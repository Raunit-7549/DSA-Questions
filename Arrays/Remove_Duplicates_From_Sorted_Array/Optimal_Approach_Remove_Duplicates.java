import java.util.*;

public class Optimal_Approach_Remove_Duplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println("The number of unique elements are : "+removeDuplicateElements(arr));
        System.out.println(Arrays.toString(arr));
    }

    // It is done by taking two pointers one have the unique value index and other checks for next the unique value in the array using for loop.

    public static int removeDuplicateElements(int[] arr){
        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
