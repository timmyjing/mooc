/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.*;
/**
 *
 * @author timmyjing
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> entries;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        this.entries = new HashSet<String>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (entries.contains(characterString)) {
            duplicates++;
        } else {
            entries.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return entries;
    }

    @Override
    public void empty() {
        entries.clear();
        duplicates = 0;
    }
    
}
