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
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> contents;
    
    public Box(double weight) {
        this.maxWeight = weight;
        this.contents = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item) {
        if (item.weight() + weight() <= maxWeight) {
            contents.add(item);
        }
    }
    
    public double weight() {
        double weight = 0.0;
        
        for (ToBeStored item: contents) {
            weight += item.weight();
        }
        
        return weight;
    }
    
    public String toString() {
        return "Box: " + contents.size() + " things, total weight " + weight() + " kg"; 
    }
}
