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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 671);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panel.setBounds(35, 29, 856, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Home Page");
		label.setBounds(15, 16, 826, 72);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 80));
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeManagement EmpMngmt = new EmployeeManagement();
				EmpMngmt.setModalExclusionType(null);
				EmpMngmt.setVisible(true);
			}
		});
		btnEmployeeManagement.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnEmployeeManagement.setBackground(new Color(135, 206, 250));
		btnEmployeeManagement.setBounds(265, 186, 418, 81);
		contentPane.add(btnEmployeeManagement);
		
		JButton btnAdvertisementMarketing = new JButton("Advertisement & Marketing");
		btnAdvertisementMarketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementNMarketing Ads = new AdvertisementNMarketing();
				Ads.setModalExclusionType(null);
				Ads.setVisible(true);
			}
		});
		btnAdvertisementMarketing.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnAdvertisementMarketing.setBackground(new Color(135, 206, 250));
		btnAdvertisementMarketing.setBounds(265, 309, 418, 81);
		contentPane.add(btnAdvertisementMarketing);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finance finance = new Finance();
				finance.setModalExclusionType(null);
				finance.setVisible(true);
			}
		});
		btnFinance.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnFinance.setBackground(new Color(135, 206, 250));
		btnFinance.setBounds(265, 436, 418, 81);
		contentPane.add(btnFinance);
	}
}
