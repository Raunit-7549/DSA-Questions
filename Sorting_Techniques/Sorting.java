import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //Selection Sort

    // It is done by finding the smallest element then taking it at the start of the array.
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort

    // It is done by taking the largest element to the end of the array.

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int didSwap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    // Insertion Sort

    // It is done by firstly taking a small part of the array and putting the elments in its correct position and then increasing the size of the small part untill the array is sorted.
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }

    //Merge Sort
    
    // It is done by breaking the array into smaller and smaller pieces and then merging each piece in the correct order untill it returns the sorted array.
    public static void MergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);
        Merge(arr, low, mid, high);
    }

    // It is done by making a temporaray integer list and then adding the numbers in the right order into the list using while loop and then using the temp list sorted elements are placed in the array untill the two parts of the array taken get merged.
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

    // Recursive Bubble Sort
    
    // It is done by using recursion for the outer loop and by using didswap we can check if the array is already sorted and we can stop the function.
    public static int[] RecursiveBubbleSort(int[] arr, int i) {
        int n = arr.length;
        if (i == n) {
            return arr;
        }
        int didswap = 0;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didswap = 1;
            }
        }
        if (didswap == 0) {
            return arr;
        }
        return RecursiveBubbleSort(arr, i + 1);
    }

    // Recursive Insertion Sort

    // It is done by using recursion for the outer loop and then sorting small parts of the array using the while loop and then increasing the size of part of the array taken untill it is sorted.
    public static int[] RecursiveInsertionSort(int[] arr, int i) {
        int n = arr.length;
        if (i == n) {
            return arr;
        }
        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        return RecursiveInsertionSort(arr, i + 1);
    }

    // Quick Sort
    
    // It is done taking a pivot then placing it at its correct place then divding the array then smaller on the left greater on the right and then diving those parts and placing elements at their correct place using the parts of the arrays untill we get the sorted array.
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