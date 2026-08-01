public class Maximum_Product_SubArray_Better_Solution {
    public static void main(String[] args){

        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArray(arr));
    }

    // It is done by checking the product of every sub array using two loops.

    public static int maximumProductSubArray(int[] arr){

        int maxProduct = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int product = 1;
            for(int j=i; j<arr.length; j++){
                product = product * arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}
