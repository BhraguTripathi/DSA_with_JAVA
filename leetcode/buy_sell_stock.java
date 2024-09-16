package leetcode;

import java.util.*;

public class buy_sell_stock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(stocks(arr));

        sc.close();
    }

    public static int stocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

}
