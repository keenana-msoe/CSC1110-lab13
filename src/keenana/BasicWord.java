/*
 * Course: CSC-1110
 * Term: Fall 2023
 * Assignment: Text Processing
 * Name: Andrew Keenan
 * Date: 11-29-23
 */
package keenana;

/**
 * basicWord object which defines a basic word and its location
 */
public class BasicWord extends Word {
    private final long location;

    /**
     * constructor for the basic word
     * @param word the word that is a basic word
     * @param location the location of th ebasic word
     */
    public BasicWord(String word, long location){
        super(word);
        this.location = location;
    }

    public long getLocation() {
        return location;
    }

    @Override
    public int compareTo(Word o) {
        return word.compareTo(o.toString());
    }

    @Override
    public void addLocation(Long location) {
        throw new UnsupportedOperationException("Cannot call addLocation from a basic word.");
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BasicWord)) {
            return false;
        } else if (o == this) {
            return true;
        } else {
            return this.toString().equals(o.toString());
        }
    }
}
