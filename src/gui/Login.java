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
	
		private final JLabel lblWelcome = new JLabel("Welcome");
		private final JLabel lblUsername = new JLabel("Username");
		private final JLabel lblPassword = new JLabel("Password");
		private final JButton btnLogIn = new JButton("Log In");
		private final JButton btnForgotLogIn = new JButton(
				"Forgot username or password?");
		private final JTextField textFieldUsername = new JTextField();
		private final JLabel lblBackground = new JLabel("");
		private final JPasswordField textFieldPassword = new JPasswordField();
		private JPasswordField passwordField;


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

			JLabel label = new JLabel("Password:");
			label.setBounds(354, 406, 146, 34);
			getContentPane().add(label);

			JLabel lblUsername = new JLabel("Username:");
			lblUsername.setBounds(344, 350, 156, 35);
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
			
			passwordField = new JPasswordField();
			passwordField.setBounds(521, 407, 189, 32);
			getContentPane().add(passwordField);
			
			JTextArea textArea = new JTextArea();
			textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textArea.setBounds(521, 350, 189, 31);
			getContentPane().add(textArea);


			
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


