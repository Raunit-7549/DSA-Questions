
public class Sorted_Array_or_not {
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 4, 5};
        System.out.println(SortedOrNot(arr));

    }

    // It is done by checking if the current element is greater than or equal to the element before it.

    public static boolean SortedOrNot(int[] arr){
        boolean ans = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                ans = true;
            } else {
                return false;
            }
        }
        return ans;
    }
}
