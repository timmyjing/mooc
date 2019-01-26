/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise31;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class LowerAndUpperLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        while (first <= second) {
            System.out.println(first);
            first++;
        }
         
    }
    
}
