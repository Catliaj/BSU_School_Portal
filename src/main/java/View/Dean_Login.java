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
public class Dean_Login extends JFrame {

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
					Dean_Login frame = new Dean_Login();
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
	public Dean_Login() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bsulbl = new JLabel("BATANGAS STATE UNIVERSITY");
		bsulbl.setForeground(new Color(239, 238, 233));
		bsulbl.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		bsulbl.setBounds(135, 0, 609, 52);
		contentPane.add(bsulbl);
		
		JLabel lblTNEU = new JLabel("THE NATIONAL ENGINEERING UNIVERSITY");
		lblTNEU.setForeground(new Color(239, 238, 233));
		lblTNEU.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lblTNEU.setBounds(135, 33, 609, 52);
		contentPane.add(lblTNEU);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(147, 55, 5));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLeadingInnovationsTransforming.setBounds(135, 89, 505, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblDean = new JLabel("DEAN");
		lblDean.setForeground(new Color(147, 55, 5));
		lblDean.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblDean.setBounds(325, 152, 158, 52);
		contentPane.add(lblDean);
		
		JLabel usernamelbl = new JLabel("Username:");
		usernamelbl.setForeground(Color.BLACK);
		usernamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		usernamelbl.setBounds(272, 267, 78, 36);
		contentPane.add(usernamelbl);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(147, 55, 5), 3));
		textField.setBackground(new Color(239, 238, 233));
		textField.setBounds(272, 298, 244, 35);
		contentPane.add(textField);
		
		JLabel passwordlbl = new JLabel("Password:");
		passwordlbl.setForeground(Color.BLACK);
		passwordlbl.setFont(new Font("Arial", Font.BOLD, 14));
		passwordlbl.setBounds(272, 338, 78, 36);
		contentPane.add(passwordlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(147, 55, 5), 3));
		passwordField.setBackground(new Color(239, 238, 233));
		passwordField.setBounds(272, 367, 243, 35);
		contentPane.add(passwordField);
		
		SignIn_btn = new JButton("SIGN IN");
		SignIn_btn.setForeground(new Color(239, 238, 233));
		SignIn_btn.setFont(new Font("Arial", Font.BOLD, 18));
		SignIn_btn.setBorder(new LineBorder(new Color(147, 55, 5), 4));
		SignIn_btn.setBackground(new Color(218, 98, 32));
		SignIn_btn.setBounds(325, 440, 137, 45);
		contentPane.add(SignIn_btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dean_Login.class.getResource("/Resources/Dean_Login.png")));
		lblNewLabel.setBounds(0, -11, 771, 605);
		contentPane.add(lblNewLabel);

		Education_Leadership_LoginController elc = new Education_Leadership_LoginController(this, null, null);
		SignIn_btn.addActionListener(elc);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

}
