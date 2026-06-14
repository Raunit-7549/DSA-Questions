import java.util.*;

public class Brute_Force_Remove_Duplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println("The number of unique elements are : "+removeDuplicateElements(arr));
        System.out.println(Arrays.toString(arr));
        
    }

    // It is done by creating a temp list and adding unique elements to it and then placing those elements in the array.

    public static int removeDuplicateElements(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                temp.add(arr[i]);
            }
        }

        for(int j=0; j<temp.size(); j++){
            arr[j] = temp.get(j);
        }

        return temp.size();
        
    }
}
