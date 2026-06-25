import java.util.ArrayList;
import java.util.List;

public class Intersectionof_Sorted_Arrays_Optimal_Approach {

    public static void main(String[] args){

        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        System.out.println(intersection(arr1, arr2));

    }

    // It is done by taking two pointers and whenever the elements in both the arrays are equal then it is added to the intersection list.
    
    public static List<Integer> intersection(int[] arr1, int[] arr2){

        List<Integer> intersection = new ArrayList<>();

        int i=0; 
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] > arr1[i]){
                j++;
            } 
            else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    } 
}