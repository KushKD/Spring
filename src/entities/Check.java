package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payment {

	private String chechnumber;

	public String getChechnumber() {
		return chechnumber;
	}

	public void setChechnumber(String chechnumber) {
		this.chechnumber = chechnumber;
	}

}
