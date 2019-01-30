/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (this.players.size() >= this.maxSize) return;
        
        this.players.add(player);
    }
    
    public void printPlayers() {
        for (Player player: this.players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int size) {
        this.maxSize = size;
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int goals = 0;
        
        for (Player player: this.players) {
            goals += player.goals();
        }
        
        return goals;
    }
}
