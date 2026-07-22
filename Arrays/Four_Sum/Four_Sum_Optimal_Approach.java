import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum_Optimal_Approach {
    public static void main(String[] args) {

        int[] arr = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(arr, 0));
    }

    // It is done by running two loops and then using two pointers after sorting the
    // array.

    public static List<List<Integer>> fourSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>(List.of(arr[i], arr[j], arr[k], arr[l]));
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                    else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return ans;

    }
}