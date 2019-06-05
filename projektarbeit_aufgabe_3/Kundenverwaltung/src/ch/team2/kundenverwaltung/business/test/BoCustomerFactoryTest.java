package ch.team2.kundenverwaltung.business.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import ch.team2.kundenverwaltung.business.BoCustomer;
import ch.team2.kundenverwaltung.business.BoCustomerFactory;

/**
 * The Class BoCustomerFactoryTest.
 * 
 *  @author Vitelli Gianmarco / Mariano Martinez
 */
@RunWith(JUnit4.class)
public class BoCustomerFactoryTest {

	/**
	 * should create business object customer.
	 */
	@Test
	public void createBoCustomer() {
		final BoCustomerFactory boCustomerFactory = BoCustomerFactory.getInstance();
		final BoCustomer boCustomer = boCustomerFactory.createBoCustomer();
		Assert.assertNotNull("Object returned by factory cannot be null", boCustomer);
	}
	
	/**
	 * should return the same instance reference of factory.
	 */
	@Test
	public void getInstance() {
		final BoCustomerFactory boCustomerFactory = BoCustomerFactory.getInstance();
		final BoCustomerFactory secoundBoCustomerFactory = BoCustomerFactory.getInstance();
		Assert.assertSame("getInstance is a singelton and must return the same reference", boCustomerFactory, secoundBoCustomerFactory);
	}
}
