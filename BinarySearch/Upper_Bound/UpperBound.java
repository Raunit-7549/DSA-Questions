public class UpperBound {
    public static void main(String[] args){

        int[] arr = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
        System.out.println(upperBound(arr, 11));
    }

    // It is done by using binary search.

    public static int upperBound(int[] arr, int x){

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }
}
