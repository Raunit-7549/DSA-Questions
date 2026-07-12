import java.util.Arrays;

public class Sort_Arrays_0_1_2_Optimal_Solution {
    public static void main(String[] args){

        int arr[] = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 1};
        sort_012_Array(arr);
        System.out.println(Arrays.toString(arr));
    }

    // It is done by considering three rules first is that elements from 0 to low-1 are 0 second the element from low to mid-1 are 1 third the elements from high+1 to the end of the array are 2 and the elements between mid and high are unsorted and by using these rules we initialize the low and mid to 0 index at first and high at last index and we run a while loop and whenver the current mid element is 0 it is swaped with element at low index and both low and mid are increased by one and if the element is 1 then mid is increased by 1 and if the element is 2 then it is swaped with element at high index at high is decreased by one and the loop runs till mid is less than or equal to high.

    public static void sort_012_Array(int[] arr){
        int low = 0;
        int mid = 0; 
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}