import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Four_Sum_Better_Solution {
    public static void main(String[] args) {

        int[] arr = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(arr, 0));
    }

    // It is done by running three loops and in the third loop adding the previous element to check if the element required for the sum is there is or not if it there then it is added to a temporary list that is added to the set and then the set of list is added to the main list.

    public static List<List<Integer>> fourSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                Set<Long> elements = new HashSet<>();
                for (int k = j + 1; k < arr.length; k++) {
                    long sum = (long) arr[i] + arr[j];
                    sum += arr[k];
                    long fourth = (long) target - sum;
                    if (elements.contains(fourth) == true) {
                        List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], (int) fourth));
                        Collections.sort(temp);
                        set.add(temp);
                    }

                    elements.add((long) arr[k]);

                }
            }
        }
        ans.addAll(set);
        return ans;

    }
}