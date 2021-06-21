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
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class OfflineAdvertisement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfflineAdvertisement frame = new OfflineAdvertisement();
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
	public OfflineAdvertisement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 671);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmEmployeeManagement = new JMenuItem("Employee Management");
		mntmEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement employee = new EmployeeManagement();
				employee.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmEmployeeManagement);
		
		JMenu mnAdvertisement = new JMenu("Advertisement");
		mnHome.add(mnAdvertisement);
		
		JMenuItem mntmOnlineAdvertisement = new JMenuItem("Online Advertisement");
		mntmOnlineAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlineAdvertisement onlineAds = new OnlineAdvertisement();
				onlineAds.setVisible(true);
				dispose();
			}
		});
		mnAdvertisement.add(mntmOnlineAdvertisement);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance();
				finance.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmFinance);
		
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
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAdsNMarketing = new JPanel();
		panelAdsNMarketing.setLayout(null);
		panelAdsNMarketing.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelAdsNMarketing.setBackground(new Color(255, 255, 204));
		panelAdsNMarketing.setBounds(15, 10, 898, 70);
		contentPane.add(panelAdsNMarketing);
		
		JLabel label = new JLabel("Advertisement & Marketing");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
		label.setBounds(15, 0, 866, 70);
		panelAdsNMarketing.add(label);
		
		JPanel panelOfflineAds = new JPanel();
		panelOfflineAds.setLayout(null);
		panelOfflineAds.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOfflineAds.setBackground(new Color(255, 255, 204));
		panelOfflineAds.setBounds(15, 85, 898, 509);
		contentPane.add(panelOfflineAds);
		
		JPanel panelOfflineAds1 = new JPanel();
		panelOfflineAds1.setLayout(null);
		panelOfflineAds1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOfflineAds1.setBackground(new Color(255, 255, 204));
		panelOfflineAds1.setBounds(15, 16, 866, 63);
		panelOfflineAds.add(panelOfflineAds1);
		
		JLabel label_1 = new JLabel("Offline Advertisement");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Century", Font.BOLD, 45));
		label_1.setBounds(15, 0, 836, 63);
		panelOfflineAds1.add(label_1);
		
		JPanel panelOfflineDetails = new JPanel();
		panelOfflineDetails.setLayout(null);
		panelOfflineDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOfflineDetails.setBackground(new Color(255, 255, 204));
		panelOfflineDetails.setBounds(15, 85, 866, 412);
		panelOfflineAds.add(panelOfflineDetails);
		
		JTextArea textAreaOfflineAds = new JTextArea();
		textAreaOfflineAds.setText("Posted on Brochure and Newspaper"
				+ "\n\nFestival Season is Coming Soon!!!!"
				+ "\nJust come to our webiste and booking for your hotels in "
				+ "\nanywhere."
				+ "\nWe provide free calcellation and free breakfast for "
				+ "\ndifferent hotels."
				+ "\n++++++++++++++++PROMOTION+++++++++++++++++"
				+ "\nYou will get a 10% discount if you have spend over RM3000!!!"
				+ "\nThis promotion only valid until 30 July 2021."
				+ "\nHURRY UP!!! Pls dont miss this amazing promotion!!!"
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: www.jgt.com.my");
		textAreaOfflineAds.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		textAreaOfflineAds.setBackground(new Color(255, 255, 204));
		textAreaOfflineAds.setBounds(15, 10, 836, 393);
		panelOfflineDetails.add(textAreaOfflineAds);
	}

}
