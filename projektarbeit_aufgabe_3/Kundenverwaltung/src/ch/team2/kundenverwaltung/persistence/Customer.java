package ch.team2.kundenverwaltung.persistence;

public interface Customer {
	String getFirstName();
	String getLastName();
	void setFirstName(final String firstname);
	void setLastName(final String lastname);
}
