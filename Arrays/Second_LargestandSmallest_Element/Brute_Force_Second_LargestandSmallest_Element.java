import java.util.*;
public class Brute_Force_Second_LargestandSmallest_Element {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println("Second Largest:" + secondLargest(arr));
        System.out.println("Second Smallest:" + secondSmallest(arr));
    }

    // It is done by finding the largest or the smallest element by sorting the array and then finding the next element which larger or smaller than the largest or the smallest using for loop

    public static int secondLargest(int[] arr){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != largest){
                return arr[i];
            }
        }

        return -1;
    }

    public static int secondSmallest(int[] arr){
        Arrays.sort(arr);
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] != smallest){
                return arr[i];
            }
        }
        return -1;
    }
}
