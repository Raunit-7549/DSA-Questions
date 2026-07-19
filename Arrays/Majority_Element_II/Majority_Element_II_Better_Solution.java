import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority_Element_II_Better_Solution {
    public static void main(String[] args){

        int[] arr = {1, 1, 1, 3, 3 ,2, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by storing the number of times each element appears in the array in a hash map.

    public static List<Integer> majorityElement(int[] arr){

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            count.merge(arr[i], 1, (oldValue, newValue) -> oldValue + newValue);
            if(count.get(arr[i]) == (arr.length / 3 + 1)){
                ans.add(arr[i]);
            }
            if(ans.size() == 2){
                break;
            }
        }
        return ans;

    }
}
