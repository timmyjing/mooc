
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
//         printWithSmileys("Method");
//         printWithSmileys("Beerbottle");
//         printWithSmileys("Interface");
         printWithSmileys("\\:D/");
         printWithSmileys("87.");
    }
    
    private static void printWithSmileys(String string) {
        int length = (string.length() + 4) / 2;
        
        if (string.length() % 2 != 0) {
            length++;
            string += " ";
        }
        
        printRow(length);
        System.out.println(":) " + string + " :)");
        printRow(length);
    }
    
    private static void printRow(int numSmileys) {
        int n = 0;
        
        while (n <= numSmileys) {
            System.out.print(":)");
            n++;
        }
        System.out.println("");
    }

}
