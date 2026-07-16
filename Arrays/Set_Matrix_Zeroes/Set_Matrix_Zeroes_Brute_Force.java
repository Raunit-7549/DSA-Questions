import java.util.Arrays;

public class Set_Matrix_Zeroes_Brute_Force {
    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setMatrixZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    // It is done by making every element other than 0 to -1 in the row and column of the zero element and then every -1 is made in to 0.

    public static void setMatrixZeroes(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    setRow(arr, i);
                    setColumn(arr, j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void setRow(int[][] arr, int i) {

        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }

    }

    public static void setColumn(int[][] arr, int j) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
        
    }
}