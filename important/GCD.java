package important;

//to find greatest common divisor
public class GCD {
    public static void main(String args[]) {
        System.out.println(gcd(24, 60));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
