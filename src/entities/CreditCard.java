package entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {

	private String cardcumber;

	public String getCardcumber() {
		return cardcumber;
	}

	public void setCardcumber(String cardcumber) {
		this.cardcumber = cardcumber;
	}

}
