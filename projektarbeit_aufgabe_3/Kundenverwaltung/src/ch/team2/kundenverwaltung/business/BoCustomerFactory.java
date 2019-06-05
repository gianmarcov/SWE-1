package ch.team2.kundenverwaltung.business;

import ch.team2.kundenverwaltung.persistence.DaoCustomerFactory;

/**
 * Factory class for creating boCustomers.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public class BoCustomerFactory {
	
	/** Singleton BoCustomerFactory. */
	public static BoCustomerFactory boCustomerFactory;
	
	/**
	 * Gets the single instance of BoCustomerFactory.
	 *
	 * @return BoCustomerFactory
	 */
	public static BoCustomerFactory getInstance() {
		return boCustomerFactory == null ? boCustomerFactory = new BoCustomerFactory() : boCustomerFactory;
	}
	
	/**
	 * create bo customer.
	 *
	 * @return the bo customer
	 */
	public BoCustomer createBoCustomer() {
		final DaoCustomerFactory daoCustomerFactory = new DaoCustomerFactory();
		
		return new BoCustomerImpl(daoCustomerFactory.createDaoCustomer());
	}
}
