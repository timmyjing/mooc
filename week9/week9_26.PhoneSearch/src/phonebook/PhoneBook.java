/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;
import java.util.*;
import person.Person;

/**
 *
 * @author timmyjing
 */
public class PhoneBook {
    private Map<String, Person> byName;
    private Map<String, Person> byPhone;
    
    public PhoneBook() {
        this.byName = new HashMap<String, Person>();
        this.byPhone = new HashMap<String, Person>();
    }
    
    public void addNumber(String name, String number) {        
        if (!byName.containsKey(name)) {
            byName.put(name, new Person(name));
        }
        
        Person person = byName.get(name);        
        person.addNumber(number);
        byPhone.put(number, person);        
    }
    
    public void addAddress(String name, String address) {
        if (!byName.containsKey(name)) {
            byName.put(name, new Person(name));
        }
        
        Person person = searchByName(name);
        person.setAddress(address);        
    }
    
    public Person searchByName(String name) {
        return byName.get(name);
    }
    
    public Person searchByPhone(String number) {
        return byPhone.get(number);
    }
    
    public Set<String> phoneNumbersByName(String name) {
        if (!byName.containsKey(name)) return new HashSet<String>();
        
        return searchByName(name).getNumbers();
    }
    
    public String nameByPhoneNumber(String number) {
        if (!byPhone.containsKey(number)) return null;
        
        return searchByPhone(number).getName();
    }
}
