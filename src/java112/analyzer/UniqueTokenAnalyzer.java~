/*
 *  Class:  UniqueTokenAnalyzer
 *  Author:  Meg Cole
 *  Create date: 3/10/2011
 *  Description:  This class creates a unique token list
 */
package java112.analyzer;

import java.util.*;
import java.io.*;

/**
 *  This class will add each unique token to a TreeSet, and create an output
 *  file with each unique token on a separate line.
 *
 *@author     Meg Cole
 *@created    March 10, 2011
 */
public class UniqueTokenAnalyzer implements Analyzer {

    private Properties properties;

    private Set<String> uniqueTokensList;

    /**
     *  Constructor for the UniqueTokenAnalyzer object
     */
    public UniqueTokenAnalyzer() { }


    /**
     *  Constructor for the UniqueTokenAnalyzer object
     *
     *@param  properties  Receives the properties object from the AnalyzeFile
     */
    public UniqueTokenAnalyzer(Properties properties) {
        this.properties = properties;
        uniqueTokensList = new TreeSet<String>();
    }


    /**
     *  Gets the uniqueTokensList attribute of the UniqueTokenAnalyzer object
     *
     *@return    The uniqueTokensList value
     */
    public Set getUniqueTokensList() {
        return uniqueTokensList;
    }


    /**
     *  This method will receive the token and add it to the TreeSet.
     *
     *@param  token  This is a single word from the input file.
     */
    public void processToken(String token) {
        uniqueTokensList.add(token);
    }


    /**
     *  This method will create an output file containing each unique token on a
     *  separate line.
     *
     *@param  inputFilePath   This is the argument passed from the command line
     *      for input file.
     */
    public void writeOutputFile(String inputFilePath) {
        PrintWriter output = null;
        String outputFilePath = properties.getProperty("output.dir")
                 + properties.getProperty("output.file.unique");

        try {
            output = new PrintWriter(new BufferedWriter
                    (new FileWriter(outputFilePath)));

            for (String word : uniqueTokensList) {
            output.println(word);
            }

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
}

