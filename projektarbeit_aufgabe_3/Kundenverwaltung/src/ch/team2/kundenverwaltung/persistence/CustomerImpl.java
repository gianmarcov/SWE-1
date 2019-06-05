package ch.team2.kundenverwaltung.persistence;

/**
 * The Class CustomerImpl. implementation of Customer
 * 
 *  @author Vitelli Gianmarco / Mariano Martinez
 */
public class CustomerImpl implements Customer {

	/** The firstname. */
	private String firstname;
	
	/** The lastname. */
	private String lastname;
	
	/**
	 * Instantiates a new customer impl.
	 */
	public CustomerImpl() {
	}
	
	/**
	 * Instantiates a new customer impl.
	 *
	 * @param firstname the firstname
	 * @param lastname the lastname
	 */
	public CustomerImpl(final String firstname, 
						final String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	@Override
	public String getFirstName() {
		return firstname;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	@Override
	public String getLastName() {
		return lastname;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstname the new first name
	 */
	@Override
	public void setFirstName(final String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastname the new last name
	 */
	@Override
	public void setLastName(final String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return this.firstname + " " + this.lastname;
	}
}
