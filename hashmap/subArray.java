package hashmap;

//find the subarray with the given sum
import java.util.HashMap;

public class subArray {
    static void subArraySum(int a[], int sum) {
        int curSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            curSum += a[i];
            if (curSum - sum == 0) // to check if the subarray is at the very start
            {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curSum - sum)) {
                start = map.get(curSum - sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        if (end == -1) {
            System.out.println("not found");
        } else {
            System.out.println(start + "," + end);
        }
    }

    public static void main(String args[]) {
        int[] a = { 10, 15, -5, 15, -10, 5 };
        subArraySum(a, 5);
    }
}
