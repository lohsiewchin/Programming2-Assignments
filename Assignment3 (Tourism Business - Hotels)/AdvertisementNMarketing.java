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
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvertisementNMarketing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementNMarketing frame = new AdvertisementNMarketing();
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
	public AdvertisementNMarketing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 670);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAdvertisementNMarketing = new JPanel();
		panelAdvertisementNMarketing.setBackground(new Color(255, 255, 204));
		panelAdvertisementNMarketing.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelAdvertisementNMarketing.setBounds(15, 43, 896, 104);
		contentPane.add(panelAdvertisementNMarketing);
		panelAdvertisementNMarketing.setLayout(null);
		
		JLabel lblAdvertisementNMarketing = new JLabel("Advertisement & Marketing");
		lblAdvertisementNMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdvertisementNMarketing.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
		lblAdvertisementNMarketing.setBounds(15, 16, 866, 71);
		panelAdvertisementNMarketing.add(lblAdvertisementNMarketing);
		
		JPanel panelSelection = new JPanel();
		panelSelection.setLayout(null);
		panelSelection.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 102)));
		panelSelection.setBackground(new Color(255, 255, 204));
		panelSelection.setBounds(15, 163, 896, 435);
		contentPane.add(panelSelection);
		
		JTextArea textAreaTypeOfAds = new JTextArea();
		textAreaTypeOfAds.setBackground(new Color(255, 255, 204));
		textAreaTypeOfAds.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		textAreaTypeOfAds.setText("We have two types of advertisement."
				+ "\n1. Online advertisement on Social Media."
				+ "\n2. Offline advertisement on Print Media.");
		textAreaTypeOfAds.setBounds(128, 16, 665, 123);
		panelSelection.add(textAreaTypeOfAds);
		
		JButton btnOnlineAds = new JButton("Online Advertisement");
		btnOnlineAds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlineAdvertisement OnlineAds = new OnlineAdvertisement();
				OnlineAds.setModalExclusionType(null);
				OnlineAds.setVisible(true);
			}
		});
		btnOnlineAds.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnOnlineAds.setBackground(new Color(255, 204, 153));
		btnOnlineAds.setBounds(257, 169, 356, 81);
		panelSelection.add(btnOnlineAds);
		
		JButton btnOfflineAds = new JButton("Offline Advertisement");
		btnOfflineAds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfflineAdvertisement OfflineAds = new OfflineAdvertisement();
				OfflineAds.setModalExclusionType(null);
				OfflineAds.setVisible(true);
			}
		});
		btnOfflineAds.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
		btnOfflineAds.setBackground(new Color(255, 204, 153));
		btnOfflineAds.setBounds(257, 279, 356, 81);
		panelSelection.add(btnOfflineAds);
	}
}