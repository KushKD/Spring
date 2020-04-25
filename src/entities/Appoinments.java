package entities;

import java.sql.Timestamp;
import java.util.Date;

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

@Entity
@Table(name = "appoinments")
public class Appoinments {

	@Id
	@GeneratedValue(generator = "appoinments_a_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "appoinments_a_id_seq", sequenceName = "public.appoinments_a_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name = "a_id")
	private Integer aid;

	@Column(name = "appoinmnet_time")
	private Timestamp appoinmentTime;

	@Column(name = "started")
	private boolean started;

	@Column(name = "ended")
	private boolean ended;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "p_id")
	private Patients patients;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "d_id")
	private Doctors doctors;


	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Timestamp getAppoinmentTime() {
		return appoinmentTime;
	}

	public void setAppoinmentTime(Timestamp appoinmentTime) {
		this.appoinmentTime = appoinmentTime;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public Doctors getDoctor() {
		return doctors;
	}

	public void setDoctor(Doctors doctor) {
		this.doctors = doctor;
	}

	public Patients getPatient() {
		return patients;
	}

	public void setPatient(Patients patient) {
		this.patients = patient;
	}

	@Override
	public String toString() {
		return "Appoinments [aid=" + aid + ", appoinmentTime=" + appoinmentTime + ", started=" + started + ", ended="
				+ ended + ", doctor=" + doctors + ", patient=" + patients + "]";
	}

	

	

	

}
