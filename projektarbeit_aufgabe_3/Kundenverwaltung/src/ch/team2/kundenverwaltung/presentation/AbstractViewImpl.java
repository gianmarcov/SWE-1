package ch.team2.kundenverwaltung.presentation;

import ch.team2.kundenverwaltung.business.BoCustomer;

/**
 * The Class AbstractViewImpl. Implementation of View 
 * 
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public abstract class AbstractViewImpl implements View {

	/** The bo customer. */
	private final BoCustomer boCustomer;
	
	/**
	 * Instantiates a new abstract view impl.
	 *
	 * @param boCustomer the bo customer
	 */
	public AbstractViewImpl(final BoCustomer boCustomer) {
		this.boCustomer = boCustomer;
	}

	/**
	 * Display customer.
	 */
	@Override
	public abstract void displayCustomer();

	/**
	 * Display customers.
	 */
	@Override
	public abstract void displayCustomers();
	
	/**
	 * Initiate creation of customer.
	 */
	@Override
	public abstract void initiateCreationOfCustomer();
	
	/**
	 * Run.
	 */
	@Override
	public abstract void run();
	
	/**
	 * Gets the bo customer.
	 *
	 * @return the bo customer
	 */
	public BoCustomer getBoCustomer() {
		return this.boCustomer;
	}
}
