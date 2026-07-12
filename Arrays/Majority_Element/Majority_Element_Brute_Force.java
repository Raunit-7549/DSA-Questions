public class Majority_Element_Brute_Force {
    public static void main(String[] args){

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by counting each element one by one using two loops.

    public static int majorityElement(int[] arr){

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
