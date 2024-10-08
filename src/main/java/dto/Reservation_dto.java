package dto;

public class Reservation_dto {
	private int reservation_id;
	private int passenger_id;
	private int flight_id;
	public Reservation_dto(int reservation_id, int passenger_id, int flight_id) {
		super();
		this.reservation_id = reservation_id;
		this.passenger_id = passenger_id;
		this.flight_id = flight_id;
	}
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	@Override
	public String toString() {
		return "Reservation_dto [reservation_id=" + reservation_id + ", passenger_id=" + passenger_id + ", flight_id="
				+ flight_id + "]";
	}
	
	
}
