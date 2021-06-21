package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Finance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNetProfit;
	private JTextField textFieldIncomeHotel;
	private JTextField textFieldIncomeAds;
	private JTextField textFieldTotalIncome;
	private JTextField textFieldMaintainance;
	private JTextField textFieldAds;
	private JTextField textFieldTotalExpenditure;
	private JTextField textFieldWages;
	private JTextField textFieldMiscellaneous;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setBackground(new Color(240, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 661);
		
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
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFinance = new JPanel();
		panelFinance.setBackground(new Color(255, 235, 205));
		panelFinance.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelFinance.setBounds(15, 12, 896, 87);
		contentPane.add(panelFinance);
		panelFinance.setLayout(null);
		
		JLabel lblFinance = new JLabel("Finance");
		lblFinance.setBounds(15, 0, 866, 87);
		lblFinance.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 90));
		lblFinance.setHorizontalAlignment(SwingConstants.CENTER);
		panelFinance.add(lblFinance);
		
		JPanel panelTotalIncome = new JPanel();
		panelTotalIncome.setBackground(new Color(255, 235, 205));
		panelTotalIncome.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelTotalIncome.setBounds(15, 102, 445, 380);
		contentPane.add(panelTotalIncome);
		panelTotalIncome.setLayout(null);
		
		JPanel panelTotalIncome1 = new JPanel();
		panelTotalIncome1.setBackground(new Color(255, 235, 205));
		panelTotalIncome1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelTotalIncome1.setBounds(15, 16, 415, 53);
		panelTotalIncome.add(panelTotalIncome1);
		panelTotalIncome1.setLayout(null);
		
		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalIncome.setFont(new Font("Century", Font.BOLD, 30));
		lblTotalIncome.setBackground(new Color(240, 255, 255));
		lblTotalIncome.setBounds(15, 0, 385, 53);
		panelTotalIncome1.add(lblTotalIncome);
		
		JPanel panelIncomes = new JPanel();
		panelIncomes.setLayout(null);
		panelIncomes.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelIncomes.setBackground(new Color(255, 235, 205));
		panelIncomes.setBounds(15, 73, 415, 295);
		panelTotalIncome.add(panelIncomes);
		
		JLabel lblIncomeHotel = new JLabel("Income from Hotel Booking");
		lblIncomeHotel.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblIncomeHotel.setBounds(15, 16, 306, 26);
		panelIncomes.add(lblIncomeHotel);
		
		JLabel lblIncomeAds = new JLabel("Income from Advertorial");
		lblIncomeAds.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblIncomeAds.setBounds(15, 85, 306, 26);
		panelIncomes.add(lblIncomeAds);
		
		textFieldIncomeHotel = new JTextField();
		textFieldIncomeHotel.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldIncomeHotel.setBounds(15, 43, 306, 26);
		panelIncomes.add(textFieldIncomeHotel);
		textFieldIncomeHotel.setColumns(10);
		
		textFieldIncomeAds = new JTextField();
		textFieldIncomeAds.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldIncomeAds.setColumns(10);
		textFieldIncomeAds.setBounds(15, 112, 306, 26);
		panelIncomes.add(textFieldIncomeAds);
		
		JLabel lblTotalIncome_1 = new JLabel("Total Income");
		lblTotalIncome_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblTotalIncome_1.setBounds(15, 232, 306, 26);
		panelIncomes.add(lblTotalIncome_1);
		
		textFieldTotalIncome = new JTextField();
		textFieldTotalIncome.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldTotalIncome.setColumns(10);
		textFieldTotalIncome.setBounds(15, 260, 306, 26);
		panelIncomes.add(textFieldTotalIncome);
		
		JPanel panelTotalExpenditure = new JPanel();
		panelTotalExpenditure.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelTotalExpenditure.setBackground(new Color(255, 235, 205));
		panelTotalExpenditure.setBounds(466, 102, 445, 380);
		contentPane.add(panelTotalExpenditure);
		panelTotalExpenditure.setLayout(null);
		
		JPanel panelTotalExpenditure1 = new JPanel();
		panelTotalExpenditure1.setLayout(null);
		panelTotalExpenditure1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelTotalExpenditure1.setBackground(new Color(255, 235, 205));
		panelTotalExpenditure1.setBounds(15, 16, 415, 53);
		panelTotalExpenditure.add(panelTotalExpenditure1);
		
		JLabel lblTotalExpenditure = new JLabel("Total Expenditure");
		lblTotalExpenditure.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalExpenditure.setFont(new Font("Century", Font.BOLD, 30));
		lblTotalExpenditure.setBackground(new Color(240, 255, 255));
		lblTotalExpenditure.setBounds(15, 0, 385, 53);
		panelTotalExpenditure1.add(lblTotalExpenditure);
		
		JPanel panelExpenditures = new JPanel();
		panelExpenditures.setLayout(null);
		panelExpenditures.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelExpenditures.setBackground(new Color(255, 235, 205));
		panelExpenditures.setBounds(15, 73, 415, 295);
		panelTotalExpenditure.add(panelExpenditures);
		
		JLabel lblMaintainance = new JLabel("Maintainance Expenses");
		lblMaintainance.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblMaintainance.setBounds(15, 13, 306, 26);
		panelExpenditures.add(lblMaintainance);
		
		textFieldMaintainance = new JTextField();
		textFieldMaintainance.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldMaintainance.setColumns(10);
		textFieldMaintainance.setBounds(15, 40, 306, 26);
		panelExpenditures.add(textFieldMaintainance);
		
		JLabel lblAdvertisement = new JLabel("Advertisement Expenses");
		lblAdvertisement.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblAdvertisement.setBounds(15, 68, 306, 26);
		panelExpenditures.add(lblAdvertisement);
		
		textFieldAds = new JTextField();
		textFieldAds.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldAds.setColumns(10);
		textFieldAds.setBounds(15, 95, 306, 26);
		panelExpenditures.add(textFieldAds);
		
		JLabel lblTotalExpenditure_1 = new JLabel("Total Expenditure");
		lblTotalExpenditure_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblTotalExpenditure_1.setBounds(15, 233, 306, 26);
		panelExpenditures.add(lblTotalExpenditure_1);
		
		textFieldTotalExpenditure = new JTextField();
		textFieldTotalExpenditure.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldTotalExpenditure.setColumns(10);
		textFieldTotalExpenditure.setBounds(15, 260, 306, 26);
		panelExpenditures.add(textFieldTotalExpenditure);
		
		JLabel lblWages = new JLabel("Wages Employee");
		lblWages.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblWages.setBounds(15, 123, 306, 26);
		panelExpenditures.add(lblWages);
		
		textFieldWages = new JTextField();
		textFieldWages.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldWages.setColumns(10);
		textFieldWages.setBounds(15, 150, 306, 26);
		panelExpenditures.add(textFieldWages);
		
		JLabel lblMiscellaneous = new JLabel("Miscellaneous Expenses");
		lblMiscellaneous.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblMiscellaneous.setBounds(15, 178, 306, 26);
		panelExpenditures.add(lblMiscellaneous);
		
		textFieldMiscellaneous = new JTextField();
		textFieldMiscellaneous.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		textFieldMiscellaneous.setColumns(10);
		textFieldMiscellaneous.setBounds(15, 205, 306, 26);
		panelExpenditures.add(textFieldMiscellaneous);
		
		JPanel panelnetProfit = new JPanel();
		panelnetProfit.setLayout(null);
		panelnetProfit.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 165, 0)));
		panelnetProfit.setBackground(new Color(255, 235, 205));
		panelnetProfit.setBounds(15, 486, 896, 95);
		contentPane.add(panelnetProfit);
		
		JButton buttonCal = new JButton("Calculate");
		buttonCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int incomeHotel = Integer.parseInt(textFieldIncomeHotel.getText());
					int incomeAds = Integer.parseInt(textFieldIncomeAds.getText());
					
					int totalIncome = incomeHotel+incomeAds;
					textFieldTotalIncome.setText(Integer.toString(totalIncome));
					
					int maintainance = Integer.parseInt(textFieldMaintainance.getText());
					int ads = Integer.parseInt(textFieldAds.getText());
					int wages = Integer.parseInt(textFieldWages.getText());
					int miscellaneous =Integer.parseInt(textFieldMiscellaneous.getText());
					
					int totalExpenditure = maintainance+ads+wages+miscellaneous;
					textFieldTotalExpenditure.setText(Integer.toString(totalExpenditure));
					
					int NetProfit = totalIncome-totalExpenditure;
					textFieldNetProfit.setText(Integer.toString(NetProfit));
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		buttonCal.setBounds(249, 44, 190, 42);
		panelnetProfit.add(buttonCal);
		buttonCal.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonCal.setBackground(new Color(255, 255, 153));
		
		JLabel lblNetProfit = new JLabel("The Net Profit is RM");
		lblNetProfit.setBounds(132, 10, 314, 30);
		panelnetProfit.add(lblNetProfit);
		lblNetProfit.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		
		textFieldNetProfit = new JTextField();
		textFieldNetProfit.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		textFieldNetProfit.setBounds(449, 10, 277, 30);
		panelnetProfit.add(textFieldNetProfit);
		textFieldNetProfit.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldIncomeHotel.setText("");
				textFieldIncomeAds.setText("");
				textFieldTotalIncome.setText("");
				textFieldMaintainance.setText("");
				textFieldAds.setText("");
				textFieldWages.setText("");
				textFieldMiscellaneous.setText("");
				textFieldTotalExpenditure.setText("");
				textFieldNetProfit.setText("");
			}
		});
		btnReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnReset.setBackground(new Color(255, 255, 153));
		btnReset.setBounds(454, 44, 190, 42);
		panelnetProfit.add(btnReset);
	}
}
