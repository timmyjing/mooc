/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author timmyjing
 */
public class UI {
    private Scanner reader;
    private TournamentTracker tracker;
    
    public UI(Scanner reader) {
        this.reader = reader;
        this.tracker = new TournamentTracker();
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        getJumpers();
        playRounds();
        printResults();
    }
    
    private void getJumpers() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                System.out.println("\nThe tournament begins!\n");
//                System.out.println("");
                break;
            }
            tracker.addJumper(name);
        }
    }
    
    private void playRounds() {
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println("");
            if (command.equals("jump")) {
                tracker.playRound();
                System.out.println("");
            } else {
                System.out.println("Thanks!\n");
                break;
            }
        }
    }
    
    private void printResults() {
        tracker.printResults();
    }
}
