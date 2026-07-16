import java.util.Arrays;

public class Set_Matrix_Zeroes_Optimal_Solution {
    public static void main(String[] args){

        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setMatrixZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    // It is done by assuming the first row and first column as the hash arrays and also having a separate variable for column 0 so that the assumed hash arrays do not collide and then go through the matrix and whenver there is 0 at the index set that corresponding row and column arrays or the column 0 variable as zero then set the matrix elements to 0 except the first row and first column after that set the elements of first row to 0 if the first element of the matrix is set to 0 and then check for column 0 variable and set the first column accordingly.

    public static void setMatrixZeroes(int[][] arr){

        int col0 = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j != 0){
                        arr[0][j] = 0;
                    }else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(arr[i][j] != 0){
                    if(arr[0][j] == 0 || arr[i][0] == 0){
                        arr[i][j] = 0;
                    }
                }
            }
        }

        if(arr[0][0] == 0){
            for(int i=0; i<arr[0].length; i++){
                arr[0][i] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0; i<arr.length; i++){
                arr[i][0] = 0;
            }
        }
        
    }
}