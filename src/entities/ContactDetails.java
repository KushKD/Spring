package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "contactdetails")
public class ContactDetails {

	@Id
	@GeneratedValue(generator = "contactdetails_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contactdetails_id_seq", sequenceName = "public.contactdetails_id_seq", initialValue = 1, allocationSize = 1)
	private Integer id;

	@Column(name = "number")
	private String number;

	@Column(name = "type")
	private String type;

	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ContactDetails [id=" + id + ", number=" + number + ", type=" + type + ", employee=" + employee + "]";
	}

	

	

}
