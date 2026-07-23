public class Count_SubArraywith_Given_XOR_k_Brute_Force {
    public static void main(String[] args){

        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(countSubArraywithGivenXORk(arr, 6));
    }

    // It is done by checking all the sub arrays one by one by using three loops.

    public static int countSubArraywithGivenXORk(int[] arr, int k){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int XOR = 0;
                for(int l=i; l<=j; l++){
                    XOR ^= arr[l];
                }
                if(XOR == k){
                    count++;
                }
            }
        }
        return count;

    }
}