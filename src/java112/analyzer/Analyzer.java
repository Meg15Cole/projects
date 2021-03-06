/*
 *  Class:  Analyzer
 *  Author:  Meg Cole
 *  Create date: 3/10/2011
 *  Description:  This class holds the abstract methods for Analyzers
 */
package java112.analyzer;

import java.util.Properties;
/**
 *  This interface creates the basic methods for the Analyzers to implement.
 *
 *@author     Meg Cole
 *@created    March 10, 2011
 */
public interface Analyzer {

    /**
     *  Abstract method which allows each Analyzer to process a token.
     *
     *@param  token  A single word from the input file.
     */
    public void processToken(String token);


    /**
     *  Abstract method which allows each Analyzer to create an output file.
     *
     *@param  inputFilePath   This is the argument passed from the command line for input file.
     *
     */
    public void writeOutputFile(String inputFilePath);

}

