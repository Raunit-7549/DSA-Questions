public class Elementthat_Appears_Once_Brute_Force {
    public static void main(String[] args){
        
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findElementthatAppearsOnce(arr));
    }
    
    // It is done by using two loops outer loop intializes the current element that we are checking and the inner loop checks the number of times it appears and whichever element have the count 1 is returned.

    public static int findElementthatAppearsOnce(int[] arr){

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count = 0;
            
            for(int j=0; j<arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }

        return -1;
    }
}
