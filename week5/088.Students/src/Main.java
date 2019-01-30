
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String name;
        String studentId;
        Student student;
        
        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            
            if (name.isEmpty()) {
                for (Student s: students) {
                    System.out.println(s);
                }
                
                System.out.println("Give search term: ");
                String term = reader.nextLine();
                System.out.println("Result:");
                
                for (Student s: students) {
                    if (s.getName().contains(term)) {
                        System.out.println(s);
                    }
                }
                
                break;
            }
            
            System.out.println("studentnumber: ");
            studentId = reader.nextLine();
            student = new Student(name, studentId);
            students.add(student);
        }
    }
}
