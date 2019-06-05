package ch.team2.kundenverwaltung.persistence;

/**
 * The Interface Customer.
 * 
 *  @author Vitelli Gianmarco / Mariano Martinez
 */
public interface Customer {
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	String getFirstName();
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	String getLastName();
	
	/**
	 * Sets the first name.
	 *
	 * @param firstname the new first name
	 */
	void setFirstName(final String firstname);
	
	/**
	 * Sets the last name.
	 *
	 * @param lastname the new last name
	 */
	void setLastName(final String lastname);
}
