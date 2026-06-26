public class Elementthat_Appears_Once_Optimal_Approac {
    public static void main(String[] args){

        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findElementthatAppearsOnce(arr));
    }

    // It is done by XOR because taking XOR of two same number returns 0 and taking XOR of a number and 0 returns the number.

    public static int findElementthatAppearsOnce(int[] arr){

        int XOR = 0;
    
        for(int i=0; i<arr.length; i++){
            XOR = XOR^arr[i];
        }

        return XOR;
    }
}
