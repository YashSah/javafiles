package Arrays;

public class kadanes {
    static int maxSumSubArray(int a[]) {
        int maxsum = 0;
        int cursum = 0;

        for (int i = 0; i < a.length; i++) {
            cursum = cursum + a[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String args[]) {
        int a[] = { 5, -4, -2, 6, -1 };
        int ans = maxSumSubArray(a);
        System.out.println(ans);
    }
}