package model.entities;

import model.AbstractObject;
import model.properties.Address;
import model.properties.Name;

public class Person extends AbstractObject {
	private Address employment;
	private Name name;

	public Address getEmployment() {
		return employment;
	}

	public void setEmployment(Address employment) {
		this.employment = employment;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
