/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

/**
 * class to define a word
 */
public abstract class Word implements Comparable {
    protected final String word;

    /**
     * constructor for the word class
     * @param word the word that is being passed in
     */
    public Word(String word){
        this.word = word;
    }

    /**
     * adding a Locaiton to a word
     * @param location where the location is that needs to be added
     */
    public abstract void addLocation(Long location);

    /**
     * turns the word to a String
     * @return the string of the word
     */
    public abstract String toString();

    /**
     * checks to see if the passed in object is equal to this
     * @param o the object passed in
     * @return true/false if it is equal
     */
    public abstract boolean equals(Object o);
}
