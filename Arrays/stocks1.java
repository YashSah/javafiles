package Arrays;

//best time to buy and sell stock to maximise profit 
public class stocks1 {
    static int maxProfit(int[] a) {
        int maxProfit = 0;
        int minsofar = a[0];
        for (int i = 0; i < a.length; i++) {
            minsofar = Math.min(minsofar, a[i]);
            int profit = a[i] - minsofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int a[] = { 5, 2, 6, 1, 4 };
        int ans = maxProfit(a);
        System.out.println(ans);
    }
}
