import java.util.Arrays;

public class Two_Sum_Brute_Force {
    public static void main(String[] args) {

        int[] arr = { 2, 6, 5, 8, 11 };
        System.out.println(Arrays.toString(twoSum(arr, 10)));

    }

    // It is done by taking two arrays and checking adding all the pairs one by one and then returning the array.

    public static int[] twoSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
