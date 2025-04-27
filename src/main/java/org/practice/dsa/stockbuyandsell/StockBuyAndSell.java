package org.practice.dsa.stockbuyandsell;

public class StockBuyAndSell {


    public int getMaxProfitByBruteForce(int[] arr) {
        int maxProfit =0;
        for(int i=0; i<arr.length; i++) {
            int currMaxProfit =0;
            for(int j=i+1; j<arr.length; j++) {
                 currMaxProfit = Math.max(arr[j] - arr[i], currMaxProfit);
            }
            maxProfit = Math.max(currMaxProfit, maxProfit);
        }
        return maxProfit;
    }

    public int getMaxProfitByGreedy(int[] arr) {
        int maxProfit =0;
        int currBuyPoint = arr[0];
        for(int i=1; i<arr.length; i++) {
            currBuyPoint = Math.min(arr[i], currBuyPoint);
            maxProfit = Math.max(arr[i] - currBuyPoint, maxProfit);
        }
        return maxProfit;
    }
}
