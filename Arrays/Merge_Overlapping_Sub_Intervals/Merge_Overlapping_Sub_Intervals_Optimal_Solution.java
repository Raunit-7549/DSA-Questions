import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Overlapping_Sub_Intervals_Optimal_Solution {
    public static void main(String[] args){

        int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        System.out.println(Arrays.deepToString(mergeOverlappingSubIntervals(arr)));
    }

    // It is done by adding each element and also checking if the element should be added or should be updated in the existing interval.

    public static int[][] mergeOverlappingSubIntervals(int[][] arr){

        List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(arr, Comparator
            .comparingInt((int[] a) -> a[0])
            .thenComparingInt(a -> a[1])
        );


        for(int i=0; i<arr.length; i++){
            
            if(ans.isEmpty() || arr[i][0] > ans.getLast()[1]){
                ans.add(arr[i]);
            } else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], arr[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }
}
