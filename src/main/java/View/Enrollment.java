package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Enrollment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enrollment frame = new Enrollment();
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
	public Enrollment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enrollment");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.BOLD, 96));
		lblNewLabel_1.setBounds(353, 10, 428, 96);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("PROSPECTUS");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnNewButton.setBounds(380, 199, 365, 45);
		contentPane.add(btnNewButton);
		
		JButton btnProgramOfStudy = new JButton("PROGRAM OF STUDY");
		btnProgramOfStudy.setBackground(new Color(255, 255, 255));
		btnProgramOfStudy.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnProgramOfStudy.setBounds(269, 312, 365, 45);
		contentPane.add(btnProgramOfStudy);
		
		JButton btnProposalSlip = new JButton("PROPOSAL SLIP");
		btnProposalSlip.setBackground(new Color(255, 255, 255));
		btnProposalSlip.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnProposalSlip.setBounds(380, 429, 365, 45);
		contentPane.add(btnProposalSlip);
		
		JButton btnProgramOfStudy_1_1 = new JButton("ADDING, CHANGING OF SUBJECTS");
		btnProgramOfStudy_1_1.setBackground(new Color(255, 255, 255));
		btnProgramOfStudy_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnProgramOfStudy_1_1.setBounds(269, 558, 365, 45);
		contentPane.add(btnProgramOfStudy_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Enrollment.class.getResource("/Resources/Enrollment_Backg.png")));
		lblNewLabel.setBounds(0, 0, 1006, 700);
		contentPane.add(lblNewLabel);
	}

}
