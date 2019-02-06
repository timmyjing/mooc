/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author timmyjing
 */
public class PromissoryNote {
    private HashMap<String, Double> loans;
    
    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if (loans.containsKey(whose)) {
            return loans.get(whose);
        } else {
            return 0.0;
        }
    }
}
