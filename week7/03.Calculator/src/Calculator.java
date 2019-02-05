/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timmyjing
 */
public class Calculator {
    private Reader reader;
    private int calcDone;
    
    public Calculator() {
        this.reader = new Reader();
        this.calcDone = 0;
    }
    
    public void start() {
        while (true) {
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        
        statistics();        
    }
    
    private void sum() {
        System.out.print("value1: ");
        int int1 = reader.readInteger();
        System.out.print("value2: ");
        int int2 = reader.readInteger();
        System.out.println("sum of the values " + (int1 + int2));
        calcDone++;
    }
    
    private void difference() {
       System.out.print("value1: ");
        int int1 = reader.readInteger();
        System.out.print("value2: ");
        int int2 = reader.readInteger();
        System.out.println("difference of the values " + (int1 - int2));
        calcDone++;
    }
    
    private void product() {
        System.out.print("value1: ");
        int int1 = reader.readInteger();
        System.out.print("value2: ");
        int int2 = reader.readInteger();
        System.out.println("product of the values " + (int1 * int2));
        calcDone++;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + calcDone);
    }
}
