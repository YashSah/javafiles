package Recursion;

//joshephus problem
public class jos {
    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (jos(n - 1, k) + k) % n;
        }
    }

    public static void main(String args[]) {
        int ans = jos(5, 3);
        System.out.println(ans);
    }
}