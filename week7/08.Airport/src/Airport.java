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
public class Airport {
    private HashMap<String, Airplane> airplanes;
    private ArrayList<Flight> flights;
    
    public Airport() {
        this.airplanes = new HashMap<String, Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void addAirplane(Airplane airplane) {
        airplanes.put(airplane.getId(), airplane);
    }
    
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    
    public Airplane getAirplane(String id) {
        if (airplanes.containsKey(id)) {
            return airplanes.get(id);
        } else {
            return null;
        }
    }
    
    public ArrayList<Airplane> getPlanes() {
        ArrayList<Airplane> planes = new ArrayList<Airplane>();
        
        for (String id: airplanes.keySet()) {
            planes.add(airplanes.get(id));
        }
        
        return planes;
    }
    
    public ArrayList<Flight> getFlights() {
        ArrayList<Flight> result = new ArrayList<Flight>();
        
        for (Flight flight: flights) {
            result.add(flight);
        }
        
        return result;
    }
    
}
