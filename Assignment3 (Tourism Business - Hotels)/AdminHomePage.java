package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 479);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		mnExit.add(mntmLogOut);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Just Go Travel Hotel Booking System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnExit.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panel.setBounds(15, 16, 722, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Home Page");
		label.setBounds(15, 0, 692, 71);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 60));
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement EmpMngmt = new EmployeeManagement();
				EmpMngmt.setModalExclusionType(null);
				EmpMngmt.setVisible(true);
				dispose();
			}
		});
		btnEmployeeManagement.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnEmployeeManagement.setBackground(new Color(135, 206, 250));
		btnEmployeeManagement.setBounds(175, 104, 418, 55);
		contentPane.add(btnEmployeeManagement);
		
		JButton btnAdvertisementMarketing = new JButton("Advertisement & Marketing");
		btnAdvertisementMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementNMarketing Ads = new AdvertisementNMarketing();
				Ads.setModalExclusionType(null);
				Ads.setVisible(true);
				dispose();
			}
		});
		btnAdvertisementMarketing.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnAdvertisementMarketing.setBackground(new Color(135, 206, 250));
		btnAdvertisementMarketing.setBounds(175, 175, 418, 55);
		contentPane.add(btnAdvertisementMarketing);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance();
				finance.setModalExclusionType(null);
				finance.setVisible(true);
				dispose();
			}
		});
		btnFinance.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnFinance.setBackground(new Color(135, 206, 250));
		btnFinance.setBounds(175, 314, 418, 55);
		contentPane.add(btnFinance);
		
		JButton btnEditHotelRoomPrice = new JButton("Update Hotels' Rooms Price");
		btnEditHotelRoomPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatePrice update = new UpdatePrice();
				update.setModalExclusionType(null);
				update.setVisible(true);
				dispose();
			}
		});
		btnEditHotelRoomPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnEditHotelRoomPrice.setBackground(new Color(135, 206, 250));
		btnEditHotelRoomPrice.setBounds(175, 246, 418, 55);
		contentPane.add(btnEditHotelRoomPrice);
	}
}
