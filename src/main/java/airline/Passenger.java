package airline;
import java.util.Random;
import java.util.UUID;


public class Passenger {
    private String name;
    private String contactInfo;
    private static int number = 0;
    private int passengerID;

    public Passenger(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.passengerID = number;
        number++;

    }

    // GETTERS & SETTERS
    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public int getPassengerID() {
        return passengerID;
    }
    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }
}

