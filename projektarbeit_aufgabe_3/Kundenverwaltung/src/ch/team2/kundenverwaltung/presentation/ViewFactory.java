package ch.team2.kundenverwaltung.presentation;

import ch.team2.kundenverwaltung.business.BoCustomerFactory;
import ch.team2.kundenverwaltung.presentation.swing.SwingViewImpl;

/**
 * Factory class for creating view
 */
public class ViewFactory {
	/**
	 * Singleton ViewFactory
	 */
	public static ViewFactory viewFactory;
	
	/**
	 * @return ViewFactory
	 */
	public static ViewFactory getInstance() {
		return viewFactory == null ? viewFactory = new ViewFactory() : viewFactory;
	}
	
	/**
	 * create view
	 * @param ui / when true create a java swing ui otherwise a console instance
	 * @return
	 */
	public View createView(boolean ui) {
		final BoCustomerFactory boCustomerFactory = BoCustomerFactory.getInstance();
		final View view = ui ? 
			new SwingViewImpl(boCustomerFactory.createBoCustomer()): 
			new ConsoleViewImpl(boCustomerFactory.createBoCustomer());
		return view;
	}
}
