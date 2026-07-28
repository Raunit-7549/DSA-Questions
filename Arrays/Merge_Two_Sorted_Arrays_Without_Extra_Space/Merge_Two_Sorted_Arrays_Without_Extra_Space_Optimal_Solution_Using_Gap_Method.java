import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space_Optimal_Solution_Using_Gap_Method {
    public static void main(String[] args){

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeTwoSortedArrays(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    // It is done by using two pointers which are separated by gap number of elements.

    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m){

        int len = n + m;
        int gap = len / 2 + len % 2;

        while(gap > 0){

            int left = 0;
            int right = left + gap;
            while(right < len){
                if(left < n && right >= n){
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                else if(left >= n){
                    swapIfGreater(arr2, arr2, left - n, right - n);
                } else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap == 1){
                break;
            }
            gap = gap / 2 + gap % 2;
        }

    }

    public static void swapIfGreater(int[] arr1, int[] arr2, int index1, int index2){

        if(arr1[index1] > arr2[index2]){
            swap(arr1, arr2, index1, index2);
        }
    }

    public static void swap(int[] arr1, int[] arr2, int index1, int index2){

        int temp = arr1[index1];
        arr1[index1] = arr2[index2];
        arr2[index2] = temp;
    }
}