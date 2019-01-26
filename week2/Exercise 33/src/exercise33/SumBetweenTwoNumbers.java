/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise33;
import java.util.Scanner;
/**
 *
 * @author timmyjing
 */
public class SumBetweenTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        
        while (first <= second) {
            result += first;
            first++;
        }
        
        System.out.println("The sum is " + result);
    }
    
}
