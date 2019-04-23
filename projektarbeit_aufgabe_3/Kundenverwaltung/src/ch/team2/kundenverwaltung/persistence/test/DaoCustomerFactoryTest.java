package ch.team2.kundenverwaltung.persistence.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import ch.team2.kundenverwaltung.persistence.DaoCustomer;
import ch.team2.kundenverwaltung.persistence.DaoCustomerFactory;

@RunWith(JUnit4.class)
public class DaoCustomerFactoryTest {

	/**
	 * should create data access object customer
	 */
	@Test
	public void createBoCustomer() {
		final DaoCustomerFactory daoCustomerFactory = DaoCustomerFactory.getInstance();
		final DaoCustomer daoCustomer = daoCustomerFactory.createDaoCustomer();
		Assert.assertNotNull("Object returned by factory cannot be null", daoCustomer);
	}
	
	/**
	 * should return the same instance reference of factory
	 */
	@Test
	public void getInstance() {
		final DaoCustomerFactory daoCustomerFactory = DaoCustomerFactory.getInstance();
		final DaoCustomerFactory secoundDaoCustomerFactory = DaoCustomerFactory.getInstance();
		Assert.assertSame("getInstance is a singelton and must return the same reference", daoCustomerFactory, secoundDaoCustomerFactory);
	}
}
