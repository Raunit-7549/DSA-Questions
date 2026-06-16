import java.util.*;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {12,25,8,10,32};
        System.out.print("Enter the number to be searched in the array : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("x is at the index : " + linearSearch(arr, x));
    }

    public static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
