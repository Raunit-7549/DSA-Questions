public class Binary_Search_Recursive_Code {
    public static void main(String[] args){

        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 13;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    // It is done by using the binary search and calling the binary search function when arr[mid] is not equal to target value and the high or low is changed and index is returned when target is equal to current element.

    public static int binarySearch(int[] arr, int low, int high, int target){

        if(low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(arr[mid] ==  target){
            return mid;
        }
        else if(arr[mid] < target){
            return binarySearch(arr, mid + 1, high, target);
        }
        return binarySearch(arr, low, mid - 1, target);

    }
}
