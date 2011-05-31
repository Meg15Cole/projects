/*
 *  Class:  TokenSizeAnalyzer
 *  Author:  Meg Cole
 *  Create date: 4/13/2011
 *  Description:  This class determines the size distribution of the tokens.
 */
package java112.analyzer;

import java.util.*;
import java.io.*;

/**
 *  TokenSizeAnalzyer receives each token from the input file, and creates a tally for each
 *  size of token by it's length, generating an output file with the list of token lengths and the
 *  number of tokens of that length, as well as a histogram to illustrate the frequency of each token.
 *
 *@author     Meg Cole
 */

public class TokenSizeAnalyzer implements Analyzer {

  private Map<Integer, Counter> tokenSizes;
  private Properties properties;
  private int maximumSize;

   /**
     * Constructor for TokenSizeAnalyzer which receives the AnalyzeFile class's Properties
     *  object and instantiates the TreeMap.
     *@param  properties  Receives the properties object from the AnalyzeFile
     */

  public TokenSizeAnalyzer(Properties properties) {
        this.properties = properties;
        tokenSizes = new TreeMap<Integer, Counter>();
    }

  public Map<Integer, Counter> getTokenSizes() {
      return tokenSizes;
  }

  public int getMaximumSize()  {
      return maximumSize;
  }

  /**
     *  Process each token in input file by checking the TreeMap for each tokens' length appearance,
     *  then keeps tally of each length. It also keeps track of the maximum size
     *  of token length appearances.
     *
     *@param  token  One single word from the AnalyzeFile class.
     */
  public void processToken(String token) {

    int tokenSize = token.length();
    int currentCount = 1;

    if (tokenSizes.containsKey(tokenSize)) {
      currentCount = tokenSizes.get(tokenSize).getCount();
      tokenSizes.get(tokenSize).increment();
    } else {
      tokenSizes.put(tokenSize, new Counter());
    }

    if (currentCount > maximumSize) {
      maximumSize = currentCount;
    }
  }

  /**
     *  Write report file for TokenCountAnalyzer, including each token length and the
     *  number of times that length appears in the input file, and a histogram of frequency.
     *
     *@param  inputFilePath   Input file that was analyzed
     *
     */
  public void writeOutputFile(String inputFilePath)  {
    PrintWriter writer = null;

        String outputFilePath = properties.getProperty("output.dir")
                + properties.getProperty("output.file.token.size");

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter
                (outputFilePath)));

            for(Map.Entry<Integer, Counter> entry : tokenSizes.entrySet())  {
                int currentCount = 1;
                currentCount = tokenSizes.get(entry.getKey()).getCount();
                writer.print(entry.getKey());
                writer.print("\t");
                writer.println(currentCount);
            }

            for(Map.Entry<Integer, Counter> entry : tokenSizes.entrySet())  {
                int currentCount = 1;
                currentCount = tokenSizes.get(entry.getKey()).getCount();
                float formatNumber;
                formatNumber = maximumSize / 70;
                float totalAsterisks;
                totalAsterisks = currentCount / formatNumber;
                writer.print(entry.getKey());
                writer.print("\t");
                for (int i=0; i< totalAsterisks; i++) {
                    writer.print("*");
                }
                 writer.print("\n");
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
