import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II_Brute_Force {
    public static void main(String[] args){

        int[] arr = {1, 1, 1, 3, 3 ,2, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by counting the number of times each element appears in the array.

    public static List<Integer> majorityElement(int[] arr){

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(ans.size() == 0 || ans.get(0) != arr[i]){
                int count = 0;
                for(int j=0; j<arr.length; j++){
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }
                if(count > arr.length / 3){
                    ans.add(arr[i]);
                }
            }
            if(ans.size() == 2){
                break;
            }
        }
        return ans;

    }
}