import java.util.*;

public class Optimal_Approach_Rotate_Array_By_k_Places {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter number of times array to be rotated : ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    // It is done by first k elements of the array then reversing the rest of the elements and then reversing the whole array.

    public static void rotateArray(int[] arr, int k){
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}