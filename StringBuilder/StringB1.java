package StringBuilder;

import java.util.*;

public class StringB1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        // insert
        sb.insert(2, 'n');
        System.out.println(sb);
        // delete the extra n
        sb.delete(2, 3);// here end index is exclusive
        System.out.println(sb);
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }
}
