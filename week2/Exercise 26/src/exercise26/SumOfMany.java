/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise26;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class SumOfMany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            // DO SOMETHING HERE
            sum = sum + read;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
    
}
