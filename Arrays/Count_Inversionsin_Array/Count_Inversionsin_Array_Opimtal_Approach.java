import java.util.ArrayList;
import java.util.List;

public class Count_Inversionsin_Array_Opimtal_Approach {
    public static void main(String[] args){
        
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversionsinArray(arr));
    }

    // It is done by using merge the counting of inversions is done while merging the array.

    public static int countInversionsinArray(int[] arr){
        
        return MergeSort(arr, 0, arr.length - 1);
    }

    public static int MergeSort(int[] arr, int low, int high) {

        int count = 0;
        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        count += MergeSort(arr, low, mid);
        count += MergeSort(arr, mid + 1, high);
        count += Merge(arr, low, mid, high);
        return count;
    }

    public static int Merge(int[] arr, int low, int mid, int high) {

        int count = 0;
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
                count += mid - left + 1;
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;

    }
}