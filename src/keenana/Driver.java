/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static final String DATA_FOLDER = "data";

    public static void main(String[] args) {
        // Instantiate your collections and other variables here

        // ask user for file

        // read file into Scanner
      
        // trim heading out of file

        // generate words and add to a list

        // generate bigrams from list
      
        // generate vocabulary from list

        // sort the data

        // Save vocabulary as a text file

        // Save bigrams as a text file

        // generate reports

        // Ask for how many top entries to show

        // report the top entries for vocabulary

        // report the top entries for bigrams

    }
    private static String getInput(Scanner in, String message){
        System.out.println(message);
        return in.next();
    }
    private static void removeHeader(Scanner read){

    }
    private static void addWords(ArrayList<BasicWord> words, Scanner read){

    }
    private static String normalize(String s){
        return null;
    }
    private static void addBigrams(ArrayList<Word> bigrams, ArrayList<BasicWord> words){

    }
    private static void addVocabulary(ArrayList<Word> vocabulary, ArrayList<BasicWord> words){

    }
    private static void saveFile(ArrayList<Word> list, File output) throws FileNotFoundException {
        PrintWriter p = new PrintWriter(output);

    }
    private static void report(ArrayList<Word> list, String type, int topHits){

    }

    
}
