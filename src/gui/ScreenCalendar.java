package gui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ScreenCalendar extends JFrame {

	// Variabels
	public static final String LOGIN = "login";
	public static final String WEEKLYVIEW = "weeklyview";
	public static final String DAILYVIEW = "dailyview";
	private JPanel contentPane;
	private final Login login = new Login();
	private final WeeklyView WeeklyView = new WeeklyView();
	private final DailyView DailyView = new DailyView();
	CardLayout c;

	/**
	 * Create the frame.
	 */
	public ScreenCalendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		// Setting contentpane
		contentPane = (JPanel) this.getContentPane();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		this.setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		// Adding panels to contentpane
		contentPane.add(WeeklyView, "weekyview");
		contentPane.add(login, "login");
		contentPane.add(DailyView, "dailyview");
		c = (CardLayout) getContentPane().getLayout();

	}

	// Getters
	public Login getLogIn() {
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
