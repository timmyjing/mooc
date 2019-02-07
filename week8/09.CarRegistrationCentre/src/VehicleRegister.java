/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author timmyjing
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> register;
    
    public VehicleRegister() {
        this.register = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        String registeredOwner = register.get(plate);
        
        if (registeredOwner == null) {
            register.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(RegistrationPlate plate) {
        return register.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (get(plate) == null) {
            return false;
        }
        
        register.remove(plate);
        
        return true;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate: register.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<String>();
        
        for (RegistrationPlate plate: register.keySet()) {
            String owner = register.get(plate);
            
            if (!owners.contains(owner)) owners.add(owner);
        }
        
        for (String owner: owners) {
            System.out.println(owner);
        }
    }
    
}
