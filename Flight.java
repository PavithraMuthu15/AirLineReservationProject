package airresveration;
// The flight reservation they get the flight number, passenger name and date and booked 
public class Flight {

	private int flightNo;
	private boolean ac;
	private int capacity;
	private boolean FlightType;
	//get and set
	//to get the private data using getter and setter method 
	Flight(int no,boolean ac,int cap,boolean FlightType){
		this.flightNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	
	public int getFlightNo() {
		return flightNo;
	}


	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public void displayFlightInfo(){
		System.out.println("Flight No:"+flightNo);
		System.out.println("Ac  :"+ac);
		System.out.println("Capacity :"+capacity);
		System.out.println("International flight :"+FlightType);
	}
}