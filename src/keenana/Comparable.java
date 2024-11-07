/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

/**
 * interface for comparable words
 * contains a compareTo method
 */
public interface Comparable {
    /**
     * the comareTo method compares two words and their index
     * in the text.
     * @param o the word that this is being compared to
     * @return the difference in index
     */
    public abstract int compareTo(Word o);
}
