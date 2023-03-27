package Arrays;

//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

public class stocks2 {
    static int maxProfit(int a[]) {
        int profit = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                profit += (a[i] - a[i - 1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int a[] = { 5, 2, 6, 1, 4, 7, 3, 6 };
        int ans = maxProfit(a);
        System.out.println(ans);
    }
}
