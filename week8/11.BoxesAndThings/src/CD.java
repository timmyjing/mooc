/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private double weight;
    private int pubYear;
    
    public CD(String artist, String title, int pubYear) {
        this.artist = artist;
        this.title = title;
        this.weight = 0.1;
        this.pubYear = pubYear;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.pubYear + ")";
    }
    
}
