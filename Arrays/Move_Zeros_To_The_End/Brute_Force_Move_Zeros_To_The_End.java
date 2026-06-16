import java.util.*;

public class Brute_Force_Move_Zeros_To_The_End {
    public static void main(String[] args){
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZerostoEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    // It is done by adding the non zero elements to a temporary list then placing them one by one in the array and then filling remaining places with zero.

    public static void moveZerostoEnd(int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        for(int j=0; j<temp.size(); j++){
            arr[j] = temp.get(j);
        }
        for(int k=temp.size(); k<arr.length; k++){
            arr[k] = 0;
        }
    }
}
