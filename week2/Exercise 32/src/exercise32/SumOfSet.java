/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise32;
import java.util.Scanner;
/**
 *
 * @author timmyjing
 */
public class SumOfSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int result = 0;
        
        while (i <= number) {
            result += i;
            i++;
        }
        
        System.out.println("Sum is " + result);
    }
    
}
