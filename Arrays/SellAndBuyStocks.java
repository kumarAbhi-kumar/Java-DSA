public class SellAndBuyStocks {

    public static int profit(int []arr){
        int lenOfArray = arr.length;
        if( lenOfArray == 1 ){
            return 0;
        }
        else if( lenOfArray == 2 ){
            return (Math.max(arr[0], arr[1]) - Math.min(arr[0], arr[1]));
        }

        int profit = 0;
        int minBuyingPrice = arr[0];

        for( int i = 1; i < lenOfArray; i++ ){
            if( arr[i] > minBuyingPrice )
                profit = Math.max( profit, (arr[i] - minBuyingPrice) );
            else if( arr[i] < minBuyingPrice )
                minBuyingPrice = arr[i];
        }

        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Net Profit: " + profit(arr));
    }
}
