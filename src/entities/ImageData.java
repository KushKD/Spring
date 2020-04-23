package entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="imagedata")
public class ImageData {
	
	@Id
	@GeneratedValue(generator="imagedata_id_seq",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="imagedata_id_seq",sequenceName="public.imagedata_id_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	@Column(name="imagename")
	private String imageName;
	
	@Lob
	@Type(type="org.hibernate.type.BinaryType")
	@Column(name="imagedata")
	private byte[] imageData;
	
	@Column(name="imageuploadedby")
	private String imageuploadedby;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public String getImageuploadedby() {
		return imageuploadedby;
	}

	public void setImageuploadedby(String imageuploadedby) {
		this.imageuploadedby = imageuploadedby;
	}

	@Override
	public String toString() {
		return "ImageData [id=" + id + ", imageName=" + imageName + ", imageData=" + Arrays.toString(imageData)
				+ ", imageuploadedby=" + imageuploadedby + "]";
	}
	
	
	

}
