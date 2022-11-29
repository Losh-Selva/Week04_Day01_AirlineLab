package airline;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airline airline = new Airline();
        System.out.println(airline.start());
      while (airline.isAddInfo()){
          System.out.println(airline.chooseFromMenu());
          String chosenMenu = scanner.nextLine();
          String output = airline.selectedOption(chosenMenu);
          System.out.println(output);
      }
        System.out.println("Thank you for using BNTA Airlines");



//        System.out.println(airline.selectedOption(chosenMenu));
//        System.out.println(airline.chooseFromMenu());
//        String chosenMenuT = scanner.nextLine();
//        System.out.println(airline.selectedOption(chosenMenuT));
    }
}
