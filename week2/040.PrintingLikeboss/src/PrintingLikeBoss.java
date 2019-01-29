public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int n = 0;
        while (n < amount) {
            System.out.print("*");
            n++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int n = 0;
        while (n < amount) {
            System.out.print(" ");
            n++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        // 40.2
        int n = 1;
        while (n <= size) {
            printWhitespaces(size - n);
            printStars(n);
            n++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int n = 0;
        while (n < height) {
            printWhitespaces(height - n - 1);
            printStars(1 + 2 * n);
            n++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
