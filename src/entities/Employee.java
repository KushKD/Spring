package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(generator = "employee_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "employee_id_seq", sequenceName = "public.employee_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "employee_id")
	private Integer id;

	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ContactDetails> contactDetails;

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
	
	

	public Set<ContactDetails> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Set<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactDetails=" + contactDetails + "]";
	}
	
	public void addContactDetails(ContactDetails contactDetailsAdd) {
		if(contactDetailsAdd!=null) {
			if(contactDetails==null) {
				contactDetails = new HashSet<>();
			}
			contactDetailsAdd.setEmployee(this); 
			contactDetails.add(contactDetailsAdd);
		}
		
	}

	

}
