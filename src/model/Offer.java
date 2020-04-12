package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer {
	
	private int id;
	@Size(min = 5, max = 25 , message = "Name must be between 5 and 25")
	@NotNull
	private String name;
	
	@NotNull
	@Pattern(regexp = ".*\\@.*\\..*", message = "This does not appear to be a Valid Email Address")
	private String email;
	
	
	private String text;
	
	private String location;
	
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + ", location=" + location
				+ "]";
	}
	
	
	
	

}
