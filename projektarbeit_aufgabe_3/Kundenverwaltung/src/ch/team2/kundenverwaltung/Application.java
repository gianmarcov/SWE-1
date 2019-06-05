package ch.team2.kundenverwaltung;

import ch.team2.kundenverwaltung.presentation.View;
import ch.team2.kundenverwaltung.presentation.ViewFactory;

/**
 * The Class Application.
 *
 * @author Vitelli Gianmarco / Mariano Martinez
 */
public class Application {
	
	/**
	 * main application entry point.
	 *
	 * @param args (command line arguments)
	 */
	 public static void main(String[] args) {
		final ViewFactory viewFactory = ViewFactory.getInstance();
		final View view = viewFactory.createView(true);
		view.run();
	 }
}
