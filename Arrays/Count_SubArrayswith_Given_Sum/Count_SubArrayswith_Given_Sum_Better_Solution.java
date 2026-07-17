public class Count_SubArrayswith_Given_Sum_Better_Solution {
    public static void main(String[] args){
        
        int[] arr = {1, 2, 3 , -3, 1, 1, 1, 4 ,2, -3};
        System.out.println(countSubArraywithGivenSum(arr, 3));
    }

    // It is done by counting each of the subarray one by one if its total sum is equal to the given sum and it is done by using two loops.

    public static int countSubArraywithGivenSum(int[] arr, int k){

        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count++;

    }
}