package logic;
import 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import shared.*;
import gui.Login;
import gui.ScreenCal;
import gui.ScreenFrame;


public class ActionHandlers {
	private ScreenFrame screen;

	// private AuthenticateUser au;

	public ActionHandlers() {
		screen = new ScreenFrame();
		screen.getLogin().addActionListener(new LogInActionListener());
	}
	
	public void run(){
		
		ScreenFrame frame = new ScreenFrame();
		frame.setVisible(true);
		
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
