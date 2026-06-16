import java.util.*;

public class Brute_Force_Rotate_Array_By_k_Places {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter number of times array to be rotated : ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
        
    }

    // It is done by add the first k elements in a temporary list and then shifting next elements each by k places and then adding placing the elements from the list at the end.

    public static void rotateArray(int[] arr, int k){
        k = k%arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<k; i++){
            temp.add(arr[i]);
        }
        for(int j=k; j<arr.length; j++){
            arr[j-k] = arr[j];
        }
        for(int l=arr.length-k; l<arr.length; l++){
            arr[l] = temp.get(l-(arr.length-k));
        }

    }
}
