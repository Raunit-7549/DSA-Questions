import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Four_Sum_Brute_Force {

    public static void main(String[] args){
        
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(arr, 0));
    }

    // It is done by checking each of the combination if it equal to the required sum using four loops.

    public static List<List<Integer>> fourSum(int[] arr, int target){

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    for(int l=k+1; l<arr.length; l++){
                        long sum = arr[i] + arr[j];
                        sum += arr[k];
                        sum += arr[l];
                        if(sum == target){
                            List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], arr[l]));
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;

    }
}
