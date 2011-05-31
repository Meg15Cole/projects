package java112.labs1;

import java.io.*;

public class LabFive {

    public void run(String filename, String message) {
        PrintWriter output = null;

        try {

            output = new PrintWriter(new BufferedWriter(new FileWriter(filename)));

            output.println(message);

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
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
            LabFive lab = new LabFive();
            lab.run(args[0], args[1]);
        } else {
            System.out.println("Please enter two arguments on the command line, a file name and a message");
        }
    }

}
