package logic;
import 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import shared.*;
import gui.Login;
import gui.ScreenCal;


public class ActionHandlers {
	private ScreenCal screen;

	// private AuthenticateUser au;

	public ActionHandlers() {
		screen = new ScreenCal();
		screen.getLogin().addActionListener(new LogInActionListener());
	}

	public class LogInActionListener implements ActionListener {
		public void actionPerformed(ActionEvent l) {
			System.out.println("virker det");
			try {
				// String userName =
				// Screen.getLogIn().getTextFieldUsername().getText();
				// String password =
				// Screen.getLogIn().getTextFieldPassword().getText();
				if (l.getSource() == screen.getLogin().getBtnLogIn()) {
					System.out.println("Det virker");
					try {
						// if(au.authenticate(userName, password, true) == 0){
						System.out.println("login succesfull");
						screen.show(Login.WEEKLYVIEW);
						// }
					} catch (Exception e1) {
						System.out.println("Login Unsuccesfull");
						e1.printStackTrace();
					}
				}
			} catch (Exception e3) {
			}
		}
	}

}
