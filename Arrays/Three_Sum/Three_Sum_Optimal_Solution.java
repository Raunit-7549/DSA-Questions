import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_Optimal_Solution {
    public static void main(String[] args){

        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    // It is done by taking j and k as two pointers and i as constant for each iteration and if the current sum is more then k is decreased and if the current sum is less then j is increased and if there combination gives the required sum then it is added to the main list.

    public static List<List<Integer>> threeSum(int[] arr){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){

                int sum = arr[i] + arr[j] + arr[k];

                if(sum < 0){
                    j++;
                } 
                else if(sum > 0){
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k]));
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]){
                        j++;
                    }
                    while(j < k && arr[k] == arr[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;

    }
}