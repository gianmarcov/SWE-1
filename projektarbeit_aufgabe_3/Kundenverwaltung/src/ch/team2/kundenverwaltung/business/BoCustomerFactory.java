package ch.team2.kundenverwaltung.business;

import ch.team2.kundenverwaltung.persistence.DaoCustomerFactory;

/**
 * Factory class for creating boCustomers
 */
public class BoCustomerFactory {
	/**
	 * Singleton BoCustomerFactory
	 */
	public static BoCustomerFactory boCustomerFactory;
	
	/**
	 * @return BoCustomerFactory
	 */
	public static BoCustomerFactory getInstance() {
		return boCustomerFactory == null ? boCustomerFactory = new BoCustomerFactory() : boCustomerFactory;
	}
	
	/**
	 * create customer
	 * @return
	 */
	public BoCustomer createBoCustomer() {
		final DaoCustomerFactory daoCustomerFactory = new DaoCustomerFactory();
		
		return new BoCustomerImpl(daoCustomerFactory.createDaoCustomer());
	}
}
