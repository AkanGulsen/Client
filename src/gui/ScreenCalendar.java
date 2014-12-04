package gui;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ScreenCalendar extends JFrame {

	// Variabels
	public final String LOGIN = "login";
	public final String WEEKVIEW = "weekview";
	public final String DAYVIEW = "dayview";
	
	private JPanel contentPane;
	private final Login login = new Login();
	private final WeeklyView WeekView = new WeeklyView();
	private final DailyView DayView = new DailyView();
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
		contentPane.add(login, "login");
		contentPane.add(WeekView, "weekview");
		contentPane.add(DayView, "dayview");
		c = (CardLayout) getContentPane().getLayout();
	}

	// Getters
	public Login getLogin() {
		return login;
	}
	public WeeklyView getWeekView(){
		return WeekView;
	}
	public DailyView getDayView(){
		return DayView;
	}
	public void show(String card) {
		c.show(getContentPane(),  card);
	}
}
