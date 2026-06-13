public class Optimal_Approach_Second_LargestandSmallest_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        System.out.println("Second Largest:" + secondLargest(arr));
        System.out.println("Second Smallest:" + secondSmallest(arr));
    }

    // It is done by intializing the largest or smallest as the first element of the array and the second largest and second smallest as integer min and integer max then using for loop and conditional statement second largest and second smallest are found

    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (secondlargest < arr[i] && largest > arr[i]) {
                       secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static int secondSmallest(int[] arr){
        int smallest = arr[0];
        int secondsmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            } else if(secondsmallest>arr[i] && smallest < arr[i]){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
}
