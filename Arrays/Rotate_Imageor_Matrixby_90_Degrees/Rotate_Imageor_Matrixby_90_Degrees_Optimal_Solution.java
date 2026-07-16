import java.util.Arrays;

public class Rotate_Imageor_Matrixby_90_Degrees_Optimal_Solution {
    public static void main(String[] args){
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrixby90Degrees(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    // It is done by firslty transposing the array and then reversing each row.

    public static void rotateMatrixby90Degrees(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            
        }

        for(int i=0; i<arr.length; i++){
            int start = 0;
            int end = arr.length-1;
            
            while(start <= end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

    }
}