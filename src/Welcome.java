import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Welcome extends JFrame {

	private JPanel contentPane;
	
	Color celadonBlue = new Color(69, 123, 157);
	Color prussianBlue = new Color(29, 53, 87);
	Color powderBlue = new Color(168, 218, 220);
	Color honeydew = new Color(241, 250, 238);
	Color imperialRed = new Color(230, 57, 70);
	Color emerald = new Color(64, 145, 108);
	Color mint = new Color(82, 183, 136);


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


	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 447);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
	}

}
