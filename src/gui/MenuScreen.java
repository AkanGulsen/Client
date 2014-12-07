package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.WeeklyView;

public class MenuScreen extends JPanel {
	
	
	WeeklyView WV = new WeeklyView();
	

	/**
	 * Create the panel.
	 */
	public MenuScreen() {
		setLayout(null);
		
		JLabel label = new JLabel("Menu");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(353, 76, 200, 50);
		add(label);
		
		JLabel label_1 = new JLabel("Calendar");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 2));
		label_1.setBounds(117, 150, 115, 41);
		add(label_1);
		
		JButton btnWV = new JButton("Weekly  View");
		btnWV.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnWV.setBounds(94, 198, 163, 45);
		add(btnWV);
		
		JButton btnDV = new JButton("Daily View");
		btnDV.setBounds(94, 240, 163, 50);
		add(btnDV);
		
		JButton button_2 = new JButton("Event");
		button_2.setBounds(397, 198, 115, 29);
		add(button_2);
		
		JButton button_3 = new JButton("Log Out");
		button_3.setBounds(666, 198, 115, 29);
		add(button_3);

	}

	public WeeklyView getWV() {
		return WV;
	}

	public void setWV(WeeklyView wV) {
		WV = wV;
	}
	public void actionListener(ActionEvent arg0) {
		
	}

}
