/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 *
 * @author timmyjing
 */
public class TournamentTracker {
    private ArrayList<Jumper> jumpers;
    private int rounds;
    
    public TournamentTracker() {
        this.jumpers = new ArrayList<Jumper>();
        this.rounds = 1;
    }
    
    public void addJumper(String name) {
        Jumper jumper = new Jumper(name);
        jumpers.add(jumper);
    }
    
    public int getRound() {
        return rounds;
    }
    
    public void playRound() {
        System.out.println("Round " + rounds);
        System.out.print("\n");
        sortByPoints();
        printOrder();
        System.out.println("");
        System.out.println("Results of round " + rounds);
        for (Jumper jumper: jumpers) {
            System.out.println("  " + jumper.getName());
            int length = jumper.jump();
            System.out.println("    length: " + length);
            ArrayList<Integer> votes = judgeVotes();
            jumper.addVotesToScore(calculateVotes(votes));
        }
        rounds++;
    }
    
    public void sortByPoints() {
        Collections.sort(jumpers);        
    }
    
    public void printOrder() {
        System.out.println("Jumping order: ");
        int i = 1;
        
        for (Jumper jumper: jumpers) {
            System.out.println("  " + i + ". " + jumper);
            i++;
        }
    }
    
    public void printResults() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        int n = 1;
        for (Jumper jumper: jumpers) {
            System.out.println(n + "           " + jumper);
            System.out.println("             jump lengths: " + jumper.getLengths());
            n++;
        }        
    }
    
    private ArrayList<Integer> judgeVotes() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        System.out.print("    judge votes: [");
        
        for (int i = 0; i < 5; i++) {
            int vote = random.nextInt(11) + 10;
            result.add(vote);
            System.out.print(vote);
            if (i != 4) System.out.print(", ");
        }
        System.out.print("]");
        System.out.println("");
        
        return result;
    }
    
    private int calculateVotes(ArrayList<Integer> votes) {
        int sum = 0;
        
        for (Integer vote: votes) {
            sum += vote;
        }
        return sum - (Collections.max(votes) + Collections.min(votes));
    }
}
