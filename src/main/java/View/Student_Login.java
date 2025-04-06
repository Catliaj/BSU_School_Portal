package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import Controller.StudentLoginController;
import Controller.LogInMenuController;

public class Student_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;
	public JButton SignIn_btn;
	public JButton Register_btn;
    
	

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

					Student_Login frame = new Student_Login();
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
	public Student_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usernamelbl = new JLabel("Username:");
		usernamelbl.setForeground(Color.BLACK);
		usernamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		usernamelbl.setBounds(465, 140, 78, 36);
		contentPane.add(usernamelbl);
		
		JLabel lblStudentPortal = new JLabel("STUDENT PORTAL");
		lblStudentPortal.setForeground(new Color(79, 15, 15));
		lblStudentPortal.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblStudentPortal.setBounds(9, 211, 446, 52);
		contentPane.add(lblStudentPortal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		textField.setBackground(new Color(239, 238, 233));
		textField.setBounds(465, 171, 244, 35);
		contentPane.add(textField);
		
		JLabel passwordlbl = new JLabel("Password:");
		passwordlbl.setForeground(Color.BLACK);
		passwordlbl.setFont(new Font("Arial", Font.BOLD, 14));
		passwordlbl.setBounds(465, 211, 78, 36);
		contentPane.add(passwordlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		passwordField.setBackground(new Color(239, 238, 233));
		passwordField.setBounds(465, 240, 243, 35);
		contentPane.add(passwordField);
		
		SignIn_btn = new JButton("SIGN IN");
		SignIn_btn.setForeground(new Color(239, 238, 233));
		SignIn_btn.setFont(new Font("Arial", Font.BOLD, 18));
		SignIn_btn.setBorder(new LineBorder(new Color(79, 15, 15), 4));
		SignIn_btn.setBackground(new Color(200, 57, 40));
		SignIn_btn.setBounds(518, 313, 137, 45);
	
		contentPane.add(SignIn_btn);
		
	    Register_btn = new JButton("EXIT");
		Register_btn.setForeground(new Color(239, 238, 233));
		Register_btn.setFont(new Font("Arial", Font.BOLD, 18));
		Register_btn.setBorder(new LineBorder(new Color(79, 15, 15), 4));
		Register_btn.setBackground(new Color(200, 57, 40));
		Register_btn.setBounds(518, 368, 137, 45);
		contentPane.add(Register_btn);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(79, 15, 15));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLeadingInnovationsTransforming.setBounds(10, 119, 377, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblBatangasState = new JLabel("BATANGAS STATE");
		lblBatangasState.setForeground(new Color(239, 238, 233));
		lblBatangasState.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblBatangasState.setBounds(133, 10, 344, 52);
		contentPane.add(lblBatangasState);
		
		JLabel lblUniversity = new JLabel("UNIVERSITY");
		lblUniversity.setForeground(new Color(239, 238, 233));
		lblUniversity.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblUniversity.setBounds(133, 47, 344, 52);
		contentPane.add(lblUniversity);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Student_Login.class.getResource("/Resources/Student_Background.png")));
		lblNewLabel.setBounds(0, 0, 771, 583);
		contentPane.add(lblNewLabel);
		
		// Controller
		StudentLoginController studentLoginController = new StudentLoginController(this);
		SignIn_btn.addActionListener(studentLoginController);
		
		LogInMenuController exit = new LogInMenuController(this);
		Register_btn.addActionListener(exit);
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
