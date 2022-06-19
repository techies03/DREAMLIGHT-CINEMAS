import javax.swing.*;
import javax.swing.Timer;

import java.awt.*;
import java.lang.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.lang.*;
import java.time.*;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class Frame1 extends JFrame {

	private static final String String = null;
	private JPanel contentPane;
	
	Font font = new Font("Arial", Font.BOLD, 14);
	
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);
	
	Image eyesOnMe = new ImageIcon(this.getClass().getResource("/eyesOnMe.jpg")).getImage();
	Image drStrange = new ImageIcon(this.getClass().getResource("/drStrange.jpg")).getImage();
	Image topGun = new ImageIcon(this.getClass().getResource("/topGun.jpg")).getImage();
	Image minions = new ImageIcon(this.getClass().getResource("/minions.jpg")).getImage();

	JLabel lblDate = new JLabel("date");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	String showDate = null;
	String date = null;
	String movie = null;
	

	private int second = 0;
	private int minute = 0;
	private int hour = 0;
	private int plus = 0;
	String seconds, minutes, hours;
	Timer timer;
	Thread clock;
	DecimalFormat timeFormat = new DecimalFormat("00");
	
	String day1 = null;
	int Months = 0;
	int Days = 0;
	int Hours = 0;
	int Minutes = 0;

	
	double memberPrice = 0.00;
	
	double totalPriceKids = 0.00;
	double totalPriceStudent = 0.00;
	double totalPriceAdult = 0.00;
	double totalPriceEldery = 0.00;

	double priceKids = 0.00;
	double priceStudent = 0.00;
	double priceAdult = 0.00;
	double priceEldery = 0.00;
	

	
	
	public Frame1(String name) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(prussianBlue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panelClock = new JPanel();
		panelClock.setBounds(50, 10, 250, 57);
		panelClock.setBackground(celadonBlue);
		panelClock.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"CURRENT TIME", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		contentPane.add(panelClock);
		panelClock.setLayout(null);
		
		//__Digital Clock Method Using Thread Programming__//
		JLabel lblClock = new JLabel("clock");
		lblClock.setHorizontalAlignment(SwingConstants.CENTER);
		clock(lblClock);
		clock.start();
		lblClock.setForeground(honeydew);
		lblClock.setBounds(10, 10, 230, 37);
		panelClock.add(lblClock);
		lblClock.setFont(new Font("Arial", Font.BOLD, 16));
		
		
		JPanel panelDate = new JPanel();
		panelDate.setBounds(350, 10, 250, 57);
		panelDate.setBackground(celadonBlue);
		panelDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"DATE", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		contentPane.add(panelDate);
		panelDate.setLayout(null);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblDate.setText(getCurrentDate());
		lblDate.setForeground(honeydew);
		lblDate.setBounds(10, 10, 230, 37);
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		panelDate.add(lblDate);
		
		
		JPanel panelStaffName = new JPanel();
		panelStaffName.setBounds(650, 10, 250, 57);
		panelStaffName.setBackground(celadonBlue);
		panelStaffName.setLayout(null);
		panelStaffName.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
									"STAFF NAME", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		contentPane.add(panelStaffName);
		
		JLabel lblStaffName = new JLabel("staff name");
		lblStaffName.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaffName.setForeground(honeydew);
		lblStaffName.setBounds(10, 10, 230, 37);
		panelStaffName.add(lblStaffName);
		lblStaffName.setText(name);
		lblStaffName.setFont(new Font("Arial", Font.BOLD, 14));
		
		
		JPanel panelUptime = new JPanel();
		panelUptime.setBounds(950, 10, 250, 57);
		panelUptime.setBackground(celadonBlue);
		panelUptime.setLayout(null);
		panelUptime.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE),
								"UPTIME", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		contentPane.add(panelUptime);
		
		//stopwatch
		JLabel lblUpTime = new JLabel("");
		lblUpTime.setHorizontalAlignment(SwingConstants.CENTER);
		upTime(lblUpTime);
		timer.start();
		lblUpTime.setForeground(honeydew);
		lblUpTime.setBounds(10, 10, 230, 37);
		panelUptime.add(lblUpTime);
		lblUpTime.setText("00:00:00");
		lblUpTime.setFont(new Font("Arial", Font.BOLD, 16));
		

		
		JPanel panelShowMovie = new JPanel();
		panelShowMovie.setBounds(10, 91, 1246, 527);
		panelShowMovie.setBackground(prussianBlue);
		contentPane.add(panelShowMovie);
		panelShowMovie.setLayout(null);
		
		JPanel panelEyesOnMe = new JPanel();
		panelEyesOnMe.setBackground(celadonBlue);
		panelEyesOnMe.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"EYES ON ME", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelEyesOnMe.setBounds(30, 67, 280, 439);
		panelShowMovie.add(panelEyesOnMe);
		panelEyesOnMe.setVisible(false);
		panelEyesOnMe.setLayout(null);
		
		JLabel lblPosterEyesOnMe = new JLabel("");
		lblPosterEyesOnMe.setBounds(15, 15, 250, 350);
		panelEyesOnMe.add(lblPosterEyesOnMe);
		lblPosterEyesOnMe.setIcon(new ImageIcon(eyesOnMe));
		
		
		JPanel panelDrStrange = new JPanel();
		panelDrStrange.setLayout(null);
		panelDrStrange.setBackground(celadonBlue);
		panelDrStrange.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"DOCTOR STRANGE", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelDrStrange.setBounds(330, 67, 280, 439);
		panelShowMovie.add(panelDrStrange);
		panelDrStrange.setVisible(false);
		
		JLabel lblPosterDrStrange = new JLabel("");
		lblPosterDrStrange.setIcon(new ImageIcon(drStrange));
		lblPosterDrStrange.setBounds(15, 15, 250, 350);
		panelDrStrange.add(lblPosterDrStrange);
		
		
		JPanel panelTopGun = new JPanel();
		panelTopGun.setLayout(null);		
		panelTopGun.setBackground(celadonBlue);
		panelTopGun.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"TOP GUN MAVERICK", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelTopGun.setBounds(630, 67, 280, 439);
		panelShowMovie.add(panelTopGun);
		panelTopGun.setVisible(false);
		
		JLabel lblPosterTopGun = new JLabel("");
		lblPosterTopGun.setIcon(new ImageIcon(topGun));
		lblPosterTopGun.setBounds(15, 15, 250, 350);
		panelTopGun.add(lblPosterTopGun);
		
		
		JPanel panelMinions = new JPanel();
		panelMinions.setLayout(null);		
		panelMinions.setBackground(celadonBlue);
		panelMinions.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, Color.WHITE), 
								"MINIONS", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelMinions.setBounds(930, 67, 280, 439);
		panelShowMovie.add(panelMinions);
		panelMinions.setVisible(false);
		
		JLabel lblPosterMinions = new JLabel("");
		lblPosterMinions.setIcon(new ImageIcon(minions));
		lblPosterMinions.setBounds(15, 15, 250, 350);
		panelMinions.add(lblPosterMinions);
		
		
		JPanel panelShowDate = new JPanel();
		panelShowDate.setBounds(302, 5, 608, 50);
		panelShowMovie.add(panelShowDate);
		
		panelShowDate.setBackground(celadonBlue);
		panelShowDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.WHITE, honeydew), 
								"MOVIE LIST", TitledBorder.LEADING, TitledBorder.TOP, null, honeydew));
		panelShowDate.setLayout(null);

		String[] datePick= {null, incrementDate(0)
				, incrementDate(1)
				, incrementDate(2)
				, incrementDate(3)
				, incrementDate(4)
				, incrementDate(5)
				, incrementDate(6)
				, incrementDate(7)};
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox cbShowDate = new JComboBox(datePick);
		cbShowDate.setBounds(10, 17, 274, 20);
		panelShowDate.add(cbShowDate);
		

		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setBackground(mint);
		btnConfirm.setForeground(prussianBlue);
		btnConfirm.setBounds(310, 17, 96, 20);
		panelShowDate.add(btnConfirm);
		
		JLabel lblShowDate = new JLabel("");
		lblShowDate.setBounds(429, 17, 170, 20);
		lblShowDate.setForeground(honeydew);
		panelShowDate.add(lblShowDate);
		lblShowDate.setFont(new Font("Arial", Font.BOLD, 14));
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
		
		JButton btnBookEyesOnMe = new JButton("BOOK NOW");
		btnBookEyesOnMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
				movie = "Eyes On Me: The Movie";
				Frame2 f3 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f3.show();
				dispose();
			}
		});
		
		btnBookEyesOnMe.setBounds(60, 375, 142, 44);
		btnBookEyesOnMe.setBackground(emerald);
		btnBookEyesOnMe.setForeground(honeydew);
		panelEyesOnMe.add(btnBookEyesOnMe);
		
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
		
		JButton btnBookMinions = new JButton("BOOK NOW");
		btnBookMinions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				movie = "Minions: The Rise of Gru";
				
				Frame2 f3 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f3.show();
				dispose();
			}
		});
		btnBookMinions.setBounds(60, 375, 142, 44);
		btnBookMinions.setBackground(emerald);
		btnBookMinions.setForeground(honeydew);
		panelMinions.add(btnBookMinions);
		
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setBackground(imperialRed);
		btnLogOut.setForeground(honeydew);
		btnLogOut.setBounds(10, 628, 94, 45);
		contentPane.add(btnLogOut);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame a = new Frame();
				a.show();
				dispose();
			}
		});
		
	}

	public void upTime(JLabel lblUpTime) {
		
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
					if (second <= 59) {
						second++;
					
						seconds = timeFormat.format(second);
						minutes = timeFormat.format(minute);
						hours = timeFormat.format(hour);
						lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
					
						if(second == 60) {
					
							second = 0;
							minute++;
					
							seconds = timeFormat.format(second);
							minutes = timeFormat.format(minute);
							hours = timeFormat.format(hour);
							lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
								
							if(minute == 60) {
								
								minute = 0;
								hour++;
								
								seconds = timeFormat.format(second);
								minutes = timeFormat.format(minute);
								hours = timeFormat.format(hour);
								lblUpTime.setText(hours + ":" + minutes + ":" + seconds);
							}
						}
					}
			}
		});
	}
	
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

	static public String incrementDate(int plus) {
	    return LocalDateTime.now()
	    		.plusDays(plus)
	    		.format(DateTimeFormatter
	    	    .ofPattern("d MMM uuuu EEEE"));
	  }
	
	public String getCurrentDateTime() {
	    return LocalDateTime.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	public String getCurrentDate() {
	    return LocalDate.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("d MMM uuuu EEEE"));
	}
	
	public String getCurrentTime() {
	    return LocalDateTime.now()
	    		.format(DateTimeFormatter
	    		.ofPattern("HH:mm:ss"));
	}
	
	public static void main(String [] args){
		
		Frame1 f1 = new Frame1(String);
		f1.show();
		
	}
	
}

