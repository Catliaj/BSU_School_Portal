package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class University_Vision extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.setProperty("sun.java2d.uiScale", "1"); // Adjust scaling
					System.setProperty("awt.useSystemAAFontSettings", "on");
					System.setProperty("swing.aatext", "true");
					System.setProperty("prism.lcdtext", "true");
					System.setProperty("prism.text", "t2k");
					System.setProperty("prism.subpixeltext", "true");
					University_Vision frame = new University_Vision();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public University_Vision() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1020, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("University Vision");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.BOLD, 96));
		lblNewLabel_1.setBounds(232, 20, 656, 96);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(255, 255, 255));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblLeadingInnovationsTransforming.setBounds(203, 637, 617, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblNewLabel_2 = new JLabel("A premier national university that develops leaders in");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBounds(92, 163, 818, 74);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("the global knowledge economy.");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1.setBounds(250, 203, 476, 74);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Patriotism");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1.setBounds(421, 328, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Service");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1.setBounds(442, 366, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Integrity");
		lblNewLabel_2_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_2.setBounds(431, 406, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Resillience");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1_1.setBounds(421, 452, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Excellence");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(421, 497, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Faith");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(453, 536, 170, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Core Values");
		lblNewLabel_2_1_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_3.setFont(new Font("Brush Script MT", Font.BOLD, 43));
		lblNewLabel_2_1_1_1_3.setBounds(396, 271, 265, 74);
		contentPane.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(University_Mission.class.getResource("/Resources/Mission_Backg.png")));
		lblNewLabel.setBounds(0, 0, 1006, 693);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
