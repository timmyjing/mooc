/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList;

/**
 *
 * @author timmyjing
 */
public class Box implements Thing{
    private int maxCapacity;
    private ArrayList<Thing> things;
    
    public Box(int maxCap) {
        this.maxCapacity = maxCap;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (maxCapacity >= getVolume() + thing.getVolume()) {
            things.add(thing);
            return true;
        }
        
        return false;
    }

    @Override
    public int getVolume() {
        int result = 0;
        for (Thing thing: things) {
            result += thing.getVolume();
        }
        return result;
    }
    
}
