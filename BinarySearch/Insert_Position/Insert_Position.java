public class Insert_Position {
    public static void main(String[] args){

        int[] arr = {1, 2, 4, 7};
        System.out.println(insertPosition(arr, 6));
    }

    // It is done by using binary search.

    public static int insertPosition(int[] arr, int x){

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

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
