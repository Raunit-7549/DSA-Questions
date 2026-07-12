import java.util.Arrays;

public class Sort_Arrayof_0_1_2_Brute_Force {
    public static void main(String[] args){
        
        int arr[] = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1};
        sort_012_Array(arr);
        System.out.println(Arrays.toString(arr));
    }

    // It is done by using a sorting method.

    public static void sort_012_Array(int[] arr){
        QuickSort(arr, 0, arr.length-1);
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = Partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex+1, high);
        }

    }
    
    public static int Partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<=high-1 && arr[i]<=pivot){
                i++;
            }
            while(j>=low+1 && arr[j]>pivot ){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }

}
