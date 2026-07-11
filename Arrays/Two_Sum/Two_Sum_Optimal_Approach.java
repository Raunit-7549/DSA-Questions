import java.util.Arrays;

public class Two_Sum_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = { 2, 6, 5, 8, 11 };
        System.out.println(twoSum(arr, 10));
    }

    // It is done by taking two pointers one at the start of the end other at the end of the array and then sorting the array then checking if the current sum of left and right element is greater than required sum then right pointer is reduced by one and if current sum is smaller than required sum then left pointer is increased by 1 and if the current sum is equal to the required sum and yes is returned.

    public static String twoSum(int[] arr, int sum){
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while(left < right) {
            int s = arr[left] + arr[right];
            if(sum == s){
                return "YES";
            }
            else if(s < sum){
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }
}