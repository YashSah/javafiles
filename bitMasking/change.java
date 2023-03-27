package bitMasking;

//find the no. of bits required to change to convert a no. a to another no. b
import java.util.Scanner;

public class change {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no.:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int diff = x ^ y; // xor will give 1 for the different set of bits

        // now counting the no. of one's generated
        int i = 0;
        while (diff != 0) {
            diff = diff * (diff - 1);
            i++;
        }
        System.out.println(i);
    }
}
