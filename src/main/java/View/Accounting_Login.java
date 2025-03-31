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

public class Accounting_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField Username_textField;
	public JPasswordField passwordField;
	public JButton SignIn_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accounting_Login frame = new Accounting_Login();
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
	public Accounting_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bsulbl = new JLabel("BATANGAS STATE UNIVERSITY");
		bsulbl.setForeground(new Color(239, 238, 233));
		bsulbl.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		bsulbl.setBounds(141, 7, 609, 52);
		contentPane.add(bsulbl);
		
		JLabel lblTNEU = new JLabel("THE NATIONAL ENGINEERING UNIVERSITY");
		lblTNEU.setForeground(new Color(239, 238, 233));
		lblTNEU.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lblTNEU.setBounds(141, 40, 609, 52);
		contentPane.add(lblTNEU);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(0, 0, 0));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLeadingInnovationsTransforming.setBounds(141, 90, 505, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblAccounting = new JLabel("ACCOUNTING");
		lblAccounting.setForeground(new Color(0, 0, 0));
		lblAccounting.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblAccounting.setBounds(262, 153, 283, 52);
		contentPane.add(lblAccounting);
		
		JLabel usernamelbl = new JLabel("Username:");
		usernamelbl.setForeground(Color.BLACK);
		usernamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		usernamelbl.setBounds(272, 273, 78, 36);
		contentPane.add(usernamelbl);
		
		Username_textField = new JTextField();
		Username_textField.setColumns(10);
		Username_textField.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Username_textField.setBackground(new Color(239, 238, 233));
		Username_textField.setBounds(272, 304, 244, 35);
		contentPane.add(Username_textField);
		
		JLabel passwordlbl = new JLabel("Password:");
		passwordlbl.setForeground(Color.BLACK);
		passwordlbl.setFont(new Font("Arial", Font.BOLD, 14));
		passwordlbl.setBounds(272, 344, 78, 36);
		contentPane.add(passwordlbl);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		passwordField.setBackground(new Color(239, 238, 233));
		passwordField.setBounds(272, 373, 243, 35);
		contentPane.add(passwordField);
		
	    SignIn_btn = new JButton("SIGN IN");
		SignIn_btn.setForeground(new Color(239, 238, 233));
		SignIn_btn.setFont(new Font("Arial", Font.BOLD, 18));
		SignIn_btn.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		SignIn_btn.setBackground(new Color(84, 84, 84));
		SignIn_btn.setBounds(325, 446, 137, 45);
		contentPane.add(SignIn_btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Accounting_Login.class.getResource("/Resources/Accounting_Login.png")));
		lblNewLabel.setBounds(0, 0, 771, 583);
		contentPane.add(lblNewLabel);
	}

}
