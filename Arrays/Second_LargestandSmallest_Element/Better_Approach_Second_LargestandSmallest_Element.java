import java.util.*;

public class Better_Approach_Second_LargestandSmallest_Element {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println("Second Largest:" + secondLargest(arr));
        System.out.println("Second Smallest:" + secondSmallest(arr));
        
    }

    // It is done by finding the largest or the smallest element by sorting the array and then initializing the second largest to int min and second smallest to int max then finding the second largest or second smallest value in the array using for loop

    public static int secondLargest(int[] arr){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static int secondSmallest(int[] arr){
        Arrays.sort(arr);
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;
        
        for(int i=arr.length-1; i>0; i--){
            if(arr[i]<secondsmallest && secondsmallest != smallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
}
