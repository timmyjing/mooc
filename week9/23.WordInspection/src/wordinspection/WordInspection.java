/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) throws Exception {
        this.file = file;
    }
    
    public int wordCount() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int count = 0;
        
        while (reader.hasNextLine()) {
            reader.nextLine();
            count++;
        }
        
        return count;
    }
    
    public List<String> wordsContainingZ() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while (reader.hasNext()) {
            String string = reader.next();
            if (string.contains("z")) {
                list.add(string);
            }
        }
        
        reader.close();
        return list;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        List<String> finWords = getFinnishWords();
//        System.out.println("l".endsWith("l"));
//        for (String word: finWords) {
//            if (word.endsWith("l")) {
//                list.add(word);
//            }
//        }
        
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.endsWith("l")) {
                list.add(word);
            }
        }
        
        reader.close();
        
        return list;
    }
    
    public List<String> getFinnishWords() throws Exception{
        File words = new File("src/shortList.txt");
        Scanner reader = new Scanner(words, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while (reader.hasNext()) {
            list.add(reader.next());
        }
        
        reader.close();
        return list;
    }
    
    public List<String> palindromes() throws Exception {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            if (isPalindrome(word)) list.add(word);
        }
        
        reader.close();
        
        return list;    
    }
    
    private boolean isPalindrome(String word) {
        int mid = word.length() / 2;
        int len = word.length() - 1;
        
        for (int i = 0; i < mid; i++) {
            if (word.charAt(i) != word.charAt(len - i)) {
                return false;
            }
        }
        
        return true;
    }
    
    
    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNext()) {
            String word = reader.next();
            if (containsVowels(word)) list.add(word);
        }
        
        return list;
    }
    
    private boolean containsVowels(String word) {
        String vowels = "aeiouyäö";
        
        for (int i = 0; i < vowels.length(); i++) {
            String curr = Character.toString(vowels.charAt(i));
            if (!word.contains(curr)) return false;
        }
        
        return true;
    }
}
