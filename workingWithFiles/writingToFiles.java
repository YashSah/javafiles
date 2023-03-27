package workingWithFiles;

import java.io.IOException;
import java.io.PrintWriter;

public class writingToFiles {
    public static void main(String args[]) throws IOException {

        // create te file and open the file
        // if the file exists it will replace the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("this is line 1");
        outputFile.println("this is line 2");
        outputFile.println("this is line 3");
        outputFile.println("this is line 4");

        outputFile.close();
    }

}
