/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

import java.util.ArrayList;

public class Bigram extends Word {
    private final String word2;
    private int occurences;
    private final ArrayList<Long> locations;
    public Bigram(BasicWord word1, BasicWord word2){
        super(word1.toString());
        this.word2 = word2.toString();
        locations = new ArrayList<>();
        occurences = 0;
        addLocation(word1.getLocation());
    }

    public int getOccurences() {
        return occurences;
    }

    @Override
    public int compareTo(Word o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public void addLocation(Long location) {
        locations.add(location);
        occurences++;
    }

    @Override
    public String toString() {
        String temp = word+" "+word2;
        return String.format("%15s %-4s", temp, occurences);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram)) {
            return false;
        } else if (o == this) {
            return true;
        } else {
            return this.toString().equals(o.toString());
        }
    }
}
