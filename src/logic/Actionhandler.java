package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.ScreenFrame;

public class Actionhandler {
	private ScreenFrame screen;
	private Methods M;

	// private AuthenticateUser au;

	public Actionhandler() {
		screen = new ScreenFrame();
		screen.getLogin().addActionListener(new LogInActionListener());
		screen.getMenuScreen()
				.addActionListener(new MenuScreenActionListener());
	}

	public void run() {
		screen.show(ScreenFrame.LOGIN);
		screen.setVisible(true);
	}

	public class LogInActionListener implements ActionListener {
		public void actionPerformed(ActionEvent l) {
			System.out.println("virker det");
			// try {
			// String userName =
			// screen.getLogin().getTextFieldUsername().getText();
			// String password =
			// screen.getLogin().getTextFieldPassword().getText();
			// String reply = M.login(userName, password);
			// System.out.println(reply);
			// System.out.println("er vi her");
			if (true) {
				// System.out.println("login succesfull");
				screen.show(ScreenFrame.MENUSCREEN);
				// }
			} else {
				System.out.println("Not logged in");
				// }

				// } catch (Exception e3) {
			}
		}
	}

	public class MenuScreenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == screen.getMenuScreen().getBtnDV()) {
				screen.show(ScreenFrame.DAILYVIEW);
			}
			if (e.getSource() == screen.getMenuScreen().getBtnWV()) {
				screen.show(ScreenFrame.WEEKLYVIEW);
			}
		}
	}
	public class WeeklyViewActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == screen.getWeeklyView().getBtnNewButton()) {
				screen.show(ScreenFrame.DAILYVIEW);
			}
			
		}
	}
	public class DailyViewActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == screen.getDailyView().getButton()) {
				screen.show(ScreenFrame.WEEKLYVIEW);
			}
			
		}
	}
}
