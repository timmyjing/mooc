/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.*;
import moving.domain.Thing;
import moving.domain.Box;

/**
 *
 * @author timmyjing
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    
    public List<Thing> packThings(List<Thing> things) {
        List<Thing> boxes = new ArrayList<Thing>();
        
        Box box = new Box(boxesVolume);
        boxes.add(box);
        
        for (Thing thing: things) {
            if (!box.addThing(thing)) { 
                box = new Box(boxesVolume);
                boxes.add(box);
                box.addThing(thing);
            }
        }
        
        return boxes;
    }
}
