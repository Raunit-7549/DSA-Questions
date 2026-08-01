public class Reverse_Pairs_Brute_Force {
    public static void main(String[] args){

        int[] arr = {40, 25, 19, 12, 9, 6, 2};
        System.out.println(reversePairs(arr));
    }

    // It is done by checking all the pairs of the elements using two loops.

    public static int reversePairs(int[] arr){

        int count = 0;

        for(int i=0; i<arr.length - 1; i++){
            for(int j=i+1; j<arr.length; j++){

                if((long)arr[i] > (long)(2L * arr[j])){
                    count++;
                }
            }
        }
        return count;

    }
}