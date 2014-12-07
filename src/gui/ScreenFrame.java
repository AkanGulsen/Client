package gui;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class ScreenFrame extends JFrame {



	public static final String LOGIN = "Login";
	public static final String MENUSCREEN = "MenuScreen";
	public static final String WEEKLYVIEW = "WeeklyView";
	public static final String DAILYVIEW = "DailyView";
	private JPanel contentPane;
	private Login login = new Login();
	public static MenuScreen MS = new MenuScreen();
	private WeeklyView WV = new WeeklyView();
	private DailyView DV = new DailyView();

	public CardLayout c;



	/**
	 * Create the frame.
	 */
	public ScreenFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		//Adding panels to contentpane
		
//		login = new Login();
//		contentPane.add(login, LOGIN);

		MS = new MenuScreen();
		contentPane.add(MS, MENUSCREEN);
		
		DV = new DailyView();
		contentPane.add(DV, DAILYVIEW);
		
		WV = new WeeklyView();
		contentPane.add(WV, "WeeklyView");
	}



	public Login getLogin() {
		return login;
	}
	
	public MenuScreen getMS() {
		return MS;
	}

	public WeeklyView getWV() {
		return WV;
	}

	public DailyView getDV() {
		return DV;
	}

	public void show(String card) {
		c.show(getContentPane(), card);
	}
	
}
