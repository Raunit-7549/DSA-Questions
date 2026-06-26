public class Find_Missing_Number_Better_Approach {
    
    public static void main(String[] args){
        int[] arr = {1, 4, 5, 3};
        System.out.println(findMissingNumber(arr, arr.length+1));
    }

    // It is done by creating a hash array which checks if a number is in the given array or not whichever number is not present in the hash array it is returned by using the index of the hash array.

    public static int findMissingNumber(int[] arr, int n){
        
        int[] hash = new int[n+1];

        for(int i=0; i<arr.length; i++){
            hash[arr[i]] = 1; 
        }

        for(int i=1; i<=arr.length; i++){
            if(hash[i] == 0){
                return i;
            }
        }

        return -1;
    }
}