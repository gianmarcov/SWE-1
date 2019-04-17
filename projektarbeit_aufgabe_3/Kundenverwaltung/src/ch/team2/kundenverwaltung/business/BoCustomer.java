package ch.team2.kundenverwaltung.business;

import java.util.List;

import ch.team2.kundenverwaltung.persistence.Customer;

public interface BoCustomer {
	void createCustomer(final String firstName, final String lastName);
	List<Customer> getCustomers();
	Customer getCustomer(final int index);
	void deleteCustomer(final int index);
}
