package ch.team2.kundenverwaltung.persistence;



public class DaoCustomerFactory {
	/**
	 * Singleton ViewFactory
	 */
	public static DaoCustomerFactory daoCustomerFactory;
	
	/**
	 * @return ViewFactory
	 */
	public static DaoCustomerFactory getInstance() {
		return daoCustomerFactory == null ? daoCustomerFactory = new DaoCustomerFactory() : daoCustomerFactory;
	}
	
	/**
	 * create customer
	 * @return
	 */
	public DaoCustomer createDaoCustomer() {
		return new DaoCustomerMockImpl();
	}
}
