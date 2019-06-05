package ch.team2.kundenverwaltung.persistence.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import ch.team2.kundenverwaltung.persistence.Customer;
import ch.team2.kundenverwaltung.persistence.CustomerImpl;
import ch.team2.kundenverwaltung.persistence.DaoCustomer;
import ch.team2.kundenverwaltung.persistence.DaoCustomerFactory;

/**
 * The Class DaoCustomerTest.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
@RunWith(JUnit4.class)
public class DaoCustomerTest {
	
	/** The dao customer. */
	final DaoCustomer daoCustomer = DaoCustomerFactory.getInstance().createDaoCustomer();
	
	
	/**
	 * should insert customer.
	 */
	@Test
	public void insert() {
		daoCustomer.insert(new CustomerImpl("Peter", "Meier"));
		Assert.assertEquals("the customer must be inserted into the list",  1, daoCustomer.select().size());
	}

	/**
	 * should select customers
	 */
	@Test
	public void select()  {
		boolean throwedException = false;
		daoCustomer.insert(new CustomerImpl("Peter", "Fratze"));
		daoCustomer.insert(new CustomerImpl("Peter", "Meier"));
		List<Customer> customers = daoCustomer.select();
		Assert.assertEquals("the customer must be inserted into the list",  2, customers.size());
		
		try {
			customers.add(new CustomerImpl("Peter", "Koch"));
		} catch(Exception e) {
			throwedException = true;
		}
		
		Assert.assertTrue("Modification outside of the list of daoCustomer should throw an exception", throwedException);
		
	}
	
	/**
	 * select customer with given index.
	 */
	@Test
	public void selectWithIndex()  {
		Customer customerThatShouldReturn = new CustomerImpl("Peter", "Koch");
		daoCustomer.insert(new CustomerImpl("Peter", "Fratze"));
		daoCustomer.insert(new CustomerImpl("Peter", "Meier"));
		daoCustomer.insert(customerThatShouldReturn);
		Customer customer = daoCustomer.select(2);
		Assert.assertSame("Hasn't returned the customer of the definied index", customerThatShouldReturn, customer);
	}
	
	/**
	 * should delete customer.
	 */
	@Test
	public void delete()  {
		Customer firstCustomer = new CustomerImpl("Peter", "Koch");
		Customer secoundCustomer = new CustomerImpl("Peter", "Meier");
		Customer thirdCustomer = new CustomerImpl("Peter", "Fratze");
		daoCustomer.insert(firstCustomer);
		daoCustomer.insert(secoundCustomer);
		daoCustomer.insert(thirdCustomer);
		
		daoCustomer.delete(1);
		
		Assert.assertSame("Hasn't deleted the customer of the definied index", firstCustomer, daoCustomer.select(0));
		Assert.assertSame("Hasn't deleted the customer of the definied index", thirdCustomer, daoCustomer.select(1));
		Assert.assertNull("Not returned null on inexistent index", daoCustomer.select(2));
	}
}
