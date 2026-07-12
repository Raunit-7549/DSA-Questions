public class Majority_Element_Optimal_Solution {
    public static void main(String[] args){

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by running a loop which intialized element variable to current element if count is zero or increases count by 1 if element variable is equal to current element and if it is not equal to current element then count is decresed by 1 and then checked if the current value of the element variable appears more times than half of array length.

    public static int majorityElement(int[] arr){

        int count = 0;
        int ele = arr[0];

        for(int i=0; i<arr.length; i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            } 
            else if(arr[i] == ele){
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] == ele){
                count1++;
            }
        }

        if(count1 > arr.length/2){
            return ele;
        }
        return -1;
    }
}