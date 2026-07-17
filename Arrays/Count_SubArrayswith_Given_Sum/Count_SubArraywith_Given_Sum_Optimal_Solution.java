import java.util.HashMap;
import java.util.Map;

public class Count_SubArraywith_Given_Sum_Optimal_Solution {
    public static void main(String[] args){

        int[] arr = {1, 2, 3 , -3, 1, 1, 1, 4 ,2, -3};
        System.out.println(countSubArraywithGivenSum(arr, 3));
    }

    // It is done by storing number of times a sum that we need to remove from the current prefix sum to get the given sum.

    public static int countSubArraywithGivenSum(int[] arr, int k){

        Map<Integer, Integer> sumCount = new HashMap<>();

        int count = 0;
        int prefixSum = 0;
        sumCount.put(0, 1);

        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            int remove = prefixSum - k;
            count += sumCount.getOrDefault(remove, 0);
            sumCount.merge(prefixSum, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        return count;

    }
} 