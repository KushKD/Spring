package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String address;
	private Integer pinCode;
	private String city;
	private String district;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", pinCode=" + pinCode + ", city=" + city + ", district=" + district
				+ ", state=" + state + "]";
	}
	
	

}
