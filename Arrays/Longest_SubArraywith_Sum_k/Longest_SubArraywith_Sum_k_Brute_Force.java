public class Longest_SubArraywith_Sum_k_Brute_Force {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 1, 1 , 1, 1, 4, 2, 3};
        int k=3;
        System.out.println(longestSubArraywithSumk(arr, k));
    }

    // It is done by checking the sum of every subarray and whichever subarray is longest and have the sum equal to k then its length is returned.

    public static int longestSubArraywithSumk(int[] arr, int k){
        
        int len=0;
        for(int i=0; i<arr.length; i++){
            int s=0;
            for(int j=i; j<arr.length; j++){
                s+=arr[j];
                if(s==k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        
        return len;
    }
}
