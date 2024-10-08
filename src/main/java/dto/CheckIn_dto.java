package dto;

public class CheckIn_dto {
	private int checkin_id;
	private int reservation_id;
	public CheckIn_dto(int checkin_id, int reservation_id) {
		super();
		this.checkin_id = checkin_id;
		this.reservation_id = reservation_id;
	}
	public int getCheckin_id() {
		return checkin_id;
	}
	public void setCheckin_id(int checkin_id) {
		this.checkin_id = checkin_id;
	}
	public int getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}
	@Override
	public String toString() {
		return "CheckIn_dto [checkin_id=" + checkin_id + ", reservation_id=" + reservation_id + "]";
	}
	
}
