public class Longest_Consecutive_Sequence_Brute_Force {
    public static void main(String[] args){

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSequence(arr));
    }

    // It is done by checking the sequences of each element that can be formed by using linear search.

    public static int longestConsecutiveSequence(int[] arr){
        int longest = 1;

        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x+1) == true){
                x = x+1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }

    public static boolean linearSearch(int[] arr, int a){
        boolean ans = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == a){
                return true;
            }
        }
        return ans;

    }

}