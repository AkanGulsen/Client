package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(208, 237, 148, 26);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(208, 299, 137, 26);
		add(lblPassword);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(377, 237, 163, 27);
		add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(377, 296, 165, 32);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLogin.setBounds(399, 426, 141, 35);
		add(btnLogin);
		
		JLabel label = new JLabel("Including your own personal events!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(239, 153, 392, 48);
		add(label);
		
		JLabel label_1 = new JLabel("Welcome to CBS Calendar!");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(294, 100, 296, 64);
		add(label_1);

	}
}

