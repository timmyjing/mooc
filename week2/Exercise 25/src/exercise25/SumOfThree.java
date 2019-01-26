/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise25;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class SumOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        // WRITE YOUR PROGRAM HERE
        // USE ONLY THE VARIABLES sum, reader AND read!
        System.out.println("Type the first number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        sum = sum + Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        sum = sum + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + sum);
        
    }
    
}
