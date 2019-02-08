/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class ShoppingBasket {
    private List<Purchase> contents;
    
    public ShoppingBasket() {
        this.contents = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
        Purchase purchase = findPurchase(product);
        
        if (purchase != null) {
            purchase.increaseAmount();
        } else {
            contents.add(new Purchase(product, 1, price));
        }
    }
    
    private Purchase findPurchase(String product) {
        
        for (Purchase p: contents) {
            if (p.getProduct().equals(product)) {
                return p;
            }
        }
        
        return null;
    } 
    
    public int price() {
        int totalPrice = 0;
        
        for (Purchase purchase: contents) {
            totalPrice += purchase.price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for (Purchase purchase: contents) {
            System.out.println(purchase);
        }
    }
}
