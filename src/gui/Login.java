package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import logic.getCalendarDay;
import java.awt.Dimension;

public class Login extends JFrame {
	private JPasswordField passwordField;
	private JTextField usernameInput;

	/**
	 * Create the panel.
	 */
	public Login() {
		setMaximumSize(new Dimension(2000, 1200));
		getContentPane().setLayout(null);

		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String username = usernameInput.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				if (getCalendarDay.login(username, password)) {
					ScreenCal SC = new ScreenCal();
					SC.setVisible(true);
					dispose();

				} else {
					ScreenCal SC = new ScreenCal();
					SC.setVisible(true);

				}
			}
		});
		btnLogin.setBounds(572, 559, 115, 29);
		getContentPane().add(btnLogin);

		passwordField = new JPasswordField();
		passwordField.setBounds(546, 463, 148, 34);
		getContentPane().add(passwordField);

		JLabel label = new JLabel("Password:");
		label.setBounds(412, 463, 88, 34);
		getContentPane().add(label);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(404, 404, 96, 35);
		getContentPane().add(lblUsername);

		JLabel lblNewLabel = new JLabel("Welcome to CBS Calendar!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(486, 123, 296, 64);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Including your own personal events!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(437, 186, 392, 48);
		getContentPane().add(lblNewLabel_1);

		usernameInput = new JTextField();
		usernameInput.setBounds(546, 408, 146, 26);
		getContentPane().add(usernameInput);
		usernameInput.setColumns(10);

	}
}
