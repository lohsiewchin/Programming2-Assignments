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
import javax.swing.JComboBox;

public class UserHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage frame = new UserHomePage();
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
	public UserHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 528);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Exit");
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		mnMenu.add(mntmLogOut);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hotel Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 182, 193)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelHomePage = new JPanel();
		panelHomePage.setBackground(new Color(250, 235, 215));
		panelHomePage.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelHomePage.setBounds(35, 16, 856, 104);
		contentPane.add(panelHomePage);
		panelHomePage.setLayout(null);
		
		JLabel lblHomePage = new JLabel("Home Page");
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 80));
		lblHomePage.setBounds(15, 16, 826, 72);
		panelHomePage.add(lblHomePage);
		
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(null);
		panelSelection.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelSelection.setBackground(new Color(250, 235, 215));
		panelSelection.setBounds(35, 125, 856, 300);
		contentPane.add(panelSelection);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(255, 192, 203));
		btnRegister.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerRegistration CusReg = new CustomerRegistration(); //calling another frame/window
				CusReg.setModalExclusionType(null);
	            CusReg.setVisible(true);
	            dispose();
			}
		});
		btnRegister.setBounds(84, 60, 282, 81);
		panelSelection.add(btnRegister);
		
		JButton btnHotelDescription = new JButton("Hotel Description");
		btnHotelDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelDescription hoteldes = new HotelDescription();
				hoteldes.setModalExclusionType(null);
				hoteldes.setVisible(true);
				dispose();
			}
		});
		btnHotelDescription.setBackground(new Color(255, 192, 203));
		btnHotelDescription.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnHotelDescription.setBounds(483, 60, 282, 81);
		panelSelection.add(btnHotelDescription);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales sales = new Sales();
				sales.setModalExclusionType(null);
				sales.setVisible(true);
				dispose();
			}
		});
		btnPlaceOrder.setBackground(new Color(255, 192, 203));
		btnPlaceOrder.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnPlaceOrder.setBounds(84, 157, 282, 80);
		panelSelection.add(btnPlaceOrder);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground ComBackground = new CompanyBackground();
				ComBackground.setModalExclusionType(null);
				ComBackground.setVisible(true);
				dispose();
			}
		});
		btnAboutUs.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnAboutUs.setBackground(new Color(255, 192, 203));
		btnAboutUs.setBounds(483, 157, 282, 80);
		panelSelection.add(btnAboutUs);
	}
}
