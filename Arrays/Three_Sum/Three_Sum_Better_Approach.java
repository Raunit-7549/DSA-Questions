import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum_Better_Approach {
    public static void main(String[] args){

        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    // It is done by storing the elements between i and j index in a set and checking if the third element required is there.

    public static List<List<Integer>> threeSum(int[] arr){

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            Set<Integer> temp = new HashSet<>();
            for(int j=i+1; j<arr.length; j++){
                int third = -(arr[i] + arr[j]);
                if(temp.contains(third) == true){
                    List<Integer> tempList = new ArrayList<>(List.of(arr[i], arr[j], third));
                    tempList.sort(Comparator.naturalOrder());
                    set.add(tempList);
                }
                temp.add(arr[j]);
            }
        }
        ans.addAll(set);
        return ans;

    }
}
