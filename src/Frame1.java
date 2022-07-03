import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;


//create class for Frame1
public class Frame1 extends JFrame {

	private static final String String = null;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	JLabel lblDate = new JLabel("date");
	String showDate = null;
	String date = null;
	String movie = null;
	
	Font font = new Font("Arial", Font.BOLD, 14);
	
	//declare color palette that I want to use
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);
	
	//declare image that i want to use in this program
	Image eyesOnMe = new ImageIcon(this.getClass().getResource("/eyesOnMe.jpg")).getImage();
	Image drStrange = new ImageIcon(this.getClass().getResource("/drStrange.jpg")).getImage();
	Image topGun = new ImageIcon(this.getClass().getResource("/topGun.jpg")).getImage();
	Image minions = new ImageIcon(this.getClass().getResource("/minions.jpg")).getImage();

	
	//declaration for Uptime variable
	int hourUptime = 0;
	int minuteUptime = 0;
	int secondUptime = 0;
	
	//declaration for uptime
	String seconds, minutes, hours;
	Timer timer;
	Thread clock;
	DecimalFormat timeFormat = new DecimalFormat("00");
	
	//declaration for time related variable
	int plus = 0;
	int Months = 0;
	int Days = 0;
	int Hours = 0;
	int Minutes = 0;
	
	public Frame1(String name) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(prussianBlue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create panel for clock
		JPanel panelClock = new JPanel();
		panelClock.setBounds(50, 10, 250, 57);
		panelClock.setBackground(celadonBlue);
		panelClock.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "CURRENT TIME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		contentPane.add(panelClock);
		panelClock.setLayout(null);
		
		//create panel clock
		JLabel lblClock = new JLabel("clock");
		lblClock.setHorizontalAlignment(SwingConstants.CENTER);
		
		//call method clock to use the clock method
		clock(lblClock);
		//start the clock
		clock.start();
		
		lblClock.setForeground(honeydew);
		lblClock.setBounds(10, 10, 230, 37);
		panelClock.add(lblClock);
		lblClock.setFont(new Font("Arial", Font.BOLD, 16));
		
		//create panel date
		JPanel panelDate = new JPanel();
		panelDate.setBounds(350, 10, 250, 57);
		panelDate.setBackground(celadonBlue);
		panelDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "DATE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		contentPane.add(panelDate);
		panelDate.setLayout(null);
		
		//set lblDate to method getCurrentDAte
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setText(getCurrentDate());
		lblDate.setForeground(honeydew);
		lblDate.setBounds(10, 10, 230, 37);
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		panelDate.add(lblDate);
		
		//create panel staff name
		JPanel panelStaffName = new JPanel();
		panelStaffName.setBounds(650, 10, 250, 57);
		panelStaffName.setBackground(celadonBlue);
		panelStaffName.setLayout(null);
		panelStaffName.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "STAFF NAME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		contentPane.add(panelStaffName);
		
		//create lblStaffName
		JLabel lblStaffName = new JLabel("staff name");
		lblStaffName.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffName.setForeground(honeydew);
		lblStaffName.setBounds(10, 10, 230, 37);
		panelStaffName.add(lblStaffName);
		lblStaffName.setText(name);
		lblStaffName.setFont(new Font("Arial", Font.BOLD, 14));
		
		//create panelUpTime
		JPanel panelUptime = new JPanel();
		panelUptime.setBounds(950, 10, 250, 57);
		panelUptime.setBackground(celadonBlue);
		panelUptime.setLayout(null);
		panelUptime.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "UPTIME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		contentPane.add(panelUptime);
		
		//create lblUpTime
		JLabel lblUpTime = new JLabel("");
		lblUpTime.setHorizontalAlignment(SwingConstants.CENTER);
		
		//call the method uptime
		upTime(lblUpTime);
		//start the method uptime
		timer.start();
		
		lblUpTime.setForeground(honeydew);
		lblUpTime.setBounds(10, 10, 230, 37);
		panelUptime.add(lblUpTime);
		lblUpTime.setText("00:00:00");
		lblUpTime.setFont(new Font("Arial", Font.BOLD, 16));
		

		//create panelShowMovie
		JPanel panelShowMovie = new JPanel();
		panelShowMovie.setBounds(10, 91, 1246, 527);
		panelShowMovie.setBackground(prussianBlue);
		contentPane.add(panelShowMovie);
		panelShowMovie.setLayout(null);
		
		//create panelEyesOnMe
		JPanel panelEyesOnMe = new JPanel();
		panelEyesOnMe.setBackground(celadonBlue);
		panelEyesOnMe.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "EYES ON ME", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelEyesOnMe.setBounds(30, 67, 280, 439);
		panelShowMovie.add(panelEyesOnMe);
		panelEyesOnMe.setVisible(false);
		panelEyesOnMe.setLayout(null);
		
		//create llbPosyerEyesOnMe and put the image
		JLabel lblPosterEyesOnMe = new JLabel("");
		lblPosterEyesOnMe.setBounds(15, 15, 250, 350);
		panelEyesOnMe.add(lblPosterEyesOnMe);
		lblPosterEyesOnMe.setIcon(new ImageIcon(eyesOnMe));
		
		//create panelDrStrange
		JPanel panelDrStrange = new JPanel();
		panelDrStrange.setLayout(null);
		panelDrStrange.setBackground(celadonBlue);
		panelDrStrange.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "DOCTOR STRANGE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelDrStrange.setBounds(330, 67, 280, 439);
		panelShowMovie.add(panelDrStrange);
		panelDrStrange.setVisible(false);
		
		//create lblPosterDrStrange and put the image
		JLabel lblPosterDrStrange = new JLabel("");
		lblPosterDrStrange.setIcon(new ImageIcon(drStrange));
		lblPosterDrStrange.setBounds(15, 15, 250, 350);
		panelDrStrange.add(lblPosterDrStrange);
		
		//create panelTopGun
		JPanel panelTopGun = new JPanel();
		panelTopGun.setLayout(null);		
		panelTopGun.setBackground(celadonBlue);
		panelTopGun.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "TOP GUN MAVERICK", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelTopGun.setBounds(630, 67, 280, 439);
		panelShowMovie.add(panelTopGun);
		panelTopGun.setVisible(false);
		
		//create lblPosterTopGun and put the image
		JLabel lblPosterTopGun = new JLabel("");
		lblPosterTopGun.setIcon(new ImageIcon(topGun));
		lblPosterTopGun.setBounds(15, 15, 250, 350);
		panelTopGun.add(lblPosterTopGun);
		
		//create panelMinions
		JPanel panelMinions = new JPanel();
		panelMinions.setLayout(null);		
		panelMinions.setBackground(celadonBlue);
		panelMinions.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "MINIONS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelMinions.setBounds(930, 67, 280, 439);
		panelShowMovie.add(panelMinions);
		panelMinions.setVisible(false);
		
		//create lblPosterMinions and put the image
		JLabel lblPosterMinions = new JLabel("");
		lblPosterMinions.setIcon(new ImageIcon(minions));
		lblPosterMinions.setBounds(15, 15, 250, 350);
		panelMinions.add(lblPosterMinions);
		
		//create panelShowDate
		JPanel panelShowDate = new JPanel();
		panelShowDate.setBounds(302, 5, 608, 50);
		panelShowMovie.add(panelShowDate);
		panelShowDate.setBackground(celadonBlue);
		panelShowDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(241, 250, 238)), "DATE LIST", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(241, 250, 238)));
		panelShowDate.setLayout(null);

		//declare array for datePick
		String[] datePick= {null, incrementDate(0)
				, incrementDate(1)
				, incrementDate(2)
				, incrementDate(3)
				, incrementDate(4)
				, incrementDate(5)
				, incrementDate(6)
				, incrementDate(7)};
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		
		//create cbShowDate
		JComboBox cbShowDate = new JComboBox(datePick);
		cbShowDate.setBounds(145, 17, 274, 23);
		panelShowDate.add(cbShowDate);
		
		//create lblShowDate
		JLabel lblShowDate = new JLabel("");
		lblShowDate.setBounds(429, 17, 170, 23);
		lblShowDate.setForeground(honeydew);
		panelShowDate.add(lblShowDate);
		lblShowDate.setFont(new Font("Arial", Font.BOLD, 14));
		
		//create button confirm
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setBounds(10, 17, 115, 23);
		panelShowDate.add(btnConfirm);
		btnConfirm.setBackground(mint);
		btnConfirm.setForeground(prussianBlue);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String showDate = (String) cbShowDate.getSelectedItem();
				
				if(showDate != null) {
					
					panelEyesOnMe.setVisible(true);
					panelDrStrange.setVisible(true);
					panelTopGun.setVisible(true);
					panelMinions.setVisible(true);
					
					if(showDate.equals(incrementDate(0))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(0).getMonthValue();
						Days = LocalDateTime.now().plusDays(0).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(0).getHour();
						Minutes = LocalDateTime.now().plusDays(0).getMinute();

					} else if(showDate.equals(incrementDate(1))){
							
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(1).getMonthValue();
						Days = LocalDateTime.now().plusDays(1).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(1).getHour();
						Minutes = LocalDateTime.now().plusDays(1).getMinute();
						
					} else if(showDate.equals(incrementDate(2))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(2).getMonthValue();
						Days = LocalDateTime.now().plusDays(2).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(2).getHour();
						Minutes = LocalDateTime.now().plusDays(2).getMinute();
						
					} else if(showDate.equals(incrementDate(3))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(3).getMonthValue();
						Days = LocalDateTime.now().plusDays(3).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(3).getHour();
						Minutes = LocalDateTime.now().plusDays(3).getMinute();
						
					} else if(showDate.equals(incrementDate(4))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(4).getMonthValue();
						Days = LocalDateTime.now().plusDays(4).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(4).getHour();
						Minutes = LocalDateTime.now().plusDays(4).getMinute();
						
					} else if(showDate.equals(incrementDate(5))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(5).getMonthValue();
						Days = LocalDateTime.now().plusDays(5).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(5).getHour();
						Minutes = LocalDateTime.now().plusDays(5).getMinute();
						
					} else if(showDate.equals(incrementDate(6))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(6).getMonthValue();
						Days = LocalDateTime.now().plusDays(6).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(6).getHour();
						Minutes = LocalDateTime.now().plusDays(6).getMinute();
						
					} else if(showDate.equals(incrementDate(7))) {
						
						lblShowDate.setText(showDate);
						
						Months = LocalDateTime.now().plusDays(7).getMonthValue();
						Days = LocalDateTime.now().plusDays(7).getDayOfMonth();
						Hours = LocalDateTime.now().plusDays(7).getHour();
						Minutes = LocalDateTime.now().plusDays(7).getMinute();
					}
					
				} else {
					
					panelEyesOnMe.setVisible(false);
					panelDrStrange.setVisible(false);
					panelTopGun.setVisible(false);
					panelMinions.setVisible(false);
					
					lblShowDate.setText(null);
					JOptionPane.showMessageDialog(null, "Select date first !", "Date Missing", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		//create btnBookEyesOnMe
		JButton btnBookEyesOnMe = new JButton("BOOK NOW");
		btnBookEyesOnMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
				movie = "Eyes On Me: The Movie";
				Frame2 f2 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f2.show();
				dispose();
			}
		});
		
		btnBookEyesOnMe.setBounds(60, 375, 142, 44);
		btnBookEyesOnMe.setBackground(emerald);
		btnBookEyesOnMe.setForeground(honeydew);
		panelEyesOnMe.add(btnBookEyesOnMe);
		
		//create btnBookDrStrange
		JButton btnBookDrStrange = new JButton("BOOK NOW");
		btnBookDrStrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				movie = "Doctor Strange in the Multiverse of Madness";
				
				Frame2 f2 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f2.show();
				dispose();
			}
		});
		btnBookDrStrange.setBounds(60, 375, 142, 44);
		btnBookDrStrange.setBackground(emerald);
		btnBookDrStrange.setForeground(honeydew);
		panelDrStrange.add(btnBookDrStrange);
		
		//create btnBookTopGun
		JButton btnBookTopGun = new JButton("BOOK NOW");
		btnBookTopGun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				movie = "Top Gun: Maverick";
				
				Frame2 f2 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f2.show();
				dispose();
			}
		});
		btnBookTopGun.setBounds(60, 375, 142, 44);
		btnBookTopGun.setBackground(emerald);
		btnBookTopGun.setForeground(honeydew);
		panelTopGun.add(btnBookTopGun);
		
		//create btnBookMinions
		JButton btnBookMinions = new JButton("BOOK NOW");
		btnBookMinions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				movie = "Minions: The Rise of Gru";
				
				Frame2 f2 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f2.show();
				dispose();
			}
		});
		btnBookMinions.setBounds(60, 375, 142, 44);
		btnBookMinions.setBackground(emerald);
		btnBookMinions.setForeground(honeydew);
		panelMinions.add(btnBookMinions);
		
		//create btnLogOut
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setBackground(imperialRed);
		btnLogOut.setForeground(honeydew);
		btnLogOut.setBounds(10, 628, 94, 45);
		contentPane.add(btnLogOut);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//go to logIn frame
				Frame a = new Frame();
				a.show();
				dispose();
			}
		});
		
	}

	//method for upTime
	public void upTime(JLabel lblUpTime) {
		
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
					if (secondUptime <= 59) {
						secondUptime++;
					
						seconds = timeFormat.format(secondUptime);
						minutes = timeFormat.format(minuteUptime);
						hours = timeFormat.format(hourUptime);
						lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
					
						if(secondUptime == 60) {
					
							secondUptime = 0;
							minuteUptime++;
					
							seconds = timeFormat.format(secondUptime);
							minutes = timeFormat.format(minuteUptime);
							hours = timeFormat.format(hourUptime);
							lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
								
							if(minuteUptime == 60) {
								
								minuteUptime = 0;
								hourUptime++;
								
								seconds = timeFormat.format(secondUptime);
								minutes = timeFormat.format(minuteUptime);
								hours = timeFormat.format(hourUptime);
								lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
							}
						}
					}
			}
		});
	}
	
	//method for clock
	public void clock(JLabel lblClock) {
		
		clock = new Thread() {
			public void run() {
				try {
					while (true) {
						//Time Formating by SimpleDateFormat class
						Date date = new Date();
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
						SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyy");

						String stringTime = simpleDateFormat.format(date);

						//set date time inside the clock label
						lblClock.setText(stringTime);
						
						Thread.currentThread();
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
	}

	//method for incrementDate
	static public String incrementDate(int plus) {
	    return LocalDateTime.now()
	    		.plusDays(plus)
	    		.format(DateTimeFormatter
	    	    .ofPattern("d MMM uuuu EEEE"));
	  }
	
	//method for getCurrentDateTme
	public String getCurrentDateTime() {
	    return LocalDateTime.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	//method for getCurrentDate
	public String getCurrentDate() {
	    return LocalDate.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("d MMM uuuu EEEE"));
	}
	
	//method for getCurrentTime
	public String getCurrentTime() {
	    return LocalDateTime.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("HH:mm:ss"));
	}
	
	//main method
	public static void main(String [] args){
		
		Frame1 f1 = new Frame1(String);
		f1.show();
		
	}
	
}

