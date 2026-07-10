public class Longest_SubArraywith_Sum_k_Optimal_Approach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        System.out.println(longestSubArraywithSumk(arr, k));
    }

    // It is done by using two pointers one takes elements from the front and adds them to the sum and the second pointer is used to remove the elements from the end whenver the current sum exceeds k and whenver the sum is equal to k then it is checked if current size of sub array is greater than the previous size of sub array.

    public static int longestSubArraywithSumk(int[] arr, long k) {
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < arr.length){
                sum += arr[right];
            }
        }
        return maxLen;
    }
}