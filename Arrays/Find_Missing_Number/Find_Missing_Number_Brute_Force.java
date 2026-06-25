public class Find_Missing_Number_Brute_Force {
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 3};
        System.out.println(findMissingNumber(arr, arr.length+1));

    }

    // It is done by using two loops one loops checks the element in the array and the other is used to have the value of the current element.


    public static int findMissingNumber(int[] arr, int n){
        for(int i=1; i<n; i++){
            int flag = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    flag = 1; break;
                }
            }
            if(flag==0){
                return i;
            }
        }

        return -1;
    }
}
