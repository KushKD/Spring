package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Fruits")
public class Fruits {

	

	@Id
	@GenericGenerator(name = "fruit_id", strategy = "entities.CustomRandomGenerator")
	@GeneratedValue(generator = "fruit_id")
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String fruitname;

	@Column(name = "fruit_desc")
	private String fruitdesc;

	public Fruits() {
		super();
	}

	public Fruits(String fruit_name, String fruit_desc) {
		super();
		this.fruitname = fruit_name;
		this.fruitdesc = fruit_desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFruit_name() {
		return fruitname;
	}

	public void setFruit_name(String fruit_name) {
		this.fruitname = fruit_name;
	}

	public String getFruit_desc() {
		return fruitdesc;
	}

	public void setFruit_desc(String fruit_desc) {
		this.fruitdesc = fruit_desc;
	}

	@Override
	public String toString() {
		return "Fruits [id=" + id + ", fruit_name=" + fruitname + ", fruit_desc=" + fruitdesc + "]";
	}

}
