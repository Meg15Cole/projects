package java112.labs1;

import java.util.*;
import java.io.*;

public class LabEight {
    /*private Set<String> set;

    public void run(String outputFilePath) {
        set = new TreeSet<String>();

        set.add("one");
        set.add("one");
        set.add("five");
        set.add("two");
        set.add("four");
        set.add("two");
        set.add("three");
        set.add("three");
        set.add("four");
        set.add("three");

        writeListToOutputFile(outputFilePath);

    }

    public void writeListToOutputFile(String outputFilePath) {
        PrintWriter outWriter = null;

        try {
            outWriter = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)));
            for (String word : set){
            outWriter.println(word);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (outWriter != null) {
                    outWriter.close();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        if (args.length == 1) {
            LabEight lab = new LabEight();
            String outputFileName = args[0];
            lab.run(outputFileName);
        } else {
            System.out.println("Please enter one argument on the command line, an output file name");
            return;
            //terminates code
        }
    }*/
}
