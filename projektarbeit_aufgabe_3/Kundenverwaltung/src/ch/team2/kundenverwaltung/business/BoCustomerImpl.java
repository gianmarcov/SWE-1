package ch.team2.kundenverwaltung.business;

import java.util.List;

import ch.team2.kundenverwaltung.persistence.Customer;
import ch.team2.kundenverwaltung.persistence.CustomerImpl;
import ch.team2.kundenverwaltung.persistence.DaoCustomer;

/**
 * The Class BoCustomerImpl. Implementation of BoCustomer.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public class BoCustomerImpl  implements BoCustomer {
	
	/** The dao customer. */
	final DaoCustomer daoCustomer;
	
	/**
	 * Instantiates a new bo customer impl.
	 *
	 * @param daoCustomer the dao customer
	 */
	public BoCustomerImpl(final DaoCustomer daoCustomer) {
		this.daoCustomer = daoCustomer;
	}
	
	/**
	 * Creates the customer.
	 *
	 * @param firstname the firstname
	 * @param lastname the lastname
	 */
	@Override
	public void createCustomer(final String firstname, final String lastname) {
		final Customer customer = new CustomerImpl();
		customer.setFirstName(firstname);
		customer.setLastName(lastname);
		this.daoCustomer.insert(customer);
	}

	/**
	 * Gets the customers.
	 *
	 * @return the customers
	 */
	@Override
	public List<Customer> getCustomers() {
		return this.daoCustomer.select();
	}

	/**
	 * Gets the customer.
	 *
	 * @param index the index
	 * @return the customer
	 */
	@Override
	public Customer getCustomer(final int index) {
		return this.daoCustomer.select(index);
	}

	/**
	 * Delete customer.
	 *
	 * @param index the index
	 */
	@Override
	public void deleteCustomer(final int index) {
		this.daoCustomer.delete(index);
	}
}
