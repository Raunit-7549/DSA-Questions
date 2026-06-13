import java.util.*;

public class Brute_Force_Largest_Element {
    public static void main(String[] args){
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
