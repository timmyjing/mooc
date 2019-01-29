import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int result = 0;
        
        for (Integer i: list) {
            result += i;
        }
        return result;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) * 1.0 / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double result = 0.0;
        
        for (Integer i: list) {
            result += Math.pow((i - avg), 2);
        }
        
        return result / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
