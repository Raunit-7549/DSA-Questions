public class Lower_Bound_Binary_Search {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 3, 7, 8, 9, 9, 9, 11};
        System.out.println(lowerBound(arr, 1));
    }

    // It is done by using binary search.

    public static int lowerBound(int[] arr, int x){

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
