import java.util.ArrayList;
import java.util.List;

public class LeadersinArray_Optimal_Approach {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 12, 3, 0, 6 };
        System.out.println(LeadersinArray(arr));
    }

    // It is done by taking a maximum element and updating it whenever there is element greater than maximum and if the current element is greater than maximum it is added.

    public static List<Integer> LeadersinArray(int[] arr) {

        List<Integer> leaders = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > maximum) {
                leaders.add(arr[i]);
            }
            maximum = Math.max(arr[i], maximum);
        }
        return leaders;

    }
}