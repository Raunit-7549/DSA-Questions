import java.util.Arrays;

public class Rotate_Imageor_Matrixby_90_Degrees_Brute_Force {
    public static void main(String[] args){

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(rotateMatrixby90Degrees(arr)));
        
    }

    // It is done by storing the elements at the index where they should be after rotation in a new matrix.

    public static int[][] rotateMatrixby90Degrees(int[][] arr){

        int[][] ans = new int[arr.length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                ans[j][arr.length-1-i ] = arr[i][j]; 
            }
        }
        return ans;

    }
}