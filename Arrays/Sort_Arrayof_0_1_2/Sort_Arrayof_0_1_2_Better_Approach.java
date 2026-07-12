import java.util.Arrays;

public class Sort_Arrayof_0_1_2_Better_Approach {
    public static void main(String[] args){
        int arr[] = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1};
        sort_012_Array(arr);
        System.out.println(Arrays.toString(arr));
    }

    // It is done by counting number of times 0, 1 and 2 appears and then placing the respective number the number of times it is present in the array sequentially by using for loops.

    public static void sort_012_Array(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            } else {
                count2++;
            }
        }

        for(int j=0; j<count0; j++){
            arr[j] = 0;
        }
        for(int k=count0; k<count0+count1; k++){
            arr[k] = 1;
        }
        for(int l=count0+count1; l<arr.length; l++){
            arr[l] = 2;
        }
    }
}
