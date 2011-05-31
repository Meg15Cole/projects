/*
 *  Class:  KeywordAnalyzer
 *  Author:  Meg Cole
 *  Create date: 4/13/2011
 *  Description:  This class searches for all instances of specified tokens.
 */
package java112.analyzer;

import java.util.*;
import java.io.*;

/**
 *  class KeywordAnalyzer receives a list of specified tokens, searches for all instances of those
 *  tokens, records their locations, and generates a report of all those locations.
 *
 *@author     Meg Cole
 */
 public class KeywordAnalyzer implements Analyzer {

   private Map<String, List<Integer>> keywordMap;
   private Properties properties;
   private int tokenOccurence;

    /**
     * Basic constructor for KeywordAnalyzer
     */
    public KeywordAnalyzer(Properties properties) {
        this.properties = properties;
        keywordMap = new HashMap<String, List<Integer>>();
        String keywordFilePath = properties.getProperty("input.file.keyword");
        readKeywordFile(keywordFilePath);
        //load the list and place the keywords into the Map.
    }

    public Map<String, List<Integer>> getKeywordMap()  {
        return keywordMap;
    }

    /**
     * Receives the string read from the input file one line at a time.
     *
     *@param  String  Receives the string pathfile.
     */
    public void readKeywordFile(String keywordFilePath)  {

        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(keywordFilePath));
            while (input.ready()) {
                String line = null;
                line = input.readLine();
                tokenizeLine(line);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
/**
     * Receives the line from the keyword.txt file, and parses the comma delimited string.
     *@param  String  Receives the string from the readKeywordFile method.
     */
    private void tokenizeLine(String line) {
        String[] lineTokenArray = line.split(", ");
        for(int i = 0; i<lineTokenArray.length; i++) {
            List<Integer> locList = new ArrayList<Integer>();
            keywordMap.put(lineTokenArray[i], locList);
        }
    }

    /**
     *  Process each token in input file.
     *
     *@param  token  Description of the Parameter
     */
    public void processToken(String token) {
        tokenOccurence++;

        if (keywordMap.containsKey(token)) {
          List<Integer> l = keywordMap.get(token);
          l.add(tokenOccurence);
        }
    }

    /**
     *  Write report file for KeywordAnalyzer
     *
     *@param  inputFilePath   Input file that was analyzed
     *@param  outputFilePath  Path to output file
     */
    public void writeOutputFile(String inputFilePath) {

        PrintWriter writer = null;

        String outputFilePath = properties.getProperty("output.dir")
                + properties.getProperty("output.file.keyword");

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter
                    (outputFilePath)));
            for(Map.Entry<String, List<Integer>> entry : keywordMap.entrySet()){
                writer.print("\n\n" + entry.getKey());
                writer.print(" = \n");
                writer.print("[");
                List<Integer> list = entry.getValue();
                for(int i=0;i<list.size();i++) {
                    if (i == 0) {
                        writer.print(list.get(i) + ", ");
                    } else {

                        if (i != (list.size()-1)) {

                          if(i%8 != 0) {
                            writer.print(list.get(i) + ", ");
                          } else {
                            writer.print("\n" + list.get(i) + ", ");
                          }
                        } else {
                            if(i%8 != 0) {
                                writer.print(list.get(i) + "]");
                            } else {
                                writer.print("\n" + list.get(i) + "]");
                            }
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println ("Error creating KeywordAnalyzer output file.");
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
