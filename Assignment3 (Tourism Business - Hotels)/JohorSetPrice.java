package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JohorSetPrice extends JFrame {

	private JPanel contentPane;
	private JPanel panelImpiana;
	private JTextField tfDeluxeIHS;
	private JTextField tfExecutiveIHS;
	private JTextField tfStandardIHS;
	private JTextField tfSuitesIHS;
	private JTextField tfDeluxeHLM;
	private JTextField tfStandardHLM;
	static double deluxeIHS;
	static double executiveIHS;
	static double standardIHS;
	static double suitesIHS;
	static double deluxeHLM;
	static double standardHLM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JohorSetPrice frame = new JohorSetPrice();
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
	public JohorSetPrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 487);
		
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
		
		JMenu mnUpdateHotelRooms = new JMenu("Update Hotels' Rooms Price");
		mnHome.add(mnUpdateHotelRooms);
		
		JMenuItem mntmPenang = new JMenuItem("Penang");
		mntmPenang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PenangSetPrice penang = new PenangSetPrice();
				penang.setModalExclusionType(null);
				penang.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelRooms.add(mntmPenang);
		
		JMenuItem mntmPerak = new JMenuItem("Perak");
		mntmPerak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerakSetPrice perak = new PerakSetPrice();
				perak.setModalExclusionType(null);
				perak.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelRooms.add(mntmPerak);
		
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
		
		JPanel panelTitle = new JPanel();
		panelTitle.setBackground(new Color(240, 255, 255));
		panelTitle.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelTitle.setBounds(15, 10, 828, 66);
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblJohor = new JLabel("Hotels in Johor");
		lblJohor.setHorizontalAlignment(SwingConstants.CENTER);
		lblJohor.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
		lblJohor.setBounds(15, 16, 798, 34);
		panelTitle.add(lblJohor);
		
		panelImpiana = new JPanel();
		panelImpiana.setBackground(new Color(240, 255, 255));
		panelImpiana.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelImpiana.setBounds(15, 79, 412, 263);
		contentPane.add(panelImpiana);
		panelImpiana.setLayout(null);
		
		JLabel lblDeluxeIHS = new JLabel("Deluxe Room");
		lblDeluxeIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDeluxeIHS.setBounds(15, 68, 175, 30);
		panelImpiana.add(lblDeluxeIHS);
		
		JPanel panelTitleImpiana = new JPanel();
		panelTitleImpiana.setBackground(new Color(240, 255, 255));
		panelTitleImpiana.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panelTitleImpiana.setBounds(15, 10, 382, 42);
		panelImpiana.add(panelTitleImpiana);
		panelTitleImpiana.setLayout(null);
		
		JLabel lblImpianaHotelSenai = new JLabel("Impiana Hotel Senai");
		lblImpianaHotelSenai.setBounds(15, 0, 352, 42);
		panelTitleImpiana.add(lblImpianaHotelSenai);
		lblImpianaHotelSenai.setHorizontalAlignment(SwingConstants.CENTER);
		lblImpianaHotelSenai.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		
		tfDeluxeIHS = new JTextField();
		tfDeluxeIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfDeluxeIHS.setBounds(205, 68, 175, 30);
		panelImpiana.add(tfDeluxeIHS);
		tfDeluxeIHS.setColumns(10);
		
		JLabel lblExecutiveIHS = new JLabel("Executive Room");
		lblExecutiveIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblExecutiveIHS.setBounds(15, 114, 175, 30);
		panelImpiana.add(lblExecutiveIHS);
		
		JLabel lblStandardIHS = new JLabel("Standard Room");
		lblStandardIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardIHS.setBounds(15, 160, 175, 30);
		panelImpiana.add(lblStandardIHS);
		
		JLabel lblSuitesIHS = new JLabel("Suites");
		lblSuitesIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblSuitesIHS.setBounds(15, 206, 175, 30);
		panelImpiana.add(lblSuitesIHS);
		
		tfExecutiveIHS = new JTextField();
		tfExecutiveIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfExecutiveIHS.setColumns(10);
		tfExecutiveIHS.setBounds(205, 114, 175, 30);
		panelImpiana.add(tfExecutiveIHS);
		
		tfStandardIHS = new JTextField();
		tfStandardIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardIHS.setColumns(10);
		tfStandardIHS.setBounds(205, 160, 175, 30);
		panelImpiana.add(tfStandardIHS);
		
		tfSuitesIHS = new JTextField();
		tfSuitesIHS.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfSuitesIHS.setColumns(10);
		tfSuitesIHS.setBounds(205, 206, 175, 30);
		panelImpiana.add(tfSuitesIHS);
		
		JPanel panelLegoland = new JPanel();
		panelLegoland.setBackground(new Color(240, 255, 255));
		panelLegoland.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelLegoland.setBounds(431, 79, 412, 263);
		contentPane.add(panelLegoland);
		panelLegoland.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(15, 10, 382, 42);
		panelLegoland.add(panel);
		
		JLabel lblHotelLegolandMalaysis = new JLabel("Hotel Legoland Malaysia");
		lblHotelLegolandMalaysis.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelLegolandMalaysis.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblHotelLegolandMalaysis.setBounds(15, 0, 352, 42);
		panel.add(lblHotelLegolandMalaysis);
		
		JLabel lblDeluxeHLM = new JLabel("Deluxe Room");
		lblDeluxeHLM.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDeluxeHLM.setBounds(15, 68, 175, 30);
		panelLegoland.add(lblDeluxeHLM);
		
		tfDeluxeHLM = new JTextField();
		tfDeluxeHLM.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfDeluxeHLM.setColumns(10);
		tfDeluxeHLM.setBounds(205, 68, 175, 30);
		panelLegoland.add(tfDeluxeHLM);
		
		JLabel lblStandardHLM = new JLabel("Standard Room");
		lblStandardHLM.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardHLM.setBounds(15, 114, 175, 30);
		panelLegoland.add(lblStandardHLM);
		
		tfStandardHLM = new JTextField();
		tfStandardHLM.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardHLM.setColumns(10);
		tfStandardHLM.setBounds(205, 114, 175, 30);
		panelLegoland.add(tfStandardHLM);
		
		JButton btnSetPrice = new JButton("Set Price");
		btnSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deluxeIHS = Double.parseDouble(tfDeluxeIHS.getText());
				executiveIHS = Double.parseDouble(tfExecutiveIHS.getText());
				standardIHS = Double.parseDouble(tfStandardIHS.getText());
				suitesIHS = Double.parseDouble(tfSuitesIHS.getText());
				deluxeHLM = Double.parseDouble(tfDeluxeHLM.getText());
				standardHLM = Double.parseDouble(tfStandardHLM.getText());
			}
		});
		btnSetPrice.setBackground(new Color(135, 206, 250));
		btnSetPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnSetPrice.setBounds(337, 355, 183, 29);
		contentPane.add(btnSetPrice);
	}
}
