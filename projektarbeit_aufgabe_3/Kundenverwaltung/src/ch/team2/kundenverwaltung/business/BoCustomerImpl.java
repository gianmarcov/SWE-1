package ch.team2.kundenverwaltung.business;

import java.util.List;

import ch.team2.kundenverwaltung.persistence.Customer;
import ch.team2.kundenverwaltung.persistence.CustomerImpl;
import ch.team2.kundenverwaltung.persistence.DaoCustomer;

public class BoCustomerImpl  implements BoCustomer {
	
	final DaoCustomer daoCustomer;
	
	public BoCustomerImpl(final DaoCustomer daoCustomer) {
		this.daoCustomer = daoCustomer;
	}
	
	@Override
	public void createCustomer(final String firstname, final String lastname) {
		final Customer customer = new CustomerImpl();
		customer.setFirstName(firstname);
		customer.setLastName(lastname);
		this.daoCustomer.insert(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return this.daoCustomer.select();
	}

	@Override
	public Customer getCustomer(final int index) {
		return this.daoCustomer.select(index);
	}

	@Override
	public void deleteCustomer(final int index) {
		this.daoCustomer.delete(index);
	}
}
