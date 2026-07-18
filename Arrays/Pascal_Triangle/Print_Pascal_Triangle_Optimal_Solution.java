import java.util.ArrayList;
import java.util.List;

public class Print_Pascal_Triangle_Optimal_Solution {
    public static void main(String[] args){

        int row = 10;
        System.out.println(printPascalTriangle(row));
    }

    // It is done by calculating the current the element by using the previous element in that row and adding the elements of the array to a temporary list and then adding that row to the main list.

    public static List<List<Integer>> printPascalTriangle(int n){

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            ans.add(generateRow(i));
        }
        return ans;

    }

    public static List<Integer> generateRow(int n){

        List<Integer> temp = new ArrayList<>();

        int a = 1;
        temp.add(a);

        for(int i=1; i<n; i++){
            a = a * (n-i);
            a = a / i;
            temp.add(a);
        }
        return temp;

    }
}