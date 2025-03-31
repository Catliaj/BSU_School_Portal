package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class University_Mission extends JFrame {

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
					University_Mission frame = new University_Mission();
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
	public University_Mission() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1020, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("University Mission");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.BOLD, 96));
		lblNewLabel_1.setBounds(232, 20, 656, 96);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(255, 255, 255));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblLeadingInnovationsTransforming.setBounds(203, 637, 617, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblNewLabel_2 = new JLabel("A university committed to producing leaders by ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBounds(139, 190, 741, 74);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("providing a 21st century learning environment");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1.setBounds(149, 237, 741, 74);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("through innovations in education, multidisciplinary");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1.setBounds(106, 282, 818, 74);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("research, and community and industry partnerships in");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1.setBounds(92, 329, 818, 74);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("order to nurture the spirit of nationhood, propel the");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1.setBounds(106, 376, 818, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("national economy, and engage the world for");
		lblNewLabel_2_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_2.setBounds(162, 425, 818, 74);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("sustainable development. ");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Lucida Fax", Font.BOLD, 27));
		lblNewLabel_2_1_1_1_1_1.setBounds(274, 473, 417, 74);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(University_Mission.class.getResource("/Resources/Mission_Backg.png")));
		lblNewLabel.setBounds(0, 0, 1006, 693);
		contentPane.add(lblNewLabel);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
