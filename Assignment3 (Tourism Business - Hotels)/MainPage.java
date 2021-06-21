package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("Just Go Travel Hotel Booking System");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel(){
			public void paintComponent(Graphics g) {
				Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\ѧϰ\\Programming 2\\Assignments\\Assignment 3\\Background.jpg");
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeTo = new JLabel("Welcome To");
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setBounds(15, 117, 698, 70);
		contentPane.add(lblWelcomeTo);
		lblWelcomeTo.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
		lblWelcomeTo.setForeground(Color.WHITE);
		
		JLabel lblJustGoTravel = new JLabel("Just Go Travel");
		lblJustGoTravel.setHorizontalAlignment(SwingConstants.CENTER);
		lblJustGoTravel.setBounds(15, 176, 698, 70);
		contentPane.add(lblJustGoTravel);
		lblJustGoTravel.setForeground(Color.WHITE);
		lblJustGoTravel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 70));
		
		JLabel lblHotel = new JLabel("Hotel Booking System");
		lblHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotel.setBounds(15, 230, 698, 70);
		contentPane.add(lblHotel);
		lblHotel.setForeground(Color.WHITE);
		lblHotel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setModalExclusionType(null);
				login.setVisible(true);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		btnLogin.setBounds(145, 424, 125, 39);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Just Go Travel Hotel Booking System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Britannic Bold", Font.BOLD, 30));
		btnExit.setBounds(442, 424, 125, 39);
		contentPane.add(btnExit);
		
		
	}
}
