import java.util.Arrays;

public class Set_Matrix_Zeroes_Better_Solution {
    public static void main(String[] args){

        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setMatrixZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    // It is done by storing the rows and columns who should be set to zero.

    public static void setMatrixZeroes(int[][] arr){

        int[] row = new int[arr.length];
        int[] column = new int[arr[0].length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(row[i] == 1 || column[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

    }
}