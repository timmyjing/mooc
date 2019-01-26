
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.println("Type a temperature to input: ");
            double number = Double.parseDouble(reader.nextLine());
            if (number >= -30.0 && number <= 40.0) {
                Graph.addNumber(number);
            }
//            System.out.println("Continue? [yes/no]");
//            if (reader.nextLine().equals("no")) {
//                break;
//            }
        }

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
