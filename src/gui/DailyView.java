package gui;

import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuItem;

import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;

import logic.getCalendarDay;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class DailyView extends JPanel {
	private JTable table;
	private final JButton button = new JButton("Week View");
	/**
	 * Create the panel.
	 */
	public DailyView() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 1333, 59);
		panel.setPreferredSize(new Dimension(1366, 25));
		add(panel);
		
		final JLabel label = new JLabel("Quote Of The Day:");
		panel.add(label);
		
		JLabel label_1 = new JLabel((String) null);
		label_1.setAlignmentX(0.5f);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setSize(new Dimension(577, 56));
		panel_1.setMinimumSize(new Dimension(1366, 100));
		panel_1.setBounds(382, 66, 735, 56);
		add(panel_1);
		String test = "";
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(button);
		
		JButton button_1 = new JButton("Previous");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(button_1);
		
		final JMenuItem Årstal = new JMenuItem(String.valueOf(getCalendarDay.getSelectedDay() + "." + getCalendarDay.getCurrentMonth() + " - " + getCalendarDay.getYear()));
		Årstal.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Årstal.setHorizontalTextPosition(SwingConstants.CENTER);
		Årstal.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Årstal);
		
		JButton button_2 = new JButton("Next");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(String.valueOf(getCalendarDay.getCurrentMonth()));
				getCalendarDay.nextDay(1);
				Årstal.setText(String.valueOf(getCalendarDay.getSelectedDay() + "." + getCalendarDay.getCurrentMonth() + " - " + getCalendarDay.getYear()));
			}
		});
		button_2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel_1.add(button_2);
		
		table = new JTable();
		table.setBounds(382, 144, 863, 660);
		add(table);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(DailyView.class.getResource("/Images/MetalBackground.jpg")));
		label_2.setBounds(0, 5, 1333, 846);
		add(label_2);
 
	}
	public JButton getButton() {
		return button;
	}
	public void addActionListener(ActionListener l) {
		button.addActionListener(l);
		
	}
}
