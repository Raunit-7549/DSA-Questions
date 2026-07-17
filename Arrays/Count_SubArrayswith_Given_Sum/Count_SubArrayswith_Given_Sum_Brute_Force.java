public class Count_SubArrayswith_Given_Sum_Brute_Force {
    public static void main(String[] args){
        
        int[] arr = {1, 2, 3 , -3, 1, 1, 1, 4 ,2, -3};
        System.out.println(countSubArraywithGivenSum(arr, 3));
    }

    // It is done by counting each of the subarray one by one if its total sum is equal to the given sum and it is done by using three loops.

    public static int countSubArraywithGivenSum(int[] arr, int k){

        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int l=i; l<=j; l++){
                    sum += arr[l];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        return count++;

    }
}