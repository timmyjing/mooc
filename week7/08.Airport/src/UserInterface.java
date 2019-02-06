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
public class UserInterface {
    private Airport airport;
    private Scanner reader;
    
    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.airport = new Airport();
    }
    
    public void start() {
        airportPanel();
        flightService();
    }
    
    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = reader.nextLine();
            
            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                System.out.println("");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        
        
    }
    
    private void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = reader.nextLine();
            
            if (command.equals("1")) {
                printPlanes();
            } else if (command.equals("2")) {
                printFlights();
            } else if (command.equals("3")) {
                printInfo();
            } else if (command.equals("x")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        
    }
    
    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        Airplane plane = new Airplane(id, capacity);
        airport.addAirplane(plane);
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        Airplane plane = airport.getAirplane(id);
        if (plane == null) {
            return;
        }
        System.out.print("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = reader.nextLine();
        Flight flight = new Flight(plane, departure, destination);
        airport.addFlight(flight);
    }
    
    private void printInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        
        Airplane airplane = airport.getAirplane(id);
        System.out.println(airplane);
    }
    
    private void printPlanes() {
        ArrayList<Airplane> planes = airport.getPlanes();
        
        for (Airplane plane: planes) {
            System.out.println(plane);
        }
    }
    
    private void printFlights() {
        ArrayList<Flight> flights = airport.getFlights();

        for (Flight flight: flights) {
            System.out.println(flight);
        }
    }
}
