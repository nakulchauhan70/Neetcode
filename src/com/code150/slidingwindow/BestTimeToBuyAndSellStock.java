package com.code150.slidingwindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
//        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length == 1) {
            return maxProfit;
        }

        int buy = 0;
        int sell = 1;

        while (buy < prices.length && sell < prices.length) {
            maxProfit = Math.max(prices[sell] - prices[buy], maxProfit);

            if (prices[buy] >= prices[sell]) {
                buy = sell;
            }

            sell++;

        }

        return maxProfit;

    }
}
