package gui;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import logic.getCalendarDay;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class WeeklyView extends JPanel {
	private JTable table;
	private JTable table_1;

	// Week of QOTD skal sættes korrekt
	private String Week;
	private String QOTD;
	private JTable table_2;
	private JTable Event;

	/**
	 * Create the panel.
	 */
	public WeeklyView() {
		setSize(new Dimension(1366, 768));
		setLayout(null);

		// QOTD contianer and with QOTD labels
		JPanel QOTD_container = new JPanel();
		QOTD_container.setBounds(0, 5, 1366, 45);
		QOTD_container.setPreferredSize(new Dimension(1366, 25));
		add(QOTD_container);

		JLabel lblQOTDHeadline = new JLabel("Quote Of The Day:");
		QOTD_container.add(lblQOTDHeadline);

		JLabel lblQOTD = new JLabel(QOTD);
		lblQOTD.setAlignmentX(Component.CENTER_ALIGNMENT);
		QOTD_container.add(lblQOTD);
		lblQOTD.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

		// Menu container inlcuding next, previous & dayview buttons
		JPanel Menu_container = new JPanel();
		Menu_container.setLocation(390, 56);
		Menu_container.setMinimumSize(new Dimension(1366, 100));
		Menu_container.setSize(new Dimension(655, 56));
		add(Menu_container);

		JButton btnNewButton = new JButton("Day View");
		btnNewButton.setBounds(21, 6, 141, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Menu_container.setLayout(null);
		btnNewButton
		.setIcon(new ImageIcon(
				WeeklyView.class
				.getResource("/com/sun/java/swing/plaf/windows/icons/DetailsView.gif")));
		Menu_container.add(btnNewButton);

		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(165, 6, 133, 35);
		btnPrevious
		.setIcon(new ImageIcon(
				WeeklyView.class
				.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		Menu_container.add(btnPrevious);

		JMenuItem mntmNewMenuItem = new JMenuItem(String.valueOf(getCalendarDay.getWeekofYear())); //getCalendarDay.getCurrentDay() + "." + getCalendarDay.getCurrentMonth() + " - " + getCalendarDay.getYear()));
		mntmNewMenuItem.setBounds(347, 3, 85, 38);
		Menu_container.add(mntmNewMenuItem);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(466, 6, 97, 35);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNext.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btnNext.setIcon(new ImageIcon(
				WeeklyView.class
				.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		Menu_container.add(btnNext);
		
		JLabel lblWeek = new JLabel("Week");
		lblWeek.setBounds(319, 6, 97, 35);
		Menu_container.add(lblWeek);

		table_2 =  new JTable();
		table_2.setBounds(339, 128, 990, 513);
		add(table_2);

		Event = new JTable();
		Event.setBounds(15, 128, 304, 513);
		add(Event);

		JLabel lblEvents = new JLabel("Events");
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEvents.setBounds(115, 86, 69, 20);
		add(lblEvents);

		for (int i = 0; i > 7; i++) {
			try {
				JPanel panel_2 = new JPanel();
				panel_2.setSize(new Dimension(1366, 0));

				JLabel lblDay = new JLabel("Sunday 30");
				lblDay.setSize(new Dimension(1366, 20));
				panel_2.add(lblDay);

				table = new JTable();
				table.setPreferredSize(new Dimension(1366, 0));
				table.setRowMargin(2);
				panel_2.add(table);

				JScrollBar scrollBar = new JScrollBar();
				panel_2.add(scrollBar);

			} catch (Exception e) {
				System.out.println("fejl i loop til oprettelse af dage");
			}
		}
	}
}
