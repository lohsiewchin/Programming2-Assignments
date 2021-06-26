package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdatePrice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatePrice frame = new UpdatePrice();
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
	public UpdatePrice() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 483);
		
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
		panelTitle.setBounds(15, 16, 637, 68);
		contentPane.add(panelTitle);
		panelTitle.setLayout(null);
		
		JLabel lblUpdatePrice = new JLabel("Update Price");
		lblUpdatePrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdatePrice.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
		lblUpdatePrice.setBounds(15, 16, 607, 36);
		panelTitle.add(lblUpdatePrice);
		
		JPanel panelJohor = new JPanel();
		panelJohor.setBackground(new Color(240, 255, 255));
		panelJohor.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelJohor.setBounds(15, 94, 637, 286);
		contentPane.add(panelJohor);
		panelJohor.setLayout(null);
		
		JButton btnJohor = new JButton("Johor");
		btnJohor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JohorSetPrice johor = new JohorSetPrice();
				johor.setModalExclusionType(null);
				johor.setVisible(true);
				dispose();
			}
		});
		btnJohor.setBackground(new Color(135, 206, 250));
		btnJohor.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnJohor.setBounds(246, 88, 136, 39);
		panelJohor.add(btnJohor);
		
		JButton btnPenang = new JButton("Penang");
		btnPenang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PenangSetPrice penang = new PenangSetPrice();
				penang.setModalExclusionType(null);
				penang.setVisible(true);
				dispose();
			}
		});
		btnPenang.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnPenang.setBackground(new Color(135, 206, 250));
		btnPenang.setBounds(246, 143, 136, 39);
		panelJohor.add(btnPenang);
		
		JButton btnPerak = new JButton("Perak");
		btnPerak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerakSetPrice perak = new PerakSetPrice();
				perak.setModalExclusionType(null);
				perak.setVisible(true);
				dispose();
			}
		});
		btnPerak.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnPerak.setBackground(new Color(135, 206, 250));
		btnPerak.setBounds(246, 198, 136, 39);
		panelJohor.add(btnPerak);
		
		JLabel lblNewLabel = new JLabel("Please choose the destination");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 30));
		lblNewLabel.setBounds(15, 16, 607, 39);
		panelJohor.add(lblNewLabel);
	}
}
