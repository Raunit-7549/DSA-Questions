import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutiveSequence(arr));
    }

    // It is done by storing all the elements in an set so that there are only unique elements and iterate through each element and if there is an element which one less than the current element then move to the next iteration and if there is not then count is set to 1 and it is checked how many consecutive numbers are there for the current element and then it is checked if current sequence is longer than the last sequence.

    public static int longestConsecutiveSequence(int[] arr){
        int longest = 1;
        Set<Integer> elements = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            elements.add(arr[i]);
        }

        for(int num : elements){
            if(elements.contains(num-1) == false){
                int count = 1;
                int x = num;
                while(elements.contains(x+1) == true){
                    x = x + 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

}