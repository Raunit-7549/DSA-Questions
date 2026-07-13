public class Stock_BuyandSell {
    public static void main(String[] args){

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(stockBuyandSell(arr));
    }

    // It is done by initializing the minimum price at first element and profit to 0 and then by using a loop cost is calculated for each day and the profit is change using max function and min is changed by min function which checks min and current element of the array.

    public static int stockBuyandSell(int[] arr){
        
        int min = arr[0];
        int profit = 0;

        for(int i=0; i<arr.length; i++){
            int cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, arr[i]);
        }
        return profit;

    }


}
