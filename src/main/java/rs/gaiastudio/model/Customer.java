package rs.gaiastudio.model;

public class Customer {
	private String name;
	private String telNumber;
	private String address;
	
	public Customer() {};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String toString() {
		return name + "\n" + telNumber + "\n" + address + "\n";
	}
	
}
