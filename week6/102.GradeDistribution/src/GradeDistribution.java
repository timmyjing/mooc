/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author timmyjing
 */
public class GradeDistribution {
    private final Scanner reader;
    private final ArrayList<Grade> grades;
    
    public GradeDistribution(Scanner reader) {
        this.reader = reader;
        this.grades = new ArrayList<Grade>();
    }
    
    
    public void addGrades() {
        System.out.println("Type exam scores, -1 completes:");
        
        while (true) {
            int score = Integer.parseInt(this.reader.nextLine());
            
            if (score == -1) {
//                print();
                break;
            } else if (score >= 0 && score <= 60) {
                Grade grade = new Grade(score);
                this.grades.add(grade);
            }
        }
    }
    
    public void print() {
        int[] counts = countGrades();
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            printRow(i, counts[i]);
        }
        
        double percentage = calcPercentage(counts);
        
        System.out.println("Acceptance percentage: " + percentage);
        
    }
    
    public void printRow(int grade, int count) {
        System.out.print(grade + ": ");
        
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
    public int[] countGrades() {
        int[] counts = {0,0,0,0,0,0};
        
        for (Grade grade: this.grades) {
            counts[grade.getGrade()]++;
        }
        
        return counts;
    }
    
    public double calcPercentage(int[] counts) {
        double total = 0.0;
        double accepted = 0.0;
        
        for (int i = 0; i < counts.length; i++) {
            if (i != 0) {
                accepted += counts[i];
            }
            total += counts[i];
        }
        
        return 100 * accepted / total;
    }
}
