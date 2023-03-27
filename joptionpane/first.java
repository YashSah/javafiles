package joptionpane;

import javax.swing.*;

public class first {
    public static void main(String args[]) {
        int number;
        String input;
        input = JOptionPane.showInputDialog("please enter a number:");
        number = Integer.parseInt(input);

        if (number == 5) {
            JOptionPane.showMessageDialog(null, "the number is exactly 5!");
        }

        else if (number > 10) {
            JOptionPane.showMessageDialog(null, "the number is greater than 10!");
        }

        else if (number > 5) {
            JOptionPane.showMessageDialog(null, "the number is greater than 5!");
        }

        else {
            JOptionPane.showMessageDialog(null, "the number is less than 5!");
        }

        System.exit(0); // this helps to exit out program a bit faster when using javax.swing components
    }
}
