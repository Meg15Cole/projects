package java112.labs1;

import java.io.*;

public class LabSix {

    public void run(String inputFileName, String outputFileName) {

        BufferedReader inFileName = null;
        PrintWriter output = null;
        String line = null;

        try {

            inFileName = new BufferedReader(new FileReader(inputFileName));
            output = new PrintWriter(new BufferedWriter(
                new FileWriter(outputFileName)));

            while (inFileName.ready()) {

                line = inFileName.readLine();
                output.println(line);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (inFileName != null) {
                    inFileName.close();
                }

                if (output != null) {
                    output.close();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        if (args.length == 2) {
            LabSix lab = new LabSix();
            lab.run(args[0], args[1]);
        } else {
            System.out.println("Please enter two arguments on the command line, an input file name and an output file name");
        }

    }
}
