import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_Better_Approach {
    public static void main(String[] args){

        int[] arr = { 2, 6, 5, 8, 11 };
        System.out.println(Arrays.toString(twoSum(arr, 10)));
    }    

    // It is done by using a hashmap in which current element is used as key and its index as the value and it is checked if the element required for making the sum in the hashmap or not if it is there then the array of indexes is returned.

    public static int[] twoSum(int[] arr, int sum){
        Map<Integer, Integer> elements = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int elementNeeded = sum - arr[i];
            if(elements.containsKey(elementNeeded) == true){
                return new int[]{elements.get(elementNeeded), i};
            }
            elements.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}