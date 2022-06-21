import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//create class for Frame5
public class Frame5 extends JFrame {

	private JPanel contentPane;
	
	String num = getRandBookingNum();

	//declare color palette that I want to use
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);

	//create money formatter
	DecimalFormat df = new DecimalFormat("RM #0.00");
	
	//declare image that i want to use in this program
	Image qrCode = new ImageIcon(this.getClass().getResource("/qrCode.png")).getImage();



	@SuppressWarnings("static-access")
	public Frame5(String name, String movie, int Months, int Days, int Hours, int Minutes, String showTime, String seat[][], int totalKids,
					int totalStudent, int totalAdult, int totalEldery, double movieClub, double total) {
		
		
		Frame3 f3 = new Frame3(name, movie, Months, Days, Hours, Minutes, showTime);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 579);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelReciept = new JPanel();
		panelReciept.setBounds(10, 10, 516, 478);
		panelReciept.setLayout(null);
		contentPane.add(panelReciept);
		
		JLabel lblNewLabel_3 = new JLabel("HALL");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setText("HALL: " + "Onyx " + getRandomHallNum());
		lblNewLabel_3.setBounds(30, 190, 200, 32);
		panelReciept.add(lblNewLabel_3);
		
		JLabel lblBookingDate = new JLabel("");
		lblBookingDate.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBookingDate.setFont(new Font("Arial", Font.BOLD, 16));
		lblBookingDate.setText("DATE: " + getCurrentDate(Months, Days));
		lblBookingDate.setBounds(30, 132, 200, 32);
		panelReciept.add(lblBookingDate);
		
		JLabel lblShowTime = new JLabel("SHOW TIME");
		lblShowTime.setHorizontalAlignment(SwingConstants.TRAILING);
		lblShowTime.setFont(new Font("Arial", Font.BOLD, 16));
		lblShowTime.setText("SHOW TIME: " + showTime);
		lblShowTime.setBounds(30, 162, 200, 32);
		panelReciept.add(lblShowTime);
		
		JLabel lblPrice = new JLabel("HALL: Onyx 8");
		lblPrice.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPrice.setText("TOTAL: " + df.format(total));
		lblPrice.setFont(new Font("Arial", Font.BOLD, 16));
		lblPrice.setBounds(30, 221, 200, 32);
		panelReciept.add(lblPrice);
		
		JLabel lblSeat = new JLabel("SEAT SELECTED");
		lblSeat.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblSeat.setBounds(10, 389, 200, 32);
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
		lblMovieTitle.setBounds(20, 44, 486, 39);
		panelReciept.add(lblMovieTitle);
		
		JLabel lblQrCode = new JLabel("");
		lblQrCode.setIcon(new ImageIcon(qrCode));
		lblQrCode.setBounds(288, 156, 200, 200);
		panelReciept.add(lblQrCode);
		
		JLabel lblKids = new JLabel("KIDS__________________________________");
		lblKids.setBounds(10, 263, 213, 32);
		panelReciept.add(lblKids);
		
		JLabel lblTotalKids = new JLabel("");
		lblTotalKids.setText(Integer.toString(totalKids));
		lblTotalKids.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalKids.setBounds(214, 263, 35, 32);
		panelReciept.add(lblTotalKids);
		
		JLabel lblStudent = new JLabel("STUDENT_____________________________");
		lblStudent.setBounds(10, 285, 213, 32);
		panelReciept.add(lblStudent);
		
		JLabel lblTotalStudent = new JLabel("");
		lblTotalStudent.setText(Integer.toString(totalStudent));
		lblTotalStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalStudent.setBounds(214, 285, 35, 32);
		panelReciept.add(lblTotalStudent);
		
		JLabel lblAdult = new JLabel("ADULT________________________________");
		lblAdult.setBounds(10, 305, 213, 32);
		panelReciept.add(lblAdult);
		
		JLabel lblTotalAdult = new JLabel("");
		lblTotalAdult.setText(Integer.toString(totalAdult));
		lblTotalAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAdult.setBounds(214, 305, 35, 32);
		panelReciept.add(lblTotalAdult);
		
		JLabel lblEldery = new JLabel("ELDERY______________________________");
		lblEldery.setBounds(10, 327, 213, 32);
		panelReciept.add(lblEldery);
		
		JLabel lblTotalEldery = new JLabel("");
		lblTotalEldery.setText(Integer.toString(totalEldery));
		lblTotalEldery.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalEldery.setBounds(214, 327, 35, 32);
		panelReciept.add(lblTotalEldery);
		
		JLabel lblTotalCutomer = new JLabel("TOTAL________________________________");
		lblTotalCutomer.setBounds(10, 347, 213, 32);
		panelReciept.add(lblTotalCutomer);
		
		int totalAll = totalKids + totalStudent + totalAdult + totalEldery;
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setText(Integer.toString(totalAll));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(214, 347, 35, 32);
		panelReciept.add(lblTotal);
		
		JLabel lblBookingNum = new JLabel("");
		lblBookingNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingNum.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblBookingNum.setText("Booking Number " + num);
		lblBookingNum.setBounds(270, 132, 236, 32);
		panelReciept.add(lblBookingNum);
		
		

		JLabel lblSeatSelected = new JLabel("");
		lblSeatSelected.setText(f3.arraySeat(seat));
		lblSeatSelected.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSeatSelected.setBounds(10, 420, 478, 48);
		panelReciept.add(lblSeatSelected);
		
		JLabel lblComment = new JLabel("Flash your phone and jump the queue!");
		lblComment.setFont(new Font("Arial", Font.BOLD, 11));
		lblComment.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment.setBounds(287, 347, 219, 32);
		panelReciept.add(lblComment);
		
		JLabel lblCashierName = new JLabel("");
		lblCashierName.setText("CASHIER: " + name);
		lblCashierName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashierName.setFont(new Font("Arial", Font.BOLD, 16));
		lblCashierName.setBounds(30, 79, 458, 32);
		panelReciept.add(lblCashierName);
		
		
		JButton btnButton = new JButton("PRINT");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				printComponenet(panelReciept);
			}
		});
		btnButton.setBackground(emerald);
		btnButton.setForeground(honeydew);
		btnButton.setBounds(442, 495, 84, 44);
		contentPane.add(btnButton);
	

	}
	
	public void printComponenet(Component component){
		  PrinterJob pj = PrinterJob.getPrinterJob();
		  pj.setJobName(" Print Component ");

		  pj.setPrintable (new Printable() {    
		    public int print(Graphics pg, PageFormat pf, int pageNum){
		      if (pageNum > 0){
		      return Printable.NO_SUCH_PAGE;
		      }

		      Graphics2D g2 = (Graphics2D) pg;
		      g2.create(10, 10, 516, 462);
		      component.paint(g2);
		      return Printable.PAGE_EXISTS;
		    }
		  });
		  if (pj.printDialog() == false)
		  return;

		  try {
		        pj.print();
		  } catch (PrinterException ex) {
		        // handle exception
		  }
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
