import java.util.ArrayList;
import java.util.List;

public class Unionof_Sorted_Arrays_Optimal_Aprroach {
    public static void main(String[] args){
        
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        System.out.println((union(arr1, arr2)));
    }

    // It is done by using two pointers which checks that which of the two elements should by added to the union list and if the element is already to the list.

    public static List<Integer> union(int[] arr1, int[] arr2){

        List<Integer> union = new ArrayList<>();
        
        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || (union.get(union.size()-1) != arr1[i] )){
                    union.add(arr1[i]);
                }
                i++;
            }

            else if(arr2[j] < arr1[i]){
                if(union.isEmpty() || (union.get(union.size()-1) != arr2[j] )){
                    union.add(arr2[j]);
                }
                j++;
            }
            else {
                if(union.isEmpty() || (union.get(union.size()-1) != arr1[i] )){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while(i<arr1.length){
            if(union.isEmpty() || (union.get(union.size()-1) != arr1[i] )){
                    union.add(arr1[i]);
                }
                i++;
        }

        while(j<arr2.length){
            if(union.isEmpty() || (union.get(union.size()-1) != arr2[j] )){
                    union.add(arr2[j]);
                }
                j++;
        }

        return union;

    }
}