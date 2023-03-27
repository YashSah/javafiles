package important;

//program to calculate fast power
public class moduloArith {
    public static void main(String args[]) {
        System.out.println(fastPower(3978432, 5, 1000000007));
    }

    static long fastPower(int a, int b, int n) {
        long res = 1;
        while (b > 0) {

            // to check if b is odd or not
            if ((b & 1) != 0) // lsb of odd no. is always 1 and lsb of even no. is 0
            {
                res = (res % n * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1; // if we right shift a no.by 1 then it is divided by 2 and left shift by 1 is
                        // multiply by 2
        }
        return res;
    }
}
