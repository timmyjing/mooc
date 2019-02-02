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
public class BirdDatabase {
    private final Scanner reader;
    private final ArrayList<Bird> birds;
    
    public BirdDatabase(Scanner reader) {
        this.reader = reader;
        this.birds = new ArrayList<Bird>();
    }
    
    public void run() {
        
        while (true) {
            System.out.print("? ");

            String command = this.reader.nextLine();
            if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("Statistics")) {
                statistics();
            } else if (command.equals("Show")) {
                show();
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }
    
    public void add() {
        System.out.print("Name: ");
        String name = this.reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = this.reader.nextLine();
        
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
        
    }
    
    public void observation() {
        System.out.print("What was observed?: ");
        String name = this.reader.nextLine();
        
        for (Bird bird: this.birds) {
            if (bird.name().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        
        System.out.println("Is not a bird!");
        
    }
    
    public void statistics() {
        for (Bird bird: this.birds) {
            System.out.println(bird);
        }
    }
    
    public void show() {
        System.out.print("What? ");
        String search = this.reader.nextLine();
        
        for (Bird bird: this.birds) {
            if (bird.name().contains(search)) {
                System.out.println(bird);
                break;
            }
        }
    }
}
