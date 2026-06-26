public class Find_Missing_Number_Sum_Optimal_Approach {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 3};
        System.out.println(findMissingNumber(arr, arr.length+1));

    }

    // It is done by calculating the difference between all the sum of all the numbers till the given number and the sum of all the element of the given array.

    public static int findMissingNumber(int[] arr, int n){

        int expected_sum = (n)*((n)+1)/2;
        int actual_sum = 0;
        for(int num: arr){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }
}