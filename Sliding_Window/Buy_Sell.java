package Sliding_Window;

public class Buy_Sell {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int val : prices){
            min = Math.min(val, min);
            max = Math.max(val - min, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}

// more efficent and understandable
// int min_val = Integer.MAX_VALUE;
//         int prof = 0;
//         for(int i = 0; i < prices.length; i++) {
//             if(prices[i] < min_val){
//                 min_val = prices[i];
//             }else if(prices[i] - min_val > prof){
//                 prof = prices[i] - min_val;
//             }
//         }
//         return prof;
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
