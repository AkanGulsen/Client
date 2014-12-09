package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.WeeklyView;
import javax.swing.ImageIcon;

public class MenuScreen extends JPanel {


private final JLabel label = new JLabel("Menu");
private final JLabel label_1 = new JLabel("Calendar");
private final JButton btnWV = new JButton("Weekly  View");
private final JButton btnDV = new JButton("Daily View");
private final JButton button_2 = new JButton("Event");
private final JButton button_3 = new JButton("Log Out");
private final JLabel label_2 = new JLabel("");
	
	

	/**
	 * Create the panel.
	 */
	public MenuScreen() {
		setLayout(null);
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(353, 76, 200, 50);
		add(label);
		
		
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 2));
		label_1.setBounds(117, 150, 115, 41);
		add(label_1);
		
		
		btnWV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent l) {
			}
		});
		btnWV.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnWV.setBounds(94, 198, 163, 45);
		add(btnWV);
		
		
		btnDV.setBounds(94, 240, 163, 50);
		add(btnDV);
		btnDV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent l) {
			}
		});
	
		button_2.setBounds(397, 198, 115, 29);
		add(button_2);
		
		
		button_3.setBounds(666, 198, 115, 29);
		add(button_3);
		label_2.setIcon(new ImageIcon(MenuScreen.class.getResource("/Images/Background3.jpg")));
		label_2.setBounds(0, 0, 931, 630);
		
		add(label_2);

	}

	public JLabel getLabel() {
		return label;
	}



	public JLabel getLabel_1() {
		return label_1;
	}



	public JButton getBtnWV() {
		return btnWV;
	}



	public JButton getBtnDV() {
		return btnDV;
	}



	public JButton getButton_2() {
		return button_2;
	}



	public JButton getButton_3() {
		return button_3;
	}

	
	public void addActionListener(ActionListener l) {
		btnWV.addActionListener(l);
		btnDV.addActionListener(l);
	}
}
