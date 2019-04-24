package ch.team2.kundenverwaltung;

import ch.team2.kundenverwaltung.presentation.View;
import ch.team2.kundenverwaltung.presentation.ViewFactory;

public class Application {
	 public static void main(String[] args) {
		final ViewFactory viewFactory = ViewFactory.getInstance();
		final View view = viewFactory.createView(true);
		view.run();
	 }
}
