package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import logic.ActionHandlers;
import logic.ActionHandlers.LoginActionListener;

public class Login extends JPanel {
	private JPasswordField passwordField;
	private JButton btnLogin = new JButton();
	private JTextField UserNameField;


	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(376, 240, 148, 26);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(386, 299, 137, 26);
		add(lblPassword);
		
		UserNameField = new JTextField();
		UserNameField.setBounds(582, 234, 186, 32);
		add(UserNameField);
		UserNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(582, 296, 186, 32);
		add(passwordField);
		
		JLabel label = new JLabel("Including your own personal events!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(481, 146, 392, 55);
		add(label);
		
		JLabel label_1 = new JLabel("Welcome to CBS Calendar!");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(525, 87, 296, 64);
		add(label_1);
		
		JButton btnLogin_1 = new JButton("Login");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent l) {
				
			ActionHandlers.LoginActionListener();
			}
		});
		btnLogin_1.setBounds(606, 410, 141, 35);
		add(btnLogin_1);

	}
	
	public JTextField getUserNameField() {
		return UserNameField;
	}

	public void setUserNameField(JTextField userNameField) {
		UserNameField = userNameField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	public void addActionListener(ActionListener l) {
		btnLogin.addActionListener(l);
		
	}
}

