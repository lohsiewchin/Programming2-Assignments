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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class EmployeeManagement extends JFrame {

	private JPanel contentPane;
	private JTable tableEmployee;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldHPNo;
	private JTextField textFieldEmail;
	private JTextField textFieldAddress;
	private JTextField textFieldPosition;
	private JTextField textFieldSalary;
	static double totalSalary;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement frame = new EmployeeManagement();
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
	public EmployeeManagement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 659);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
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
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelEmployeeManagement = new JPanel();
		panelEmployeeManagement.setBackground(new Color(255, 228, 225));
		panelEmployeeManagement.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		panelEmployeeManagement.setBounds(15, 12, 942, 87);
		contentPane.add(panelEmployeeManagement);
		panelEmployeeManagement.setLayout(null);
		
		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 65));
		lblEmployeeManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagement.setBounds(15, 0, 912, 87);
		panelEmployeeManagement.add(lblEmployeeManagement);
		
		JPanel panelInput = new JPanel();
		panelInput.setLayout(null);
		panelInput.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		panelInput.setBackground(new Color(255, 228, 225));
		panelInput.setBounds(15, 105, 352, 407);
		contentPane.add(panelInput);
		
		JLabel labelName = new JLabel("Name");
		labelName.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelName.setBounds(15, 16, 93, 30);
		panelInput.add(labelName);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldName.setBounds(114, 16, 223, 30);
		panelInput.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblAge.setBounds(15, 54, 93, 30);
		panelInput.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblGender.setBounds(15, 93, 93, 30);
		panelInput.add(lblGender);
		
		JLabel lblHpNo = new JLabel("HP No.");
		lblHpNo.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblHpNo.setBounds(15, 134, 93, 26);
		panelInput.add(lblHpNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblEmail.setBounds(15, 176, 93, 30);
		panelInput.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblAddress.setBounds(15, 218, 93, 30);
		panelInput.add(lblAddress);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblPosition.setBounds(15, 261, 93, 30);
		panelInput.add(lblPosition);
		
		JLabel lblDurationOfContract = new JLabel("Contract");
		lblDurationOfContract.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDurationOfContract.setBounds(15, 304, 93, 30);
		panelInput.add(lblDurationOfContract);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblSalary.setBounds(15, 344, 93, 30);
		panelInput.add(lblSalary);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(114, 54, 223, 30);
		panelInput.add(textFieldAge);
		
		textFieldHPNo = new JTextField();
		textFieldHPNo.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldHPNo.setColumns(10);
		textFieldHPNo.setBounds(114, 134, 223, 30);
		panelInput.add(textFieldHPNo);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(114, 176, 223, 30);
		panelInput.add(textFieldEmail);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(114, 218, 223, 30);
		panelInput.add(textFieldAddress);
		
		textFieldPosition = new JTextField();
		textFieldPosition.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldPosition.setColumns(10);
		textFieldPosition.setBounds(114, 261, 223, 30);
		panelInput.add(textFieldPosition);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(114, 344, 116, 30);
		panelInput.add(textFieldSalary);
		
		JComboBox comboBoxContract = new JComboBox();
		comboBoxContract.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "1 year", "2 years", "5 years"}));
		comboBoxContract.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		comboBoxContract.setBounds(114, 304, 223, 30);
		panelInput.add(comboBoxContract);
		
		JLabel lblPerMonth = new JLabel("per month");
		lblPerMonth.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblPerMonth.setBounds(234, 344, 104, 30);
		panelInput.add(lblPerMonth);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("Male");
		buttonGroupGender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		rdbtnMale.setActionCommand("Male");
		rdbtnMale.setBounds(114, 93, 107, 30);
		panelInput.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		buttonGroupGender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		rdbtnFemale.setActionCommand("Female");
		rdbtnFemale.setBounds(230, 93, 107, 30);
		panelInput.add(rdbtnFemale);
		
		JPanel panelButton = new JPanel();
		panelButton.setLayout(null);
		panelButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		panelButton.setBackground(new Color(255, 228, 225));
		panelButton.setBounds(15, 520, 942, 62);
		contentPane.add(panelButton);
		
		JButton buttonAddRecord = new JButton("Add Record");
		buttonAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAge.getText(),
						buttonGroupGender.getSelection().getActionCommand(),
						textFieldHPNo.getText(),
						textFieldEmail.getText(),
						textFieldAddress.getText(),
						textFieldPosition.getText(),
						comboBoxContract.getSelectedItem(),
						textFieldSalary.getText(),
						
				});
				
				if (tableEmployee.getSelectedRow() == -1) {
					if (tableEmployee.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		buttonAddRecord.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonAddRecord.setBackground(new Color(255, 192, 203));
		buttonAddRecord.setBounds(15, 12, 196, 39);
		panelButton.add(buttonAddRecord);
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				buttonGroupGender.clearSelection();
				textFieldHPNo.setText("");
				textFieldEmail.setText("");
				textFieldAddress.setText("");
				textFieldPosition.setText("");
				comboBoxContract.setSelectedItem("Please Select");
				textFieldSalary.setText("");
			}
		});
		buttonReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonReset.setBackground(new Color(255, 192, 203));
		buttonReset.setBounds(266, 12, 127, 39);
		panelButton.add(buttonReset);
		
		JButton buttonUpdate = new JButton("Update");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableEmployee.getModel();
				int i = tableEmployee.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(textFieldAge.getText(), i, 1);
			    	model.setValueAt(buttonGroupGender.getSelection().getActionCommand(), i, 2);
			    	model.setValueAt(textFieldHPNo.getText(), i, 3);
			    	model.setValueAt(textFieldEmail.getText(), i, 4);
			    	model.setValueAt(textFieldAddress.getText(), i, 5);
			    	model.setValueAt(textFieldPosition.getText(), i, 6);
			    	model.setValueAt(comboBoxContract.getSelectedItem(), i, 7);
			    	model.setValueAt(textFieldSalary.getText(), i, 8);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		buttonUpdate.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonUpdate.setBackground(new Color(255, 192, 203));
		buttonUpdate.setBounds(449, 12, 127, 39);
		panelButton.add(buttonUpdate);
		
		JButton buttonDelete = new JButton("Delete");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableEmployee.getModel();
				if(tableEmployee.getSelectedRow()==-1) {
					if(tableEmployee.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableEmployee.getSelectedRow());
				}
			}
		});
		buttonDelete.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonDelete.setBackground(new Color(255, 192, 203));
		buttonDelete.setBounds(623, 12, 127, 39);
		panelButton.add(buttonDelete);
		
		JButton buttonPrint = new JButton("Print");
		buttonPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableEmployee.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		buttonPrint.setBounds(800, 12, 127, 39);
		panelButton.add(buttonPrint);
		buttonPrint.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonPrint.setBackground(new Color(255, 192, 203));
		
		JPanel panelTable = new JPanel();
		panelTable.setBackground(new Color(255, 228, 225));
		panelTable.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(250, 128, 114)));
		panelTable.setBounds(373, 105, 584, 407);
		contentPane.add(panelTable);
		panelTable.setLayout(null);
		
		JButton buttonUpload = new JButton("Upload");
		buttonUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Assignment 3\\txt files\\Employee Information.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableEmployee.getRowCount(); i++) {
						for (int j=0; j<tableEmployee.getColumnCount(); j++) {
							bw.write(tableEmployee.getModel().getValueAt(i, j) + "  |  ");
						}
						bw.write("\n________________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Uploaded");
					
					DefaultTableModel model = (DefaultTableModel) tableEmployee.getModel();
					totalSalary=0;
					
					for(int i=0; i<model.getRowCount(); i++) {
						double salary = Double.parseDouble(model.getValueAt(i, 8).toString());
						totalSalary = salary+totalSalary;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		buttonUpload.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonUpload.setBackground(new Color(255, 192, 203));
		buttonUpload.setBounds(233, 344, 127, 47);
		panelTable.add(buttonUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 554, 318);
		panelTable.add(scrollPane);
		
		tableEmployee = new JTable();
		tableEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		tableEmployee.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "HP No.", "Email", "Address", "Position", "Contract", "Salary"
			}
		));
		scrollPane.setViewportView(tableEmployee);
	
		tableEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableEmployee.getModel();
				int i = tableEmployee.getSelectedRow();
				
				textFieldName.setText(model.getValueAt(i, 0).toString());
				textFieldAge.setText(model.getValueAt(i, 1).toString());
				
				String tableGender = model.getValueAt(i, 2).toString();
				if (tableGender.equals("Male")) {
					rdbtnMale.setSelected(true);
				}
				else if(tableGender.equals("Female")) {
					rdbtnFemale.setSelected(true);
				}
				
				textFieldHPNo.setText(model.getValueAt(i, 3).toString());
				textFieldEmail.setText(model.getValueAt(i, 4).toString());
				textFieldAddress.setText(model.getValueAt(i, 5).toString());
				textFieldPosition.setText(model.getValueAt(i, 6).toString());
				
				String tableContract = model.getValueAt(i, 7).toString();
				if (tableContract.equals("1 year")) {
					comboBoxContract.setSelectedIndex(1);
				}
				else if (tableContract.equals("2 years")) {
					comboBoxContract.setSelectedIndex(2);
				}
				else if (tableContract.equals("5 years")) {
					comboBoxContract.setSelectedIndex(3);
				}
				
				textFieldSalary.setText(model.getValueAt(i, 8).toString());
			}
		});
	}
}
