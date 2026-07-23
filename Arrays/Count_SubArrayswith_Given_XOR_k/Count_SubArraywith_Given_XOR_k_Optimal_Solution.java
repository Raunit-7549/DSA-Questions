import java.util.HashMap;
import java.util.Map;

public class Count_SubArraywith_Given_XOR_k_Optimal_Solution {
    public static void main(String[] args){

        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(countSubArraywithGivenXORk(arr, 6));
    }

    // It is done by storing prefix xor in a map and checking the number of times it appears.

    public static int countSubArraywithGivenXORk(int[] arr, int k){

        int count = 0;
        int XOR = 0;

        Map<Integer, Integer> countXOR = new HashMap<>();
        countXOR.merge(0, 1, (oldValue, newValue) -> oldValue + newValue);

        for(int i=0; i<arr.length; i++){
            XOR ^= arr[i];
            int x = XOR ^ k;
            count += countXOR.getOrDefault(x, 0);
            countXOR.merge(XOR, 1, (oldValue, newValue) -> oldValue + newValue);
        }
        return count;

    }
}