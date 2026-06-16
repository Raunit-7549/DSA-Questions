public class SortedandRotatedCheck {
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        System.out.println(SortedandRotatedorNot(arr));
    }

    // It is done by setting a count that counts the number of times the next element is not bigger than the previous one and if the array is roated and was sorted before rotating it should not be more than one and if it was not rotated then also it should not be more than one because if it is not rotated then last element is checked with the first element and then count will become one but not more than and if count becomes more than one then it means the array was not sorted.

    public static boolean SortedandRotatedorNot(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;

    }
}