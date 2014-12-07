package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import shared.*;
import gui.*;



public class ActionHandlers {
	private static ScreenFrame screen;

	// private AuthenticateUser au;

	public ActionHandlers() {
		screen = new ScreenFrame();
		screen.getLogin().addActionListener(new LoginActionListener());
//		screen.getWV().addActionListener(new WeekyViewActionListener());
	}

	public void run(){

		ScreenFrame frame = new ScreenFrame();
		frame.setVisible(true);

	}

	public class LoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent l) {
			System.out.println("virker det");
			try {
				String userNameField =
						screen.getLogin().getUserNameField().getText();
				String passwordField =
						screen.getLogin().getPasswordField().getText();
				if (l.getSource() == screen.getLogin().getBtnLogin()) {
					System.out.println("Det virker");
					try {
						// if(au.authenticate(userName, password, true) == 0){
						System.out.println("login succesfull");
						screen.c.show(screen.getContentPane(),"MenuScreen");
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

	public class MenuScreen implements ActionListener {
		public void actionPerformed(ActionEvent l) {
			System.out.println("Du er nu videre");
			try {
				


			}
		}

	}

}


