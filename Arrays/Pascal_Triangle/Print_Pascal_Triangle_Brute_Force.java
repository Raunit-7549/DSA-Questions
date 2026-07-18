import java.util.ArrayList;
import java.util.List;

public class Print_Pascal_Triangle_Brute_Force {
    public static void main(String[] args){

        int row = 10;
        System.out.println(printPascalTriangle(row));
    }

    // It is done by calculating the elements one by one and each time adding them to a temporary list and then adding the temporary list to the main list.

    public static List<List<Integer>> printPascalTriangle(int n){

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=1; j<=i; j++){
                temp.add(find_ncr(i-1, j-1));
            }
            ans.add(temp);
        }
        return ans;
    }

    public static int find_ncr(int n, int r){

        int ans = 1;

        for(int i=0; i<r; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return ans;

    }
}