package java112.labs1;

/**
 *  Description of the Class
 *
 *@author     Meg Cole
 *@created    February 5, 2011
 */
public class LabThree {


    /**
     *  Main processing method for the LabThree object
     *
     *@param  input  Description of the Parameter
     */
    public void run(String input) {
        System.out.println("input: " + input);
    }


    /**
     *  The main program for the LabThree class
     *
     *@param  arguments  The command line arguments
     */
    public static void main(String[] arguments) {
        LabThree lab = new LabThree();

        if (arguments.length != 1) {
            System.out.println("Please enter one argument on the command line");
            return;
        }

        lab.run(arguments[0]);

    }

}

