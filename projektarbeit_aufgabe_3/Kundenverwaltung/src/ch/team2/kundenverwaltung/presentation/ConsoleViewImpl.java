package ch.team2.kundenverwaltung.presentation;

import java.util.Scanner;

import ch.team2.kundenverwaltung.business.BoCustomer;
import ch.team2.kundenverwaltung.persistence.Customer;

public class ConsoleViewImpl extends AbstractViewImpl {

	private static final String NO = "N";
	private static final String YES = "Y";
	private static final String DELETE = "4";
	private static final String DISPLAY = "3";
	private static final String DISPLAY_ALL = "2";
	private static final String CREATE = "1";
	private static final String EXIT = "5";
	private final Scanner consoleScanner = new Scanner(System.in);
	
	public ConsoleViewImpl(BoCustomer boCustomer) {
		super(boCustomer);
	}

	@Override
	public void displayCustomer() {
		final BoCustomer boCustomer = getBoCustomer();
		System.out.println("Kundenindex eingeben:");
		final String input = this.consoleScanner.nextLine();
		
		int index;
		try {
			index = Integer.parseInt(input);
		} catch(NumberFormatException e) {
			System.out.println("Eingabe ist keine Zahl, bitte geben Sie eine Zahl ein.");
			displayCustomer();
			return;
		}
		final Customer customer = boCustomer.getCustomer(index);
		
		if (customer == null) {
			System.out.println("Kein Kunde gefunden mit diesem Index!");
		} else {
			System.out.println(index + " : " + customer.getFirstName() + " " + customer.getLastName());
		}
	}
	

	public void deleteCustomer() {
		final BoCustomer boCustomer = getBoCustomer();
		System.out.println("Kundenindex eingeben:");
		final String input = this.consoleScanner.nextLine();
		
		int index;
		try {
			index = Integer.parseInt(input);
		} catch(NumberFormatException e) {
			System.out.println("Eingabe ist keine Zahl, bitte geben Sie eine Zahl ein.");
			deleteCustomer();
			return;
		}

		final Customer customer = boCustomer.getCustomer(index);
		if (customer == null) {
			System.out.println("Kein Kunde gefunden mit diesem Index!");
		} else {
			String command;
			do {
				System.out.println(index + " : " + customer.getFirstName() + " " + customer.getLastName());
				System.out.println("Möchten Sie wirklich löschen [Y/N]");
				command = this.consoleScanner.nextLine();
				if(YES.equals(command) || NO.equals(command)) {
					break;
				}
				System.out.println("Eingabe ungültig!");
			}while(true);
			if(YES.equals(command)) {
				boCustomer.deleteCustomer(index);
				System.out.println("Kunde wurde gelöscht.");
			}
		}
	}

	@Override
	public void displayCustomers() {
		final BoCustomer boCustomer = getBoCustomer();
		
		int index = 0;
		for(Customer customer : boCustomer.getCustomers()) {
			System.out.println(index + " : " + customer.getFirstName() + " " + customer.getLastName());
			index++;
		}
	}

	@Override
	public void initiateCreationOfCustomer() {
		final BoCustomer boCustomer = getBoCustomer();
		
		System.out.println("Vorname:");
		final String firstName = this.consoleScanner.nextLine();
		System.out.println("Nachname:");
		final String lastName = this.consoleScanner.nextLine();
		
		boCustomer.createCustomer(firstName, lastName);
	}

	@Override
	public void run() {
		printWelcomeScreen();
		printMenu();
		
		String command;
		do {
			command = this.consoleScanner.nextLine();
			switch (command) {
			case CREATE:
				initiateCreationOfCustomer();
				printMenu();
				break;
			case DISPLAY_ALL:
				displayCustomers();
				printMenu();
				break;
			case DISPLAY:
				displayCustomer();
				printMenu();
				break;
			case DELETE:
				deleteCustomer();
				printMenu();
				break;
			case EXIT:
				break;
			default:
				System.out.println("Ungültige Eingabe!");
				break;
			}
		} while(!EXIT.equals(command));
	}
	
	public void printMenu() {
		System.out.println("Menu:");
		System.out.println("[1] Kunde erfassen");
		System.out.println("[2] Kunden anzeigen");
		System.out.println("[3] Kunde anzeigen");
		System.out.println("[4] Kunde löschen");
		System.out.println("[5] schliessen");
	}
	
	public void printWelcomeScreen() {
		System.out.println("                         _                                        _ _                                ");
		System.out.println("  /\\ /\\_   _ _ __   __| | ___ _ ____   _____ _ ____      ____ _| | |_ _   _ _ __   __ _            ");
		System.out.println(" / //_/ | | | '_ \\ / _` |/ _ \\ '_ \\ \\ / / _ \\ '__\\ \\ /\\ / / _` | | __| | | | '_ \\ / _` |    ");
		System.out.println("/ __ \\| |_| | | | | (_| |  __/ | | \\ V /  __/ |   \\ V  V / (_| | | |_| |_| | | | | (_| |          ");
		System.out.println("\\/  \\/ \\__,_|_| |_|\\__,_|\\___|_| |_|\\_/ \\___|_|    \\_/\\_/ \\__,_|_|\\__|\\__,_|_| |_|\\__, |");
		System.out.println("                                                                                  |___/ ");
		System.out.println("                                                                             Version 1.0");
		System.out.println();
		System.out.println("      Developed by: Mariano Martinez / Gianmarco Vitelli, all rights reserved");
		System.out.println();
		System.out.println();
	}
}
