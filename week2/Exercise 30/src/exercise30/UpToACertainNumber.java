/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise30;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class UpToACertainNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int number = Integer.parseInt(reader.nextLine());
        int count = 1;
        while (count <= number) {
            System.out.println(count);
            count++;
        }
        
    }
    
}
