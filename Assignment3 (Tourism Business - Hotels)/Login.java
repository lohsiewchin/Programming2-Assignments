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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 182, 193)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelJustGoTravel = new JPanel();
		panelJustGoTravel.setBackground(new Color(250, 235, 215));
		panelJustGoTravel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelJustGoTravel.setBounds(15, 16, 856, 104);
		contentPane.add(panelJustGoTravel);
		panelJustGoTravel.setLayout(null);
		
		JLabel LabelJustGoTravel = new JLabel("JUST GO TRAVEL");
		LabelJustGoTravel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 80));
		LabelJustGoTravel.setHorizontalAlignment(SwingConstants.CENTER);
		LabelJustGoTravel.setBounds(15, 16, 826, 72);
		panelJustGoTravel.add(LabelJustGoTravel);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelLogin.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 192, 203)));
		panelLogin.setBackground(new Color(250, 235, 215));
		panelLogin.setBounds(15, 136, 856, 378);
		contentPane.add(panelLogin);
		
		JComboBox comboBoxSelection = new JComboBox();
		comboBoxSelection.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		comboBoxSelection.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "I'm a Customer", "I'm an Admin"}));
		comboBoxSelection.setBounds(280, 71, 292, 37);
		panelLogin.add(comboBoxSelection);
		
		JLabel LabelUserName = new JLabel("User Name");
		LabelUserName.setFont(new Font("Eras Medium ITC", Font.PLAIN, 35));
		LabelUserName.setBounds(195, 124, 188, 48);
		panelLogin.add(LabelUserName);
		
		JLabel LabelPassword = new JLabel("Password");
		LabelPassword.setFont(new Font("Eras Medium ITC", Font.PLAIN, 35));
		LabelPassword.setBounds(195, 209, 188, 48);
		panelLogin.add(LabelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		textFieldUsername.setBounds(398, 124, 278, 48);
		panelLogin.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Eras Medium ITC", Font.PLAIN, 30));
		textFieldPassword.setBounds(398, 209, 278, 48);
		panelLogin.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JButton ButtonLogin = new JButton("Login");
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (comboBoxSelection.getSelectedItem().equals("I'm a Customer")) {
						if(textFieldUsername.getText().equals("user") && textFieldPassword.getText().equals("abc123")) {
							JOptionPane.showMessageDialog(null, "Login Sucessful");
							
							UserHomePage UserHome = new UserHomePage(); //calling another frame/window
							UserHome.setModalExclusionType(null);
					        UserHome.setVisible(true);
					        dispose();
						}else
							JOptionPane.showMessageDialog(null, "Please enter the valid User Name and Password");
					}
					else if (comboBoxSelection.getSelectedItem().equals("I'm an Admin")) {
						if(textFieldUsername.getText().equals("admin") && textFieldPassword.getText().equals("efg456")) {
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
		ButtonLogin.setBounds(195, 285, 209, 60);
		panelLogin.add(ButtonLogin);
		
		JLabel LabelWelcome = new JLabel("Welcome to UUM Tourism Service ----- Just Go Travel");
		LabelWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		LabelWelcome.setFont(new Font("Century Schoolbook", Font.BOLD, 28));
		LabelWelcome.setBounds(15, 16, 826, 53);
		panelLogin.add(LabelWelcome);
		
		JButton ButtonReset = new JButton("Reset");
		ButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				textFieldPassword.setText("");
				comboBoxSelection.setSelectedItem("Please Select");
			}
		});
		ButtonReset.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		ButtonReset.setBackground(new Color(255, 192, 203));
		ButtonReset.setBounds(467, 285, 209, 60);
		panelLogin.add(ButtonReset);

	}
}
