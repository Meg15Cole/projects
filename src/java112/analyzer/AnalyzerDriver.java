/*
 *  Class:  AnalyzerDriver
 *  Author:  Meg Cole
 *  Create date: 3/10/2011
 *  Description:  This class holds the main method for project2
 */
package java112.analyzer;

/**
 *  This class starts the processing of project2.
 *
 *@author     Meg Cole
 *@created    March 10, 2011
 */
public class AnalyzerDriver {

    /**
     *  The main program for the AnalyzerDriver class
     *
     *@param  arguments  The command line arguments which includes an input file name and
     *                                  the location of a properties file.
     */
    public static void main(String[] arguments) {
        AnalyzeFile analyzer = new AnalyzeFile();
        analyzer.runAnalysis(arguments);
    }

}

