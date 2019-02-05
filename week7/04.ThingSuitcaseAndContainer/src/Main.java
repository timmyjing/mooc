
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        int n = 1;
        
        while (n <= 100) {
            Thing brick = new Thing("brick", n);
            Suitcase suitcase = new Suitcase(n);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            n++;
        }
    }

}
