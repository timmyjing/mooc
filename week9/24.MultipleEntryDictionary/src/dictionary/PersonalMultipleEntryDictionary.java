/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Set;
import java.util.*;

/**
 *
 * @author timmyjing
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> entries;
    
    public PersonalMultipleEntryDictionary() {
        this.entries = new HashMap<String, Set<String>>();
    }
    
    
    @Override
    public void add(String word, String entry) {
        if (!entries.containsKey(word)) {
            entries.put(word, new HashSet<String>());
        }
        
        entries.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return entries.get(word);
    }

    @Override
    public void remove(String word) {
        entries.remove(word);
    }
    
}
