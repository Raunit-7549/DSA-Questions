import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Unionof_Sorted_Arrays_Set_Brute_Force_Approach {
    
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        System.out.println(Arrays.toString(union(arr1, arr2)));

    }

    // It is done by adding the elements of both the arrays in a temporary tree set and then creating an array of size equal to the size of treeset and then adding its all elements in the array one by one and then returning the union of the two arrays.

    public static int[] union(int[] arr1, int[] arr2){

        Set<Integer> temp = new TreeSet<>();

        for(int i : arr1){
            temp.add(i);
        }

        for(int j : arr2){
            temp.add(j);
        }

        int[] union = new int[temp.size()];

        int index = 0;
        for(int k : temp){
            union[index] = k;
            index++;
        }
        return union;

    }
}