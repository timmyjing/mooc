/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class Grade {
    private final int points;
    
    public Grade(int points) {
        this.points = points;
    }
    
    public int getGrade() {
        if (this.points < 30) {
            return 0;
        } else if (this.points < 35 ) {
            return 1;
        } else if (this.points < 40) {
            return 2;
        } else if (this.points < 45) {
            return 3;
        } else if (this.points < 50) {
            return 4;
        } else {
            return 5;
        }
    }
}
