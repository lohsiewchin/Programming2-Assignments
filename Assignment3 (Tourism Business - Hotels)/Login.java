package Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\\u5B66\u4E60\\Programming 2\\Assignments\\Assignment 3\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 182, 193)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLoginPage = new JPanel();
		panelLoginPage.setBackground(new Color(250, 235, 215));
		panelLoginPage.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelLoginPage.setBounds(15, 16, 656, 84);
		contentPane.add(panelLoginPage);
		panelLoginPage.setLayout(null);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setBounds(15, 0, 626, 84);
		panelLoginPage.add(lblLoginPage);
		lblLoginPage.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 60));
		lblLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelLogin.setBackground(new Color(250, 235, 215));
		panelLogin.setBounds(15, 107, 656, 328);
		contentPane.add(panelLogin);
		
		JComboBox comboBoxSelection = new JComboBox();
		comboBoxSelection.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "I'm a Customer", "I'm an Admin"}));
		comboBoxSelection.setBounds(171, 16, 292, 37);
		panelLogin.add(comboBoxSelection);
		
		JLabel LabelUserName = new JLabel("User Name");
		LabelUserName.setFont(new Font("Eras Medium ITC", Font.PLAIN, 35));
		LabelUserName.setBounds(86, 69, 188, 48);
		panelLogin.add(LabelUserName);
		
		JLabel LabelPassword = new JLabel("Password");
		LabelPassword.setFont(new Font("Eras Medium ITC", Font.PLAIN, 35));
		LabelPassword.setBounds(86, 133, 188, 48);
		panelLogin.add(LabelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		textFieldUsername.setBounds(289, 69, 278, 48);
		panelLogin.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JButton ButtonLogin = new JButton("Login");
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (comboBoxSelection.getSelectedItem().equals("I'm a Customer")) {
						if(textFieldUsername.getText().equals("user") && passwordField.getText().equals("abc123")) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							
							UserHomePage UserHome = new UserHomePage(); //calling another frame/window
							UserHome.setModalExclusionType(null);
					        UserHome.setVisible(true);
					        dispose();
						}else
							JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}
					else if (comboBoxSelection.getSelectedItem().equals("I'm an Admin")) {
						if(textFieldUsername.getText().equals("admin") && passwordField.getText().equals("efg456")) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							
							AdminHomePage AdminHome = new AdminHomePage(); //calling another frame/window
							AdminHome.setModalExclusionType(null);
					        AdminHome.setVisible(true);
					        dispose();
						}else
							JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}else {
						JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
				}
			}
		});
		ButtonLogin.setBackground(new Color(255, 192, 203));
		ButtonLogin.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		ButtonLogin.setBounds(152, 235, 140, 37);
		panelLogin.add(ButtonLogin);
		
		JButton ButtonReset = new JButton("Reset");
		ButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				passwordField.setText("");
				comboBoxSelection.setSelectedItem("Please Select");
			}
		});
		ButtonReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		ButtonReset.setBackground(new Color(255, 192, 203));
		ButtonReset.setBounds(365, 235, 140, 37);
		panelLogin.add(ButtonReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Just Go Travel Hotel Booking System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Britannic Bold", Font.BOLD, 20));
		btnExit.setBounds(560, 283, 81, 29);
		panelLogin.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		passwordField.setBounds(289, 133, 278, 48);
		panelLogin.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('\u2022');
				}
			}
		});
		chckbxShowPassword.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
		chckbxShowPassword.setBounds(287, 180, 158, 29);
		panelLogin.add(chckbxShowPassword);

	}
}
