import javax.swing.*;
import java.awt.*;
import java.lang.*;

import javax.swing.border.EmptyBorder;

import java.awt.Window.Type;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	//create class for Frame
	public Frame() {
		
		//declare color palette that I want to use
		Color celadonBlue = new Color(69, 123, 157);
		Color prussianBlue = new Color(29, 53, 87);
		Color powderBlue = new Color(168, 218, 220);
		Color honeydew = new Color(241, 250, 238);
		Color imperialRed = new Color(230, 57, 70);
		Color emerald = new Color(64, 145, 108);
		Color mint = new Color(82, 183, 136);
		
		//declare image that i want to use in this program
		Image dreamlight = new ImageIcon(this.getClass().getResource("/dreamLight.png")).getImage();

		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 100, 500, 300);
		setResizable(false);

		
		contentPane = new JPanel();
		contentPane.setBackground(prussianBlue);
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)),
								"Log In", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create lblLogo and put the image Icon
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(dreamlight));
		lblLogo.setBounds(178, 10, 145, 107);
		contentPane.add(lblLogo);
		
		//create lblUsername
		JLabel lblUsername = new JLabel("USERNAME : ");
		lblUsername.setForeground(honeydew);
		lblUsername.setFont(new Font("Arial", Font.BOLD, 15));
		lblUsername.setBounds(68, 102, 100, 43);
		contentPane.add(lblUsername);
		
		//create lblPassword
		JLabel lblPassword = new JLabel("PASSWORD : ");
		lblPassword.setForeground(honeydew);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
		lblPassword.setBounds(68, 145, 120, 43);
		contentPane.add(lblPassword);
		
		//create textfield to input username
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", txtUsername.getFont().getStyle() | Font.BOLD, 12));
		txtUsername.setToolTipText("Enter Staff Username");
		txtUsername.setColumns(10);
		txtUsername.setBounds(178, 115, 237, 20);
		contentPane.add(txtUsername);
		
		//create passwordfield to imput password
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setFont(new Font("Arial", txtPassword.getFont().getStyle() | Font.BOLD, 14));
		txtPassword.setToolTipText("Enter Staff Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(178, 155, 237, 20);
		contentPane.add(txtPassword);
		
		//create button login
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				//declare array for username and password
				String[] Username = {"muqsit", "danial", "irfan", "kamil"};
				String[] Password = {"123"};
				String name = null;
								
				if(txtUsername.getText().equals(Username[0]) &&
				   txtPassword.getText().equals(Password[0])) {
							
						name = "MOHD MUQSIT";
						Frame1 a = new Frame1(name);
						a.show();
						dispose();

				} else if(txtUsername.getText().toString().equals(Username[1]) &&
						  txtPassword.getText().toString().equals(Password[0])) {
					
						name = "MUHAMMAD DANIAL ASYRAAF";
						Frame1 a = new Frame1(name);
						a.show();
						dispose();

				} else if (txtUsername.getText().toString().equals(Username[2]) &&
						   txtPassword.getText().toString().equals(Password[0])) {
					
						name = "MUHAMMAD IRFAN";
						Frame1 a = new Frame1(name);
						a.show();
						dispose();

				} else if (txtUsername.getText().toString().equals(Username[3]) &&
						   txtPassword.getText().toString().equals(Password[0])) {
					
						name = "MUHAMMAD KAMIL";
						Frame1 a = new Frame1(name);
						a.show();
						dispose();

				} else  {
					//error message
 						JOptionPane.showMessageDialog(btnLogin, "Wrong input", "Wrong Input", JOptionPane.ERROR_MESSAGE);

				}
				
			}
		});
		btnLogin.setForeground(honeydew);
		btnLogin.setBackground(emerald);
		btnLogin.setFont(new Font("Arial", btnLogin.getFont().getStyle() | Font.BOLD, 15));
		btnLogin.setBounds(273, 198, 111, 36);
		contentPane.add(btnLogin);
		
		//create button close
		JButton btnClose = new JButton("CLOSE");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.RED);
		btnClose.setFont(new Font("Arial", btnClose.getFont().getStyle() | Font.BOLD, 15));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//exit the program
				System.exit(0);
			}
		});
		btnClose.setBounds(91, 198, 111, 36);
		contentPane.add(btnClose);
		
	}
	
}
