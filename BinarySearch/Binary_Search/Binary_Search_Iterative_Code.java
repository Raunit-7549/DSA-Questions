public class Binary_Search_Iterative_Code {
    public static void main(String[] args){

        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 13;
        System.out.println(binarySearch(arr, target));
    }

    // It is done by using three pointers low high and mid and if the current element is equal to target then it is returned and if it is more than target than high is set to mid - 1 and if target is more than mid then low is set to mid + 1.

    public static int binarySearch(int[] arr, int target){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > mid){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return -1;

    }
} 