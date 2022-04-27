package springCoreQ5;

import org.springframework.beans.factory.annotation.Required;

public class VCard {

	private String vNumber;


	public String getvNumber() {
		return vNumber;
	}

	@Override
	public String toString() {
		return "VCard [vNumber=" + vNumber + "]";
	}

	
	 public void setvNumber(String vNumber) { this.vNumber = vNumber; }
	 
}
