
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int result = number1;
        
        if (number2 > result) {
            result = number2;
        }
        
        if (number3 > result) {
            result = number3;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
