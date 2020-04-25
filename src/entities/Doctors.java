package entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctors {

	@Id
	@GeneratedValue(generator = "doctors_d_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "doctors_d_id_seq", sequenceName = "public.doctors_d_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "d_id")
	private Integer did;

	@Column(name = "fname")
	private String firstName;

	@Column(name = "lname")
	private String lastName;

	@Column(name = "speciality")
	private String specialist;
	
	@OneToMany(mappedBy = "doctors", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<Appoinments> appoinments;

	@ManyToMany(mappedBy = "doctors_", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<Patients> patients_;

	

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public Set<Patients> getPatients_() {
		return patients_;
	}

	public void setPatients_(Set<Patients> patients_) {
		this.patients_ = patients_;
	}

	public List<Appoinments> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinments> appoinments) {
		this.appoinments = appoinments;
	}

	@Override
	public String toString() {
		return "Doctors [did=" + did + ", firstName=" + firstName + ", lastName=" + lastName + ", specialist="
				+ specialist + ", patients_=" + patients_ + ", appoinments=" + appoinments + "]";
	}

}
