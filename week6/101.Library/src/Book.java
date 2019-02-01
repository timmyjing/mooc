/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class Book {
    private String title;
    private int year;
    private String publisher;
    
    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    public String toString() {
        return title() + ", " + publisher() + ", " + year();
    }
}
