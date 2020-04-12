package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="offers")
public class Offers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "offers_id_seq")
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	@Size(min = 5, max = 25 , message = "Name must be between 5 and 25")
	private String name;
	
	@Column(name="email")
	
	private String email;
	
	@Column(name="location")
	private String location;

	public Offers() {
		
		System.out.println("Offfers Bean Created");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Offers [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + "]";
	}
	
	
	
	
	
	
	
	
	
}
