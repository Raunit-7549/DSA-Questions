public class Find_ncr {
    public static void main(String[] args){

        int row = 10;
        int column = 3;
        System.out.println(find_ncr(row-1, column-1));
    }

    // It is done by calculating only the part of the factorials that will be not canceled out and any element in a pascal's triangle is found out by taking ncr of row-1 and column-1 of that element.

    public static long find_ncr(int n, int r){

        long ans = 1L;

        for(int i=0; i<r; i++){
            ans = ans * (n-i);
            ans = ans / (i+1);
        }
        return ans;

    }
}