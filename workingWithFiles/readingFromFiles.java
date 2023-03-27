package workingWithFiles;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.util.*;

public class readingFromFiles {
    public static void main(String args[]) throws IOException {
        File file = new File("OutputFile.txt");
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());

            sc.close();

        } else {
            JOptionPane.showMessageDialog(null, "the file does not exist!");
        }
    }
}
