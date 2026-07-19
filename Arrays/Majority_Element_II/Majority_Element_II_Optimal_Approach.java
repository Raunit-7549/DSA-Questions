import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = {1, 1, 1, 3, 3 ,2, 2, 2};
        System.out.println(majorityElement(arr));
    }

    // It is done by getting the two elements which appears the most in the array and then it is checked if they appear are the majority element.

    public static List<Integer> majorityElement(int[] arr){

        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(count1 == 0 && ele2 != arr[i]){
                count1 = 1;
                ele1 = arr[i];
            }
            else if(count2 == 0 && ele1 != arr[i]){
                count2 = 1;
                ele2 = arr[i];
            }
            else if(arr[i] ==  ele1){
                count1++;
            }
            else if(arr[i] == ele2){
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i=0; i<arr.length; i++){
            if(ele1 == arr[i]){
                count1++;
            }
            if(ele2 == arr[i]){
                count2++;
            }
        }
        
        if(count1 >= arr.length / 3 + 1){
            ans.add(ele1);
        }
        if(count2 >= arr.length / 3 + 1){
            ans.add(ele2);
        }
        return ans;

    }
}