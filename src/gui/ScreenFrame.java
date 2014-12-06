package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class ScreenFrame extends JFrame {



	public static final String LOGIN = "Login";
	public static final String MENUSCREEN = "MenuScreen";
	
	private JPanel contentPane;
	
	private final Login login = new Login();
	private final MenuScreen MS = new MenuScreen();

	CardLayout c;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenFrame frame = new ScreenFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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

		//Adding panels to contentpane
		contentPane.add(login, "Login");
	}



	public Login getLogin() {
		return login;
	}
	public void show(String card) {
		c.show(getContentPane(), card);
	}

}
