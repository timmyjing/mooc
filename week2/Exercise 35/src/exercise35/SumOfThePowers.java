/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise35;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class SumOfThePowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        
        while (i <= number) {
            result += Math.pow(2, i);
            i++;
        }
        
        System.out.println("The result is " + result);
    }
    
}
