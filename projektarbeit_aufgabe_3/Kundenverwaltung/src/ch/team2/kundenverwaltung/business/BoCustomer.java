package ch.team2.kundenverwaltung.business;

import java.util.List;

import ch.team2.kundenverwaltung.persistence.Customer;

/**
 * The Interface BoCustomer.
 *
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public interface BoCustomer {

	/**
	 * Creates the customer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 */
	void createCustomer(final String firstName, final String lastName);
	
	/**
	 * Gets the customers.
	 *
	 * @return the customers
	 */
	List<Customer> getCustomers();
	
	/**
	 * Gets the customer.
	 *
	 * @param index the index
	 * @return the customer
	 */
	Customer getCustomer(final int index);
	
	/**
	 * Delete customer.
	 *
	 * @param index the index
	 */
	void deleteCustomer(final int index);
}
