package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="programmer")
public class Programmer {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "programmer_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "programmer_id_seq", sequenceName = "public.programmer_id_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private Integer salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="programmers_projects", 
			   joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id" ) ,
			   inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id" )  )
	private Set<Projects> projects;
	

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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", salary=" + salary + ", projects=" + projects + "]";
	}
	
	
	//Inverse Join is for the Other Side of the Relationship
	//Join column is for the Parent side of the relationship
	
	
	
	
	

}
