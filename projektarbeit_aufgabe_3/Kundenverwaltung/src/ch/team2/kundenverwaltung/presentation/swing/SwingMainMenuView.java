package ch.team2.kundenverwaltung.presentation.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class SwingMainMenuView {

	/**
	 * @wbp.parser.entryPoint
	 */
	public void show() {
		JFrame jframe = new JFrame();
		
		JPanel panel = new JPanel();
		jframe.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblKundenverwaltung = new JLabel("Kundenverwaltung");
		lblKundenverwaltung.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblKundenverwaltung);
		
		JLabel lblNewLabel_1 = new JLabel("Version 1.0");
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		jframe.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Developed by: Mariano Martinez / Gianmarco Vitelli, all rights reserved");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		jframe.getContentPane().add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWeights = new double[]{1.0};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnNewButton_1 = new JButton("Erstellen");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("Anzeigen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_2.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("L\u00F6schen");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		panel_2.add(btnNewButton_2, gbc_btnNewButton_2);
	}
}
