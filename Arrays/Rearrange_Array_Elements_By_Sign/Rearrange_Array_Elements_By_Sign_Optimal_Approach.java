import java.util.Arrays;

public class Rearrange_Array_Elements_By_Sign_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeElementsBySign(arr)));
    }

    // It is done by taking initialzing positive and negative indexes and increasing their value by 2 each time a element is added at the respective index.

    public static int[] rearrangeElementsBySign(int[] arr){
        int[] ans = new int[arr.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            } else {
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            }
        }
        return ans;

    }
}