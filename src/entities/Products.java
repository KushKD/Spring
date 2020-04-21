package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="products")
public class Products {

	@Id
	
	/*
	 * Generated ID Custom Generator
	 * @GenericGenerator(name="product_id", strategy = "entities.CustomRandomGenerator")
	 * @GeneratedValue(generator = "product_id")
	 */
	
	@GeneratedValue(generator="products_id_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="products_id_seq",sequenceName="public.products_id_seq", initialValue = 1, allocationSize = 1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private String price;

	public Products() {
		
		System.out.println("Products Bean Created");
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Products( String name, String description, String price) {
		super();
		
		this.name = name;
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
}
