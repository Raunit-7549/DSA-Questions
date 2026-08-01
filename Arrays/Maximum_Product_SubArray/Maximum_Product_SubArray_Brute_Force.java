public class Maximum_Product_SubArray_Brute_Force {
    public static void main(String[] args){

        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArray(arr));
    }

    // It is done by checking the product of every sub array by using three loops.

    public static int maximumProductSubArray(int[] arr){

        int maxProduct = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int product = 1;
                for(int k=i; k<=j; k++){
                    product = product * arr[k];
                }
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;

    }
}
