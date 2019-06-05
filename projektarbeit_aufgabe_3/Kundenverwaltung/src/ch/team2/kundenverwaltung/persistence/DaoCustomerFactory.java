package ch.team2.kundenverwaltung.persistence;

/**
 * A factory for creating DaoCustomer objects.
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public class DaoCustomerFactory {
	
	/** Singleton ViewFactory. */
	public static DaoCustomerFactory daoCustomerFactory;
	
	/**
	 * Gets the single instance of DaoCustomerFactory.
	 *
	 * @return ViewFactory
	 */
	public static DaoCustomerFactory getInstance() {
		return daoCustomerFactory == null ? daoCustomerFactory = new DaoCustomerFactory() : daoCustomerFactory;
	}
	
	/**
	 * create dao customer.
	 *
	 * @return the dao customer
	 */
	public DaoCustomer createDaoCustomer() {
		return new DaoCustomerMockImpl();
	}
}
