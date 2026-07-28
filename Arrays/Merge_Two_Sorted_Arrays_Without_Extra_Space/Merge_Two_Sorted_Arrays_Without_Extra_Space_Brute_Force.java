import java.util.Arrays;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space_Brute_Force {

    public static void main(String[] args){

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeTwoSortedArrays(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    // It is done by storing the elements in order in a separate array and the replacing the elements in original array by using the new array.

    public static void mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m){

        int[] arr3 = new int[n+m];
        int left = 0;
        int right = 0;
        int i = 0;

        while(left < n && right < m){
            if(arr1[left] <= arr2[right]){
                arr3[i++] = arr1[left++];
            } else {
                arr3[i++] = arr2[right++];
            }
        }
        while(left < n){
            arr3[i++] = arr1[left++];
        } 
        while(right < m ) {
            arr3[i++] = arr2[right++];
        }

        for(int j=0; j<n+m; j++){
            if(j < n){
                arr1[j] = arr3[j];
            } else {
                arr2[j - n] = arr3[j];
            }
        }

    } 
}