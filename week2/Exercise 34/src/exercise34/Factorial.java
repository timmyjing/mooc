/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise34;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Factorial is " + result);
    }
    
}
