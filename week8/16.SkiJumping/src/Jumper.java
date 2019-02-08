/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class Jumper implements Comparable<Jumper>{
    private String name;
    private int score;
    private ArrayList<Integer> jumps;
    
    public Jumper(String name) {
        this.name = name;
        this.score = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public int getScore() {
        return score;
    }
    
    public String getName() {
        return name;
    }
    
    public int jump() {
        Random random = new Random();
        int jump = random.nextInt(61) + 60;
        jumps.add(jump);
        score += jump;
        return jump;
    }
    
    public void addVotesToScore(int votes) {
        score += votes;
    }
    
    @Override
    public int compareTo(Jumper other) {
        if (score == other.score) return 0;
        if (score > other.score) return 1;
        return -1;
    }
    
    public String toString() {
        return name + " (" + score + " points)";
    }
    
    public String getLengths() {
        String result = "";
        for (Integer jump: jumps) {
            result += jump + " m, ";
        }
        
        return result.substring(0, result.length() - 2);
    }
            
}
