public class Maximum_SubArray_Sum_Brute_Force {
    public static void main(String[] args){

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSumSubArray(arr));
    }

    // It is done by using three loops which checks the total sum of all the subarrays one by one.

    public static int maxSumSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}