package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import logic.getCalendarDay;

import java.awt.Dimension;

public class Login extends JFrame {
	
		private JPasswordField passwordField;
	
		private final JLabel lblWelcome = new JLabel("Welcome");
		private final JLabel lblUsername = new JLabel("Username");
		private final JLabel lblPassword = new JLabel("Password");
		private JTextField UsernameInput;


		/**
		 * Create the panel.
		 */

		public Login() {
			setMaximumSize(new Dimension(2000, 1200));

			JButton btnLogin = new JButton("Login");
			btnLogin.setBounds(572, 559, 115, 29);
			btnLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					String username = UsernameInput.getText();
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
			getContentPane().setLayout(null);
			getContentPane().add(btnLogin);

			passwordField = new JPasswordField();
			passwordField.setBounds(543, 463, 148, 34);
			getContentPane().add(passwordField);
			
						JLabel lblUsername_1 = new JLabel("Username:");
						lblUsername_1.setBounds(381, 399, 163, 35);
						getContentPane().add(lblUsername_1);

			JLabel label = new JLabel("Password:");
			label.setBounds(381, 463, 141, 34);
			getContentPane().add(label);

			JLabel lblNewLabel = new JLabel("Welcome to CBS Calendar!");
			lblNewLabel.setBounds(449, 148, 296, 64);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
			getContentPane().add(lblNewLabel);

			JLabel lblNewLabel_1 = new JLabel("Including your own personal events!");
			lblNewLabel_1.setBounds(393, 211, 392, 48);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			getContentPane().add(lblNewLabel_1);
			
			UsernameInput = new JTextField();
			UsernameInput.setBounds(545, 400, 186, 32);
			getContentPane().add(UsernameInput);
			UsernameInput.setColumns(10);

			setFont(new Font("Lucida Grande", Font.PLAIN, 17));

		}

		public JTextField getTextField() {
			return textFieldUsername;
		}

		public JButton getBtnLogIn() {
			return btnLogIn;
		}

		public JButton getBtnForgotLogIn() {
			return btnForgotLogIn;
		}

		public void addActionListener(ActionListener l) {
			btnLogIn.addActionListener(l);
			btnForgotLogIn.addActionListener(l);
		}

		public JTextField getTextFieldUsername() {
			return textFieldUsername;
		}

		public JPasswordField getTextFieldPassword() {
			return textFieldPassword;
		}
	}


