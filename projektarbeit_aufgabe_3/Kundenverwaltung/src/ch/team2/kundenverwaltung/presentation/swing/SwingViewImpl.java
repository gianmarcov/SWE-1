package ch.team2.kundenverwaltung.presentation.swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch.team2.kundenverwaltung.business.BoCustomer;
import ch.team2.kundenverwaltung.persistence.Customer;
import ch.team2.kundenverwaltung.presentation.AbstractViewImpl;

import java.awt.Insets;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SwingViewImpl extends AbstractViewImpl {
	
	private final JList<Customer> list = new JList<Customer>();
	private final JButton button_add = new JButton("Kunde erfassen");
	private final JButton button_remove = new JButton("Kunde löschen");
	private final JFrame frame = new JFrame("Kundenverwaltung");
	private final JDialog dialog = new JDialog(frame, "Kunde erfassen", true);
	private final JButton button_dialog_create = new JButton("Erstellen");
	private JTextField textfield_firstname = new JTextField();
	private JTextField textfield_lastname = new JTextField();
	private boolean is_textfield_firstname_valid = false;
	private boolean is_textfield_lastname_valid = false;

	public SwingViewImpl(BoCustomer boCustomer) {
		super(boCustomer);
	}

	@Override
	public void displayCustomer() {
	}

	@Override
	public void displayCustomers() {
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void initiateCreationOfCustomer() {
	    dialog.setVisible(true);
	}


	@Override
	public void run() {
		buildMainWindow();
        buildCreateCustomerDialog();
        addListeners();
	}
	
	private void buildMainWindow() {
		frame.getContentPane().add(buildTitle(), BorderLayout.PAGE_START);
		frame.getContentPane().add(buildBody(), BorderLayout.CENTER);
		frame.getContentPane().add(buildCredits(), BorderLayout.PAGE_END);

        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildCreateCustomerDialog() {
		dialog.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		dialog.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblVorname = new JLabel("Vorname");
		GridBagConstraints gbc_lblVorname = new GridBagConstraints();
		gbc_lblVorname.anchor = GridBagConstraints.EAST;
		gbc_lblVorname.insets = new Insets(0, 0, 5, 5);
		gbc_lblVorname.gridx = 0;
		gbc_lblVorname.gridy = 0;
		panel.add(lblVorname, gbc_lblVorname);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textfield_firstname, gbc_textField);
		textfield_firstname.setColumns(10);
		
		JLabel lblNachname = new JLabel("Nachname");
		GridBagConstraints gbc_lblNachname = new GridBagConstraints();
		gbc_lblNachname.anchor = GridBagConstraints.EAST;
		gbc_lblNachname.insets = new Insets(0, 0, 5, 5);
		gbc_lblNachname.gridx = 0;
		gbc_lblNachname.gridy = 1;
		panel.add(lblNachname, gbc_lblNachname);
		
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textfield_lastname, gbc_textField_1);
		textfield_lastname.setColumns(10);

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		panel.add(button_dialog_create, gbc_btnNewButton);
		
		JPanel panel_1 = new JPanel();
		dialog.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblKundeErfassen = new JLabel("Kunde erfassen");
		lblKundeErfassen.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel_1.add(lblKundeErfassen);
	    dialog.setDefaultCloseOperation(
	                 WindowConstants.DISPOSE_ON_CLOSE);
	    button_dialog_create.setEnabled(false);
	    dialog.setSize(500, 200);
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
	
	private JPanel buildBody() {
		final JPanel jpanel = new JPanel();
        final GridBagLayout gridbag = new GridBagLayout();
        gridbag.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
        gridbag.columnWeights = new double[]{1.0, 0.0};
        final GridBagConstraints c = new GridBagConstraints();
        jpanel.setLayout(gridbag);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        
        c.gridx = 0;
        c.gridy = 1;

        c.gridx = 0;
        c.gridy = 2;
        
        this.fillTableWithCostumer();
        
        JSeparator separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.gridwidth = 2;
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridx = 0;
        gbc_separator.gridy = 0;
        jpanel.add(separator, gbc_separator);
        list.setVisibleRowCount(20);
        GridBagConstraints gbc_list = new GridBagConstraints();
        gbc_list.gridheight = 4;
        gbc_list.insets = new Insets(0, 0, 5, 5);
        gbc_list.fill = GridBagConstraints.BOTH;
        gbc_list.gridx = 0;
        gbc_list.gridy = 1;
        jpanel.add(list, gbc_list);
        
        JPanel panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 1;
        jpanel.add(panel, gbc_panel);
        panel.setLayout(new GridLayout(0, 1, 0, 0));
        
        panel.add(button_add);
        gridbag.setConstraints(button_add, c);
        
        panel.add(button_remove);
        gridbag.setConstraints(button_remove, c);
        button_remove.setEnabled(false);
        
        JSeparator separator_1 = new JSeparator();
        GridBagConstraints gbc_separator_1 = new GridBagConstraints();
        gbc_separator_1.gridheight = 2;
        gbc_separator_1.insets = new Insets(0, 0, 0, 5);
        gbc_separator_1.gridx = 0;
        gbc_separator_1.gridy = 5;
        jpanel.add(separator_1, gbc_separator_1);
        
        c.gridx = 0;
        c.gridy = 3;

        c.gridx = 0;
        c.gridy = 4;

        return jpanel;
	}
	
	private JPanel buildCredits() {
		final JPanel jpanel = new JPanel();
        final JLabel label = new JLabel("Developed by: Mariano Martinez / Gianmarco Vitelli, all rights reserved");
        label.setFont(new Font("Arial", Font.BOLD, 12));
        
        jpanel.add(label);
        return jpanel;
	}
	
	private void fillTableWithCostumer() {
		DefaultListModel<Customer> defaultListModel = new DefaultListModel<Customer>();
		for(final Customer customer : getBoCustomer().getCustomers())  {
			defaultListModel.addElement(customer);
		}
		list.setModel(defaultListModel);
	}
	
	private void addListeners() {
		this.list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				button_remove.setEnabled(true);
			}
		});
		
		
        this.button_add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				initiateCreationOfCustomer();
			}
		});
        
        this.button_remove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getBoCustomer().deleteCustomer(list.getSelectedIndex());
				fillTableWithCostumer();
				button_remove.setEnabled(false);
			}
		});
        
        this.button_dialog_create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final String firstName = textfield_firstname.getText();
				final String lastName = textfield_lastname.getText();
				getBoCustomer().createCustomer(firstName, lastName);
				
				// refresh list
				fillTableWithCostumer();
				
				// reset dialog
				textfield_firstname.setText("");
				textfield_lastname.setText("");
				button_dialog_create.setEnabled(false);
				dialog.setVisible(false);
			}
		});
        
        this.textfield_firstname.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				is_textfield_firstname_valid = !textfield_firstname.getText().isEmpty();
				button_dialog_create.setEnabled(is_textfield_firstname_valid && is_textfield_lastname_valid);
			}
		});
        
        this.textfield_firstname.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				final String text = isPrintableChar(e.getKeyChar()) ? (textfield_firstname.getText() + String.valueOf(e.getKeyChar())) : "";
				is_textfield_firstname_valid = !text.isEmpty();
				button_dialog_create.setEnabled(is_textfield_firstname_valid && is_textfield_lastname_valid);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

        this.textfield_lastname.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				final String text = isPrintableChar(e.getKeyChar()) ? (textfield_lastname.getText() + String.valueOf(e.getKeyChar())) : "";
				is_textfield_lastname_valid = !text.isEmpty();
				button_dialog_create.setEnabled(is_textfield_firstname_valid && is_textfield_lastname_valid);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	}
	
	public boolean isPrintableChar( char c ) {
	    Character.UnicodeBlock block = Character.UnicodeBlock.of( c );
	    return (!Character.isISOControl(c)) &&
	            c != KeyEvent.CHAR_UNDEFINED &&
	            block != null &&
	            block != Character.UnicodeBlock.SPECIALS;
	}
}
