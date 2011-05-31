/*
 *  Class:  BigWordAnalyzer
 *  Author:  Meg Cole
 *  Create date: 3/10/2011
 *  Description:  This class creates a report of the tokens with the most characters.
 */
package java112.analyzer;

import java.util.*;
import java.io.*;

/**
 *  class BigWordAnalyzer will receive tokens from the AnalyzerFile class, process the tokens to
 * find the largest tokens, and output them in a report.
 *
 *@author     Meg Cole
 */
 public class BigWordAnalyzer implements Analyzer {

    private Properties properties;
    private Set<String> bigWords;
    private int minimumWordLength;

    /**
     * Basic constructor for BigWordAnalyzer
     */
    public BigWordAnalyzer()  {}

     /**
     * Constructor for BigWordAnalyzer which receives the properties object from AnalyzeFile,
     *  and instantiates the TreeSet.
     *@param  properties  Receives the properties object from the AnalyzeFile
     */
    public BigWordAnalyzer(Properties properties) {
        this.properties = properties;
        bigWords = new TreeSet<String>();
        minimumWordLength = Integer.parseInt(
            properties.getProperty("bigwords.minimum.length"));
    }

   /**
     * returns the TreeSet which holds the set of biggest tokens.
     */
    public Set<String> getBigWords()  {
        return bigWords;
    }


    /**
     *  Process each token in input file and add it to the TreeSet.
     *
     *@param  token  One single word from the AnalyzeFile class.
     */
    public void processToken(String token) {
        if(token.length() >= minimumWordLength)  {
             bigWords.add(token);
        }

    }

    /**
     *  Write report file for BigWordAnalyzer
     *
     *@param  inputFilePath   Input file that was analyzed
     *
     */
    public void writeOutputFile(String inputFilePath) {
        PrintWriter output = null;
        String outputFilePath = properties.getProperty("output.dir")
                + properties.getProperty("output.file.bigwords");

        try {
            output = new PrintWriter(new BufferedWriter
                (new FileWriter(outputFilePath)));
            for (String word : bigWords) {
                output.println(word);
            }

        } catch (IOException ioe) {
            System.out.println ("Error creating BigWord output file.");
            ioe.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Something really bad happened.");
            exception.printStackTrace();
        } finally {
            try {
                if (output != null) {
                    output.close();
                }
            } catch (Exception closeException) {
                System.out.println("Something really bad happened.");
                closeException.printStackTrace();
            }
        }
    }
}
