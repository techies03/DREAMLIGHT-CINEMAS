import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	JButton btnJump = new JButton("");

	// declare color palette that I want to use
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);

	// main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// create class for Welcome
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(prussianBlue);
		panel.setBounds(10, 10, 663, 494);
		contentPane.add(panel);
		panel.setLayout(null);

		// uncomment utk add sneak peak
		// JLabel lblSneakPeak = new JLabel("");

		/*
		 * uncomment to add sneak peak
		 * lblSneakPeak.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override
		 * public void mouseClicked(MouseEvent e) {
		 * 
		 * btnJump.setVisible(true);
		 * }
		 * });
		 * lblSneakPeak.setBounds(256, 10, 207, 59);
		 * panel.add(lblSneakPeak);
		 */

		JLabel lblNewLabel = new JLabel("WELCOME TO DREAM LIGHT CINEMAS");
		lblNewLabel.setForeground(honeydew);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 10, 643, 67);
		panel.add(lblNewLabel);

		JTextPane txtpnAadsasdasdaAsdasdasd = new JTextPane();
		txtpnAadsasdasdaAsdasdasd.setFont(new Font("Arial", Font.BOLD, 15));
		txtpnAadsasdasdaAsdasdasd.setText(
				"NAME :  MOHAMMED MUQSIT BIN OSMAN\r\nID        : AM2111010440\r\n\r\nNAME : MUHAMMAD DANIAL ASYRAAF BIN JALALUDDIN\r\nID        : AM2111010451\r\n\r\nNAME : MUHAMAD KAMIL BIN MUHAMAD ZAIN\r\nID        : AM2111010444\r\n\r\nNAME : MUHAMMAD IRFAN BIN MOHD RIZAL\r\nID        : AM2111010462\r\n\r\nLECTURE : NOORNAJWA BINTI MD AMIN\r\nCOURSE CODE : SWC 2333 (OBJECT-ORIENTED PROGRAMMING)\r\nCOURSE  :  CC101\r\n\r\n**DREAMLIGHT**");
		txtpnAadsasdasdaAsdasdasd.setBounds(20, 87, 633, 337);
		panel.add(txtpnAadsasdasdaAsdasdasd);

		// create button Jump
		btnJump = new JButton("JUMP IN !");
		btnJump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// go to next frame
				Frame f = new Frame();
				f.show();
				dispose();
			}
		});

		// uncomment to add sneakpeak
		// btnJump.setVisible(false);
		btnJump.setBackground(emerald);
		btnJump.setForeground(honeydew);
		btnJump.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnJump.setBounds(217, 438, 183, 46);
		panel.add(btnJump);

	}
}
