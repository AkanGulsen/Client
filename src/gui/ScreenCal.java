package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenCal extends JFrame {
	private JPanel contentPane;


	public ScreenCal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMenu.setBounds(329, 60, 200, 50);
		contentPane.add(lblMenu);
		
		JButton btnCalendar = new JButton("Weekly View");
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalendar.setBounds(106, 150, 138, 41);
		contentPane.add(btnCalendar);
		
		JButton btnEvent = new JButton("Event");
		btnEvent.setBounds(380, 150, 115, 29);
		contentPane.add(btnEvent);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(673, 150, 115, 29);
		contentPane.add(btnLogOut);
		
		JLabel lblCalendar = new JLabel("Calendar");
		lblCalendar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCalendar.setBounds(106, 106, 115, 41);
		contentPane.add(lblCalendar);
		
		JButton btnDailyView = new JButton("Daily View");
		btnDailyView.setBounds(106, 207, 138, 41);
		contentPane.add(btnDailyView);
		
		
	}
}
