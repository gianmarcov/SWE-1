package ch.team2.kundenverwaltung.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Class DaoCustomerMockImpl. Implementation of DaoCustomer.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public class DaoCustomerMockImpl implements DaoCustomer {

	/** The customers. */
	final List<Customer> customers = new ArrayList<Customer>();
	
	/**
	 * Insert.
	 *
	 * @param customer the customer
	 */
	@Override
	public void insert(final Customer customer) {
		customers.add(customer);
	}

	/**
	 * Select.
	 *
	 * @param index the index
	 * @return the customer
	 */
	@Override
	public Customer select(int index) {
		try {
			return customers.get(index);
		} catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	/**
	 * Select.
	 *
	 * @return the list
	 */
	@Override
	public List<Customer> select() {
		/** don't allow to change the array elements from the outside (pass by reference) */
		return  Collections.unmodifiableList(customers);
	}

	/**
	 * Delete.
	 *
	 * @param index the index
	 */
	@Override
	public void delete(int index) {
		customers.remove(index);
	}
}
