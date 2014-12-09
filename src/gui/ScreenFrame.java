package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Rectangle;
import java.awt.Dimension;

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



	/**
	 * Create the frame.
	 */
	public ScreenFrame() {
		setSize(new Dimension(1500, 780));
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
	
	public MenuScreen getMenuScreen(){
		return MenuScreen;
	}

	public WeeklyView getWeeklyView() {
		return WeeklyView;
	}

	public DailyView getDailyView() {
		return DailyView;
	}

	public void show(String card) {
		c.show(getContentPane(), card);
	}

}
