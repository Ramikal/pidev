package esprit.team.pi.client.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;

import esprit.team.pi.ejb.domain.User;
import esprit.team.pi.ejb.services.UserServiceRemote;
import java.awt.Font;
import java.awt.Color;

public class Auth extends JFrame {

	private JPanel contentPane;
	private JTextField textlogin;
	private JPasswordField passwordField;
	static User connected = new User();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			  UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auth frame = new Auth();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	UserServiceRemote userService =(UserServiceRemote) esprit.team.pi.client.interfaces.Locator.lookup("UserService", UserServiceRemote.class);
	public Auth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_2 = new JLabel("Bestination");
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 49));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textlogin = new JTextField();
		GridBagConstraints gbc_textlogin = new GridBagConstraints();
		gbc_textlogin.insets = new Insets(0, 0, 5, 0);
		gbc_textlogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textlogin.gridx = 1;
		gbc_textlogin.gridy = 3;
		contentPane.add(textlogin, gbc_textlogin);
		textlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 4;
		contentPane.add(passwordField, gbc_passwordField);
		
		JButton btnNewAccount = new JButton("New account");
		btnNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Register().setVisible(true);;
				
			}
		});
		
		JButton btnEnter = new JButton("Login");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((textlogin.getText().isEmpty())||(passwordField.getText().isEmpty()))
				{
					JOptionPane.showMessageDialog(null, "One or more fields are empty");
				}
				else
				{
				String email = textlogin.getText();
				String pwd = passwordField.getText();
				User u= null;
				try{
				 u=userService.auth(email, pwd);
				}
				catch (Exception e){
					
				}
				if(u==null)
				{
				JOptionPane.showMessageDialog(null, "Please verify your email and password");}
					
			
				else{
					connected=u;
					
					new Weblog().setVisible(true);
				}}
			
				
			}
		});
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnter.gridx = 1;
		gbc_btnEnter.gridy = 6;
		contentPane.add(btnEnter, gbc_btnEnter);
		GridBagConstraints gbc_btnNewAccount = new GridBagConstraints();
		gbc_btnNewAccount.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewAccount.gridx = 1;
		gbc_btnNewAccount.gridy = 7;
		contentPane.add(btnNewAccount, gbc_btnNewAccount);
	}

}
