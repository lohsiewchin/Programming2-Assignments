package Assignment3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class PenangSetPrice extends JFrame {

	private JPanel contentPane;
	private JPanel panelENO;
	private JTextField tfDeluxeENO;
	private JTextField tfStandardENO;
	private JTextField tfStudioENO;
	private JTextField tfSuitesENO;
	static double comfortENO;
	static double deluxeENO;
	static double standardENO;
	static double studioENO;
	static double suitesENO;
	static double comfortBayview;
	static double deluxeBayview;
	static double familyBayview;
	static double standardBayview;
	static double suitesBayview;
	private JTextField tfComfortENO;
	private JTextField tfComfortBayview;
	private JTextField tfDeluxeBayview;
	private JTextField tfFamilyBayview;
	private JTextField tfStandardBayview;
	private JTextField tfSuitesBayview;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PenangSetPrice frame = new PenangSetPrice();
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
	public PenangSetPrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 534);
		
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
		
		JMenuItem mntmJohor = new JMenuItem("Johor");
		mntmJohor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JohorSetPrice johor = new JohorSetPrice();
				johor.setModalExclusionType(null);
				johor.setVisible(true);
				dispose();
			}
		});
		mnUpdateHotelRooms.add(mntmJohor);
		
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
		
		JLabel lblJohor = new JLabel("Hotels in Penang");
		lblJohor.setHorizontalAlignment(SwingConstants.CENTER);
		lblJohor.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
		lblJohor.setBounds(15, 16, 798, 34);
		panelTitle.add(lblJohor);
		
		panelENO = new JPanel();
		panelENO.setBackground(new Color(240, 255, 255));
		panelENO.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelENO.setBounds(15, 79, 412, 298);
		contentPane.add(panelENO);
		panelENO.setLayout(null);
		
		JLabel lblDeluxeENO = new JLabel("Deluxe Room");
		lblDeluxeENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDeluxeENO.setBounds(15, 114, 175, 30);
		panelENO.add(lblDeluxeENO);
		
		JPanel panelTitleENO = new JPanel();
		panelTitleENO.setBackground(new Color(240, 255, 255));
		panelTitleENO.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panelTitleENO.setBounds(15, 10, 382, 42);
		panelENO.add(panelTitleENO);
		panelTitleENO.setLayout(null);
		
		JLabel lblHotelENO = new JLabel("Hotel Eastern & Oriental");
		lblHotelENO.setBounds(15, 0, 352, 42);
		panelTitleENO.add(lblHotelENO);
		lblHotelENO.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelENO.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		
		tfDeluxeENO = new JTextField();
		tfDeluxeENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfDeluxeENO.setBounds(205, 114, 175, 30);
		panelENO.add(tfDeluxeENO);
		tfDeluxeENO.setColumns(10);
		
		JLabel lblStudioENO = new JLabel("Studio Room");
		lblStudioENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStudioENO.setBounds(15, 206, 175, 30);
		panelENO.add(lblStudioENO);
		
		JLabel lblStandardENO = new JLabel("Standard Room");
		lblStandardENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardENO.setBounds(15, 160, 175, 30);
		panelENO.add(lblStandardENO);
		
		JLabel lblSuitesENO = new JLabel("Suites");
		lblSuitesENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblSuitesENO.setBounds(15, 252, 175, 30);
		panelENO.add(lblSuitesENO);
		
		tfStandardENO = new JTextField();
		tfStandardENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardENO.setColumns(10);
		tfStandardENO.setBounds(205, 160, 175, 30);
		panelENO.add(tfStandardENO);
		
		tfStudioENO = new JTextField();
		tfStudioENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStudioENO.setColumns(10);
		tfStudioENO.setBounds(205, 206, 175, 30);
		panelENO.add(tfStudioENO);
		
		tfSuitesENO = new JTextField();
		tfSuitesENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfSuitesENO.setColumns(10);
		tfSuitesENO.setBounds(205, 252, 175, 30);
		panelENO.add(tfSuitesENO);
		
		JLabel lblComfortENO = new JLabel("Comfort Room");
		lblComfortENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblComfortENO.setBounds(15, 68, 175, 30);
		panelENO.add(lblComfortENO);
		
		tfComfortENO = new JTextField();
		tfComfortENO.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfComfortENO.setColumns(10);
		tfComfortENO.setBounds(205, 68, 175, 30);
		panelENO.add(tfComfortENO);
		
		JPanel panelBayview = new JPanel();
		panelBayview.setBackground(new Color(240, 255, 255));
		panelBayview.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelBayview.setBounds(431, 79, 412, 298);
		contentPane.add(panelBayview);
		panelBayview.setLayout(null);
		
		JPanel panelTitleBayview = new JPanel();
		panelTitleBayview.setLayout(null);
		panelTitleBayview.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panelTitleBayview.setBackground(new Color(240, 255, 255));
		panelTitleBayview.setBounds(15, 10, 382, 42);
		panelBayview.add(panelTitleBayview);
		
		JLabel lblBayview = new JLabel("Bayview Hotel");
		lblBayview.setHorizontalAlignment(SwingConstants.CENTER);
		lblBayview.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblBayview.setBounds(15, 0, 352, 42);
		panelTitleBayview.add(lblBayview);
		
		JLabel lblComfortBayview = new JLabel("Comfort Room");
		lblComfortBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblComfortBayview.setBounds(15, 68, 175, 30);
		panelBayview.add(lblComfortBayview);
		
		tfComfortBayview = new JTextField();
		tfComfortBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfComfortBayview.setColumns(10);
		tfComfortBayview.setBounds(205, 68, 175, 30);
		panelBayview.add(tfComfortBayview);
		
		tfDeluxeBayview = new JTextField();
		tfDeluxeBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfDeluxeBayview.setColumns(10);
		tfDeluxeBayview.setBounds(205, 114, 175, 30);
		panelBayview.add(tfDeluxeBayview);
		
		JLabel lblDeluxeBayview = new JLabel("Deluxe Room");
		lblDeluxeBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDeluxeBayview.setBounds(15, 114, 175, 30);
		panelBayview.add(lblDeluxeBayview);
		
		JLabel lblStandardBayview = new JLabel("Standard Room");
		lblStandardBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardBayview.setBounds(15, 206, 175, 30);
		panelBayview.add(lblStandardBayview);
		
		tfFamilyBayview = new JTextField();
		tfFamilyBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfFamilyBayview.setColumns(10);
		tfFamilyBayview.setBounds(205, 160, 175, 30);
		panelBayview.add(tfFamilyBayview);
		
		tfStandardBayview = new JTextField();
		tfStandardBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardBayview.setColumns(10);
		tfStandardBayview.setBounds(205, 206, 175, 30);
		panelBayview.add(tfStandardBayview);
		
		JLabel lblFamilyBayview = new JLabel("Family Room");
		lblFamilyBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblFamilyBayview.setBounds(15, 160, 175, 30);
		panelBayview.add(lblFamilyBayview);
		
		JLabel lblSuitesBayview = new JLabel("Suites");
		lblSuitesBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblSuitesBayview.setBounds(15, 252, 175, 30);
		panelBayview.add(lblSuitesBayview);
		
		tfSuitesBayview = new JTextField();
		tfSuitesBayview.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfSuitesBayview.setColumns(10);
		tfSuitesBayview.setBounds(205, 252, 175, 30);
		panelBayview.add(tfSuitesBayview);
		
		JButton btnSetPrice = new JButton("Set Price");
		btnSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comfortENO =Double.parseDouble(tfComfortENO.getText());
				deluxeENO = Double.parseDouble(tfDeluxeENO.getText());
				standardENO = Double.parseDouble(tfStandardENO.getText());
				studioENO = Double.parseDouble(tfStudioENO.getText());
				suitesENO = Double.parseDouble(tfSuitesENO.getText());
				comfortBayview = Double.parseDouble(tfComfortBayview.getText());
				deluxeBayview = Double.parseDouble(tfDeluxeBayview.getText());
				familyBayview = Double.parseDouble(tfFamilyBayview.getText());
				standardBayview = Double.parseDouble(tfStandardBayview.getText());
				suitesBayview = Double.parseDouble(tfSuitesBayview.getText());
			}
		});
		btnSetPrice.setBackground(new Color(135, 206, 250));
		btnSetPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnSetPrice.setBounds(337, 402, 183, 29);
		contentPane.add(btnSetPrice);
	}

}
