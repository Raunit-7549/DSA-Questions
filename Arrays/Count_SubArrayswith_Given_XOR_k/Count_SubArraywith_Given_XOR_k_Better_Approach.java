public class Count_SubArraywith_Given_XOR_k_Better_Approach {
    public static void main(String[] args){

        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(countSubArraywithGivenXORk(arr, 6));
    }

    // It is done by checking all the sub arrays one by one using two loops.

    public static int countSubArraywithGivenXORk(int[] arr, int k){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            int XOR = 0;
            for(int j=i; j<arr.length; j++){
                XOR ^= arr[j];
                if(XOR == k){
                    count++;
                }
            }
        }
        return count;
        
    }
}