import javax.swing.*;
import java.awt.*;
import java.lang.*;

import javax.swing.border.EmptyBorder;

import java.awt.Window.Type;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Login frame = new Login();
				frame.setVisible(true);

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		
		setResizable(false);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 100, 500, 300);
		setResizable(false);

		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173,128,168));
		contentPane.setBorder(new TitledBorder(null, "Log In", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\mrmuq\\Downloads\\Grey_Simple_and_Minimalist_Cinema_House_Film_Production_Youtube_Channel_Logo_2_150x150.png"));
		lblLogo.setBounds(178, 10, 145, 107);
		contentPane.add(lblLogo);
		
		JLabel lblUsername_1 = new JLabel("USERNAME : ");
		lblUsername_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblUsername_1.setBounds(68, 102, 100, 43);
		contentPane.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("PASSWORD : ");
		lblPassword_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblPassword_1.setBounds(68, 145, 120, 43);
		contentPane.add(lblPassword_1);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", txtUsername.getFont().getStyle() | Font.BOLD, 12));
		txtUsername.setToolTipText("Enter Staff Username");
		txtUsername.setColumns(10);
		txtUsername.setBounds(178, 115, 237, 20);
		contentPane.add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setFont(new Font("Arial", txtPassword.getFont().getStyle() | Font.BOLD, 14));
		txtPassword.setToolTipText("Enter Staff Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(178, 155, 237, 20);
		contentPane.add(txtPassword);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(178, 174, 237, 20);
		contentPane.add(lblMessage);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
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

				} else {
					
							lblMessage.setText("Wrong Input!");
					}
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setFont(new Font("Arial", btnLogin.getFont().getStyle() | Font.BOLD, 15));
		btnLogin.setBounds(273, 198, 111, 36);
		contentPane.add(btnLogin);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.RED);
		btnClose.setFont(new Font("Arial", btnClose.getFont().getStyle() | Font.BOLD, 15));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnClose.setBounds(91, 198, 111, 36);
		contentPane.add(btnClose);
		
	}
	
}
