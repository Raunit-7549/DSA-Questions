import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space_Optimal_Solution_Using_Two_Pointers {
    public static void main(String[] args){

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeTwoSortedArrays(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    // It is done by firstly placing all elements in the correct starting the iteration from last index of first array and first index of second array and then sorting both the arrays.

    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m){

        int left = n - 1;
        int right = 0;

        while(left >=0 && right < m){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }
            left--;
            right++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}