package airline;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Airline {
    private boolean addInfo;
    private ArrayList<Flight> availableFlights;
    private ArrayList<Passenger> passengers; //IS THIS ARRAY IN THE RIGHT PLACE

    public Airline() {
        this.addInfo = false;
        this.availableFlights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    // GETTERS&SETTERS

    public ArrayList<Flight> getAvailableFlights() {
        return this.availableFlights;
    }

    public void setAvailableFlights(ArrayList<Flight> availableFlights) {
        this.availableFlights = availableFlights;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public boolean isAddInfo() {
        return this.addInfo;
    }

    //METHODS
    public String start() {
        this.addInfo = true;
        return "Welcome to BNTA airlines!";
    }

    //IS THIS METHOD IN THE RIGHT PLACE
    //add passenger
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public int addNewFlight(String destination) {
        Flight flight = new Flight(destination, Flight.flightStatus.ACTIVE);
        flight.getFlightStatuses();// not sure if this is still required
        flight.getFlightID(); // not sure if this is still required
        availableFlights.add(flight);
        return flight.getFlightID();
    }

    public String chooseFromMenu() {
        return "Please select the option that best suits you \n" +
                "1. Add a new flight \n" +
                "2. Display all available flights \n" +
                "3. Add a new passenger \n" +
                "4. Book a passenger onto a flight \n" +
                "5. Cancel a flight \n" +
                "6. Search flights";

    }

    public void displayFlights() {
        for (int i = 0; i < availableFlights.size(); i++) {
            System.out.println(availableFlights.get(i));
        }
    }

    public String selectedOption(String chosenMenu) { //option becomes chosenMenu

        String choseMenu1 = "1";
        String choseMenu2 = "2";
        String choseMenu3 = "3";
        String choseMenu4 = "4";
        String choseMenu5 = "5";
        String choseMenu6 = "6";

        if (Objects.equals(chosenMenu, "1")) {
            System.out.println("Please add destination: ");
            Scanner scanner = new Scanner(System.in);
            String destination = scanner.nextLine();
            return "Flight AE:" + this.addNewFlight(destination) + " has been added";
        } else if (Objects.equals(chosenMenu, "2")) {
            displayFlights();
            return "Available flights: "; //returns flight id but not the assigned id
        } else if (Objects.equals(chosenMenu, "3") || Objects.equals(chosenMenu, "4")) {
            System.out.println("Please enter passenger's full name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Please enter passenger contact info: ");
            String contactInfo = scanner.nextLine();
            Passenger passenger = new Passenger(name, contactInfo);
            if (Objects.equals(chosenMenu, "3")) {
                passengers.add(passenger);
                return "Successfully added new passenger";
            } else {
                {
                    System.out.println("Please enter the flight ID:");
                    int flightID = scanner.nextInt();
                    for (int i = 0; i < availableFlights.size(); i++) {
                        Flight flight = availableFlights.get(i);
                        if (flightID == flight.getFlightID()) {
                            flight.addPassengerToFlight(passenger);
                            return "Successfully booked passenger onto flight";
                        }
                    }
                    return "Booking failed incorrect ID";
                }
//        else if (Objects.equals(chosenMenu, "5")) {
//                return "Flight has changed to Cancelled" + Flight.flightStatus.CANCELLED;
//            }
//            return null;
            }

        }
    return null; }
}