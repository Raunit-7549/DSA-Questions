import java.util.Map;
import java.util.TreeMap;

public class Elementthat_Appears_Once_Better_Approach{
    public static void main(String[] args){

        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findElementthatAppearsOnce(arr));
    }

    // It is done by creating a hash map which stores the frequency of each element in the array and then whichever element has the frequency equal to 1 is returned.

    public static int findElementthatAppearsOnce(int[] arr){
        Map<Integer, Integer> mpp = new TreeMap<>();

        for(int num : arr){
            mpp.merge(num, 1, (oldValue, newValue)->oldValue + newValue);
        }

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }
}