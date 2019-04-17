package ch.team2.kundenverwaltung.presentation;

import ch.team2.kundenverwaltung.business.BoCustomer;

public abstract class AbstractViewImpl implements View {

	private final BoCustomer boCustomer;
	
	public AbstractViewImpl(final BoCustomer boCustomer) {
		this.boCustomer = boCustomer;
	}

	@Override
	public abstract void displayCustomer();

	@Override
	public abstract void displayCustomers();
	
	@Override
	public abstract void initiateCreationOfCustomer();
	
	@Override
	public abstract void run();
	
	public BoCustomer getBoCustomer() {
		return this.boCustomer;
	}
}
