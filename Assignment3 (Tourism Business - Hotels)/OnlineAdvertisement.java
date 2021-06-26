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

public class OnlineAdvertisement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineAdvertisement frame = new OnlineAdvertisement();
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
	public OnlineAdvertisement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 671);
		
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
		
		JMenuItem mntmOfflineAdvertisement = new JMenuItem("Offline Advertisement");
		mntmOfflineAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfflineAdvertisement offlineAds = new OfflineAdvertisement();
				offlineAds.setVisible(true);
				dispose();
			}
		});
		mnAdvertisement.add(mntmOfflineAdvertisement);
		
		JMenuItem mntmFinance = new JMenuItem("Finance");
		mntmFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance();
				finance.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmFinance);
		
		JMenu mnUpdateHotelsRooms = new JMenu("Update Hotels' Rooms Price");
		mnHome.add(mnUpdateHotelsRooms);
		
		JMenuItem mntmJohor = new JMenuItem("Johor");
		mntmJohor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JohorSetPrice johor = new JohorSetPrice();
				johor.setModalExclusionType(null);
				johor.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelsRooms.add(mntmJohor);
		
		JMenuItem mntmPenang = new JMenuItem("Penang");
		mntmPenang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PenangSetPrice penang = new PenangSetPrice();
				penang.setModalExclusionType(null);
				penang.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelsRooms.add(mntmPenang);
		
		JMenuItem mntmPerak = new JMenuItem("Perak");
		mntmPerak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerakSetPrice perak = new PerakSetPrice();
				perak.setMaximizedBounds(null);
				perak.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelsRooms.add(mntmPerak);
		
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
		
		JPanel panelOnlineAds = new JPanel();
		panelOnlineAds.setLayout(null);
		panelOnlineAds.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOnlineAds.setBackground(new Color(255, 255, 204));
		panelOnlineAds.setBounds(15, 85, 898, 509);
		contentPane.add(panelOnlineAds);
		
		JPanel panelOnlineAds1 = new JPanel();
		panelOnlineAds1.setLayout(null);
		panelOnlineAds1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOnlineAds1.setBackground(new Color(255, 255, 204));
		panelOnlineAds1.setBounds(15, 16, 866, 63);
		panelOnlineAds.add(panelOnlineAds1);
		
		JLabel label_1 = new JLabel("Online Advertisement");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Century", Font.BOLD, 45));
		label_1.setBounds(15, 0, 836, 63);
		panelOnlineAds1.add(label_1);
		
		JPanel panelOnlineDetails = new JPanel();
		panelOnlineDetails.setLayout(null);
		panelOnlineDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelOnlineDetails.setBackground(new Color(255, 255, 204));
		panelOnlineDetails.setBounds(15, 85, 866, 408);
		panelOnlineAds.add(panelOnlineDetails);
		
		JTextArea textAreaOnlineAds = new JTextArea();
		textAreaOnlineAds.setText("Posted on Facebook, Instagram and Twitter."
				+ "\n\nOur company is helding a GIVEAWAY event!!!\nYou have a chance to get a 40% discount voucher for "
				+ "\nbooking hotels by just follow these 3 steps!!!"
				+ "\n1st Step\t: Like our page."
				+ "\n2nd Step\t: Like this post and share out this post "
				+ "\n\tin public condition."
				+ "\n3nd Step\t: Tag 3 friends in comment and writ "
				+ "\n\tdown why you want to get this voucher."
				+ "\nLucky winner will win the prize!!!"
				+ "\nThe lucky winner will be announced on 24 June 2021.");
		textAreaOnlineAds.setFont(new Font("Lucida Bright", Font.BOLD, 27));
		textAreaOnlineAds.setBackground(new Color(255, 255, 204));
		textAreaOnlineAds.setBounds(15, 10, 836, 382);
		panelOnlineDetails.add(textAreaOnlineAds);
	}

}
