import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.DropMode;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.print.PrinterJob;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame5 extends JFrame {

	private JPanel contentPane;
	
	String num = getRandBookingNum();

	
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);


	@SuppressWarnings("static-access")
	public Frame5(String name, String movie, int Months, int Days, int Hours, int Minutes, String showTime, String seat[][], int totalKids,
					int totalStudent, int totalAdult, int totalEldery, double movieClub) {
		
		
		Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 738);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelReciept = new JPanel();
		panelReciept.setBounds(10, 10, 516, 462);
		panelReciept.setLayout(null);
		contentPane.add(panelReciept);
		
		JLabel lblNewLabel_3 = new JLabel("HALL");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setText("HALL: " + "Onyx " + getRandomHallNum());
		lblNewLabel_3.setBounds(20, 170, 200, 32);
		panelReciept.add(lblNewLabel_3);
		
		JLabel lblBookingDate = new JLabel("");
		lblBookingDate.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblBookingDate.setText("DATE: " + getCurrentDate(Months, Days));
		lblBookingDate.setBounds(20, 112, 200, 32);
		panelReciept.add(lblBookingDate);
		
		JLabel lblShowTime = new JLabel("SHOW TIME");
		lblShowTime.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblShowTime.setText("SHOW TIME: " + showTime);
		lblShowTime.setBounds(20, 142, 200, 32);
		panelReciept.add(lblShowTime);
		
		JLabel lblSeat = new JLabel("SEAT SELECTED");
		lblSeat.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblSeat.setBounds(10, 350, 200, 32);
		panelReciept.add(lblSeat);
		
		JLabel lblNewLabel = new JLabel("Dreamlight Cinemas Kuala Lumpur");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 496, 48);
		panelReciept.add(lblNewLabel);
		
		JLabel lblMovieTitle = new JLabel("");
		lblMovieTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieTitle.setText(movie);
		lblMovieTitle.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblMovieTitle.setBounds(20, 46, 486, 39);
		panelReciept.add(lblMovieTitle);
		
		JLabel lblQrCode = new JLabel("");
		lblQrCode.setIcon(new ImageIcon("C:\\Users\\mrmuq\\OneDrive\\Documents\\Eclipse\\DREAMLIGHT CINEMAS\\Images\\qrCode_200x200.png"));
		lblQrCode.setBounds(288, 119, 200, 200);
		panelReciept.add(lblQrCode);
		
		JLabel lblKids = new JLabel("KIDS__________________________________");
		lblKids.setBounds(20, 226, 213, 32);
		panelReciept.add(lblKids);
		
		JLabel lblTotalKids = new JLabel("");
		lblTotalKids.setText(Integer.toString(totalKids));
		lblTotalKids.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalKids.setBounds(224, 226, 35, 32);
		panelReciept.add(lblTotalKids);
		
		JLabel lblStudent = new JLabel("STUDENT_____________________________");
		lblStudent.setBounds(20, 248, 213, 32);
		panelReciept.add(lblStudent);
		
		JLabel lblTotalStudent = new JLabel("");
		lblTotalStudent.setText(Integer.toString(totalStudent));
		lblTotalStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalStudent.setBounds(224, 248, 35, 32);
		panelReciept.add(lblTotalStudent);
		
		JLabel lblAdult = new JLabel("ADULT________________________________");
		lblAdult.setBounds(20, 268, 213, 32);
		panelReciept.add(lblAdult);
		
		JLabel lblTotalAdult = new JLabel("");
		lblTotalAdult.setText(Integer.toString(totalAdult));
		lblTotalAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAdult.setBounds(224, 268, 35, 23);
		panelReciept.add(lblTotalAdult);
		
		JLabel lblEldery = new JLabel("ELDERY_______________________________");
		lblEldery.setBounds(20, 290, 213, 32);
		panelReciept.add(lblEldery);
		
		JLabel lblTotalEldery = new JLabel("");
		lblTotalEldery.setText(Integer.toString(totalEldery));
		lblTotalEldery.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalEldery.setBounds(224, 290, 35, 23);
		panelReciept.add(lblTotalEldery);
		
		JLabel lblTotalCutomer = new JLabel("TOTAL________________________________");
		lblTotalCutomer.setBounds(20, 310, 213, 32);
		panelReciept.add(lblTotalCutomer);
		
		int totalAll = totalKids + totalStudent + totalAdult + totalEldery;
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setText(Integer.toString(totalAll));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(224, 310, 35, 23);
		panelReciept.add(lblTotal);
		
		JLabel lblBookingNum = new JLabel("");
		lblBookingNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingNum.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblBookingNum.setText("Booking Number " + num);
		lblBookingNum.setBounds(288, 95, 200, 32);
		panelReciept.add(lblBookingNum);
				
		
		JLabel lblSeatSelected = new JLabel("");
		lblSeatSelected.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSeatSelected.setText(f3.arraySeat(seat));
		lblSeatSelected.setBounds(10, 387, 478, 48);
		panelReciept.add(lblSeatSelected);
		
		JLabel lblComment = new JLabel("Flash your phone and jump the queue!");
		lblComment.setFont(new Font("Arial", Font.BOLD, 11));
		lblComment.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment.setBounds(287, 310, 219, 32);
		panelReciept.add(lblComment);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnNewButton.setBounds(0, 81, 74, 21);
		panelReciept.add(btnNewButton);
		
	


	}
	
	public static String getRandBookingNum() {
		
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random booking = new Random();
	    int number = booking.nextInt(999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%06d", number);
	}
	
	public static String getRandomHallNum() {
		
	    // It will generate 6 digit random Number.
	    // from 0 to 999999
	    Random hall = new Random();
	    int number = hall.nextInt(1, 9);

	    // this will convert any number sequence into 6 character.
	    return String.format("%01d", number);
	}
	
	public String getCurrentDate(int Months, int Days) {
	    return LocalDate.of(2022, Months, Days)
	    		.format(DateTimeFormatter
	    		.ofPattern("d MMM, uuuu"));
	}
}
