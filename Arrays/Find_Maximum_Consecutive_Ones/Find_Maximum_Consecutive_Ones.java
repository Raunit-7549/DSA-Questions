public class Find_Maximum_Consecutive_Ones {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(maxConsecutiveOnes(arr));
    }

    // It is done by taking max and count in which max counts the number the times one comes and resets to zero when zero appears and max stores the value which is max between max and count.

    public static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }

        return max;
    }

}