package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

public class ScreenFrame extends JFrame {

	// Variabels
	public static final String LOGIN = "login";
	public static final String WEEKLYVIEW = "weeklyview";
	public static final String DAILYVIEW = "dailyview";
	public static final String MENUSCREEN = "menuscreen";
	private JPanel contentPane;
	private final LogIn login = new LogIn();
	private final WeeklyView WeeklyView = new WeeklyView();
	private final DailyView DailyView = new DailyView();
	private final MenuScreen MenuScreen = new MenuScreen();
	CardLayout c;

	/*
	 * public static final String LOGIN = "login"; public static final String
	 * MENUSCREEN = "MenuScreen"; public static final String WEEKLYVIEW =
	 * "WeeklyView"; public static final String DAILYVIEW = "DailyView";
	 * 
	 * private JPanel contentPane;
	 * 
	 * public static String login = new LogIn(); public static MenuScreen MS =
	 * new MenuScreen(); private WeeklyView WV = new WeeklyView(); private
	 * DailyView DV = new DailyView();
	 * 
	 * 
	 * 
	 * CardLayout c;
	 */

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

		// Adding panels to contentpane
		contentPane.add(login,"login");
		contentPane.add(DailyView, "dailyview");
		contentPane.add(WeeklyView, "weeklyview");
		contentPane.add(MenuScreen, "menuscreen");
		c = (CardLayout) getContentPane().getLayout();

	}
	public LogIn getLogin() {
		return login;
	}

	public WeeklyView getWeekView() {
		return WeeklyView;
	}

	public DailyView getDayView() {
		return DailyView;
	}

	public void show(String card) {
		c.show(getContentPane(), card);
	}

}
