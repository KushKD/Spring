package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name="offers")
@XmlType(name="offer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Offers {

	@Id
	@GeneratedValue(generator="offers_id_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="offers_id_seq",sequenceName="public.offers_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name="id")
	@XmlElement(name="id")
	private Integer id;
	
	@Column(name="name")
	@XmlElement(name="name")
	private String name;
	
	@Column(name="email")
	@XmlElement(name="email")
	private String email;
	
	@Column(name="location")
	@XmlElement(name="location")
	private String location;

	public Offers() {
		
		System.out.println("Offfers Bean Created");
	}
	
	

	public Offers(String name, String email, String location) {
		super();
		this.name = name;
		this.email = email;
		this.location = location;
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
