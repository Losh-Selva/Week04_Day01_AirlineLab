package airline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Flight {
    private String destination;
    private static int number =1000;
    private int flightID;
    private ArrayList<Passenger> passengers;
    private static flightStatus flightStatuses; //may need to change to private

    public enum flightStatus{
        ACTIVE, CANCELLED
    };

    public Flight(String destination, flightStatus flightStatuses) {
        this.destination = destination;
        this.flightStatuses = flightStatuses;
        this.flightID = number;
        number++;
    }


    // GETTERS AND SETTERS
    public String getDestination (){
        return this.destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public int getFlightID() {
        return flightID;
    }
    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers){
        this.passengers = passengers;
    }

    public flightStatus getFlightStatuses (){
        return flightStatuses; }

    public void setFlightStatuses(flightStatus flightStatuses) {
        Flight.flightStatuses = flightStatuses;
    }

    // METHODS
 public String addPassengerToFlight(Passenger passenger) {
     return "Passenger:" + this.passengers.add(passenger) + " has been added";

 }
    @Override
    public String toString() {
        return destination + flightID;
    }
 }


