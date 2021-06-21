package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CompanyBackground extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground frame = new CompanyBackground();
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
	public CompanyBackground() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 649);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmRegistration = new JMenuItem("Registration");
		mntmRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration cusreg = new CustomerRegistration();
				cusreg.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmRegistration);
		
		JMenuItem mntmHotelDescription = new JMenuItem("Hotel Description");
		mntmHotelDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelDescription hoteldes = new HotelDescription();
				hoteldes.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmHotelDescription);
		
		JMenuItem mntmPlaceOrder = new JMenuItem("Place Order");
		mntmPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales sales = new Sales();
				sales.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmPlaceOrder);
		
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
		
		JPanel panelCompanyBackground = new JPanel();
		panelCompanyBackground.setBackground(new Color(240, 255, 255));
		panelCompanyBackground.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelCompanyBackground.setBounds(36, 16, 856, 104);
		contentPane.add(panelCompanyBackground);
		panelCompanyBackground.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Company Background");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 60));
		lblNewLabel.setBounds(15, 16, 826, 72);
		panelCompanyBackground.add(lblNewLabel);
		
		JPanel panelCompanyDetails = new JPanel();
		panelCompanyDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelCompanyDetails.setBackground(new Color(240, 255, 255));
		panelCompanyDetails.setBounds(36, 136, 415, 416);
		contentPane.add(panelCompanyDetails);
		panelCompanyDetails.setLayout(null);
		
		JPanel panelCompanyDetails1 = new JPanel();
		panelCompanyDetails1.setLayout(null);
		panelCompanyDetails1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelCompanyDetails1.setBackground(new Color(240, 255, 255));
		panelCompanyDetails1.setBounds(15, 16, 385, 53);
		panelCompanyDetails.add(panelCompanyDetails1);
		
		JLabel lblCompanyDetails = new JLabel("Company Details");
		lblCompanyDetails.setBackground(new Color(240, 255, 255));
		lblCompanyDetails.setFont(new Font("Century", Font.BOLD, 30));
		lblCompanyDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyDetails.setBounds(15, 0, 355, 53);
		panelCompanyDetails1.add(lblCompanyDetails);
		
		JPanel panelCompanyDetails2 = new JPanel();
		panelCompanyDetails2.setBackground(new Color(240, 255, 255));
		panelCompanyDetails2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelCompanyDetails2.setBounds(15, 85, 385, 315);
		panelCompanyDetails.add(panelCompanyDetails2);
		panelCompanyDetails2.setLayout(null);
		
		JLabel LabelCompanyName = new JLabel("Company Name: Just Go Travel");
		LabelCompanyName.setBounds(15, 16, 360, 40);
		panelCompanyDetails2.add(LabelCompanyName);
		LabelCompanyName.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelEstablishedYear = new JLabel("Established Year: 2010");
		LabelEstablishedYear.setBounds(15, 128, 355, 40);
		panelCompanyDetails2.add(LabelEstablishedYear);
		LabelEstablishedYear.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelAddress = new JLabel("Address: 123, Jalan Emas,");
		LabelAddress.setBounds(15, 54, 360, 40);
		panelCompanyDetails2.add(LabelAddress);
		LabelAddress.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelAddress2 = new JLabel("11888 Pulau Pinang");
		LabelAddress2.setBounds(120, 92, 255, 40);
		panelCompanyDetails2.add(LabelAddress2);
		LabelAddress2.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelAwards = new JLabel("Awards: Winner of Hotel Tech");
		LabelAwards.setBounds(15, 166, 355, 40);
		panelCompanyDetails2.add(LabelAwards);
		LabelAwards.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelAwards2 = new JLabel("Awards in 2018");
		LabelAwards2.setBounds(114, 205, 256, 40);
		panelCompanyDetails2.add(LabelAwards2);
		LabelAwards2.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JLabel LabelWebsite = new JLabel("Website: www.jgt.com.my");
		LabelWebsite.setBounds(15, 240, 355, 40);
		panelCompanyDetails2.add(LabelWebsite);
		LabelWebsite.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		
		JPanel PanelContactUs = new JPanel();
		PanelContactUs.setLayout(null);
		PanelContactUs.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		PanelContactUs.setBackground(new Color(240, 255, 255));
		PanelContactUs.setBounds(477, 136, 415, 416);
		contentPane.add(PanelContactUs);
		
		JPanel panelContactUs1 = new JPanel();
		panelContactUs1.setLayout(null);
		panelContactUs1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelContactUs1.setBackground(new Color(240, 255, 255));
		panelContactUs1.setBounds(15, 16, 385, 53);
		PanelContactUs.add(panelContactUs1);
		
		JLabel labelContactUs = new JLabel("Contact Us");
		labelContactUs.setHorizontalAlignment(SwingConstants.CENTER);
		labelContactUs.setFont(new Font("Century", Font.BOLD, 30));
		labelContactUs.setBounds(15, 0, 355, 53);
		panelContactUs1.add(labelContactUs);
		
		JPanel PanelContactUs2 = new JPanel();
		PanelContactUs2.setLayout(null);
		PanelContactUs2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		PanelContactUs2.setBackground(new Color(240, 255, 255));
		PanelContactUs2.setBounds(15, 85, 385, 315);
		PanelContactUs.add(PanelContactUs2);
		
		JLabel lblFacebook = new JLabel("Facebook: Just Go Travel");
		lblFacebook.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblFacebook.setBounds(25, 128, 329, 40);
		PanelContactUs2.add(lblFacebook);
		
		JLabel lblHotline = new JLabel("Hotline: 1300-88-8888");
		lblHotline.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblHotline.setBounds(25, 16, 329, 40);
		PanelContactUs2.add(lblHotline);
		
		JLabel lblFaxNo = new JLabel("Fax No: 04-1357982");
		lblFaxNo.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblFaxNo.setBounds(25, 54, 329, 40);
		PanelContactUs2.add(lblFaxNo);
		
		JLabel lblEmail = new JLabel("Email: jgt2010@gmail.com");
		lblEmail.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblEmail.setBounds(25, 92, 329, 40);
		PanelContactUs2.add(lblEmail);
		
		JLabel lblInstagram = new JLabel("Instagram: @justgotravelll");
		lblInstagram.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblInstagram.setBounds(25, 163, 329, 40);
		PanelContactUs2.add(lblInstagram);
		
		JLabel lblTwitter = new JLabel("Twitter: @justgotravelll");
		lblTwitter.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblTwitter.setBounds(25, 199, 329, 40);
		PanelContactUs2.add(lblTwitter);
	}

}
