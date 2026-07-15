import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrange_Array_Elements_By_Sign_Brute_Force {
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeElementsBySign(arr)));

        int[] arr2 = { -1, 2, 3, 4, -3, 1 };
        System.out.println(Arrays.toString(rearrangeElementsBySignNonEqualElements(arr2)));
    }

    // It is done by storing postive and negative elements of array in separate
    // lists and then adding those elements to the answer array one by one.

    public static int[] rearrangeElementsBySign(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length / 2; i++) {
            ans[2 * i] = pos.get(i);
            ans[2 * i + 1] = neg.get(i);
        }
        return ans;

    }

    // If number of positive elements and number of negative elements are not equal.

    public static int[] rearrangeElementsBySignNonEqualElements(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }

        }
        return arr;

    }
}
