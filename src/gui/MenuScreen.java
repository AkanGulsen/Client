package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MenuScreen extends JPanel {

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
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(117, 150, 115, 41);
		add(label_1);
		
		JButton button = new JButton("Week View");
		button.setBounds(94, 195, 138, 41);
		add(button);
		
		JButton button_1 = new JButton("Daily View");
		button_1.setBounds(94, 240, 138, 41);
		add(button_1);
		
		JButton button_2 = new JButton("Event");
		button_2.setBounds(397, 198, 115, 29);
		add(button_2);
		
		JButton button_3 = new JButton("Log Out");
		button_3.setBounds(666, 198, 115, 29);
		add(button_3);

	}

}
