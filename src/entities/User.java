package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="bo_user")
public class User {
	
	@Column(name="uid")
	@GeneratedValue(generator="bo_user_uid_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="bo_user_uid_seq",sequenceName="public.bo_user_uid_seq", initialValue = 1, allocationSize = 1)
	@Id
	private Integer u_id;
	
	@Column(name="name")
	private Name name;
	
	@Column(name="address")
	private Address address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="createdDate")
	private Date created_date;
	
	@Column(name="isActive", columnDefinition = "BOOLEAN DEFAULT false")
	private Boolean isActive;
//	
//	@OneToMany(mappedBy = "rollId", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    private List<Roles> roles = new ArrayList<Roles>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("bo_User Table Created ");
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + ", username=" + username + ", password=" + password + ", created_date=" + created_date
				+ ", isActive=" + isActive + "]";
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	

}
