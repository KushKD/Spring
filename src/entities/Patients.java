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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {

	@Id
	@GeneratedValue(generator = "patients_p_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "patients_p_id_seq", sequenceName = "public.patients_p_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "p_id")
	private Integer pid;

	@Column(name = "fname")
	private String firstName;

	@Column(name = "lname")
	private String lastName;

	@OneToMany(mappedBy = "patients" , cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	List<Appoinments> appoinments;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "patients_doctors", joinColumns = @JoinColumn(name = "p_id", referencedColumnName = "p_id"), inverseJoinColumns = @JoinColumn(name = "d_id", referencedColumnName = "d_id"))
	List<Doctors> doctors_;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public List<Appoinments> getAppoinments() {
		return appoinments;
	}

	public void setAppoinments(List<Appoinments> appoinments) {
		this.appoinments = appoinments;
	}

	public List<Doctors> getDoctors_() {
		return doctors_;
	}

	public void setDoctors_(List<Doctors> doctors_) {
		this.doctors_ = doctors_;
	}

	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", firstName=" + firstName + ", lastName=" + lastName + ", appoinments="
				+ appoinments + ", doctors_=" + doctors_ + "]";
	}

}
