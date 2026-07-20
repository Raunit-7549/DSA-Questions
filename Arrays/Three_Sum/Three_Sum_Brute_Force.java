import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum_Brute_Force {
    public static void main(String[] args){

        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    // It is done by checking each combination using three loops and then storing the each list in a set so that unique lists are stored then that set is stored in an list of lists.

    public static List<List<Integer>> threeSum(int[] arr){
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k]));
                        temp.sort(Comparator.naturalOrder());
                        set.add(temp);
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;

    }
}
