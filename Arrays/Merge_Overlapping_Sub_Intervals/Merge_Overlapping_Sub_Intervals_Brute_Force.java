import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Overlapping_Sub_Intervals_Brute_Force {
    public static void main(String[] args){

        int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        System.out.println(Arrays.deepToString(mergeOverlappingSubIntervals(arr)));
    }

    // It is done by checking if the last element added is smaller than the current element and if it is then the interval is updated and untill the element is smaller than the last element added the interval is updated and then it is added to the main array and all the intervals are added to the main array.

    public static int[][] mergeOverlappingSubIntervals(int[][] arr){

        List<int[]> ans = new ArrayList<>();
        
        Arrays.sort(arr, Comparator
            .comparingInt((int[] a) -> a[0])
            .thenComparingInt(a -> a[1])
        );


        for(int i=0; i<arr.length; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(ans.isEmpty() == false && end <= ans.getLast()[1]){
                continue;
            }
            for(int j=i+1; j<arr.length; j++){
                if(arr[j][0] <= end){
                    end = Math.max(arr[j][1], end);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[ans.size()][]);

    }
}