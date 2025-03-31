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
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import Controller.Education_Leadership_LoginController;
public class Registrar_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;
	public JButton SignIn_btn;

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
					Registrar_Login frame = new Registrar_Login();
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
	
	
	public Registrar_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bsulbl = new JLabel("BATANGAS STATE UNIVERSITY");
		bsulbl.setForeground(new Color(239, 238, 233));
		bsulbl.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		bsulbl.setBounds(134, 0, 609, 52);
		contentPane.add(bsulbl);
		
		JLabel lblTNEU = new JLabel("THE NATIONAL ENGINEERING UNIVERSITY");
		lblTNEU.setForeground(new Color(239, 238, 233));
		lblTNEU.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lblTNEU.setBounds(134, 33, 609, 52);
		contentPane.add(lblTNEU);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(2, 78, 2));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLeadingInnovationsTransforming.setBounds(134, 90, 505, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblProgramChair = new JLabel("REGISTRAR");
		lblProgramChair.setForeground(new Color(2, 78, 2));
		lblProgramChair.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblProgramChair.setBounds(251, 153, 398, 52);
		contentPane.add(lblProgramChair);
		
		JLabel usernamelbl = new JLabel("Username:");
		usernamelbl.setForeground(Color.BLACK);
		usernamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		usernamelbl.setBounds(270, 272, 78, 36);
		contentPane.add(usernamelbl);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(2, 78, 2), 3));
		textField.setBackground(new Color(239, 238, 233));
		textField.setBounds(270, 303, 244, 35);
		contentPane.add(textField);
		
		JLabel passwordlbl = new JLabel("Password:");
		passwordlbl.setForeground(Color.BLACK);
		passwordlbl.setFont(new Font("Arial", Font.BOLD, 14));
		passwordlbl.setBounds(270, 343, 78, 36);
		contentPane.add(passwordlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(2, 78, 2), 3));
		passwordField.setBackground(new Color(239, 238, 233));
		passwordField.setBounds(270, 372, 243, 35);
		contentPane.add(passwordField);
		
		SignIn_btn = new JButton("SIGN IN");
		SignIn_btn.setForeground(new Color(239, 238, 233));
		SignIn_btn.setFont(new Font("Arial", Font.BOLD, 18));
		SignIn_btn.setBorder(new LineBorder(new Color(2, 78, 2), 4));
		SignIn_btn.setBackground(new Color(0, 128, 0));
		SignIn_btn.setBounds(323, 445, 137, 45);
		contentPane.add(SignIn_btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registrar_Login.class.getResource("/Resources/Registrar_Login.png")));
		lblNewLabel.setBounds(0, 0, 771, 583);
		contentPane.add(lblNewLabel);
		
	    Education_Leadership_LoginController elc = new Education_Leadership_LoginController(null, null, this);
	    SignIn_btn.addActionListener(elc);
	}

}
