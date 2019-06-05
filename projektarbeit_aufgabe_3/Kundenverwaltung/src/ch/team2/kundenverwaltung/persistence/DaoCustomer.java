package ch.team2.kundenverwaltung.persistence;

import java.util.List;

/**
 * The Interface DaoCustomer.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public interface DaoCustomer {
	
	/**
	 * Insert customer.
	 *
	 * @param customer the customer
	 */
	void insert(final Customer customer);
	
	/**
	 * Select customer at given index.
	 *
	 * @param index the index
	 * @return the customer
	 */
	Customer select(final int index);
	
	/**
	 * Select all customers.
	 *
	 * @return the list
	 */
	List<Customer> select();
	
	/**
	 * Delete customer at given index.
	 *
	 * @param index the index
	 */
	void delete(final int index);
}
