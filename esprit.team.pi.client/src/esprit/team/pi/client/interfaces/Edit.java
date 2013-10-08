package esprit.team.pi.client.interfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import esprit.team.pi.ejb.domain.User;
import esprit.team.pi.ejb.services.UserServiceRemote;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Edit extends JFrame {

	private JPanel contentPane;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	UserServiceRemote userService =(UserServiceRemote) esprit.team.pi.client.interfaces.Locator.lookup("UserService", UserServiceRemote.class);
	
	/**
	 * Create the frame.
	 */
	public Edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Edit Profile");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 49));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.EAST;
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 1;
		contentPane.add(lblFirstName, gbc_lblFirstName);
		
		textFirstName = new JTextField();
		GridBagConstraints gbc_textFirstName = new GridBagConstraints();
		gbc_textFirstName.insets = new Insets(0, 0, 5, 0);
		gbc_textFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFirstName.gridx = 1;
		gbc_textFirstName.gridy = 1;
		contentPane.add(textFirstName, gbc_textFirstName);
		textFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 2;
		contentPane.add(lblLastName, gbc_lblLastName);
		
		textLastName = new JTextField();
		GridBagConstraints gbc_textLastName = new GridBagConstraints();
		gbc_textLastName.insets = new Insets(0, 0, 5, 0);
		gbc_textLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLastName.gridx = 1;
		gbc_textLastName.gridy = 2;
		contentPane.add(textLastName, gbc_textLastName);
		textLastName.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 3;
		contentPane.add(lblEmail, gbc_lblEmail);
		
		textEmail = new JTextField();
		GridBagConstraints gbc_textEmail = new GridBagConstraints();
		gbc_textEmail.insets = new Insets(0, 0, 5, 0);
		gbc_textEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEmail.gridx = 1;
		gbc_textEmail.gridy = 3;
		contentPane.add(textEmail, gbc_textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewPassword = new GridBagConstraints();
		gbc_lblNewPassword.anchor = GridBagConstraints.EAST;
		gbc_lblNewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewPassword.gridx = 0;
		gbc_lblNewPassword.gridy = 4;
		contentPane.add(lblNewPassword, gbc_lblNewPassword);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 4;
		contentPane.add(passwordField, gbc_passwordField);
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFirstName.setText(Auth.connected.getFirstName());
				textLastName.setText(Auth.connected.getLastName());
				textEmail.setText(Auth.connected.getEmail());
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ok");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User userEdited = new User();
				userEdited.setIdUser(Auth.connected.getIdUser());
				userEdited.setFirstName(textFirstName.getText());
				userEdited.setLastName(textLastName.getText());
				userEdited.setEmail(textEmail.getText());
				userEdited.setPwd(passwordField.getText());
				userEdited.setBirthDate(Auth.connected.getBirthDate());
				userEdited.setArt(Auth.connected.getArt());
				userEdited.setCaving(Auth.connected.getCaving());
				userEdited.setFestivals(Auth.connected.getFestivals());
				userEdited.setLuxury(Auth.connected.getLuxury());
				userEdited.setSwimming(Auth.connected.getSwimming());
				
				userService.updateUser(userEdited);
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 7;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
