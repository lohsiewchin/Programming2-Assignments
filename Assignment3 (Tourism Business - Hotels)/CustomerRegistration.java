package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;
	private JTable tableCustomer;
	private JTextField textFieldName;
	private JTextField textFieldAge;
	private JTextField textFieldHPNo;
	private JTextField textFieldEmail;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
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
	public CustomerRegistration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 655);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
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
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground bgr = new CompanyBackground();
				bgr.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmAboutUs);
		
		JMenu mnMenu = new JMenu("Exit");
		menuBar.add(mnMenu);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Just Go Travel Hotel Booking System", 
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
		
		JPanel panelCustomerRegistration = new JPanel();
		panelCustomerRegistration.setBackground(new Color(250, 250, 210));
		panelCustomerRegistration.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelCustomerRegistration.setBounds(15, 12, 908, 87);
		contentPane.add(panelCustomerRegistration);
		panelCustomerRegistration.setLayout(null);
		
		JLabel lblCustomerRegistration = new JLabel("Customer Registration");
		lblCustomerRegistration.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 60));
		lblCustomerRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerRegistration.setBounds(15, 16, 878, 55);
		panelCustomerRegistration.add(lblCustomerRegistration);
		
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelTable.setBackground(new Color(250, 250, 210));
		panelTable.setBounds(343, 105, 580, 399);
		contentPane.add(panelTable);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Assignment 3\\txt files\\Customer Information.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableCustomer.getRowCount(); i++) {
						for (int j=0; j<tableCustomer.getColumnCount(); j++) {
							bw.write(tableCustomer.getModel().getValueAt(i, j) + "  |  ");
							}
						bw.write("\n_____________________________________________________________________\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Uploaded");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnUpload.setBackground(new Color(255, 192, 203));
		btnUpload.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnUpload.setBounds(236, 336, 127, 47);
		panelTable.add(btnUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 550, 304);
		panelTable.add(scrollPane);
		
		tableCustomer = new JTable();
		tableCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		tableCustomer.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "HP No.", "Email"
			}
		));
		scrollPane.setViewportView(tableCustomer);
		
		JPanel panelInput = new JPanel();
		panelInput.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelInput.setBackground(new Color(250, 250, 210));
		panelInput.setBounds(15, 105, 313, 399);
		contentPane.add(panelInput);
		panelInput.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblName.setBounds(15, 16, 109, 30);
		panelInput.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblGender.setBounds(15, 164, 109, 30);
		panelInput.add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblAge.setBounds(15, 89, 69, 34);
		panelInput.add(lblAge);
		
		JLabel lblHpNo = new JLabel("HP No.");
		lblHpNo.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblHpNo.setBounds(15, 229, 96, 34);
		panelInput.add(lblHpNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblEmail.setBounds(15, 305, 79, 33);
		panelInput.add(lblEmail);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		textFieldName.setBounds(15, 51, 278, 34);
		panelInput.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(15, 125, 278, 34);
		panelInput.add(textFieldAge);
		
		textFieldHPNo = new JTextField();
		textFieldHPNo.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		textFieldHPNo.setColumns(10);
		textFieldHPNo.setBounds(15, 262, 278, 34);
		panelInput.add(textFieldHPNo);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(15, 338, 278, 34);
		panelInput.add(textFieldEmail);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("Male");
		buttonGroupGender.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		rdbtnMale.setBounds(15, 196, 109, 30);
		panelInput.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		buttonGroupGender.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		rdbtnFemale.setBounds(138, 196, 109, 30);
		panelInput.add(rdbtnFemale);
		
		JPanel panelButton = new JPanel();
		panelButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelButton.setBackground(new Color(250, 250, 210));
		panelButton.setBounds(15, 508, 908, 70);
		contentPane.add(panelButton);
		panelButton.setLayout(null);
		
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableCustomer.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAge.getText(),
						buttonGroupGender.getSelection().getActionCommand(),
						textFieldHPNo.getText(),
						textFieldEmail.getText(),
						
				});
				
				if (tableCustomer.getSelectedRow() == -1) {
					if (tableCustomer.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Register Successful", "Customer Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddRecord.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnAddRecord.setBackground(new Color(255, 192, 203));
		btnAddRecord.setBounds(15, 16, 196, 39);
		panelButton.add(btnAddRecord);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				buttonGroupGender.clearSelection();
				textFieldHPNo.setText("");
				textFieldEmail.setText("");
			}
		});
		btnReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnReset.setBackground(new Color(255, 192, 203));
		btnReset.setBounds(266, 16, 111, 39);
		panelButton.add(btnReset);
		
		JButton btnUpdate = new JButton("Update");
		tableCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableCustomer.getModel();
				int i = tableCustomer.getSelectedRow();
				
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
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableCustomer.getModel();
				int i = tableCustomer.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(), i, 0);
			    	model.setValueAt(textFieldAge.getText(), i, 1);
			    	model.setValueAt(buttonGroupGender.getSelection().getActionCommand(), i, 2);
			    	model.setValueAt(textFieldHPNo.getText(), i, 3);
			    	model.setValueAt(textFieldEmail.getText(), i, 4);
			    	
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnUpdate.setBackground(new Color(255, 192, 203));
		btnUpdate.setBounds(426, 16, 127, 39);
		panelButton.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableCustomer.getModel();
				if(tableCustomer.getSelectedRow()==-1) {
					if(tableCustomer.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableCustomer.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnDelete.setBackground(new Color(255, 192, 203));
		btnDelete.setBounds(603, 16, 127, 39);
		panelButton.add(btnDelete);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableCustomer.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnPrint.setBackground(new Color(255, 192, 203));
		btnPrint.setBounds(782, 16, 111, 39);
		panelButton.add(btnPrint);
	}
}
