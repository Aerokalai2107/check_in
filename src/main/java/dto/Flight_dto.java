package dto;

public class Flight_dto {
	private int flight_id;
	private String airlinename;
	private String designation;
	private int dep_time;
	private int arrival_time;
	public Flight_dto(int id, String airlinename, String designation, int dep_time, int arrival_time) {
		super();
		this.flight_id = id;
		this.airlinename = airlinename;
		this.designation = designation;
		this.dep_time = dep_time;
		this.arrival_time = arrival_time;
	}
	public int getId() {
		return flight_id;
	}
	public void setId(int id) {
		this.flight_id = id;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getDep_time() {
		return dep_time;
	}
	public void setDep_time(int dep_time) {
		this.dep_time = dep_time;
	}
	public double getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}
	@Override
	public String toString() {
		return "Flight_dto [id=" + flight_id + ", airlinename=" + airlinename + ", designation=" + designation + ", dep_time="
				+ dep_time + ", arrival_time=" + arrival_time + "]";
	}
	
}
