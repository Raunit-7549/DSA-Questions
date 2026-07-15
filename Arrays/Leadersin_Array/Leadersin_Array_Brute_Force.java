import java.util.ArrayList;
import java.util.List;

public class Leadersin_Array_Brute_Force {
    public static void main(String[] args){

        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(LeadersinArray(arr));
    }

    // It is done by checking for each element if there is a element greater than it in the coming elements and if not then it is added.

    public static List<Integer> LeadersinArray(int[] arr){

        List<Integer> leaders = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            boolean flag = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                leaders.add(arr[i]);
            }
        }
        return leaders;

    }
}