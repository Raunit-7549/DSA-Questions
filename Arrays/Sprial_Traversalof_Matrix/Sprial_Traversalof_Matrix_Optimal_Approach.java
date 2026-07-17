import java.util.ArrayList;
import java.util.List;

public class Sprial_Traversalof_Matrix_Optimal_Approach {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralTraversalofMatrix(arr));
    }

    // It is done by firstly going from left to right at the top index in the matrix then from top to bottom at the right index and then right to left at the bottom index and then bottom to top at the left index and each time changing the values of top bottom left and right.

    public static List<Integer> spiralTraversalofMatrix(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int right = arr[0].length - 1;
        int top = 0;
        int bottom = arr.length - 1;

        while (left <= right && top <= bottom) {
            
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
}
