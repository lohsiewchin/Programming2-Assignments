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

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Sales extends JFrame {

	private JPanel contentPane;
	static double totalSales;
	private JTextField textFieldDuration;
	private JTextField textFieldTotalPrice;
	private JTextField textFieldDiscount;
	private JTextField textFieldPrice;
	private JTextField textFieldFinalPrice;
	private JTable tableSales;
	private JTextField textFieldQuantity;
	private JPanel panelButton;
	private final ButtonGroup buttonGroupPaymentMethod = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 673);
		
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
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompanyBackground bgr = new CompanyBackground();
				bgr.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmAboutUs);
		
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
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelOrderDetails = new JPanel();
		panelOrderDetails.setLayout(null);
		panelOrderDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelOrderDetails.setBackground(new Color(255, 240, 245));
		panelOrderDetails.setBounds(15, 10, 1062, 87);
		contentPane.add(panelOrderDetails);
		
		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderDetails.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 70));
		lblOrderDetails.setBounds(15, 0, 1032, 87);
		panelOrderDetails.add(lblOrderDetails);
		
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelTable.setBackground(new Color(255, 240, 245));
		panelTable.setBounds(493, 99, 584, 427);
		contentPane.add(panelTable);
		
		JButton buttonUpload = new JButton("Upload");
		buttonUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\Documents\\ѧϰ\\STIA1123 PROGRAMMING 2\\Assignments\\Assignment 3\\txt files\\Sales.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<tableSales.getRowCount(); i++) {
						for (int j=0; j<tableSales.getColumnCount(); j++) {
							bw.write(tableSales.getModel().getValueAt(i, j) + "  |  ");
						}
						bw.write("\n______________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Uploaded");
					
					DefaultTableModel model = (DefaultTableModel) tableSales.getModel();
					totalSales=0;
					
					for(int i=0; i<model.getRowCount(); i++) {
						double sales = Double.parseDouble(model.getValueAt(i, 8).toString());
						totalSales=sales+totalSales;
					}
						
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonUpload.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonUpload.setBackground(new Color(255, 192, 203));
		buttonUpload.setBounds(230, 356, 127, 47);
		panelTable.add(buttonUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 16, 554, 317);
		panelTable.add(scrollPane);
		
		tableSales = new JTable();
		tableSales.setBackground(new Color(255, 255, 255));
		tableSales.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		tableSales.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Destination", "Hotel", "Type Of Room", "Price", "Quantity", "Duration", "Total Price", "Discount", "Final Price", "Payment Method"
			}
		));
		scrollPane.setViewportView(tableSales);
		
		JPanel panelInput = new JPanel();
		panelInput.setLayout(null);
		panelInput.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelInput.setBackground(new Color(255, 240, 245));
		panelInput.setBounds(15, 99, 475, 427);
		contentPane.add(panelInput);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDestination.setBounds(15, 16, 168, 30);
		panelInput.add(lblDestination);
		
		JComboBox comboBoxDestination = new JComboBox();
		comboBoxDestination.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Johor", "Penang", "Perak"}));
		comboBoxDestination.setBounds(192, 16, 268, 30);
		panelInput.add(comboBoxDestination);
		comboBoxDestination.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setBounds(15, 54, 168, 30);
		panelInput.add(lblHotel);
		lblHotel.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JComboBox comboBoxHotel = new JComboBox();
		comboBoxHotel.setBounds(192, 54, 268, 30);
		panelInput.add(comboBoxHotel);
		comboBoxHotel.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		comboBoxDestination.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	final DefaultComboBoxModel JohorHotels = new DefaultComboBoxModel(new String[]{"Please Select", "Impiana Hotel Senai", "Hotel Legoland Malaysia"});
		    	final DefaultComboBoxModel PenangHotels = new DefaultComboBoxModel(new String[]{"Please Select", "Hotel Eastern & Oriental", "Bayview Hotel"});
		    	final DefaultComboBoxModel PerakHotels = new DefaultComboBoxModel(new String[]{"Please Select", "D Hotel Seri Iskandar", "Pangkor Laut Resort"});
		    	
		        if (comboBoxDestination.getSelectedItem().equals("Johor")){
		            comboBoxHotel.setModel(JohorHotels);    
		        } 
		        else if (comboBoxDestination.getSelectedItem().equals("Penang")){
		        	comboBoxHotel.setModel(PenangHotels);  
		        }
		        else if (comboBoxDestination.getSelectedItem().equals("Perak")){
		        	comboBoxHotel.setModel(PerakHotels);  
		        }
		    }
		});
		
		JLabel lblTypeOfRoom = new JLabel("Type Of Room");
		lblTypeOfRoom.setBounds(15, 92, 168, 30);
		panelInput.add(lblTypeOfRoom);
		lblTypeOfRoom.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JComboBox comboBoxTypeOfRoom = new JComboBox();
		comboBoxTypeOfRoom.setBounds(192, 92, 268, 30);
		panelInput.add(comboBoxTypeOfRoom);
		comboBoxTypeOfRoom.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		comboBoxHotel.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	final DefaultComboBoxModel ImpianaRooms = new DefaultComboBoxModel(new String[]{"Please Select", "(IHS)Deluxe rooms", "(IHS)Executive rooms", "(IHS)Standard rooms", "(IHS)Suites"});
		    	final DefaultComboBoxModel LegolandRooms = new DefaultComboBoxModel(new String[]{"Please Select", "(HLM)Deluxe rooms", "(HLM)Standard rooms"});
		    	final DefaultComboBoxModel ENORooms = new DefaultComboBoxModel(new String[]{"Please Select", "(ENO)Comfort rooms", "(ENO)Deluxe rooms", "(ENO)Standard rooms", "(ENO)Studio rooms", "(ENO)Suites"});
		    	final DefaultComboBoxModel BayviewRooms = new DefaultComboBoxModel(new String[]{"Please Select", "(BH)Comfort rooms", "(BH)Deluxe rooms", "(BH)Family rooms", "(BH)Standard rooms", "(BH)Suites"});
		    	final DefaultComboBoxModel DHotelRooms = new DefaultComboBoxModel(new String[]{"Please Select", "(DH)Comfort rooms", "(DH)Standard rooms"});
		    	final DefaultComboBoxModel PangkorRooms = new DefaultComboBoxModel(new String[]{"Please Select", "(PLR)Standard rooms", "(PLR)Villas"});
		    	
		        if (comboBoxHotel.getSelectedItem().equals("Impiana Hotel Senai")){
		            comboBoxTypeOfRoom.setModel(ImpianaRooms);
		            
		            comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(IHS)Deluxe rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.deluxeIHS));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(IHS)Executive rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.executiveIHS));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(IHS)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.standardIHS));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(IHS)Suites")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.suitesIHS));
		    		    	}

		    		    }
		    		});
		        } 
		        else if (comboBoxHotel.getSelectedItem().equals("Hotel Legoland Malaysia")){
		        	comboBoxTypeOfRoom.setModel(LegolandRooms);  
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(HLM)Deluxe rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.deluxeHLM));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(HLM)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", JohorSetPrice.standardHLM));
		    		    	}

		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Hotel Eastern & Oriental")){
		        	comboBoxTypeOfRoom.setModel(ENORooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(ENO)Comfort rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.comfortENO));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(ENO)Deluxe rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.deluxeENO));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(ENO)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.standardENO));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(ENO)Studio rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.studioENO));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(ENO)Suites")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.suitesENO));
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Bayview Hotel")){
		        	comboBoxTypeOfRoom.setModel(BayviewRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(BH)Comfort rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.comfortBayview));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(BH)Deluxe rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.deluxeBayview));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(BH)Family rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.familyBayview));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(BH)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.standardBayview));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(BH)Suites")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PenangSetPrice.suitesBayview));
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("D Hotel Seri Iskandar")){
		        	comboBoxTypeOfRoom.setModel(DHotelRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(DH)Comfort rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PerakSetPrice.comfortDH));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(DH)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PerakSetPrice.standardDH));
		    		    	}

		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Pangkor Laut Resort")){
		        	comboBoxTypeOfRoom.setModel(PangkorRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("(PLR)Standard rooms")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PerakSetPrice.standardPangkor));
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("(PLR)Villas")) {
		    		    		textFieldPrice.setText(String.format("%.2f", PerakSetPrice.villasPangkor));
		    		    	}

		    		    }
		    		});
		        }

		    }
		});
		
		JLabel lblPrice = new JLabel("Price (RM)");
		lblPrice.setBounds(15, 130, 168, 30);
		panelInput.add(lblPrice);
		lblPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		textFieldPrice = new JTextField();
		textFieldPrice.setEditable(false);
		textFieldPrice.setBounds(192, 130, 156, 30);
		panelInput.add(textFieldPrice);
		textFieldPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldPrice.setColumns(10);
		
		JLabel lblPerRoom = new JLabel("per room");
		lblPerRoom.setBounds(363, 130, 97, 30);
		panelInput.add(lblPerRoom);
		lblPerRoom.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(15, 206, 168, 30);
		panelInput.add(lblDuration);
		lblDuration.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		textFieldDuration = new JTextField();
		textFieldDuration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						double price = Double.parseDouble(textFieldPrice.getText());
						int qty = Integer.parseInt(textFieldQuantity.getText());
						int duration = Integer.parseInt(textFieldDuration.getText());
						
						double totalPrice = price*qty*duration;
						textFieldTotalPrice.setText(Double.toString(totalPrice));
						
						if (totalPrice>3000) {
							textFieldDiscount.setText("10%");
							double finalPrice = totalPrice*(0.9);
							textFieldFinalPrice.setText(String.format("%.2f", finalPrice));
						}
						else {
							textFieldDiscount.setText("N/A");
							textFieldFinalPrice.setText(String.format("%.2f", totalPrice));
						}
						
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					}
				}
		});
		textFieldDuration.setBounds(192, 206, 156, 30);
		panelInput.add(textFieldDuration);
		textFieldDuration.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldDuration.setColumns(10);
		
		JLabel lblNights = new JLabel("night(s)");
		lblNights.setBounds(363, 206, 97, 30);
		panelInput.add(lblNights);
		lblNights.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setEditable(false);
		textFieldTotalPrice.setBounds(193, 244, 267, 30);
		panelInput.add(textFieldTotalPrice);
		textFieldTotalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldTotalPrice.setColumns(10);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setEditable(false);
		textFieldDiscount.setBounds(192, 282, 268, 30);
		panelInput.add(textFieldDiscount);
		textFieldDiscount.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldDiscount.setColumns(10);
		
		JLabel lblFinalPrice = new JLabel("Final Price (RM)");
		lblFinalPrice.setBounds(15, 320, 168, 30);
		panelInput.add(lblFinalPrice);
		lblFinalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setBounds(15, 282, 168, 30);
		panelInput.add(lblDiscount);
		lblDiscount.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JLabel lblTotalPrice = new JLabel("Total Price (RM)");
		lblTotalPrice.setBounds(15, 244, 168, 30);
		panelInput.add(lblTotalPrice);
		lblTotalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		textFieldFinalPrice = new JTextField();
		textFieldFinalPrice.setEditable(false);
		textFieldFinalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldFinalPrice.setColumns(10);
		textFieldFinalPrice.setBounds(192, 320, 268, 30);
		panelInput.add(textFieldFinalPrice);
		
		JLabel labelQuantity = new JLabel("Quantity");
		labelQuantity.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelQuantity.setBounds(15, 168, 168, 30);
		panelInput.add(labelQuantity);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(192, 168, 156, 30);
		panelInput.add(textFieldQuantity);
		
		JLabel labelRooms = new JLabel("room(s)");
		labelRooms.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelRooms.setBounds(363, 168, 97, 30);
		panelInput.add(labelRooms);
		
		JLabel labelPaymentMethod = new JLabel("Payment Method");
		labelPaymentMethod.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelPaymentMethod.setBounds(15, 358, 168, 30);
		panelInput.add(labelPaymentMethod);
		
		JRadioButton rdbtnOnlineBanking = new JRadioButton("Online Banking");
		rdbtnOnlineBanking.setSelected(true);
		rdbtnOnlineBanking.setActionCommand("Online Banking");
		buttonGroupPaymentMethod.add(rdbtnOnlineBanking);
		rdbtnOnlineBanking.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		rdbtnOnlineBanking.setBounds(192, 358, 225, 29);
		panelInput.add(rdbtnOnlineBanking);
		
		JRadioButton rdbtnDebitCreditCard = new JRadioButton("Debit/Credit Card");
		rdbtnDebitCreditCard.setActionCommand("Debit/Credit Card");
		buttonGroupPaymentMethod.add(rdbtnDebitCreditCard);
		rdbtnDebitCreditCard.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		rdbtnDebitCreditCard.setBounds(192, 386, 225, 29);
		panelInput.add(rdbtnDebitCreditCard);
		
		panelButton = new JPanel();
		panelButton.setLayout(null);
		panelButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelButton.setBackground(new Color(255, 240, 245));
		panelButton.setBounds(15, 532, 1062, 65);
		contentPane.add(panelButton);
		
		JButton buttonAddRecord = new JButton("Add Record");
		buttonAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableSales.getModel();
				
				model.addRow(new Object[]{
						comboBoxDestination.getSelectedItem(),
						comboBoxHotel.getSelectedItem(),
						comboBoxTypeOfRoom.getSelectedItem(),
						textFieldPrice.getText(),
						textFieldQuantity.getText(),
						textFieldDuration.getText(),
						textFieldTotalPrice.getText(),
						textFieldDiscount.getText(),
						textFieldFinalPrice.getText(),
						buttonGroupPaymentMethod.getSelection().getActionCommand(),
				});
				
				if (tableSales.getSelectedRow() == -1) {
					if (tableSales.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Order added", "Sales",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		buttonAddRecord.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonAddRecord.setBackground(new Color(255, 192, 203));
		buttonAddRecord.setBounds(15, 13, 196, 39);
		panelButton.add(buttonAddRecord);
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxDestination.setSelectedItem("Please Select");
				comboBoxHotel.setSelectedItem("Please Select");
				comboBoxTypeOfRoom.setSelectedItem("Please Select");
				textFieldPrice.setText("");
				textFieldQuantity.setText("");
				textFieldDuration.setText("");
				textFieldTotalPrice.setText("");
				textFieldDiscount.setText("");
				textFieldFinalPrice.setText("");
				buttonGroupPaymentMethod.clearSelection();
			}
		});
		buttonReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonReset.setBackground(new Color(255, 192, 203));
		buttonReset.setBounds(284, 13, 127, 39);
		panelButton.add(buttonReset);
		
		JButton buttonUpdate = new JButton("Update");
		tableSales.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
				int i = tableSales.getSelectedRow();
				
				String tableDestination = model.getValueAt(i, 0).toString();
				if (tableDestination.equals("Johor")) {
					comboBoxDestination.setSelectedIndex(1);
				}
				else if (tableDestination.equals("Penang")) {
					comboBoxDestination.setSelectedIndex(2);
				}
				else if (tableDestination.equals("Perak")) {
					comboBoxDestination.setSelectedIndex(3);
				}
				
				String tableHotels = model.getValueAt(i, 1).toString();
				if (tableHotels.equals("Impiana Hotel Senai")) {
					comboBoxHotel.setSelectedItem("Impiana Hotel Senai");
				}
				else if (tableHotels.equals("Hotel Legoland Malaysia")) {
					comboBoxHotel.setSelectedItem("Hotel Legoland Malaysia");
				}
				else if (tableHotels.equals("Hotel Eastern & Oriental")) {
					comboBoxHotel.setSelectedItem("Hotel Eastern & Oriental");
				}
				else if (tableHotels.equals("Bayview Hotel")) {
					comboBoxHotel.setSelectedItem("Bayview Hotel");
				}
				else if (tableHotels.equals("D Hotel Seri Iskandar")) {
					comboBoxHotel.setSelectedItem("D Hotel Seri Iskandar");
				}
				else if (tableHotels.equals("Pangkor Laut Resort")) {
					comboBoxHotel.setSelectedItem("Pangkor Laut Resort");
				}
				
				String tableTypeOfRooms = model.getValueAt(i, 2).toString();
				if (tableTypeOfRooms.equals("(IHS)Deluxe rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(IHS)Deluxe rooms");
				}
				else if (tableTypeOfRooms.equals("(IHS)Executive rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(IHS)Executive rooms");
				}
				else if (tableTypeOfRooms.equals("(IHS)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(IHS)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(IHS)Suites")) {
					comboBoxTypeOfRoom.setSelectedItem("(IHS)Suites");
				}
				else if (tableTypeOfRooms.equals("(HLM)Deluxe rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(HLM)Deluxe rooms");
				}
				else if (tableTypeOfRooms.equals("(HLM)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(HLM)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(ENO)Comfort rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(ENO)Comfort rooms");
				}
				else if (tableTypeOfRooms.equals("(ENO)Deluxe rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(ENO)Deluxe rooms");
				}
				else if (tableTypeOfRooms.equals("(ENO)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(ENO)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(ENO)Studio rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(ENO)Studio rooms");
				}
				else if (tableTypeOfRooms.equals("(ENO)Suites rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(ENO)Suites rooms");
				}
				else if (tableTypeOfRooms.equals("(BH)Comfort rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(BH)Comfort rooms");
				}
				else if (tableTypeOfRooms.equals("(BH)Deluxe rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(BH)Deluxe rooms");
				}
				else if (tableTypeOfRooms.equals("(BH)Family rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(BH)Family rooms");
				}
				else if (tableTypeOfRooms.equals("(BH)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(BH)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(BH)Suites rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(BH)Suites rooms");
				}
				else if (tableTypeOfRooms.equals("(DH)Comfort rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(DH)Comfort rooms");
				}
				else if (tableTypeOfRooms.equals("(DH)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(DH)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(PLR)Standard rooms")) {
					comboBoxTypeOfRoom.setSelectedItem("(PLR)Standard rooms");
				}
				else if (tableTypeOfRooms.equals("(PLR)Villas")) {
					comboBoxTypeOfRoom.setSelectedItem("(PLR)Villas");
				}
				
				textFieldPrice.setText(model.getValueAt(i, 3).toString());
				textFieldQuantity.setText(model.getValueAt(i, 4).toString());
				textFieldDuration.setText(model.getValueAt(i, 5).toString());
				textFieldTotalPrice.setText(model.getValueAt(i, 6).toString());
				textFieldDiscount.setText(model.getValueAt(i, 7).toString());
				textFieldFinalPrice.setText(model.getValueAt(i, 8).toString());
				
				String tablePayment = model.getValueAt(i, 9).toString();
				if (tablePayment.equals("Online Banking")) {
					rdbtnOnlineBanking.setSelected(true);
				}
				else if (tablePayment.equals("Debit/Credit Card")) {
					rdbtnDebitCreditCard.setSelected(true);
				}
				
			}
		});
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
				int i = tableSales.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(comboBoxDestination.getSelectedItem(), i, 0);
			    	model.setValueAt(comboBoxHotel.getSelectedItem(), i, 1);
			    	model.setValueAt(comboBoxTypeOfRoom.getSelectedItem(), i, 2);
			    	model.setValueAt(textFieldPrice.getText(), i, 3);
			    	model.setValueAt(textFieldQuantity.getText(), i, 4);
			    	model.setValueAt(textFieldDuration.getText(), i, 5);
			    	model.setValueAt(textFieldTotalPrice.getText(), i, 6);
			    	model.setValueAt(textFieldDiscount.getText(), i, 7);
			    	model.setValueAt(textFieldFinalPrice.getText(), i, 8);
			    	model.setValueAt(buttonGroupPaymentMethod.getSelection().getActionCommand(), i, 9);
			    	
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
		buttonUpdate.setBounds(497, 13, 127, 39);
		panelButton.add(buttonUpdate);
		
		JButton buttonDelete = new JButton("Delete");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableSales.getModel();
				if(tableSales.getSelectedRow()==-1) {
					if(tableSales.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Order Details", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Order Details", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(tableSales.getSelectedRow());
				}
			}
		});
		buttonDelete.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonDelete.setBackground(new Color(255, 192, 203));
		buttonDelete.setBounds(714, 13, 127, 39);
		panelButton.add(buttonDelete);
		
		JButton buttonPrint = new JButton("Print");
		buttonPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tableSales.print();
				} catch (Exception e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		buttonPrint.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonPrint.setBackground(new Color(255, 192, 203));
		buttonPrint.setBounds(920, 13, 127, 39);
		panelButton.add(buttonPrint);
	}
}
