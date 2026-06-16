import java.util.*;

public class Left_Rotate_Array_By_One{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        rotateArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    // It is done by storing the first element in an temporary variabale and then placing each element at an index less than its actual index and then placing temp at the last index.

    public static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}