/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class CivilService implements NationalService{
    private int days;
    
    public CivilService() {
        this.days = 362;    
    }
    public int getDaysLeft() {
        return this.days;
    }
    
    public void work() {
        if (this.days > 0) this.days--;
    }
}
