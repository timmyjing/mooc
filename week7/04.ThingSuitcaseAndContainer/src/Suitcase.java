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
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing) {
        if (canAddThing(thing)) {
            this.things.add(thing);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Thing thing: this.things) {
            totalWeight += thing.getWeight();
        }
        
        return totalWeight;
    }
    
    private boolean canAddThing(Thing thing) {
        return (thing.getWeight() + totalWeight()) <= maxWeight;
    }
    
    public String toString() {
        int count = getCount();
        
        if (count == 0) {
            return "empty (0 kg)";
        } else if (count == 1) {
            return "1 thing (" + totalWeight() + " kg)";
        } else {
            return getCount() + " things (" + totalWeight() + "  kg)";
        }
    }
    
    private int getCount() {
        return this.things.size();
    }
    
    public void printThings() {
        for (Thing thing: this.things) {
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        
        for (Thing thing: this.things) {
            if (heaviest == null || thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        
        return heaviest;
    }
}
