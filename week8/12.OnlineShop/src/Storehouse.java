/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author timmyjing
 */
public class Storehouse {
    private Map<String, Integer> stocks;
    private Map<String, Integer> prices;
    
    public Storehouse() {
        this.stocks = new HashMap<String, Integer>();
        this.prices = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        stocks.put(product, stock);
        prices.put(product, price);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        int stock = stock(product);
        if (stock > 0) {
            stocks.put(product, stock - 1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return stocks.keySet();
    }
}
