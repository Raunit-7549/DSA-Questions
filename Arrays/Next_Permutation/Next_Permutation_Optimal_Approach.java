import java.util.Arrays;

public class Next_Permutation_Optimal_Approach {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }

    // It is done by first finding the element which is not greater than the next element and it is done from the last and then that element is swapped with element which smallest larger element than the element at in the index variable and then the element after the index variable are reversed.

    public static int[] nextPermutation(int[] arr){
        int index = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
            index = i;
            break;
        }

        }
        if(index == -1){
            reverse(arr, 0, arr.length-1);
            return arr;
        }

        for(int i=arr.length-1; i>index; i--){
            if(arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr, index+1, arr.length-1);
        return arr;

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
