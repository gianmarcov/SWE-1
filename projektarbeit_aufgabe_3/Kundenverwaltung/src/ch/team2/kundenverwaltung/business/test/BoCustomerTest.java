package ch.team2.kundenverwaltung.business.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import ch.team2.kundenverwaltung.business.BoCustomer;
import ch.team2.kundenverwaltung.business.BoCustomerImpl;
import ch.team2.kundenverwaltung.persistence.Customer;
import ch.team2.kundenverwaltung.persistence.CustomerImpl;
import ch.team2.kundenverwaltung.persistence.DaoCustomer;

/**
 * The Class BoCustomerTest.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
@RunWith(JUnit4.class)
public class BoCustomerTest {
	
	/** The insert called. */
	private boolean insertCalled = false;
	
	/** The get customers called. */
	private boolean getCustomersCalled = false;
	
	/** The get customer called. */
	private boolean getCustomerCalled = false;
	
	/** The delete customer called. */
	private boolean deleteCustomerCalled = false;
	
	/** The mock customers. */
	@SuppressWarnings("serial")
	private List<Customer> mockCustomers = new ArrayList<Customer>() {
		{
			add(new CustomerImpl("Peter","Muster"));
			add(new CustomerImpl("Stefan","Luchs"));
		}
	};

	/**
	 * should create the customer.
	 */
	@Test
	public void createCustomer() {
		final BoCustomer boCustomer = new BoCustomerImpl(new DaoCustomer() {
			@Override
			public List<Customer> select() {
				return null;
			}
			
			@Override
			public Customer select(int index) {
				return null;
			}
			
			@Override
			public void insert(Customer customer) {
				Assert.assertEquals("firstname is not the same", "Peter", customer.getFirstName());
				Assert.assertEquals("lastname is not the same", "Muster", customer.getLastName());
				insertCalled = true;
			}
			
			@Override
			public void delete(int index) {
			}
		});
		boCustomer.createCustomer("Peter", "Muster");
		Assert.assertTrue("have not called the method insert of dao", insertCalled);
	}
	
	/**
	 * should return the customers.
	 */
	@Test
	public void getCustomers() {
		final BoCustomer boCustomer = new BoCustomerImpl(new DaoCustomer() {
			@Override
			public List<Customer> select() {
				getCustomersCalled = true;
				return mockCustomers;
			}
			
			@Override
			public Customer select(int index) {
				return null;
			}
			
			@Override
			public void insert(Customer customer) {
			}
			
			@Override
			public void delete(int index) {
			}
		});
		final List<Customer> customers = boCustomer.getCustomers();
		Assert.assertSame(customers, mockCustomers);
		Assert.assertTrue("have not called the method select of dao", getCustomersCalled);
	}
	
	/**
	 * should return the right customer.
	 */
	@Test
	public void getCustomer() {
		final BoCustomer boCustomer = new BoCustomerImpl(new DaoCustomer() {
			@Override
			public List<Customer> select() {
				return null;
			}
			
			@Override
			public Customer select(int index) {
				getCustomerCalled = true;
				Assert.assertEquals("the index must be passed through without modifications", 0, index);
				return mockCustomers.get(0);
			}
			
			@Override
			public void insert(Customer customer) {
			}
			
			@Override
			public void delete(int index) {
			}
		});
		final Customer customer = boCustomer.getCustomer(0);
		Assert.assertSame(customer, mockCustomers.get(0));
		Assert.assertTrue("have not called the method select of dao", getCustomerCalled);
	}
	
	/**
	 * should delete customer.
	 */
	@Test
	public void deleteCustomer() {
		final BoCustomer boCustomer = new BoCustomerImpl(new DaoCustomer() {
			@Override
			public List<Customer> select() {
				return null;
			}
			
			@Override
			public Customer select(int index) {
				return null;
			}
			
			@Override
			public void insert(Customer customer) {
			}
			
			@Override
			public void delete(int index) {
				deleteCustomerCalled = true;
				Assert.assertEquals("the index must be passed through without modifications", 0, index);
			}
		});
		boCustomer.deleteCustomer(0);
		Assert.assertTrue("have not called the method delete of dao", deleteCustomerCalled);
	}
}
