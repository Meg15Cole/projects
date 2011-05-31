/*
 *  Class:  TokenCountAnalyzer
 *  Author:  Meg Cole
 *  Create date: 3/10/2011
 *  Description:  This class creates a tally of each token.
 */
package java112.analyzer;

import java.util.*;
import java.io.*;

/**
 *  TokenCountAnalzyer receives each token from the input file, and creates a tally for each
 *  token, generating an output file with the list of tokens and then the number of times they
 *  appeard in the input file.
 *
 *@author     Meg Cole
 */
 public class TokenCountAnalyzer implements Analyzer {

    private Properties properties;
    private Map<String, Integer> tokenCounts;

    public Map getTokenCounts() {
        return tokenCounts;
    }

    /**
     * Basic constructor for TokenCountAnalyzer
     */
    public TokenCountAnalyzer()  {}

    /**
     * Constructor for TokenCountAnalyzer which receives the AnalyzeFile class's Properties
     *  object and instantiates the TreeMap.
     *@param  properties  Receives the properties object from the AnalyzeFile
     */
    public TokenCountAnalyzer(Properties properties) {
        this.properties = properties;
        tokenCounts = new TreeMap<String, Integer>();
    }

    /**
     *  Process each token in input file by checking the TreeMap for each tokens appearance,
     *  then keeps tally of each time that token reappears.
     *
     *@param  token  One single word from the AnalyzeFile class.
     */
    public void processToken(String token) {

        int count = 1;

        if(tokenCounts.containsKey(token))  {
            count = tokenCounts.get(token);
            tokenCounts.put(token, ++count);
        } else {
            tokenCounts.put(token, count);
        }
    }

    /**
     *  Write report file for TokenCountAnalyzer, including each unique token and the
     *  number of times it appears in the input file.
     *
     *@param  inputFilePath   Input file that was analyzed
     *
     */
    public void writeOutputFile(String inputFilePath) {

        PrintWriter writer = null;

        String outputFilePath = properties.getProperty("output.dir")
                + properties.getProperty("output.file.token.count");

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter
                (outputFilePath)));
            for(Map.Entry<String, Integer> entry : tokenCounts.entrySet())  {
                writer.print(entry.getKey());
                writer.print("\t");
                writer.println(entry.getValue());
            }

        } catch (IOException ioe) {
            System.out.println ("Error creating name output file.");
            ioe.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Something really bad happened.");
            exception.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception closeException) {
                System.out.println("Something really bad happened.");
                closeException.printStackTrace();
            }
        }

    }
 }
