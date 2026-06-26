public class Find_Missing_Number_XOR_Optimal_Approach {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 3};
        System.out.println(findMissingNumber(arr, arr.length+1));
    }

    // It is done by taking XOR of all the numbers till n and all the numbers in the array and then taking their XOR that will give the missing number.

    public static int findMissingNumber(int[] arr, int n){
        int XOR1 = 0;
        int XOR2 = 0;

        for(int i=0; i<n-1; i++){
            XOR2 = XOR2^arr[i];
            XOR1 = XOR1^(i+1);
        }
        XOR1 = XOR1^n;

        return XOR1^XOR2;
    }

}
