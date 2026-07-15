import java.util.Arrays;

public class Longest_Consecutive_Sequence_Better_Solution {
    public static void main(String[] args){

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSequence(arr));
    }

    // It is done by firstly sorting the array then checking if current element is one smaller than the last element and if not then the count is set to 1 and each time it is checked if the current length of the longest sequence is more than count or not.

    public static int longestConsecutiveSequence(int[] arr){
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == lastSmaller){
                count += 1;
                lastSmaller = arr[i];
            } 
            else if(lastSmaller != arr[i]){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }

}