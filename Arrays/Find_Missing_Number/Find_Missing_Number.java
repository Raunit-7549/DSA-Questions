public class Find_Missing_Number {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 3};
        System.out.println(findMissingNumber(arr));

    }

    // It is done by calculating the difference between all the sum of all the numbers till the given number and the sum of all the element of the given array.

    public static int findMissingNumber(int[] arr){

        int expected_sum = (arr.length+1)*((arr.length+1)+1)/2;
        int actual_sum = 0;
        for(int num: arr){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }
}