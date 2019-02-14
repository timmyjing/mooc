/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author timmyjing
 */
public class Printer {
    private String filename;
    
    public Printer(String filename) throws Exception {
        this.filename = filename;
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        File file = new File(filename);
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            
            if (word.isEmpty() || line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
