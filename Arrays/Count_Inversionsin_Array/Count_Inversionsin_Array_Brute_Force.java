public class Count_Inversionsin_Array_Brute_Force {
    public static void main(String[] args){

        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversionsinArray(arr));
    }

    // It is done by checking each of the elements which right side of each of the left element using two loop in the array.

    public static int countInversionsinArray(int[] arr){

        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count += 1;
                }
            }
        }
        return count;

    }
}
