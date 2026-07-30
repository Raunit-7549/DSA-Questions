import java.util.Arrays;

public class Find_MissingandRepeating_Number_Optimal_Approach_XOR_Method {
    public static void main(String[] args){

        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(findMissingandRepeatingNumber(arr)));
    }

    // It is done by taking xor of all the elements that are in the array and all the elements that should be in the array and then xor will be xor of repeating and missing number then number with a one at differentiating bit is found and then it is checked which elements have zero and which elements have one at the differentitiating bit by using & operator and their xor is stored in one and zero variables and only the repeating and missing element is both the variables because only they have odd count rest of the elements are appearing twice and get cancelled after doing xor and then count of the element is found out in the array if it is two then it is repeating and if it is zero then it is missing and other variable will have missing or repeating respectively and then both the numbers are returned in the array.

    public static int[] findMissingandRepeatingNumber(int[] arr){

        int xr = 0;

        for(int i=0; i<arr.length; i++){
            xr = xr ^ arr[i];
            xr = xr ^ (i + 1);
        }

        int bitNo = 0;

        while(true){

            if((xr & (1 << bitNo)) != 0){
                break;
            }
            bitNo++;
        }

        // bitNo number calculation can be done as number = xr & ~(xr - 1);

        int zero = 0;
        int one = 0;

        for(int i=0; i<arr.length; i++){

            if((arr[i] & (1 << bitNo)) != 0){
                one = one ^ arr[i];
            } else {
                zero = zero ^ arr[i];
            }
        }

        for(int i=1; i<=arr.length; i++){

            if((i & (1 << bitNo)) != 0){
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }
        }
        
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == zero){
                count++;
            }
        }
        if(count == 2){
            return new int[]{zero, one};
        }
        return new int[]{one, zero};

    }
}