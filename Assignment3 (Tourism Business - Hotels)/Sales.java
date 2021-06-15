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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Sales extends JFrame {

	private JPanel contentPane;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelOrderDetails = new JPanel();
		panelOrderDetails.setLayout(null);
		panelOrderDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelOrderDetails.setBackground(new Color(255, 240, 245));
		panelOrderDetails.setBounds(15, 16, 1111, 87);
		contentPane.add(panelOrderDetails);
		
		JLabel lblOrderDetails = new JLabel("Order Details");
		lblOrderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderDetails.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 90));
		lblOrderDetails.setBounds(15, 0, 1081, 87);
		panelOrderDetails.add(lblOrderDetails);
		
		JPanel panelTable = new JPanel();
		panelTable.setLayout(null);
		panelTable.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(238, 130, 238)));
		panelTable.setBackground(new Color(255, 240, 245));
		panelTable.setBounds(542, 105, 584, 427);
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
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonUpload.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonUpload.setBackground(new Color(255, 192, 203));
		buttonUpload.setBounds(233, 344, 127, 47);
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
		panelInput.setBounds(15, 105, 524, 427);
		contentPane.add(panelInput);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblDestination.setBounds(15, 16, 168, 30);
		panelInput.add(lblDestination);
		
		JComboBox comboBoxDestination = new JComboBox();
		comboBoxDestination.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Johor", "Penang", "Perak"}));
		comboBoxDestination.setBounds(192, 16, 317, 30);
		panelInput.add(comboBoxDestination);
		comboBoxDestination.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setBounds(15, 54, 168, 30);
		panelInput.add(lblHotel);
		lblHotel.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		JComboBox comboBoxHotel = new JComboBox();
		comboBoxHotel.setBounds(192, 54, 317, 30);
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
		comboBoxTypeOfRoom.setBounds(192, 92, 317, 30);
		panelInput.add(comboBoxTypeOfRoom);
		comboBoxTypeOfRoom.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		comboBoxHotel.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	final DefaultComboBoxModel ImpianaRooms = new DefaultComboBoxModel(new String[]{"Please Select", "Deluxe rooms", "Executive rooms", "Standard rooms", "Suites"});
		    	final DefaultComboBoxModel LegolandRooms = new DefaultComboBoxModel(new String[]{"Please Select", "Deluxe rooms", "Standard rooms"});
		    	final DefaultComboBoxModel ENORooms = new DefaultComboBoxModel(new String[]{"Please Select", "Comfort rooms", "Deluxe rooms", "Standard rooms", "Studio rooms", "Suites"});
		    	final DefaultComboBoxModel BayviewRooms = new DefaultComboBoxModel(new String[]{"Please Select", "Comfort rooms", "Deluxe rooms", "Family rooms", "Standard rooms", "Suites"});
		    	final DefaultComboBoxModel DHotelRooms = new DefaultComboBoxModel(new String[]{"Please Select", "Comfort rooms", "Standard rooms"});
		    	final DefaultComboBoxModel PangkorRooms = new DefaultComboBoxModel(new String[]{"Please Select", "Standard rooms", "Villas"});
		    	
		        if (comboBoxHotel.getSelectedItem().equals("Impiana Hotel Senai")){
		            comboBoxTypeOfRoom.setModel(ImpianaRooms);
		            
		            comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Deluxe rooms")) {
		    		    		textFieldPrice.setText("199");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Executive rooms")) {
		    		    		textFieldPrice.setText("395");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("147");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Suites")) {
		    		    		textFieldPrice.setText("650");
		    		    	}

		    		    }
		    		});
		        } 
		        else if (comboBoxHotel.getSelectedItem().equals("Hotel Legoland Malaysia")){
		        	comboBoxTypeOfRoom.setModel(LegolandRooms);  
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Deluxe rooms")) {
		    		    		textFieldPrice.setText("792");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("548");
		    		    	}

		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Hotel Eastern & Oriental")){
		        	comboBoxTypeOfRoom.setModel(ENORooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Comfort rooms")) {
		    		    		textFieldPrice.setText("508");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Deluxe rooms")) {
		    		    		textFieldPrice.setText("611");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("420");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Studio rooms")) {
		    		    		textFieldPrice.setText("748");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Suites")) {
		    		    		textFieldPrice.setText("899");
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Bayview Hotel")){
		        	comboBoxTypeOfRoom.setModel(BayviewRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Comfort rooms")) {
		    		    		textFieldPrice.setText("133");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Deluxe rooms")) {
		    		    		textFieldPrice.setText("142");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Family rooms")) {
		    		    		textFieldPrice.setText("356");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("119");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Suites")) {
		    		    		textFieldPrice.setText("297");
		    		    	}
		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("D Hotel Seri Iskandar")){
		        	comboBoxTypeOfRoom.setModel(DHotelRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Comfort rooms")) {
		    		    		textFieldPrice.setText("205");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("160");
		    		    	}

		    		    }
		    		});
		        }
		        else if (comboBoxHotel.getSelectedItem().equals("Pangkor Laut Resort")){
		        	comboBoxTypeOfRoom.setModel(PangkorRooms);
		        	
		        	comboBoxTypeOfRoom.addActionListener (new ActionListener () {
		    		    public void actionPerformed(ActionEvent e) {
		    		    	if (comboBoxTypeOfRoom.getSelectedItem().equals("Standard rooms")) {
		    		    		textFieldPrice.setText("891");
		    		    	}
		    		    	else if (comboBoxTypeOfRoom.getSelectedItem().equals("Villas")) {
		    		    		textFieldPrice.setText("1080");
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
		textFieldPrice.setBounds(192, 130, 317, 30);
		panelInput.add(textFieldPrice);
		textFieldPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldPrice.setColumns(10);
		
		JLabel lblPerRoom = new JLabel("per room");
		lblPerRoom.setBounds(412, 130, 97, 30);
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
						int price = Integer.parseInt(textFieldPrice.getText());
						int qty = Integer.parseInt(textFieldQuantity.getText());
						int duration = Integer.parseInt(textFieldDuration.getText());
						
						int totalPrice = price*qty*duration;
						textFieldTotalPrice.setText(Integer.toString(totalPrice));
						
						if (totalPrice>3000) {
							textFieldDiscount.setText("10%");
							double finalPrice = totalPrice*(0.9);
							textFieldFinalPrice.setText(String.format("%.2f", finalPrice));
						}
						else {
							textFieldDiscount.setText("N/A");
							textFieldFinalPrice.setText(Integer.toString(totalPrice));
						}
						
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
					}
				}
		});
		textFieldDuration.setBounds(192, 206, 317, 30);
		panelInput.add(textFieldDuration);
		textFieldDuration.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldDuration.setColumns(10);
		
		JLabel lblNights = new JLabel("night(s)");
		lblNights.setBounds(412, 206, 97, 30);
		panelInput.add(lblNights);
		lblNights.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		
		textFieldTotalPrice = new JTextField();
		textFieldTotalPrice.setBounds(193, 244, 316, 30);
		panelInput.add(textFieldTotalPrice);
		textFieldTotalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldTotalPrice.setColumns(10);
		
		textFieldDiscount = new JTextField();
		textFieldDiscount.setBounds(192, 282, 317, 30);
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
		textFieldFinalPrice.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldFinalPrice.setColumns(10);
		textFieldFinalPrice.setBounds(192, 320, 317, 30);
		panelInput.add(textFieldFinalPrice);
		
		JLabel labelQuantity = new JLabel("Quantity");
		labelQuantity.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelQuantity.setBounds(15, 168, 168, 30);
		panelInput.add(labelQuantity);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(192, 168, 317, 30);
		panelInput.add(textFieldQuantity);
		
		JLabel labelRooms = new JLabel("room(s)");
		labelRooms.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelRooms.setBounds(412, 168, 97, 30);
		panelInput.add(labelRooms);
		
		JLabel labelPaymentMethod = new JLabel("Payment Method");
		labelPaymentMethod.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		labelPaymentMethod.setBounds(15, 358, 168, 30);
		panelInput.add(labelPaymentMethod);
		
		JRadioButton rdbtnOnlineBanking = new JRadioButton("Online Banking");
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
		panelButton.setBounds(15, 538, 1111, 87);
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
						JOptionPane.showMessageDialog(null, "Register Successful", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		buttonAddRecord.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonAddRecord.setBackground(new Color(255, 192, 203));
		buttonAddRecord.setBounds(15, 16, 196, 55);
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
		buttonReset.setBounds(262, 16, 127, 55);
		panelButton.add(buttonReset);
		
		JButton buttonUpdate = new JButton("Update");
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
		buttonUpdate.setBounds(444, 16, 127, 55);
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
		buttonDelete.setBounds(617, 16, 127, 55);
		panelButton.add(buttonDelete);
		
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		buttonExit.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		buttonExit.setBackground(new Color(255, 192, 203));
		buttonExit.setBounds(969, 16, 127, 55);
		panelButton.add(buttonExit);
		
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
		buttonPrint.setBounds(787, 16, 127, 55);
		panelButton.add(buttonPrint);
	}
}
