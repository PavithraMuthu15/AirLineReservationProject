package airresveration;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class FlightDemo {

	public static void main(String[] args) {
	
		ArrayList<Flight> flightes = new ArrayList<Flight>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		flightes.add(new Flight(1,true,2,true));
		flightes.add(new Flight(2,false,350,false));
		flightes.add(new Flight(3,true,250,true));
		//using the scanner class to get the user input
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		//to display the details
		for(Flight f:flightes) {
			f.displayFlightInfo(); //calling the function
		}
		
		while(userOpt==1) {
			//Enter the choice to booked the ticket 
			System.out.println("Enter 1 to Book and 2 to exit  :");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				// booked the ticket in the if class 
				if(booking.isAvailable(bookings,flightes)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. flight is full. Try another date.");
			}
			else {
				System.out.println("exit");
			}
		}
	}

}