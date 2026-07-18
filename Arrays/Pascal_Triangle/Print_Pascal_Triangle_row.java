public class Print_Pascal_Triangle_row {
    public static void main(String[] args){

        int row = 10;
        printPascalTriangleRow(row);
    }

    // It is done by calculating the current element by using the previous element rather than doing the whole calculation from start.

    public static void printPascalTriangleRow(int n){

        int ans = 1;
        System.out.print(ans + " ");

        for(int i=1; i<n; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans + " ");
        }

    }
}