public class Lower_Bound_Brute_Force {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        System.out.println(lowerBound(arr, 11));
    }

    // It is done by iterating through each element of the array.

    public static int lowerBound(int[] arr, int x){

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= x){
                return i;
            }
        }
        return -1;

    }

}