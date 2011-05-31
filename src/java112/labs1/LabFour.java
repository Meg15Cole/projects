package java112.labs1;

import java.io.*;

public class LabFour {

    public void run(String input){

        BufferedReader inputReader = null;
        //the BufferedReader needs to be declared here because of the scope of the
        //try - catch block.

        try {

            inputReader = new BufferedReader(new FileReader(input));

            while (inputReader.ready()) {
                String line = null;
                line = inputReader.readLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (inputReader != null) {
                    inputReader.close();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        LabFour lab = new LabFour();

        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            lab.run(args[0]);
        }

    }

}
