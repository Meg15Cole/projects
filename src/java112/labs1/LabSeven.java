package java112.labs1;

import java.util.*;
import java.io.*;

public class LabSeven {
    /*private List<String> list;

    public void run(String outputFilePath) {
        list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        writeListToOutputFile(outputFilePath);

    }

    public void writeListToOutputFile(String outputFilePath) {
        PrintWriter outWriter = null;

        try {
            outWriter = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)));
            for (String word : list){
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
        LabSeven lab = new LabSeven();

        if (args.length == 1) {
            String outputFileName = args[0];
            lab.run(outputFileName);
        } else {
            System.out.println("Please enter one argument on the command line, an output file name");
            return;
            //terminates code
        }
    }*/
}
