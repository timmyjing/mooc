import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String result = "";
        int n = 0;
        
        while (n < this.length) {
            result += randomChar();
            n++;
        }
        return result;
    }
    
    private char randomChar() {
        int number = random.nextInt(26);
        return "abcdefghijklmnopqrstuvwxyz".charAt(number);
    }
}
