import java.util.Arrays;

public class Find_MissingandRepeating_Number_Optimal_Approach_Sum_Method {
    public static void main(String[] args){

        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(findMissingandRepeatingNumber(arr)));
    }

    // It is done by making two solutions of x and y where x is repeating number and y is missing number and two equations are made x + y and x - y by using sum of the elements and sum of square of the elements.

    public static int[] findMissingandRepeatingNumber(int[] arr){

        long n = arr.length;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0;
        long S2 = 0;

        for(int i=0; i<arr.length; i++){
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        return new int[]{(int)x, (int)y};
    }
}
