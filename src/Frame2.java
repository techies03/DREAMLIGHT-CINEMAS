import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.time.*;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

//create class for Frame2
public class Frame2 extends JFrame {

	protected static final String String = null;
	protected static final double d2 = 0;
	private JPanel contentPane;

	LocalDateTime time = LocalDateTime.now();
	
	//declare color palette that I want to use
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);

	//declaration for show time
	String showTime = null;
	String showTime11 = null;
	String showTime13 = null;
	String showTime15 = null;
	String showTime19 = null;
	String showTime20 = null;
	String showTime22 = null;


	public Frame2(String name, String movie, int Months, int Days, int Hours, int Minutes) {
				
		int currentDay = LocalDateTime.now().getDayOfMonth();
		LocalDateTime bookingDateTime = LocalDateTime.of(2022, Months, Days, Hours, Minutes);
		LocalDateTime timeMax = LocalDateTime.of(2022, Months, Days, 23, 00);
		
		LocalDateTime hours11 = LocalDateTime.of(2022, Months, Days, 11, 10);
		LocalDateTime hours13 = LocalDateTime.of(2022, Months, Days, 13, 10);
		LocalDateTime hours15 = LocalDateTime.of(2022, Months, Days, 15, 10);
		LocalDateTime hours19 = LocalDateTime.of(2022, Months, Days, 19, 10);
		LocalDateTime hours20 = LocalDateTime.of(2022, Months, Days, 20, 10);
		LocalDateTime hours22 = LocalDateTime.of(2022, Months, Days, 22, 10);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 480);
		contentPane = new JPanel();
		contentPane.setBackground(prussianBlue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create a panel
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(29, 53, 87), new Color(29, 53, 87)), "MOVIE TITLE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panel.setBounds(10, 10, 546, 80);
		panel.setBackground(celadonBlue);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//create lblMovie
		JLabel lblMovie = new JLabel("");
		lblMovie.setForeground(honeydew);
		lblMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovie.setText(movie);
		lblMovie.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblMovie.setBounds(10, 10, 526, 60);
		panel.add(lblMovie);
		
		//create panelShowTime
		JPanel panelShowTime = new JPanel();
		panelShowTime.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(29, 53, 87), new Color(29, 53, 87)), "AVAILABLE SHOWTIMES", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelShowTime.setBackground(celadonBlue);
		panelShowTime.setBounds(10, 100, 546, 333);
		contentPane.add(panelShowTime);
		panelShowTime.setLayout(null);
		
		//create panelShowBookingDate
		JPanel panelShowBookingDate = new JPanel();
		panelShowBookingDate.setBackground(prussianBlue);
		panelShowBookingDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(69, 123, 157), new Color(69, 123, 157)), "BOOKING DATE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(241, 250, 238)));
		panelShowBookingDate.setBounds(18, 25, 504, 61);
		panelShowTime.add(panelShowBookingDate);
		panelShowBookingDate.setLayout(null);
		
		//create lblTime
		JLabel lblTime = new JLabel("");
		lblTime.setBounds(8, 10, 486, 42);
		panelShowBookingDate.add(lblTime);
		lblTime.setForeground(powderBlue);
		lblTime.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setText(getCurrentDate(Months, Days));
		
		//create panelShowTime1
		JPanel panelShowTime1 = new JPanel();
		panelShowTime1.setBackground(prussianBlue);
		panelShowTime1.setBounds(18, 96, 153, 71);
		panelShowTime1.setVisible(false);
		panelShowTime.add(panelShowTime1);
		panelShowTime1.setLayout(null);
		
		//create lblShowTime1
		JLabel lblShowTime1 = new JLabel("");
		lblShowTime1.setForeground(mint);
		lblShowTime1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime1.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime1.setBounds(0, 0, 153, 71);
		panelShowTime1.add(lblShowTime1);
		
		//create panelShowTime2
		JPanel panelShowTime2 = new JPanel();
		panelShowTime2.setBackground(prussianBlue);
		panelShowTime2.setBounds(193, 96, 153, 71);
		panelShowTime2.setVisible(false);
		panelShowTime.add(panelShowTime2);
		panelShowTime2.setLayout(null);
		
		//create lblShowTime2
		JLabel lblShowTime2 = new JLabel("");
		lblShowTime2.setForeground(mint);
		lblShowTime2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime2.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime2.setBounds(0, 10, 153, 51);
		panelShowTime2.add(lblShowTime2);
		
		//create panelShowTime3
		JPanel panelShowTime3 = new JPanel();
		panelShowTime3.setBackground(prussianBlue);
		panelShowTime3.setBounds(368, 96, 153, 71);
		panelShowTime3.setVisible(false);
		panelShowTime.add(panelShowTime3);
		panelShowTime3.setLayout(null);
		
		//create lblShowTime3
		JLabel lblShowTime3 = new JLabel("");
		lblShowTime3.setForeground(mint);
		lblShowTime3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime3.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime3.setBounds(0, 0, 153, 71);
		panelShowTime3.add(lblShowTime3);
		
		//create panelShowTime4
		JPanel panelShowTime4 = new JPanel();
		panelShowTime4.setBackground(prussianBlue);
		panelShowTime4.setBounds(18, 188, 153, 71);
		panelShowTime4.setVisible(false);
		panelShowTime.add(panelShowTime4);
		panelShowTime4.setLayout(null);
		
		//create lblShowTime4
		JLabel lblShowTime4 = new JLabel("");
		lblShowTime4.setForeground(mint);
		lblShowTime4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime4.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime4.setBounds(0, 0, 153, 71);
		panelShowTime4.add(lblShowTime4);
		
		//create panelShowTime5
		JPanel panelShowTime5 = new JPanel();
		panelShowTime5.setBackground(prussianBlue);
		panelShowTime5.setBounds(193, 188, 153, 71);
		panelShowTime5.setVisible(false);
		panelShowTime.add(panelShowTime5);
		panelShowTime5.setLayout(null);
		
		//create lblShowTime5
		JLabel lblShowTime5 = new JLabel("");
		lblShowTime5.setForeground(mint);
		lblShowTime5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime5.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime5.setBounds(0, 0, 153, 71);
		panelShowTime5.add(lblShowTime5);
		
		//create panelShowTime6
		JPanel panelShowTime6 = new JPanel();
		panelShowTime6.setBackground(prussianBlue);
		panelShowTime6.setBounds(369, 188, 153, 71);
		panelShowTime6.setVisible(false);
		panelShowTime.add(panelShowTime6);
		panelShowTime6.setLayout(null);
		
		//create lblShowTime6
		JLabel lblShowTime6 = new JLabel("");
		lblShowTime6.setForeground(mint);
		lblShowTime6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblShowTime6.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime6.setBounds(0, 0, 153, 71);
		panelShowTime6.add(lblShowTime6);
		
		//create btnBack
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(19, 276, 152, 50);
		panelShowTime.add(btnBack);
		btnBack.setBackground(imperialRed);
		btnBack.setForeground(honeydew);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//go to frame1
				Frame1 b = new Frame1(name);
				b.show();
				dispose();
			}
		});

		
		if(Days > currentDay) {
			
			//set all the panel to true
			panelShowTime1.setVisible(true);
			panelShowTime2.setVisible(true);
			panelShowTime3.setVisible(true);
			panelShowTime4.setVisible(true);
			panelShowTime5.setVisible(true);
			panelShowTime6.setVisible(true);

			//assign the showtime
			showTime11 = "11:00 AM";
			showTime13 = "1:00 PM";
			showTime15 = "3:00 PM";
			showTime19 = "7:00 PM";
			showTime20 = "8:00 PM";
			showTime22 = "9:00 PM";

			//set the showTime to lblshowTime
			lblShowTime1.setText(showTime11);
			lblShowTime2.setText(showTime13);
			lblShowTime3.setText(showTime15);
			lblShowTime4.setText(showTime19);
			lblShowTime5.setText(showTime20);
			lblShowTime6.setText(showTime22);

			
		}
		if (Days == currentDay){
			
			if(bookingDateTime.isBefore(timeMax)) {
				
				
				if (bookingDateTime.isBefore(hours11)) {
					
					//set all the panel to true
					panelShowTime1.setVisible(true);
					panelShowTime2.setVisible(true);
					panelShowTime3.setVisible(true);
					panelShowTime4.setVisible(true);
					panelShowTime5.setVisible(true);
					panelShowTime6.setVisible(true);

					//assign the showtime
					showTime11 = "11:00 AM";
					showTime13 = "1:00 PM";
					showTime15 = "3:00 PM";
					showTime19 = "7:00 PM";
					showTime20 = "8:00 PM";
					showTime22 = "9:00 PM";

					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime11);
					lblShowTime2.setText(showTime13);
					lblShowTime3.setText(showTime15);
					lblShowTime4.setText(showTime19);
					lblShowTime5.setText(showTime20);
					lblShowTime6.setText(showTime22);
					
				} else if (bookingDateTime.isBefore(hours13)) {
					
					//set all the panel to true
					panelShowTime1.setVisible(true);
					panelShowTime2.setVisible(true);
					panelShowTime3.setVisible(true);
					panelShowTime4.setVisible(true);
					panelShowTime5.setVisible(true);

					//assign the showtime
					showTime13 = "1:00 PM";
					showTime15 = "3:00 PM";
					showTime19 = "7:00 PM";
					showTime20 = "8:00 PM";
					showTime22 = "9:00 PM";
					
					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime13);
					lblShowTime2.setText(showTime15);
					lblShowTime3.setText(showTime19);
					lblShowTime4.setText(showTime20);
					lblShowTime5.setText(showTime22);
	
				} else if (bookingDateTime.isBefore(hours15)) {
				
					//set all the panel to true
					panelShowTime1.setVisible(true);
					panelShowTime2.setVisible(true);
					panelShowTime3.setVisible(true);
					panelShowTime4.setVisible(true);
					
					//assign the showtime
					showTime15 = "3:00 PM";
					showTime19 = "7:00 PM";
					showTime20 = "8:00 PM";
					showTime22 = "9:00 PM";
					
					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime15);
					lblShowTime2.setText(showTime19);
					lblShowTime3.setText(showTime20);
					lblShowTime4.setText(showTime22);

				}  else if (bookingDateTime.isBefore(hours19)) {
				
					//set all the panel to true
					panelShowTime1.setVisible(true);
					panelShowTime2.setVisible(true);
					panelShowTime3.setVisible(true);
					
					//assign the showtime
					showTime19 = "7:00 PM";
					showTime20 = "8:00 PM";
					showTime22 = "9:00 PM";
					
					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime19);
					lblShowTime2.setText(showTime20);
					lblShowTime3.setText(showTime22);
					
				}  else if (bookingDateTime.isBefore(hours20)) {
				
					//set all the panel to true
					panelShowTime1.setVisible(true);
					panelShowTime2.setVisible(true);
					
					//assign the showtime
					showTime20 = "8:00 PM";
					showTime22 = "9:00 PM";
					
					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime20);
					lblShowTime2.setText(showTime22);

				}  else if (bookingDateTime.isBefore(hours22)) {
				
					//set all the panel to true
					panelShowTime1.setVisible(true);
					
					//assign the showtime
					showTime22 = "9:00 PM";

					//set the showTime to lblshowTime
					lblShowTime1.setText(showTime22);

				} else {
					
					//warning message
					JOptionPane.showMessageDialog(null, "Select date first !", "Date Missing", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		}
		
		//mouseClick listener for lblShowTime1
		lblShowTime1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime1.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
		//mouseClick listener for lblShowTime2
		lblShowTime2.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime2.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
		//mouseClick listener for lblShowTime3
		lblShowTime3.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime3.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
		//mouseClick listener for lblShowTime4
		lblShowTime4.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime4.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
		//mouseClick listener for lblShowTime5
		lblShowTime5.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime5.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
		//mouseClick listener for lblShowTime6
		lblShowTime6.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
	            int result = JOptionPane.showConfirmDialog(null,"Do you want to proceed ?", "Confirm Message",
	                    JOptionPane.YES_NO_OPTION,
	                    JOptionPane.QUESTION_MESSAGE);
	            
	            if(result == JOptionPane.YES_OPTION){
	            	
	            	showTime = lblShowTime6.getText();
	            	
	            	Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);
	            	f3.show();
	            	dispose();
	            } 
				
			}
		});
		
	}
	
	//method for getCurrentDate
	public String getCurrentDate(int Months, int Days) {
	    return LocalDate.of(2022, Months, Days)
	    		.format(DateTimeFormatter
	    		.ofPattern("d MMM uuuu (EEEE)"));
	}
	
	//method for getCurrentDateTime
	public String getCurrentTime(int Hours, int Minutes) {
	    return LocalTime.of(Hours, Minutes)
	    		.format(DateTimeFormatter
	    		.ofPattern("HH:mm"));
	}
	
}
