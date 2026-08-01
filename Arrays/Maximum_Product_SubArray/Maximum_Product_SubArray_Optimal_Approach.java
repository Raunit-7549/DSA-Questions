public class Maximum_Product_SubArray_Optimal_Approach {
    public static void main(String[] args){

        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArray(arr));
    }

    // It is done by using prefix and suffix product.

    public static int maximumProductSubArray(int[] arr){

        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i=0; i<arr.length; i++){

            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }

            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length-i-1];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;

    }
}
