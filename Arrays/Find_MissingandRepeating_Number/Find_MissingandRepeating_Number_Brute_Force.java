import java.util.Arrays;

class Find_MissingandRepeating_Number_Brute_Force {
    public static void main(String[] args){

        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(findMissingandRepeatingNumber(arr)));
    }

    // It is done by counting the number of times each number appears in the array.

    public static int[] findMissingandRepeatingNumber(int[] arr){

        int repeating = -1;
        int missing = -1;
        int n = arr.length;

        for(int i=1; i<=n; i++){

            int count = 0;
            for(int j=0; j<arr.length; j++){

                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeating = i;
            } 
            else if(count == 0){
                missing = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }
        }
        return new int[]{repeating, missing};
        
    }
}