import java.util.HashMap;
import java.util.Map;

public class Majority_Element_Better_Approach {
    public static void main(String[] args){

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by using hashmap which stores the number of times each elements appears in the array.

    public static int majorityElement(int[] arr){
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : arr){
            count.merge(num, 1, (oldValue, newValue)-> oldValue + newValue);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}