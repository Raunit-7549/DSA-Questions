import java.util.ArrayList;
import java.util.List;

public class Reverse_Pairs_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = {40, 25, 19, 12, 9, 6, 2};
        System.out.println(reversePairs(arr));
    }

    // It is done by counting the pairs while sorting the array using merge sort because in merge sort the array is divided and then reassembled and the counting of the reverse pairs is done while sorting the array.

    public static int reversePairs(int[] arr){

        return MergeSort(arr, 0, arr.length - 1);
    }

    public static int countPairs(int[] arr, int low, int mid, int high){

        int right = mid + 1;
        int count = 0;

        for(int i=low; i<=mid; i++){
            while(right <= high && (long)arr[i] > (long)2L * arr[right]){
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;

    }

    public static int MergeSort(int[] arr, int low, int high) {

        int count = 0;

        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;

        count += MergeSort(arr, low, mid);
        count += MergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        Merge(arr, low, mid, high);
        return count;

    }

    public static void Merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
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

    }
}