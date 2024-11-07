/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

import java.util.ArrayList;

/**
 * the vocabulary entry object which takes in a basic word
 * and adds it to the vocabulary
 */
public class VocabularyEntry extends Word {
    private int occurences;
    private final ArrayList<Long> locations;

    /**
     * constructor for the vocabulary entry
     * @param basic the basic word that is added and tracked
     */
    public VocabularyEntry(BasicWord basic){
        super(basic.toString());
        occurences = 0;
        locations = new ArrayList<>();
        addLocation(basic.getLocation());
    }

    public int getOccurences() {
        return occurences;
    }
    public ArrayList<Long> getLocations(){
        return locations;
    }
    @Override
    public int compareTo(Word o) {
        return word.compareTo(o.toString());
    }

    @Override
    public void addLocation(Long location) {
        locations.add(location);
        occurences++;
    }

    @Override
    public String toString() {
        return String.format("%15s %-4s", word, occurences);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof VocabularyEntry)) {
            return false;
        } else if (o == this) {
            return true;
        } else {
            return this.toString().equals(o.toString());
        }
    }
}
