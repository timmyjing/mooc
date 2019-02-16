/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.*;

/**
 *
 * @author timmyjing
 */
public class Person {
    private String name;
    private Set<String> phoneNumbers;
    private String address;
    
    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new HashSet<String>();
        this.address = null;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addNumber(String number) {
        phoneNumbers.add(number);
    }
    
    public Set<String> getNumbers() {
        return phoneNumbers;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
}
