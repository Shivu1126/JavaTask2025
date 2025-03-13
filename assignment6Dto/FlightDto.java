package assignment6Dto;

class Flight{
	private int id;
    private String flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;
    private double price;
    private String status;
    private String aircraftType;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", airline=" + airline + ", departureAirport="
				+ departureAirport + ", arrivalAirport=" + arrivalAirport + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", availableSeats=" + availableSeats + ", price=" + price
				+ ", status=" + status + ", aircraftType=" + aircraftType + "]";
	}
    
	
}
public class FlightDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight = new Flight();
		flight.setId(1);
		flight.setFlightNumber("894AB9");
		flight.setAirline("ShivAirline");
		flight.setDepartureAirport("Tenkasi");
		flight.setArrivalAirport("Avudaiyanoor");
		flight.setDepartureTime("8.00pm");
		flight.setArrivalTime("8.03pm");
		flight.setAvailableSeats(25);
		flight.setPrice(15);
		flight.setStatus("Scheduled");
		flight.setAircraftType("AirBus");
		
		System.out.println(flight.toString());
	}

}
