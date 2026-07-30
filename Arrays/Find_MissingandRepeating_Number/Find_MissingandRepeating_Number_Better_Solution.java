import java.util.Arrays;

public class Find_MissingandRepeating_Number_Better_Solution {
    public static void main(String[] args){

        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(findMissingandRepeatingNumber(arr)));
    }

    // It is done by storing the number of times each element appears in a hash array.

    public static int[] findMissingandRepeatingNumber(int[] arr){

        int[] hashArray = new int[arr.length + 1];
        int repeating = -1;
        int missing = -1;

        for(int i=0; i<arr.length; i++){
            hashArray[arr[i]]++;
        }

        for(int i=1; i<arr.length + 1; i++){
            if(hashArray[i] == 2){
                repeating = i;
            } 
            else if(hashArray[i] == 0){
                missing = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        return new int[]{repeating, missing};
    }
}
