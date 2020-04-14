package entities;

import java.sql.Date;
import java.util.List;

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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="bo_roles")
public class Roles {
	
	@Column(name="rid")
	@GeneratedValue(generator="bo_roles_rid_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="bo_roles_rid_seq",sequenceName="public.bo_roles_rid_seq", initialValue = 1, allocationSize = 1)
	@Id
	private Integer rollId;
	
	@Column(name="rname")
	private String rollName;
	
	@Column(name="rdesc")
	private String rollDescription;
	
	@Column(name="isActive")
	private Boolean isActive;
	
	@Column(name="createdDate")
	private Date createdDate;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.SUBSELECT)
	@JoinColumn(name = "u_id", updatable = false, insertable = false)
	private List<User> user ;

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Roles Table Created");
	}

	public Integer getRollId() {
		return rollId;
	}

	public void setRollId(Integer rollId) {
		this.rollId = rollId;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	public String getRollDescription() {
		return rollDescription;
	}

	public void setRollDescription(String rollDescription) {
		this.rollDescription = rollDescription;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Roles [rollId=" + rollId + ", rollName=" + rollName + ", rollDescription=" + rollDescription
				+ ", isActive=" + isActive + ", createdDate=" + createdDate + "]";
	}
	
	
	

}
