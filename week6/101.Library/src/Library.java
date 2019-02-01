/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void printBooks() {
        for (Book book: this.books) {
            System.out.println(book);
        }
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> books = new ArrayList<Book>();
        
        for (Book book: this.books) {
            if (book.title().contains(title)) {
                books.add(book);
            }
        }
        
        return books;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> books = new ArrayList<Book>();
        
        for (Book book: this.books) {
            if (book.publisher().contains(publisher)) {
                books.add(book);
            }
        }
        
        return books;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> books = new ArrayList<Book>();
        
        for (Book book: this.books) {
            if (book.year() == year) {
                books.add(book);
            }
        }
        
        return books;
    }
    
}
