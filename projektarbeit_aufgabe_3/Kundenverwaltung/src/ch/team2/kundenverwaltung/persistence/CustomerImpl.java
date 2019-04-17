package ch.team2.kundenverwaltung.persistence;

public class CustomerImpl implements Customer {

	private String firstname;
	private String lastname;
	
	@Override
	public String getFirstName() {
		return firstname;
	}

	@Override
	public String getLastName() {
		return lastname;
	}

	@Override
	public void setFirstName(final String firstname) {
		this.firstname = firstname;
	}

	@Override
	public void setLastName(final String lastname) {
		this.lastname = lastname;
	}

}
