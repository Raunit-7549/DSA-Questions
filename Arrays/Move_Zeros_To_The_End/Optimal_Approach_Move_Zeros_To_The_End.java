import java.util.Arrays;

public class Optimal_Approach_Move_Zeros_To_The_End {
    public static void main(String[] args){
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZerostoEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    // It is done by initializing a pointer to the index which have the first zero then iterating through the array from the next element and swapping the zero elements with the whenever there is a non zero element.


    public static void moveZerostoEnd(int[] arr){
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int k=j+1; k<arr.length; k++){
            if(arr[k] != 0){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
            }
        }

    }
}