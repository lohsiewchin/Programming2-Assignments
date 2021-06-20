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
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class HotelDescription extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelDescription frame = new HotelDescription();
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
	public HotelDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1007, 686);
		
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Place Order");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sales sales = new Sales();
				sales.setVisible(true);
				dispose();
			}
		});
		mnHome.add(mntmNewMenuItem);
		
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
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hotel Description", 
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
		
		JPanel panelHotelDescription = new JPanel();
		panelHotelDescription.setBackground(new Color(240, 255, 255));
		panelHotelDescription.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelHotelDescription.setBounds(15, 12, 954, 87);
		contentPane.add(panelHotelDescription);
		panelHotelDescription.setLayout(null);
		
		JLabel lblHotelDescription = new JLabel("Hotel Description");
		lblHotelDescription.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 75));
		lblHotelDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelDescription.setBounds(15, 16, 866, 55);
		panelHotelDescription.add(lblHotelDescription);
		
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(null);
		panelSelection.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelSelection.setBackground(new Color(240, 255, 255));
		panelSelection.setBounds(15, 103, 467, 410);
		contentPane.add(panelSelection);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		lblDestination.setBounds(15, 16, 223, 36);
		panelSelection.add(lblDestination);
		
		JComboBox comboBoxDestination = new JComboBox();
		comboBoxDestination.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		comboBoxDestination.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Johor", "Penang", "Perak"}));
		comboBoxDestination.setBounds(15, 57, 437, 42);
		panelSelection.add(comboBoxDestination);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		lblHotel.setBounds(15, 136, 223, 36);
		panelSelection.add(lblHotel);
		
		JComboBox comboBoxHotel = new JComboBox();
		comboBoxHotel.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		comboBoxHotel.setBounds(15, 177, 437, 42);
		panelSelection.add(comboBoxHotel);
		
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
		
		JPanel panelHotelDetails = new JPanel();
		panelHotelDetails.setLayout(null);
		panelHotelDetails.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(70, 130, 180)));
		panelHotelDetails.setBackground(new Color(240, 255, 255));
		panelHotelDetails.setBounds(489, 103, 480, 496);
		contentPane.add(panelHotelDetails);
		
		JLabel labelHotelName = new JLabel("");
		labelHotelName.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		labelHotelName.setBounds(15, 16, 417, 36);
		panelHotelDetails.add(labelHotelName);
		
		JTextArea textAreaHotelDetails = new JTextArea();
		textAreaHotelDetails.setFont(new Font("Lucida Bright", Font.BOLD, 23));
		textAreaHotelDetails.setBackground(new Color(240, 255, 255));
		textAreaHotelDetails.setBounds(15, 54, 450, 426);
		panelHotelDetails.add(textAreaHotelDetails);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxDestination.setSelectedItem("Please Select");
				comboBoxHotel.setSelectedItem(null);
				labelHotelName.setText("");
				textAreaHotelDetails.setText("");
			}
		});
		btnReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnReset.setBackground(new Color(135, 206, 250));
		btnReset.setBounds(244, 523, 190, 76);
		contentPane.add(btnReset);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (comboBoxDestination.getSelectedItem().equals("Johor") && comboBoxHotel.getSelectedItem().equals("Impiana Hotel Senai")) {
						labelHotelName.setText("Impiana Hotel Senai");
						textAreaHotelDetails.setText("Placed at 18.7km from city centre"
								+ "\nRating\t: 4 stars"
								+ "\nLowest Price\t: RM147 per night" 
								+ "\n\nRoom types\t: Deluxe rooms" 
								+ "\n\t: Executive rooms"
								+ "\n\t: Standard rooms"
								+ "\n\t: Suites" 
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free cancellation");
					}
					
					else if (comboBoxDestination.getSelectedItem().equals("Johor") && comboBoxHotel.getSelectedItem().equals("Hotel Legoland Malaysia")) {
						labelHotelName.setText("Hotel Legoland Malaysia");
						textAreaHotelDetails.setText("Placed at 14.5km from city centre"
								+ "\nRating\t: 4 stars"
								+ "\nLowest Price\t: RM548 per night" 
								+ "\n\nRoom types\t: Deluxe rooms" 
								+ "\n\t: Standard rooms"
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free cancellation"
								+ "\n\t: Free breakfast");
					}
					
					else if (comboBoxDestination.getSelectedItem().equals("Penang") && comboBoxHotel.getSelectedItem().equals("Hotel Eastern & Oriental")) {
						labelHotelName.setText("Hotel Eastern & Oriental");
						textAreaHotelDetails.setText("Placed at Georgetown"
								+ "\nRating\t: 5 stars"
								+ "\nLowest Price\t: RM420 per night" 
								+ "\n\nRoom types\t: Comfort rooms" 
								+ "\n\t: Deluxe rooms"
								+ "\n\t: Standard rooms"
								+ "\n\t: Studio rooms"
								+ "\n\t: Suites" 
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free breakfast");
					}
					
					else if (comboBoxDestination.getSelectedItem().equals("Penang") && comboBoxHotel.getSelectedItem().equals("Bayview Hotel")) {
						labelHotelName.setText("Bayview Hotel");
						textAreaHotelDetails.setText("Placed at Georgetown"
								+ "\nRating\t: 4 stars"
								+ "\nLowest Price\t: RM122 per night" 
								+ "\n\nRoom types\t: Comfort rooms" 
								+ "\n\t: Deluxe rooms"
								+ "\n\t: Family rooms"
								+ "\n\t: Standard rooms"
								+ "\n\t: Suites" 
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free breakfast"
								+ "\n\t: Pay at the property");
					}
					
					else if (comboBoxDestination.getSelectedItem().equals("Perak") && comboBoxHotel.getSelectedItem().equals("D Hotel Seri Iskandar")) {
						labelHotelName.setText("D Hotel Seri Iskandar");
						textAreaHotelDetails.setText("Placed at Ipoh"
								+ "\nRating\t: 3 stars"
								+ "\nLowest Price\t: RM160 per night" 
								+ "\n\nRoom types\t: Comfort rooms" 
								+ "\n\t: Standard rooms" 
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free cancellation");
					}
					
					else if (comboBoxDestination.getSelectedItem().equals("Perak") && comboBoxHotel.getSelectedItem().equals("Pangkor Laut Resort")) {
						labelHotelName.setText("Pangkor Laut Resort");
						textAreaHotelDetails.setText("Placed at 0.5km from the beach"
								+ "\nRating\t: 5 stars"
								+ "\nLowest Price\t: RM891 per night" 
								+ "\n\nRoom types\t: Standard rooms" 
								+ "\n\t: Villas" 
								+ "\n\nFree Wifi\t: Available" 
								+ "\nSwimming Pool: Available" 
								+ "\n\nRemarks\t: Free breakfast");
					}else
						JOptionPane.showMessageDialog(null, "Please select the valid Destination and Hotel");
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please select the valid Destination and Hotel");
				}
				
			}
		});
		btnCheck.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnCheck.setBackground(new Color(135, 206, 250));
		btnCheck.setBounds(43, 523, 190, 76);
		contentPane.add(btnCheck);
	}
}
