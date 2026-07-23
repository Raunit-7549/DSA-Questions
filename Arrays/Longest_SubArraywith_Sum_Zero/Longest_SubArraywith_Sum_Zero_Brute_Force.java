public class Longest_SubArraywith_Sum_Zero_Brute_Force {
    public static void main(String[] args){

        int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(longestSubArraywithSumZero(arr));
    }

    // It is done by checking the sum of all the sub arrays using three loops.

    public static int longestSubArraywithSumZero(int[] arr){

        int ans = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum == 0){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;

    }
}