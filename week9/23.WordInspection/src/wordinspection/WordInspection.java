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
        
        return list;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        return list;
    }
}
