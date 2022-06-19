import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;




public class Frame3 extends JFrame {

	private static final String String = null;
	private JPanel contentPane;
	JLabel lblTotalCustomer = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("");
	JPanel panelInfo = new JPanel();
	JPanel panelMovieClub = new JPanel();
	JPanel panelCustomers = new JPanel();
	JRadioButton rdbtnNo = new JRadioButton("NO");

	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);
	
	Image singleBlack = new ImageIcon(this.getClass().getResource("/singleBlack.png")).getImage();
	Image singleRed = new ImageIcon(this.getClass().getResource("/singleRed.png")).getImage();

	double movieClub = 0.0;
	int totalCustomer = 0;
	int totalPerson = 0;
							//collumn
	String[][] seat = 	{	{"", "", "", "", "", "", ""},
							{"", "", "", "", "", "", ""},
								{"", "", "", "", "", "", ""},
						};
	
	int[][] seatValue = {	{0, 0, 0, 0, 0, 0, 0,},
							{0, 0, 0, 0, 0, 0, 0,},
							{0, 0, 0, 0, 0, 0, 0,},
						};

	private final ButtonGroup buttonGroup = new ButtonGroup();

	public Frame3(String name, String movie, int Months, int Days, int Hours, int Minutes, String showTime) {
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height/2 );
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(celadonBlue);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMovieTitle = new JPanel();
		panelMovieTitle.setLayout(null);
		panelMovieTitle.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "MOVIE TITLE", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelMovieTitle.setBackground(prussianBlue);
		panelMovieTitle.setBounds(50, 10, 370, 57);
		contentPane.add(panelMovieTitle);
		
		JLabel lblMovieTitle = new JLabel("");
		lblMovieTitle.setText(movie);
		lblMovieTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieTitle.setForeground(new Color(241, 250, 238));
		lblMovieTitle.setFont(new Font("Arial", Font.BOLD, 16));
		lblMovieTitle.setBounds(10, 10, 350, 37);
		panelMovieTitle.add(lblMovieTitle);
		
		JPanel panelBookingDate = new JPanel();
		panelBookingDate.setLayout(null);
		panelBookingDate.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "BOOKING DATE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelBookingDate.setBackground(prussianBlue);
		panelBookingDate.setBounds(433, 10, 250, 57);
		contentPane.add(panelBookingDate);
		
		JLabel lblBookingDate = new JLabel("");
		lblBookingDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingDate.setForeground(new Color(241, 250, 238));
		lblBookingDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblBookingDate.setBounds(10, 10, 230, 37);
		lblBookingDate.setText(getCurrentDate(Months, Days));
		panelBookingDate.add(lblBookingDate);
		
		JPanel panelHallType = new JPanel();
		panelHallType.setLayout(null);
		panelHallType.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "HALL TYPE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelHallType.setBackground(prussianBlue);
		panelHallType.setBounds(703, 10, 250, 57);
		contentPane.add(panelHallType);
		
		JLabel lblOnyx = new JLabel("ONYX");
		lblOnyx.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnyx.setForeground(new Color(241, 250, 238));
		lblOnyx.setFont(new Font("Arial", Font.BOLD, 14));
		lblOnyx.setBounds(10, 10, 230, 37);
		panelHallType.add(lblOnyx);
		
		JPanel panelShowTime = new JPanel();
		panelShowTime.setLayout(null);
		panelShowTime.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), "SHOW TIME", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(168, 218, 220)));
		panelShowTime.setBackground(prussianBlue);
		panelShowTime.setBounds(973, 10, 250, 57);
		contentPane.add(panelShowTime);
		
		JLabel lblShowTime = new JLabel("");
		lblShowTime.setText(showTime);
		lblShowTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowTime.setForeground(new Color(241, 250, 238));
		lblShowTime.setFont(new Font("Arial", Font.BOLD, 14));
		lblShowTime.setBounds(10, 10, 230, 37);
		panelShowTime.add(lblShowTime);
		
		panelInfo = new JPanel();
		panelInfo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, honeydew, honeydew),
								"INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, powderBlue));
		panelInfo.setBounds(893, 108, 330, 550);
		contentPane.add(panelInfo);
		panelInfo.setBackground(prussianBlue);
		panelInfo.setVisible(false);
		panelInfo.setLayout(null);
		
		JPanel panelSeatList = new JPanel();
		panelSeatList.setBackground(prussianBlue);
		panelSeatList.setBounds(50, 108, 833, 550);
		contentPane.add(panelSeatList);
		panelSeatList.setLayout(null);
		
		JPanel panelSeatPick = new JPanel();
		panelSeatPick.setBackground(celadonBlue);
		panelSeatPick.setBounds(63, 18, 685, 57);
		panelSeatList.add(panelSeatPick);
		panelSeatPick.setLayout(null);
		
		JTextArea txtSeatPick = new JTextArea();
		txtSeatPick.setFont(new Font("Arial Black", Font.BOLD, 11));
		txtSeatPick.setBounds(10, 10, 665, 37);
		panelSeatPick.add(txtSeatPick);
		
		JPanel panelScreen = new JPanel();
		panelScreen.setBounds(30, 101, 739, 16);
		panelScreen.setBackground(honeydew);
		panelSeatList.add(panelScreen);
		panelScreen.setLayout(null);
		
		JLabel lblScreen = new JLabel("S C R E E N");
		lblScreen.setFont(new Font("Arial", Font.BOLD, 10));
		lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreen.setBounds(10, 0, 719, 13);
		panelScreen.add(lblScreen);
		
		JButton btnConfirm = new JButton("COFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				totalCustomer = 0;
				
				for (int i = 0; i < seatValue.length; i++) { //row
					
				    for (int j = 0; j < seatValue[i].length; j++) { //column
				    	
				        totalCustomer += seatValue[i][j];
				    }
				}
				
				lblTotalCustomer.setText(Integer.toString(totalCustomer));
				

			
		        String txt = "";
		        for(int i = 0; i < seat.length; i++){
		        	
		            for(int c = 0; c < seat[i].length; c++){
		            	
		            	if(seat[i][c] != null) {
		            		
		            		txt += seat[i][c] + ", ";
		            		
		            	}

		            }
		            
		        }
		        
		        if(totalCustomer > 0) {
		        	
		        	txtSeatPick.setText(txt);
		        	panelMovieClub.setVisible(true);
		        	panelInfo.setVisible(true);
		        	
		        } else {
		        	
 					JOptionPane.showMessageDialog(btnConfirm, "Select your seat", "Missing Input", JOptionPane.ERROR_MESSAGE);
		        	panelMovieClub.setVisible(false);
		        	panelInfo.setVisible(false);
		        }
		        
			}	
		});
		
		btnConfirm.setForeground(honeydew);
		btnConfirm.setBackground(emerald);
		btnConfirm.setBounds(738, 493, 85, 47);
		panelSeatList.add(btnConfirm);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame2 f2 = new Frame2(name, movie, Months, Days, Hours, Minutes);
				f2.show();
				dispose();
			}
		});
		btnBack.setForeground(new Color(241, 250, 238));
		btnBack.setBackground(new Color(230, 57, 70));
		btnBack.setBounds(10, 493, 85, 47);
		panelSeatList.add(btnBack);
		
		btnClear.setBackground(imperialRed);
		btnClear.setForeground(honeydew);
		btnClear.setBounds(643, 493, 85, 47);
		panelSeatList.add(btnClear);
		
		JLabel lblA1 = new JLabel("");
		lblA1.setIcon(new ImageIcon(singleBlack));
		lblA1.setBounds(42, 164, 64, 64);
		panelSeatList.add(lblA1);
		
		JCheckBox chckbxA1 = new JCheckBox("");
		chckbxA1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source.equals(chckbxA1)) {
					
					seat[0][0] = "A1";
					seatValue[0][0] = 1;
					lblA1.setIcon(new ImageIcon(singleRed));
					
				}
				
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][0] = "";
					seatValue[0][0] = 0;
					lblA1.setIcon(new ImageIcon(singleBlack));
				}

				
			    	
			}
		});
		
		chckbxA1.setBackground(celadonBlue);
		chckbxA1.setBounds(63, 234, 21, 21);
		panelSeatList.add(chckbxA1);
		
		JLabel lblA2 = new JLabel("");
		lblA2.setIcon(new ImageIcon(singleBlack));
		lblA2.setBounds(116, 164, 64, 64);
		panelSeatList.add(lblA2);
		
		JCheckBox chckbxA2 = new JCheckBox("");
		chckbxA2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA2) {
					
					seat[0][1] = "A2";
					seatValue[0][1] = 1;
					lblA2.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][1] = "";
					seatValue[0][1] = 0;
					lblA2.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxA2.setBackground(celadonBlue);
		chckbxA2.setBounds(137, 234, 21, 21);
		panelSeatList.add(chckbxA2);
		
		JLabel lblA3 = new JLabel("");
		lblA3.setIcon(new ImageIcon(singleBlack));
		lblA3.setBounds(280, 164, 64, 64);
		panelSeatList.add(lblA3);
		
		JCheckBox chckbxA3 = new JCheckBox("");
		chckbxA3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA3) {
					
					seat[0][2] = "A3";
					seatValue[0][2] = 1;
					lblA3.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][2] = "";
					seatValue[0][2] = 0;
					lblA3.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxA3.setBackground(celadonBlue);
		chckbxA3.setBounds(302, 234, 21, 21);
		panelSeatList.add(chckbxA3);
		
		JLabel lblA4 = new JLabel("");
		lblA4.setIcon(new ImageIcon(singleBlack));
		lblA4.setBounds(354, 164, 64, 64);
		panelSeatList.add(lblA4);
		
		JCheckBox chckbxA4 = new JCheckBox("");
		chckbxA4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA4) {
					
					seat[0][3] = "A4";
					seatValue[0][3] = 1;
					lblA4.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][3] = "";
					seatValue[0][3] = 0;
					lblA4.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxA4.setBackground(celadonBlue);
		chckbxA4.setBounds(376, 234, 21, 21);
		panelSeatList.add(chckbxA4);
		
		JLabel lblA5 = new JLabel("");
		lblA5.setIcon(new ImageIcon(singleBlack));
		lblA5.setBounds(428, 164, 64, 64);
		panelSeatList.add(lblA5);
		
		JCheckBox chckbxA5 = new JCheckBox("");
		chckbxA5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA5) {
					
					seat[0][4] = "A5";
					seatValue[0][4] = 1;
					lblA5.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][4] = "";
					seatValue[0][4] = 0;
					lblA5.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxA5.setBackground(celadonBlue);
		chckbxA5.setBounds(451, 234, 21, 21);
		panelSeatList.add(chckbxA5);
		
		JLabel lblA6 = new JLabel("");
		lblA6.setIcon(new ImageIcon(singleBlack));
		lblA6.setBounds(580, 164, 64, 64);
		panelSeatList.add(lblA6);
		
		JCheckBox chckbxA6 = new JCheckBox("");
		chckbxA6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA6) {
					
					seat[0][5] = "A6";
					seatValue[0][5] = 1;
					lblA6.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][5] = "";
					seatValue[0][5] = 0;
					lblA6.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		
		chckbxA6.setBackground(celadonBlue);
		chckbxA6.setBounds(603, 234, 21, 21);
		panelSeatList.add(chckbxA6);
		
		JLabel lblA7 = new JLabel("");
		lblA7.setIcon(new ImageIcon(singleBlack));
		lblA7.setBounds(654, 164, 64, 64);
		panelSeatList.add(lblA7);
		
		JCheckBox chckbxA7 = new JCheckBox("");
		chckbxA7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxA7) {
					
					seat[0][6] = "A7";
					seatValue[0][6] = 1;
					lblA7.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[0][6] = "";
					seatValue[0][6] = 0;
					lblA7.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxA7.setBackground(celadonBlue);
		chckbxA7.setBounds(675, 234, 21, 21);
		panelSeatList.add(chckbxA7);
		
		JLabel lblB1 = new JLabel("");
		lblB1.setIcon(new ImageIcon(singleBlack));
		lblB1.setBounds(42, 261, 64, 64);
		panelSeatList.add(lblB1);
		
		JCheckBox chckbxB1 = new JCheckBox("");
		chckbxB1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB1) {
					
					seat[1][0] = "B1";
					seatValue[1][0] = 1;
					lblB1.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][0] = "";
					seatValue[1][0] = 0;
					lblB1.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB1.setBackground(celadonBlue);
		chckbxB1.setBounds(63, 331, 21, 21);
		panelSeatList.add(chckbxB1);
		
		JLabel lblB2 = new JLabel("");
		lblB2.setIcon(new ImageIcon(singleBlack));
		lblB2.setBounds(116, 261, 64, 64);
		panelSeatList.add(lblB2);
		
		JCheckBox chckbxB2 = new JCheckBox("");
		chckbxB2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB2) {
					
					seat[1][1] = "B2";
					seatValue[1][1] = 1;
					lblB2.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][1] = "";
					seatValue[1][1] = 0;
					lblB2.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB2.setBackground(celadonBlue);
		chckbxB2.setBounds(137, 331, 21, 21);
		panelSeatList.add(chckbxB2);
		
		JLabel lblB3 = new JLabel("");
		lblB3.setIcon(new ImageIcon(singleBlack));
		lblB3.setBounds(280, 261, 64, 64);
		panelSeatList.add(lblB3);
		
		JCheckBox chckbxB3 = new JCheckBox("");
		chckbxB3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB3) {
					
					seat[1][2] = "B3";
					seatValue[1][2] = 1;
					lblB3.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][2] = "";
					seatValue[1][2] = 0;
					lblB3.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB3.setBackground(celadonBlue);
		chckbxB3.setBounds(302, 331, 21, 21);
		panelSeatList.add(chckbxB3);
		
		JLabel lblB4 = new JLabel("");
		lblB4.setIcon(new ImageIcon(singleBlack));
		lblB4.setBounds(354, 261, 64, 64);
		panelSeatList.add(lblB4);
		
		JCheckBox chckbxB4 = new JCheckBox("");
		chckbxB4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB4) {
					
					seat[1][3] = "B4";
					seatValue[1][3] = 1;
					lblB4.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][3] = "";
					seatValue[1][3] = 0;
					lblB4.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB4.setBackground(celadonBlue);
		chckbxB4.setBounds(376, 331, 21, 21);
		panelSeatList.add(chckbxB4);
		
		JLabel lblB5 = new JLabel("");
		lblB5.setIcon(new ImageIcon(singleBlack));
		lblB5.setBounds(428, 261, 64, 64);
		panelSeatList.add(lblB5);
		
		JCheckBox chckbxB5 = new JCheckBox("");
		chckbxB5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB5) {
					
					seat[1][4] = "B5";
					seatValue[1][4] = 1;
					lblB5.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][4] = "";
					seatValue[1][4] = 0;
					lblB5.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB5.setBackground(celadonBlue);
		chckbxB5.setBounds(451, 331, 21, 21);
		panelSeatList.add(chckbxB5);
		
		JLabel lblB6 = new JLabel("");
		lblB6.setIcon(new ImageIcon(singleBlack));
		lblB6.setBounds(580, 261, 64, 64);
		panelSeatList.add(lblB6);
		
		JCheckBox chckbxB6 = new JCheckBox("");
		chckbxB6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB6) {
					
					seat[1][5] = "B6";
					seatValue[1][5] = 1;
					lblB6.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][5] = "";
					seatValue[1][5] = 0;
					lblB6.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB6.setBackground(celadonBlue);
		chckbxB6.setBounds(603, 331, 21, 21);
		panelSeatList.add(chckbxB6);
		
		JLabel lblB7 = new JLabel("");
		lblB7.setIcon(new ImageIcon(singleBlack));
		lblB7.setBounds(654, 261, 64, 64);
		panelSeatList.add(lblB7);
		
		JCheckBox chckbxB7 = new JCheckBox("");
		chckbxB7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxB7) {
					
					seat[1][6] = "B7";
					seatValue[1][6] = 1;
					lblB7.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[1][6] = "";
					seatValue[1][6] = 0;
					lblB7.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxB7.setBackground(celadonBlue);
		chckbxB7.setBounds(675, 331, 21, 21);
		panelSeatList.add(chckbxB7);
		
		JLabel lblC1 = new JLabel("");
		lblC1.setIcon(new ImageIcon(singleBlack));
		lblC1.setBounds(42, 358, 64, 64);
		panelSeatList.add(lblC1);
		
		JCheckBox chckbxC1 = new JCheckBox("");
		chckbxC1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC1) {
					
					seat[2][0] = "C1";
					seatValue[2][0] = 1;
					lblC1.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][0] = "";
					seatValue[2][0] = 0;
					lblC1.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		
		chckbxC1.setBackground(celadonBlue);
		chckbxC1.setBounds(63, 428, 21, 21);
		panelSeatList.add(chckbxC1);
		
		JLabel lblC2 = new JLabel("");
		lblC2.setIcon(new ImageIcon(singleBlack));
		lblC2.setBounds(116, 358, 64, 64);
		panelSeatList.add(lblC2);
		
		JCheckBox chckbxC2 = new JCheckBox("");
		chckbxC2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC2) {
					
					seat[2][1] = "C2";
					seatValue[2][1] = 1;
					lblC2.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][1] = "";
					seatValue[2][1] = 0;
					lblC2.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxC2.setBackground(celadonBlue);
		chckbxC2.setBounds(137, 428, 21, 21);
		panelSeatList.add(chckbxC2);
		
		JLabel lblC3 = new JLabel("");
		lblC3.setIcon(new ImageIcon(singleBlack));
		lblC3.setBounds(280, 358, 64, 64);
		panelSeatList.add(lblC3);
		
		JCheckBox chckbxC3 = new JCheckBox("");
		chckbxC3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC3) {
					
					seat[2][2] = "C3";
					seatValue[2][2] = 1;
					lblC3.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][2] = "";
					seatValue[2][2] = 0;
					lblC3.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		
		chckbxC3.setBackground(celadonBlue);
		chckbxC3.setBounds(302, 428, 21, 21);
		panelSeatList.add(chckbxC3);
		
		JLabel lblC4 = new JLabel("");
		lblC4.setIcon(new ImageIcon(singleBlack));
		lblC4.setBounds(354, 358, 64, 64);
		panelSeatList.add(lblC4);
		
		JCheckBox chckbxC4 = new JCheckBox("");
		chckbxC4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC4) {
					
					seat[2][3] = "C4";
					seatValue[2][3] = 1;
					lblC4.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][3] = "";
					seatValue[2][3] = 0;
					lblC4.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxC4.setBackground(celadonBlue);
		chckbxC4.setBounds(376, 428, 21, 21);
		panelSeatList.add(chckbxC4);
		
		JLabel lblC5 = new JLabel("");
		lblC5.setIcon(new ImageIcon(singleBlack));
		lblC5.setBounds(428, 358, 64, 64);
		panelSeatList.add(lblC5);
		
		JCheckBox chckbxC5 = new JCheckBox("");
		chckbxC5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC5) {
					
					seat[2][4] = "C5";
					seatValue[2][4] = 1;
					lblC5.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][4] = "";
					seatValue[2][4] = 0;
					lblC5.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxC5.setBackground(celadonBlue);
		chckbxC5.setBounds(451, 428, 21, 21);
		panelSeatList.add(chckbxC5);
		
		JLabel lblC6 = new JLabel("");
		lblC6.setIcon(new ImageIcon(singleBlack));
		lblC6.setBounds(580, 358, 64, 64);
		panelSeatList.add(lblC6);
		
		JCheckBox chckbxC6 = new JCheckBox("");
		chckbxC6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC6) {
					
					seat[2][5] = "C6";
					seatValue[2][5] = 1;
					lblC6.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][5] = "";
					seatValue[2][5] = 0;
					lblC6.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxC6.setBackground(celadonBlue);
		chckbxC6.setBounds(605, 428, 21, 21);
		panelSeatList.add(chckbxC6);
		
		JLabel lblC7 = new JLabel("");
		lblC7.setIcon(new ImageIcon(singleBlack));
		lblC7.setBounds(654, 358, 64, 64);
		panelSeatList.add(lblC7);
		
		JCheckBox chckbxC7 = new JCheckBox("");
		chckbxC7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Object source = e.getItemSelectable();
				
				if(source == chckbxC7) {
					
					seat[2][6] = "C7";
					seatValue[2][6] = 1;
					lblC7.setIcon(new ImageIcon(singleRed));
					
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					
					seat[2][6] = "";
					seatValue[2][6] = 0;
					lblC7.setIcon(new ImageIcon(singleBlack));
				}
			}
		});
		chckbxC7.setBackground(celadonBlue);
		chckbxC7.setBounds(675, 428, 21, 21);
		panelSeatList.add(chckbxC7);
		
		panelMovieClub = new JPanel();
		panelMovieClub.setLayout(null);
		panelMovieClub.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160))
								, "MOVIE CLUB", TitledBorder.LEADING, TitledBorder.TOP, null, honeydew));
		panelMovieClub.setBounds(10, 80, 310, 103);
		panelMovieClub.setBackground(celadonBlue);
		panelMovieClub.setVisible(false);
		panelInfo.add(panelMovieClub);
		
		JRadioButton rdbtnYes = new JRadioButton("YES");
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnYes.isSelected()) {
					
					panelCustomers.setVisible(true);
					movieClub = 0.15;
					
				}
			}
		});

		rdbtnYes.setBackground(celadonBlue);
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(91, 62, 54, 21);
		panelMovieClub.add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("NO");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnNo.isSelected()){
					
					panelCustomers.setVisible(true);
					movieClub = 0.0;
				}
			}
		});
		rdbtnNo.setBackground(celadonBlue);
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(166, 62, 54, 21);
		panelMovieClub.add(rdbtnNo);
		
		JLabel lblMovieClub = new JLabel("MOVIE CLUB");
		lblMovieClub.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieClub.setForeground(honeydew);
		lblMovieClub.setFont(new Font("Arial", Font.BOLD, 14));
		lblMovieClub.setBounds(10, 16, 290, 40);
		panelMovieClub.add(lblMovieClub);
		
		panelCustomers = new JPanel();
		panelCustomers.setLayout(null);		
		panelCustomers.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160))
								, "CUSTOMERS", TitledBorder.LEADING, TitledBorder.TOP, null, honeydew));
		panelCustomers.setBackground(celadonBlue);
		panelCustomers.setBounds(10, 224, 310, 235);
		panelCustomers.setVisible(false);
		panelInfo.add(panelCustomers);
		
		JLabel lblKids = new JLabel("KIDS");
		lblKids.setForeground(honeydew);
		lblKids.setBounds(10, 20, 147, 33);
		panelCustomers.add(lblKids);
		
		SpinnerModel plusKids = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerKids = new JSpinner(plusKids);
		spinnerKids.setBounds(247, 20, 39, 30);
		panelCustomers.add(spinnerKids);
		
		JLabel lblStudent = new JLabel("STUDENT");
		lblStudent.setForeground(honeydew);
		lblStudent.setBounds(10, 55, 147, 33);
		panelCustomers.add(lblStudent);
		
		SpinnerModel plusStudent = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerStudent = new JSpinner(plusStudent);
		spinnerStudent.setBounds(247, 55, 39, 30);
		panelCustomers.add(spinnerStudent);
		
		JLabel lblAdult = new JLabel("ADULT");
		lblAdult.setForeground(honeydew);
		lblAdult.setBounds(10, 88, 147, 33);
		panelCustomers.add(lblAdult);
		
		SpinnerModel plusAdult = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerAdult = new JSpinner(plusAdult);
		spinnerAdult.setBounds(247, 90, 39, 30);
		panelCustomers.add(spinnerAdult);
		
		JLabel lblEldery = new JLabel("ELDERY");
		lblEldery.setForeground(honeydew);
		lblEldery.setBounds(10, 121, 147, 33);
		panelCustomers.add(lblEldery);
		
		SpinnerModel plusEldery = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerEldery = new JSpinner(plusEldery);
		spinnerEldery.setBounds(247, 125, 39, 30);
		panelCustomers.add(spinnerEldery);
		
		JPanel panelTotalCustomer = new JPanel();
		panelTotalCustomer.setLayout(null);
		panelTotalCustomer.setBorder(new TitledBorder(null, "TOTAL CUSTOMER", TitledBorder.LEADING, TitledBorder.TOP, null, honeydew));
		panelTotalCustomer.setBackground(celadonBlue);
		panelTotalCustomer.setBounds(10, 164, 290, 61);
		panelCustomers.add(panelTotalCustomer);
		
		JButton btnApply = new JButton("APPLY");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalKids = (int) spinnerKids.getValue();
				int totalStudent = (int) spinnerStudent.getValue();
				int totalAdult = (int) spinnerAdult.getValue();
				int totalEldery = (int) spinnerEldery.getValue();

				int inputCustomer = totalKids + totalStudent + totalAdult + totalEldery;
				int customer = 0;
				
				if (inputCustomer == totalCustomer) {
										
			        if(seat != null) {
	            		
			            Frame4 f4 = new Frame4(name, movie, Months, Days, Hours, Minutes, showTime, seat, totalKids, totalStudent, totalAdult, totalEldery, movieClub);
			            f4.show();
			            dispose();
			            		
			        }
					
					
				} else if(inputCustomer < totalCustomer) {
					
					customer = totalCustomer - inputCustomer;
					JOptionPane.showMessageDialog(btnApply, "Mising " + customer + " person", "Underload", JOptionPane.ERROR_MESSAGE);
					spinnerReset(inputCustomer, spinnerKids, spinnerStudent, spinnerAdult, spinnerEldery);

					
				} else {
					
					customer = inputCustomer - totalCustomer;
					JOptionPane.showMessageDialog(null, "Total customers has exceed by " + customer + " person", "Overload", JOptionPane.ERROR_MESSAGE);
					spinnerReset(inputCustomer, spinnerKids, spinnerStudent, spinnerAdult, spinnerEldery);

				}
				
  	
				
			}
		});
		
		btnApply.setBackground(emerald);
		btnApply.setForeground(honeydew);
		btnApply.setBounds(10, 20, 79, 31);
		panelTotalCustomer.add(btnApply);
		
		lblTotalCustomer = new JLabel("");
		lblTotalCustomer.setForeground(prussianBlue);
		lblTotalCustomer.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblTotalCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalCustomer.setBounds(236, 12, 44, 39);
		panelTotalCustomer.add(lblTotalCustomer);
		

	}
	



	public String getCurrentDate(int Months, int Days) {
	    return LocalDate.of(2022, Months, Days)
	    		.format(DateTimeFormatter
	    		.ofPattern("d MMM uuuu (EEEE)"));
	}
	
	public String getCurrentTime(int Hours, int Minutes) {
	    return LocalTime.of(Hours, Minutes)
	    		.format(DateTimeFormatter
	    		.ofPattern("HH:mm"));
	}
	
	public void spinnerReset(int inputCustomer, JSpinner spinnerKids, JSpinner spinnerStudent, JSpinner spinnerAdult, JSpinner spinnerEldery) {
		
		inputCustomer = 0;
		spinnerKids.setValue(0);
		spinnerStudent.setValue(0);
		spinnerAdult.setValue(0);
		spinnerEldery.setValue(0);
	}
}

