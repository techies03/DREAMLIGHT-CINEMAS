import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Frame4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTicket;
	private JTextField txtFood;
	private JTextField txtTotal;
	private JTextField txtChange;
	private JTextField txtPay;

	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);
	
	Image popcorn = new ImageIcon(this.getClass().getResource("/popcorn.png")).getImage();

	
	String[] payMethod = {"Select Payment Method", "Tng eWallet", "Grab Pay", "Cash", "Credit / Debit"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox cbPaymentMethod = new JComboBox(payMethod);
	JPanel panelPay = new JPanel();
	JButton btnNext;
	JButton btnTotal = new JButton("TOTAL");


	double regular = 9.0;
	double large = 12.0;
	double totalCaramel = 0.0;
	double totalChoco = 0.0;
	double totalButter = 0.0;
	double totalFood = 0.0;

	
	double priceKids = 0.0;
	double priceStudent = 0.0;
	double priceAdult = 0.0;
	double priceEldery = 0.0;
	
	double totalPriceKids = 0.0;
	double totalPriceStudent = 0.0;
	double totalPriceAdult = 0.0;
	double totalPriceEldery = 0.0;
	
	double totalTicket = 0.0;
	double ticketDiscount = 0.0;
	double total = 0.0;

	DecimalFormat df = new DecimalFormat("#0.00");

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Frame4(String name, String movie, int Months, int Days, int Hours, int Minutes, String showTime, String seat[][], int totalKids,
					int totalStudent, int totalAdult, int totalEldery, double movieClub) {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(prussianBlue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panelSeatList = new JPanel();
		panelSeatList.setBackground(celadonBlue);
		panelSeatList.setBounds(80, 63, 1083, 550);
		contentPane.add(panelSeatList);
		panelSeatList.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(prussianBlue);
		panel.setBounds(560, 10, 513, 530);
		panelSeatList.add(panel);
		panel.setLayout(null);
		
		JPanel panelCaramel = new JPanel();
		panelCaramel.setBounds(20, 34, 224, 144);
		panel.add(panelCaramel);
		panelCaramel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "POPCORN CARAMEL", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelCaramel.setBackground(prussianBlue);
		panelCaramel.setLayout(null);
		
		JLabel lblCaramel = new JLabel("POPCORN CARAMEL");
		lblCaramel.setForeground(honeydew);
		lblCaramel.setBounds(10, 10, 197, 40);
		panelCaramel.add(lblCaramel);
		lblCaramel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCaramel.setHorizontalAlignment(SwingConstants.CENTER);
		
		SpinnerModel plusCaramelR = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerCaramelR = new JSpinner(plusCaramelR);
		spinnerCaramelR.setBounds(128, 54, 35, 30);
		panelCaramel.add(spinnerCaramelR);
		
		SpinnerModel plusCaramelL = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerCarameL = new JSpinner(plusCaramelL);
		spinnerCarameL.setBounds(128, 94, 35, 30);
		panelCaramel.add(spinnerCarameL);
		
		
		JLabel lblCaramelR = new JLabel("REGULAR");
		lblCaramelR.setForeground(honeydew);
		lblCaramelR.setFont(new Font("Arial", Font.BOLD, 15));
		lblCaramelR.setBounds(20, 54, 77, 30);
		panelCaramel.add(lblCaramelR);
		
		JLabel lblCaramelL = new JLabel("LARGE");
		lblCaramelL.setForeground(honeydew);
		lblCaramelL.setFont(new Font("Arial", Font.BOLD, 15));
		lblCaramelL.setBounds(20, 96, 77, 30);
		panelCaramel.add(lblCaramelL);
		
		JPanel panelChoco = new JPanel();
		panelChoco.setLayout(null);
		panelChoco.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "POPCORN CHOCOLATE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelChoco.setBackground(prussianBlue);
		panelChoco.setBounds(264, 34, 224, 144);
		panel.add(panelChoco);
		
		JLabel lblChoco = new JLabel("POPCORN CHOCOLATE");
		lblChoco.setForeground(honeydew);
		lblChoco.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoco.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblChoco.setBounds(10, 10, 197, 40);
		panelChoco.add(lblChoco);
		
		SpinnerModel plusChocoR = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerChocoR = new JSpinner(plusChocoR);
		spinnerChocoR.setBounds(157, 54, 35, 30);
		panelChoco.add(spinnerChocoR);
		
		SpinnerModel plusChocoL = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerChocoL = new JSpinner(plusChocoL);
		spinnerChocoL.setBounds(157, 94, 35, 30);
		panelChoco.add(spinnerChocoL);
		
		
		JLabel lblChocoR = new JLabel("REGULAR");
		lblChocoR.setForeground(honeydew);
		lblChocoR.setFont(new Font("Arial", Font.BOLD, 15));
		lblChocoR.setBounds(20, 54, 77, 30);
		panelChoco.add(lblChocoR);
		
		JLabel lblChocoL = new JLabel("LARGE");
		lblChocoL.setForeground(honeydew);
		lblChocoL.setFont(new Font("Arial", Font.BOLD, 15));
		lblChocoL.setBounds(20, 96, 77, 30);
		panelChoco.add(lblChocoL);
		
		JPanel panelButter = new JPanel();
		panelButter.setLayout(null);
		panelButter.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "POPCORN BUTTER", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelButter.setBackground(prussianBlue);
		panelButter.setBounds(20, 199, 224, 144);
		panel.add(panelButter);
		
		JLabel lblButter = new JLabel("POPCORN BUTTER");
		lblButter.setForeground(honeydew);
		lblButter.setHorizontalAlignment(SwingConstants.CENTER);
		lblButter.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblButter.setBounds(10, 10, 197, 40);
		panelButter.add(lblButter);
		
		SpinnerModel plusButterR = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerButterR = new JSpinner(plusButterR);
		spinnerButterR.setBounds(128, 54, 35, 30);
		panelButter.add(spinnerButterR);
		
		SpinnerModel plusButterL = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerButterL = new JSpinner(plusButterL);
		spinnerButterL.setBounds(128, 94, 35, 30);
		panelButter.add(spinnerButterL);
		
		
		JLabel lblButterR = new JLabel("REGULAR");
		lblButterR.setForeground(honeydew);
		lblButterR.setFont(new Font("Arial", Font.BOLD, 15));
		lblButterR.setBounds(20, 54, 77, 30);
		panelButter.add(lblButterR);
		
		JLabel lblButterL = new JLabel("LARGE");
		lblButterL.setForeground(honeydew);
		lblButterL.setFont(new Font("Arial", Font.BOLD, 15));
		lblButterL.setBounds(20, 96, 77, 30);
		panelButter.add(lblButterL);
		
		
		JPanel panelCheckOut = new JPanel();
		panelCheckOut.setLayout(null);
		panelCheckOut.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "CHECK OUT", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelCheckOut.setBackground(prussianBlue);
		panelCheckOut.setBounds(264, 199, 224, 301);
		panel.add(panelCheckOut);
		
		JLabel lblCheckOut = new JLabel("TOTAL");
		lblCheckOut.setForeground(honeydew);
		lblCheckOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckOut.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblCheckOut.setBounds(10, 10, 197, 40);
		panelCheckOut.add(lblCheckOut);
		
		JLabel lblTicket = new JLabel("TICKET RM");
		lblTicket.setForeground(honeydew);
		lblTicket.setFont(new Font("Arial", Font.BOLD, 15));
		lblTicket.setBounds(10, 49, 94, 30);
		panelCheckOut.add(lblTicket);
		
		JLabel lblFood = new JLabel("FOOD    RM");
		lblFood.setForeground(honeydew);
		lblFood.setFont(new Font("Arial", Font.BOLD, 15));
		lblFood.setBounds(10, 83, 91, 30);
		panelCheckOut.add(lblFood);
		
		txtTicket = new JTextField();
		txtTicket.setBounds(101, 49, 106, 30);
		panelCheckOut.add(txtTicket);
		txtTicket.setColumns(10);
		
		txtFood = new JTextField();
		txtFood.setColumns(10);
		txtFood.setBounds(101, 85, 106, 30);
		panelCheckOut.add(txtFood);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(101, 121, 106, 30);
		panelCheckOut.add(txtTotal);
		
		cbPaymentMethod = new JComboBox(payMethod);
		cbPaymentMethod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String payType = (String) cbPaymentMethod.getSelectedItem();

				if(payType.equals("Tng eWallet")) {
					
					panelPay.setVisible(false);
					btnTotal.setVisible(false);
					btnNext.setVisible(true);

				} else if(payType.equals("Grab Pay")) {
					
					panelPay.setVisible(false);
					btnTotal.setVisible(false);
					btnNext.setVisible(true);


				} else if(payType.equals("Credit / Debit")) {
					
					panelPay.setVisible(false);
					btnTotal.setVisible(false);
					btnNext.setVisible(true);

				} else if(payType.equals("Select Payment Method")) {
					
					panelPay.setVisible(false);
					btnTotal.setVisible(false);
					btnNext.setVisible(true);


				} else if(payType.equals("Cash")) {
					
					panelPay.setVisible(true);
					btnTotal.setVisible(true);
					btnNext.setVisible(false);

				}
					
				
				
			}
		});
		
		cbPaymentMethod.setVisible(false);
		cbPaymentMethod.setBounds(10, 171, 197, 30);
		panelCheckOut.add(cbPaymentMethod);
		
		panelPay = new JPanel();
		panelPay.setBackground(prussianBlue);
		panelPay.setBounds(10, 211, 204, 80);
		panelPay.setVisible(false);
		panelCheckOut.add(panelPay);
		
		panelPay.setLayout(null);
		
		JLabel lblPay = new JLabel("PAY          RM");
		lblPay.setForeground(honeydew);
		lblPay.setBounds(10, 0, 96, 30);
		panelPay.add(lblPay);
		lblPay.setFont(new Font("Arial", Font.BOLD, 15));
		
		txtPay = new JTextField("");
		txtPay.setBounds(108, 2, 96, 30);
		panelPay.add(txtPay);
		txtPay.setColumns(10);
		
		JLabel lblChange = new JLabel("CHANGE RM");
		lblChange.setForeground(honeydew);
		lblChange.setBounds(10, 42, 96, 30);
		panelPay.add(lblChange);
		lblChange.setFont(new Font("Arial", Font.BOLD, 15));
		
		txtChange = new JTextField("");
		txtChange.setBounds(108, 44, 96, 30);
		panelPay.add(txtChange);
		txtChange.setColumns(10);
		
		JLabel lblTotal = new JLabel("TOTAL  RM");
		lblTotal.setForeground(honeydew);
		lblTotal.setBounds(10, 123, 91, 30);
		panelCheckOut.add(lblTotal);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 15));
		
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				totalCaramel(spinnerCaramelR, spinnerCarameL);
				totalChoco(spinnerChocoR, spinnerChocoL);
				totalButter(spinnerButterR, spinnerButterL);
				
				totalFood = totalCaramel(spinnerCaramelR, spinnerCarameL) + 
							totalChoco(spinnerChocoR, spinnerChocoL) +
							totalButter(spinnerButterR, spinnerButterL);


				priceKids = 9.00;
				priceStudent = 12.00;
				priceAdult = 18.00;
				priceEldery = 10.00;

					
				totalPriceKids = priceKids * totalKids;
				totalPriceStudent = priceStudent * totalStudent;
				totalPriceAdult = priceAdult * totalAdult;
				totalPriceEldery = priceEldery * totalEldery;
				
				totalTicket = totalPriceKids + totalPriceStudent + totalPriceAdult + totalPriceEldery;
				ticketDiscount = totalTicket * movieClub;
				totalTicket -= ticketDiscount;
				
				total = totalTicket + totalFood;


				txtFood.setText(df.format(totalFood));
				txtTicket.setText(df.format(totalTicket));
				txtTotal.setText(df.format(total));
				
				cbPaymentMethod.setVisible(true);
				
			}
		});
		btnCalculate.setForeground(honeydew);
		btnCalculate.setBackground(emerald);
		btnCalculate.setBounds(20, 353, 224, 65);
		panel.add(btnCalculate);
		
		btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNext.setBounds(20, 435, 104, 65);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				Frame5 f5 = new Frame5(name, movie, Months, Days, Hours, Minutes, showTime, seat, totalKids,
						 				totalStudent, totalAdult, totalEldery, movieClub);
				f5.show();
				dispose();
			}
		});
		btnNext.setVisible(false);
		btnNext.setForeground(new Color(241, 250, 238));
		btnNext.setBackground(new Color(230, 57, 70));
		
		btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double totalPay = Double.parseDouble(txtPay.getText());
				double change = 0;	

				if(totalPay > total) {
					
					totalPay -= total;
					txtChange.setText(df.format(totalPay));
					btnNext.setVisible(true);
					
				} else if (totalPay < total || totalPay == 0) {
					
					JOptionPane.showMessageDialog(btnTotal, "Warning! negative output", "Negative Output", JOptionPane.ERROR_MESSAGE);
					
				}
 				else {
 					JOptionPane.showMessageDialog(btnTotal, "No input detected", "Missing Input", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		});
		btnTotal.setVisible(false);
		btnTotal.setForeground(new Color(241, 250, 238));
		btnTotal.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnTotal.setBackground(new Color(64, 145, 108));
		btnTotal.setBounds(140, 435, 104, 65);
		panel.add(btnTotal);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(popcorn));
		lblNewLabel.setBounds(10, 10, 540, 530);
		panelSeatList.add(lblNewLabel);
	}
	
	public double totalCaramel(JSpinner spinnerCaramelR, JSpinner spinnerCarameL) {
		
		int caramelR = (int) spinnerCaramelR.getValue();
		int caramelL = (int) spinnerCarameL.getValue();

		return totalCaramel = (caramelR * regular) + (caramelL * large);
	}
	
	public double totalChoco(JSpinner spinnerChocoR, JSpinner spinnerChocoL) {
		
		int chocoR = (int) spinnerChocoR.getValue();
		int chocoL = (int) spinnerChocoL.getValue();
		

		return totalChoco = (chocoR * regular) + (chocoL * large);
	}
	
	public double totalButter(JSpinner spinnerButteR, JSpinner spinnerButteL) {
		
		int butterR = (int) spinnerButteR.getValue();
		int butterL = (int) spinnerButteL.getValue();
		

		return totalButter = (butterR * regular) + (butterL * large);
	}
}
