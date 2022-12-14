package pattern;

//number pyramid
import java.util.*;

public class AdvancePattern3 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers->print row no., row no. of times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}