import java.util.Arrays;

public class Maximum_SubArray_Sum_Optimal_Solution {
    public static void main(String[] args){

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSumSubArray(arr));
        System.out.println(Arrays.toString(maxSumSubArrayPrint(arr)));
    }

    // It is done by adding the the elements one by one and whenever the sum is less than 0 it is set to 0 and if the sum is more than max sum then max sum is set to sum.

    public static int maxSumSubArray(int[] arr){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;

    }

    public static int[] maxSumSubArrayPrint(int[] arr){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = -1;
        for(int i=0; i<arr.length; i++){
            if(sum == 0){
                start = i;
            }
            sum += arr[i];

            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        int[] ans = new int[ansEnd-ansStart+1];
        for(int j=ansStart; j<=ansEnd; j++){
            ans[j-ansStart] = arr[j];
        }
        return ans;
        
    }
}