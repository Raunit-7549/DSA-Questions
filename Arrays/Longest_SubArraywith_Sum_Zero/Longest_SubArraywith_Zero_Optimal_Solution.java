import java.util.HashMap;
import java.util.Map;

public class Longest_SubArraywith_Zero_Optimal_Solution {
    
    public static void main(String[] args){

        int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(longestSubArraywithSumZero(arr));
    }

    // It is done by adding the prefix sum to a hash map because the total sum of the array till the current is will be a value that is in the hash map then it means there is a sub array which has the total sum zero.

    public static int longestSubArraywithSumZero(int[] arr){

        Map<Integer, Integer> prefixSum = new HashMap<>();

        int ans = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
            if(sum == 0){
                ans = i+1;
            }
            else {
                if(prefixSum.containsKey(sum) == true){
                    ans = Math.max(ans, i - prefixSum.get(sum));
                } else {
                    prefixSum.put(sum, i);
                }
            }
        }
        return ans;

    }
}
