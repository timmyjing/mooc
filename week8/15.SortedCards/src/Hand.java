/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author timmyjing
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card: cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    private int getTotalValue() {
        int value = 0;
        
        for (Card card: cards) {
            value += card.getValue();
        }
        
        return value;
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter);
    }
    
    @Override
    
    public int compareTo(Hand other) {
        int value = getTotalValue();
        int otherValue = other.getTotalValue();
        
        if (value > otherValue) {
            return 1;
        } else if (value == otherValue) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
