package java112.labs1;

import java.io.*;

public class ExceptionDemo {

    public void run() {

        BufferedReader input = null;

        try {

        input = new BufferedReader(new FileReader("compile.sh"));
        //if you have the file closed here, the file won't be closed if it couldn't find the file.
        //place the close command in a finally block.
        input.readLine();


        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
            input.close();
            //we need this try/catch for if the file was never found. If you have an exception
            //here, then there will be a hanging connection, but at least you've done
            //everything you can.  The important thing is to catch the exception.
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
        //in the beginning with programming, don't even try to catch the exceptions, then
        //compile and the error will tell you which class of exception you need to address.
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
    }
}
