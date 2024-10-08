package dto;

public class Passenger_dto {
	private int passenger_id;
	private String name;
	private long contact;
	private String email;
	public Passenger_dto(int id, String name, long contact, String email) {
		super();
		this.passenger_id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}
	public int getId() {
		return passenger_id;
	}
	public void setId(int id) {
		this.passenger_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Passenger_dto [id=" + passenger_id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
	
}
