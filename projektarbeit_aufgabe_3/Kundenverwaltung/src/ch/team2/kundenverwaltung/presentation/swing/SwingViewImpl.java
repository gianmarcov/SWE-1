package ch.team2.kundenverwaltung.presentation.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch.team2.kundenverwaltung.business.BoCustomer;
import ch.team2.kundenverwaltung.presentation.AbstractViewImpl;

import java.awt.Insets;

public class SwingViewImpl extends AbstractViewImpl {

	public SwingViewImpl(BoCustomer boCustomer) {
		super(boCustomer);
	}

	@Override
	public void displayCustomer() {
		
	}

	@Override
	public void displayCustomers() {
		
	}

	@Override
	public void initiateCreationOfCustomer() {
		
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void run() {
		this.displayMainMenu();
	}
	
	private void displayMainMenu() {
		final JFrame frame = new JFrame("Kundenverwaltung");

		frame.getContentPane().add(buildTitle(), BorderLayout.PAGE_START);
		frame.getContentPane().add(buildMenu(), BorderLayout.CENTER);
		frame.getContentPane().add(buildSpacer(), BorderLayout.LINE_START);
		frame.getContentPane().add(buildSpacer(), BorderLayout.LINE_END);
		frame.getContentPane().add(buildCredits(), BorderLayout.PAGE_END);

        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private Component buildSpacer() {
		return new JPanel();
	}

	private JPanel buildTitle() {
        final JPanel jpanel = new JPanel();
        final JLabel label_0 = new JLabel("Kundenverwaltung");
        final JLabel label_1 = new JLabel("Version 1.0");
        jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
        
        label_0.setFont(new Font("Arial", Font.BOLD, 30));
        label_1.setFont(new Font("Arial", Font.BOLD, 20));
        jpanel.add(label_0);
        jpanel.add(label_1);
        
        return jpanel;
	}
	
	private JPanel buildMenu() {
		final JPanel jpanel = new JPanel();
        final GridBagLayout gridbag = new GridBagLayout();
        final GridBagConstraints c = new GridBagConstraints();
        jpanel.setLayout(gridbag);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        
        c.gridx = 0;
        c.gridy = 1;

        c.gridx = 0;
        c.gridy = 2;
        final JButton button_1 = new JButton("Kunde erfassen");
        gridbag.setConstraints(button_1, c);
        GridBagConstraints gbc_button_1 = new GridBagConstraints();
        gbc_button_1.fill = GridBagConstraints.BOTH;
        gbc_button_1.insets = new Insets(0, 0, 5, 5);
        gbc_button_1.gridy = 0;
        gbc_button_1.gridx = 0;
        jpanel.add(button_1, gbc_button_1);
        
        button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				initiateCreationOfCustomer();
			}
		});

        c.gridx = 0;
        c.gridy = 3;
        final JButton button_2 = new JButton("Kunden anzeigen");
        gridbag.setConstraints(button_2, c);
        GridBagConstraints gbc_button_2 = new GridBagConstraints();
        gbc_button_2.insets = new Insets(0, 0, 5, 5);
        gbc_button_2.gridy = 1;
        gbc_button_2.gridx = 0;
        jpanel.add(button_2, gbc_button_2);
        
        button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

        c.gridx = 0;
        c.gridy = 4;
        final JButton button_3 = new JButton("Kunde anzeigen");
        gridbag.setConstraints(button_3, c);
        GridBagConstraints gbc_button_3 = new GridBagConstraints();
        gbc_button_3.insets = new Insets(0, 0, 5, 5);
        gbc_button_3.gridy = 2;
        gbc_button_3.gridx = 0;
        jpanel.add(button_3, gbc_button_3);
        
        button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
        final JButton button_4 = new JButton("Kunde löschen");
        gridbag.setConstraints(button_4, c);
        GridBagConstraints gbc_button_4 = new GridBagConstraints();
        gbc_button_4.insets = new Insets(0, 0, 0, 5);
        gbc_button_4.gridy = 3;
        gbc_button_4.gridx = 0;
        jpanel.add(button_4, gbc_button_4);
        
        button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

        return jpanel;
	}
	
	private JPanel buildCredits() {
		final JPanel jpanel = new JPanel();
        final JLabel label = new JLabel("Developed by: Mariano Martinez / Gianmarco Vitelli, all rights reserved");
        label.setFont(new Font("Arial", Font.BOLD, 12));
        
        jpanel.add(label);
        return jpanel;
	}
}
