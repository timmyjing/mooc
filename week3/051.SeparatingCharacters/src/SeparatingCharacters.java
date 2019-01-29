
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int n = 0;
        while (n < name.length()) {
            System.out.println((n + 1) + ". character: " + name.charAt(n));
            n++;
        }
        
    }
}
