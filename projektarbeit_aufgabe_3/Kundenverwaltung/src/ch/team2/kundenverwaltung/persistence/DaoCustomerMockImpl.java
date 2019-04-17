package ch.team2.kundenverwaltung.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaoCustomerMockImpl implements DaoCustomer {

	final List<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void insert(final Customer customer) {
		customers.add(customer);
	}

	@Override
	public Customer select(int index) {
		try {
			return customers.get(index);
		} catch(IndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public List<Customer> select() {
		/** don't allow to change the array elements from the outside (pass by reference) */
		return  Collections.unmodifiableList(customers);
	}

	@Override
	public void delete(int index) {
		customers.remove(index);
	}
}
