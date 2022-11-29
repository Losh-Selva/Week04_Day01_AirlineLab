import airline.Airline;
import airline.Flight;
import airline.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class flightTest {
    Flight flight;
    Passenger passenger;
    Airline airline;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Morocco", Flight.flightStatus.ACTIVE);
        passenger = new Passenger("Emma Melendez", "emma@bnta.com");
        airline = new Airline();
     }


    @Test
    public void showsCorrectOptionForInput1_true (){
        String canChoose = airline.chooseFromMenu();
        assertThat(airline.selectedOption("1")).isEqualTo("Flight AE: 1000 has been added");
    }

//    @Test
//public void canChooseOption1(){
//String name = airline.chooseFromMenu();
//   asserThat()     }
//
//    @Test
//    public void canChooseFromMenuIf2_true(){
//        asserThat(airline)
//    }

}


