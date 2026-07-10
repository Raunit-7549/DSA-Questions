import java.util.HashMap;
import java.util.Map;

public class Longest_SubArraywith_Sum_k_Better_Solution {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        System.out.println(longestSubArraywithSumk(arr, k));
    }

    // It is done by going through the array and checking if the current sum of all the elements is k or it has a subarray which has a sum that is k less than the current sum. 

    public static int longestSubArraywithSumk(int[] arr, long k) {
        Map<Long, Integer> sumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - k;
            if (sumMap.containsKey(rem)) {
                int len = i - sumMap.get(rem);
                maxLen = Math.max(len, maxLen);
            }
            if(!sumMap.containsKey(sum)){
                sumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}