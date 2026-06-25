import java.util.ArrayList;
import java.util.List;

public class Intersectionof_Sorted_Arrays_Brute_Force {
    public static void main(String[] args){

        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        System.out.println(intersection(arr1, arr2));
        
    }

    // It is done by creating a visited array which checks if the current element is already in the intersection list or not and whenever the elements of both the arrays are equal then the element is added to the list.

    public static List<Integer> intersection(int[] arr1, int[] arr2){

        List<Integer> intersection = new ArrayList<>();

        int [] visited = new int[arr2.length];

        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && visited[j] == 0){
                    intersection.add(arr2[j]);
                    visited[j] = 1;
                    break;
                }

                if(arr2[j]>arr1[i]){
                    break;
                }
            }

        }

        return intersection;
    }
}