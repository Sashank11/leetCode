package Sliding_Window;

public class Buy_Sell {
    public static int maxProfit(int[] prices) {
        
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
//  Not so efficient
    //     int j = 1;
    //     int i = 0;
    //     int max = 0;
    //     while(j < prices.length) {
    //         if(prices[i] < prices[j]) {
    //             max = Math.max(max, prices[j] - prices[i]);
    //             j++;
    //         }else{
    //         i++;
    //         j = i + 1;
    //         }
    //     }
    // return max;
