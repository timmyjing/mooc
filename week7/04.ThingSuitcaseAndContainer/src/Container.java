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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (canAddSuitcase(suitcase)) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    private boolean canAddSuitcase(Suitcase suitcase) {
        return (suitcase.totalWeight() + totalWeight() <= this.maxWeight);
    }
    
    public int totalWeight() {
        int total = 0;
        
        for (Suitcase suitcase: this.suitcases) {
            total += suitcase.totalWeight();
        }
        
        return total;
    }
    
    public void printThings() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printThings();
        }
    }
}
