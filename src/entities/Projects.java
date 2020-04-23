package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="project")
public class Projects {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "project_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "project_id_seq", sequenceName = "public.project_id_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(mappedBy = "projects")   //projects is the name of the variabe in the Projects class not the table name
	private Set<Programmer> programmers;

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

	public Set<Programmer> getProgrammers() {
		return programmers;
	}

	public void setProgrammers(Set<Programmer> programmers) {
		this.programmers = programmers;
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", name=" + name + ", programmers=" + programmers + "]";
	}
	
	
	
	

}