public class Longest_SubArraywith_Sum_Zero_Better_Approach {
    public static void main(String[] args){

        int[] arr = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(longestSubArraywithSumZero(arr));
    }

    // It is done by checking the sum of all the sub arrays by using two loops.

    public static int longestSubArraywithSumZero(int[] arr){

        int ans = 0;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == 0){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;

    }
}