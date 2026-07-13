public class Maximum_SubArray_Sum_Better_Approach {
    public static void main(String[] args){

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSumSubArray(arr));
    }

    // It is done by using two loops which checks the total sum of all the subarrays one by one.

    public static int maxSumSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
