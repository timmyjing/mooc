/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise36;
import java.util.Scanner;

/**
 *
 * @author timmyjing
 */
public class ReadingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + ((double)sum / count));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            } else {
                sum += number;
                count++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        
    }
    
}
