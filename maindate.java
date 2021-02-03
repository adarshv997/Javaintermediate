package asd;

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class

public class maindate {
  public static void main(String[] args) {
    LocalDate d = LocalDate.now(); // Create a date object
    System.out.println(d); // Display the current date
    LocalTime t = LocalTime.now(); //Create a time object
    System.out.println(t); //Display the current time
    LocalDateTime dt = LocalDateTime.now(); // Create a date time object
    System.out.println(dt);//Display current date and time
  }
}