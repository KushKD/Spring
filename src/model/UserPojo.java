package model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class UserPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1420638993029441458L;
	
	//@NotBlank(message = "Username cannot be blank")
	@Size(min = 5, max = 20)
	private String username;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter a Secure Password")
	private String pasword;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid First name")
	private String firstname;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid Middle Name")
	private String middlename;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid last name")
	private String lastname;
	
	@NotNull
	@Size(min = 5, max = 7, message = "Please enter valid phone number")
	private String phone;
	
	@NotNull
	private String email;
	
	
	private Boolean isactive;
	

	private String createdDate;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid State")
	private String state;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid Distrct")
	private String district;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid City")
	private String city;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid Address")
	private String address;
	
	@NotNull
	@Size(min = 3, max = 20, message = "Please enter valid role name")
	private String rol_name;
	
	@NotNull
	@Size(min = 5, max = 20, message = "Please enter valid role description")
	private String role_description;
	public UserPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRol_name() {
		return rol_name;
	}
	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	@Override
	public String toString() {
		return "UserPojo [username=" + username + ", pasword=" + pasword + ", firstname=" + firstname + ", middlename="
				+ middlename + ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", isactive="
				+ isactive + ", createdDate=" + createdDate + ", state=" + state + ", district=" + district + ", city="
				+ city + ", address=" + address + ", rol_name=" + rol_name + ", role_description=" + role_description
				+ "]";
	}
	
	
	
	
	
}
