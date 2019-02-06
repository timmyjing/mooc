/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class Dictionary {
    private HashMap<String, String> translations;
    
    public Dictionary() {
        this.translations = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if (translations.containsKey(word)) {
            return translations.get(word);
        } else {
            return null;
        }
    }
    
    public void add(String word, String translation) {
        translations.put(word, translation);
    }
    
    public int amountOfWords() {
        return translations.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        
        for (String word: translations.keySet()) {
            String translation = translations.get(word);
            list.add(word + " = " + translation);
        }
        
        return list;
    }
    
}
