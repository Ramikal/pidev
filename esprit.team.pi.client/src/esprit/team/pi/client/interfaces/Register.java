package esprit.team.pi.client.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

import org.junit.Before;
import org.junit.Test;
import org.xml.sax.Locator;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import esprit.team.pi.ejb.domain.User;
import esprit.team.pi.ejb.services.UserService;
import esprit.team.pi.ejb.services.UserServiceRemote;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

import java.awt.Font;
import java.awt.Color;

import javax.swing.border.CompoundBorder;

import java.awt.SystemColor;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textEmail;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	

UserServiceRemote userService =(UserServiceRemote) esprit.team.pi.client.interfaces.Locator.lookup("UserService", UserServiceRemote.class);
	
	
	public static void main(String[] args) {
		try {
			  UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try{
				
					Register frame = new Register();
					frame.setVisible(true);
					
			} catch (Exception e) {
				e.printStackTrace();
		}}});
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setBackground(new Color(135, 206, 250));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Stencil", Font.PLAIN, 49));
		GridBagConstraints gbc_lblRegister = new GridBagConstraints();
		gbc_lblRegister.gridwidth = 3;
		gbc_lblRegister.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegister.gridx = 0;
		gbc_lblRegister.gridy = 0;
		contentPane.add(lblRegister, gbc_lblRegister);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		final JDateChooser calendar = new JDateChooser();
		GridBagConstraints gbc_calendar = new GridBagConstraints();
		gbc_calendar.fill = GridBagConstraints.HORIZONTAL;
		gbc_calendar.insets = new Insets(0, 0, 5, 0);
		gbc_calendar.gridx = 2;
		gbc_calendar.gridy = 3;
		contentPane.add(calendar,gbc_calendar);
		
		
		textFirstName = new JTextField();
		GridBagConstraints gbc_textFirstName = new GridBagConstraints();
		gbc_textFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFirstName.insets = new Insets(0, 0, 5, 0);
		gbc_textFirstName.gridx = 2;
		gbc_textFirstName.gridy = 1;
		contentPane.add(textFirstName, gbc_textFirstName);
		textFirstName.setColumns(10);
		
		JLabel label2 = new JLabel("Last Name");
		label2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_label2 = new GridBagConstraints();
		gbc_label2.anchor = GridBagConstraints.EAST;
		gbc_label2.insets = new Insets(0, 0, 5, 5);
		gbc_label2.gridx = 0;
		gbc_label2.gridy = 2;
		contentPane.add(label2, gbc_label2);
		
		textLastName = new JTextField();
		GridBagConstraints gbc_textLastName = new GridBagConstraints();
		gbc_textLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLastName.insets = new Insets(0, 0, 5, 0);
		gbc_textLastName.gridx = 2;
		gbc_textLastName.gridy = 2;
		contentPane.add(textLastName, gbc_textLastName);
		textLastName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date of Birth");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		final JCheckBox checkCaving = new JCheckBox("Caving");
		checkCaving.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		GridBagConstraints gbc_checkCaving = new GridBagConstraints();
		gbc_checkCaving.anchor = GridBagConstraints.WEST;
		gbc_checkCaving.insets = new Insets(0, 0, 5, 5);
		gbc_checkCaving.gridx = 1;
		gbc_checkCaving.gridy = 4;
		contentPane.add(checkCaving, gbc_checkCaving);
		
		final JCheckBox checkFestivals = new JCheckBox("Festivals");
		checkFestivals.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		GridBagConstraints gbc_checkFestivals = new GridBagConstraints();
		gbc_checkFestivals.anchor = GridBagConstraints.WEST;
		gbc_checkFestivals.insets = new Insets(0, 0, 5, 0);
		gbc_checkFestivals.gridx = 2;
		gbc_checkFestivals.gridy = 4;
		contentPane.add(checkFestivals, gbc_checkFestivals);
		
		JLabel lblNewLabel_3 = new JLabel("Interests");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		final JCheckBox checkSwimming = new JCheckBox("Swimming");
		checkSwimming.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		GridBagConstraints gbc_checkSwimming = new GridBagConstraints();
		gbc_checkSwimming.anchor = GridBagConstraints.WEST;
		gbc_checkSwimming.insets = new Insets(0, 0, 5, 5);
		gbc_checkSwimming.gridx = 1;
		gbc_checkSwimming.gridy = 5;
		contentPane.add(checkSwimming, gbc_checkSwimming);
		
		final JCheckBox checkArt = new JCheckBox("Art events");
		checkArt.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		GridBagConstraints gbc_checkArt = new GridBagConstraints();
		gbc_checkArt.anchor = GridBagConstraints.WEST;
		gbc_checkArt.insets = new Insets(0, 0, 5, 0);
		gbc_checkArt.gridx = 2;
		gbc_checkArt.gridy = 5;
		contentPane.add(checkArt, gbc_checkArt);
		
		final JCheckBox checkLuxury = new JCheckBox("Luxury");
		checkLuxury.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		GridBagConstraints gbc_checkLuxury = new GridBagConstraints();
		gbc_checkLuxury.anchor = GridBagConstraints.WEST;
		gbc_checkLuxury.insets = new Insets(0, 0, 5, 5);
		gbc_checkLuxury.gridx = 1;
		gbc_checkLuxury.gridy = 6;
		contentPane.add(checkLuxury, gbc_checkLuxury);
		
		JLabel lblNewLabel_4 = new JLabel("E-Mail");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 7;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.insets = new Insets(0, 0, 5, 0);
		gbc_textEmail.gridx = 2;
		gbc_textEmail.gridy = 7;
		contentPane.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 8;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 8;
		contentPane.add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel_6 = new JLabel("Confirm Password");
		lblNewLabel_6.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 9;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				if ((textFirstName.getText().isEmpty())||(textLastName.getText().isEmpty())||(textEmail.getText().isEmpty())||(passwordField.getText().isEmpty())||(passwordField_1.getText().isEmpty()))
				
				
					JOptionPane.showMessageDialog(null, "All fields must be completed before you submit the form");
				
				else if (passwordField.getText().equals(passwordField_1.getText())==false)
					
					JOptionPane.showMessageDialog(null, "Password does not match the confirm password");
					
				else
				{
					String firstName = textFirstName.getText();
					String lastName = textLastName.getText();
					int day = calendar.getDate().getDate();
					int month = calendar.getDate().getMonth();
					int year = calendar.getDate().getYear()+1900;
					
					String email = textEmail.getText();
					String password1 = passwordField.getText();
					String password2 = passwordField_1.getText();
					Boolean art = checkArt.isSelected();
					Boolean swim = checkSwimming.isSelected();
					Boolean caving = checkCaving.isSelected();
					Boolean lux = checkLuxury.isSelected();
					Boolean fest = checkFestivals.isSelected();
					
					User user = new User();
					user.setFirstName(firstName);
					user.setLastName(lastName);
					user.setEmail(email);
					user.setPwd(password1);
					Calendar cal=Calendar.getInstance();
					cal.set(year,month,day);
					Date date = cal.getTime();
					user.setBirthDate(date);
					user.setArt(art);
					user.setCaving(caving);
					user.setFestivals(fest);
					user.setLuxury(lux);
					user.setSwimming(swim);
					
					
					userService.createUser(user);
				}
				
				
				
			}
		});
		
		passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_1.gridx = 2;
		gbc_passwordField_1.gridy = 9;
		contentPane.add(passwordField_1, gbc_passwordField_1);
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.gridx = 2;
		gbc_btnRegister.gridy = 11;
		contentPane.add(btnRegister, gbc_btnRegister);
	}

}
