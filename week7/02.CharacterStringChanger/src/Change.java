/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class Change {
    private char fromChar;
    private char toChar;
    
    public Change(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
    }
    
    public String change(String string) {
        String result = "";
        
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            
            if (ch == this.fromChar) {
                result += toChar;
            } else {
                result += ch;
            }
        }
        
        return result;
    }
}
