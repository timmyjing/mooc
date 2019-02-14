/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;

/**
 *
 * @author timmyjing
 */

import java.util.Scanner;

public class Analysis {
    private File file;
    
    public Analysis(File file) throws Exception {
        this.file = file;
    }
    
    public int lines() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int count = 0;
        
        while (reader.hasNextLine()) {
            reader.nextLine();
            count++;
        }
        
        reader.close();

        
        return count;
    }
    
    public int characters() throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        int count = 0;
        
        while (reader.hasNextLine()) {
            String string = reader.nextLine();
            count += string.length() + 1;

        }
        reader.close();
        return count;
    }
    
}
