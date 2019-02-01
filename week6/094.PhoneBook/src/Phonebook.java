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
public class Phonebook {
    private ArrayList<Person> people;
    
    public Phonebook() {
        this.people = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        this.people.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person p: this.people) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name) {
        String result = "number not known";
        
        for (Person p: this.people) {
            if (p.getName().equals(name)) {
                result = p.getNumber();
            }
        }
        
        return result;
    }
    
}
