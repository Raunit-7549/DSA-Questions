public class Find_Missing_Number {
    public static void main(String[] args){
        int[] arr = {0, 1, 4, 5, 3};
        System.out.println(findMissingNumber(arr));

    }

    public static int findMissingNumber(int[] arr){

        int expected_sum = arr.length*(arr.length+1)/2;
        int actual_sum = 0;
        for(int num: arr){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }
}