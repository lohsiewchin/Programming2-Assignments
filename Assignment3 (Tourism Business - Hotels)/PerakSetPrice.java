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

public class PerakSetPrice extends JFrame {

	private JPanel contentPane;
	private JPanel panelDH;
	private JTextField tfStandardDH;
	static double comfortDH;
	static double standardDH;
	static double standardPangkor;
	static double villasPangkor;
	private JTextField tfComfortDH;
	private JTextField tfStandardPangkor;
	private JTextField tfVillasPangkor;
	private JLabel lblStandardDH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerakSetPrice frame = new PerakSetPrice();
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
	public PerakSetPrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 391);
		
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
		
		JLabel lblJohor = new JLabel("Hotels in Perak");
		lblJohor.setHorizontalAlignment(SwingConstants.CENTER);
		lblJohor.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 40));
		lblJohor.setBounds(15, 16, 798, 34);
		panelTitle.add(lblJohor);
		
		panelDH = new JPanel();
		panelDH.setBackground(new Color(240, 255, 255));
		panelDH.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelDH.setBounds(15, 79, 412, 168);
		contentPane.add(panelDH);
		panelDH.setLayout(null);
		
		JPanel panelTitleDH = new JPanel();
		panelTitleDH.setBackground(new Color(240, 255, 255));
		panelTitleDH.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panelTitleDH.setBounds(15, 10, 382, 42);
		panelDH.add(panelTitleDH);
		panelTitleDH.setLayout(null);
		
		JLabel lblDH = new JLabel("D Hotel Seri Iskandar");
		lblDH.setBounds(15, 0, 352, 42);
		panelTitleDH.add(lblDH);
		lblDH.setHorizontalAlignment(SwingConstants.CENTER);
		lblDH.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		
		lblStandardDH = new JLabel("Standard Room");
		lblStandardDH.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardDH.setBounds(15, 114, 175, 30);
		panelDH.add(lblStandardDH);
		
		tfStandardDH = new JTextField();
		tfStandardDH.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardDH.setColumns(10);
		tfStandardDH.setBounds(205, 114, 175, 30);
		panelDH.add(tfStandardDH);
		
		JLabel lblComfortDH = new JLabel("Comfort Room");
		lblComfortDH.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblComfortDH.setBounds(15, 68, 175, 30);
		panelDH.add(lblComfortDH);
		
		tfComfortDH = new JTextField();
		tfComfortDH.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfComfortDH.setColumns(10);
		tfComfortDH.setBounds(205, 68, 175, 30);
		panelDH.add(tfComfortDH);
		
		JPanel panelPangkor = new JPanel();
		panelPangkor.setBackground(new Color(240, 255, 255));
		panelPangkor.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelPangkor.setBounds(431, 79, 412, 168);
		contentPane.add(panelPangkor);
		panelPangkor.setLayout(null);
		
		JPanel panelTitlePangkor = new JPanel();
		panelTitlePangkor.setLayout(null);
		panelTitlePangkor.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(70, 130, 180)));
		panelTitlePangkor.setBackground(new Color(240, 255, 255));
		panelTitlePangkor.setBounds(15, 10, 382, 42);
		panelPangkor.add(panelTitlePangkor);
		
		JLabel lblPangkor = new JLabel("Pangkor Laut resort");
		lblPangkor.setHorizontalAlignment(SwingConstants.CENTER);
		lblPangkor.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblPangkor.setBounds(15, 0, 352, 42);
		panelTitlePangkor.add(lblPangkor);
		
		JLabel lblStandardPangkor = new JLabel("Standard Room");
		lblStandardPangkor.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblStandardPangkor.setBounds(15, 68, 175, 30);
		panelPangkor.add(lblStandardPangkor);
		
		tfStandardPangkor = new JTextField();
		tfStandardPangkor.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfStandardPangkor.setColumns(10);
		tfStandardPangkor.setBounds(205, 68, 175, 30);
		panelPangkor.add(tfStandardPangkor);
		
		JLabel lblVillasPangkor = new JLabel("Villas");
		lblVillasPangkor.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblVillasPangkor.setBounds(15, 114, 175, 30);
		panelPangkor.add(lblVillasPangkor);
		
		tfVillasPangkor = new JTextField();
		tfVillasPangkor.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		tfVillasPangkor.setColumns(10);
		tfVillasPangkor.setBounds(205, 114, 175, 30);
		panelPangkor.add(tfVillasPangkor);
		
		JButton btnSetPrice = new JButton("Set Price");
		btnSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comfortDH =Double.parseDouble(tfComfortDH.getText());
				standardDH = Double.parseDouble(tfStandardDH.getText());
				standardPangkor = Double.parseDouble(tfStandardPangkor.getText());
				villasPangkor = Double.parseDouble(tfVillasPangkor.getText());
			}
		});
		btnSetPrice.setBackground(new Color(135, 206, 250));
		btnSetPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnSetPrice.setBounds(337, 263, 183, 29);
		contentPane.add(btnSetPrice);
	}

}
