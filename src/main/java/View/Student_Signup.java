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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Student_Signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fname_textField;
	private JTextField Mname_textField;
	private JTextField lname_textField;
	private JTextField address_textField;
	private JTextField email_textField;
	private JTextField phone_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Signup frame = new Student_Signup();
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
	public Student_Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(79, 15, 15));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblLeadingInnovationsTransforming.setBounds(132, 90, 505, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		JLabel lblTNEU = new JLabel("THE NATIONAL ENGINEERING UNIVERSITY");
		lblTNEU.setForeground(new Color(239, 238, 233));
		lblTNEU.setFont(new Font("Segoe UI Historic", Font.BOLD, 25));
		lblTNEU.setBounds(132, 33, 609, 52);
		contentPane.add(lblTNEU);
		
		JLabel bsulbl = new JLabel("BATANGAS STATE UNIVERSITY");
		bsulbl.setForeground(new Color(239, 238, 233));
		bsulbl.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		bsulbl.setBounds(132, 0, 609, 52);
		contentPane.add(bsulbl);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setForeground(new Color(79, 15, 15));
		lblRegistration.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblRegistration.setBounds(220, 146, 398, 52);
		contentPane.add(lblRegistration);
		
		JLabel fnamelbl = new JLabel("First Name:");
		fnamelbl.setForeground(Color.BLACK);
		fnamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		fnamelbl.setBounds(183, 220, 109, 36);
		contentPane.add(fnamelbl);
		
		fname_textField = new JTextField();
		fname_textField.setColumns(10);
		fname_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		fname_textField.setBackground(new Color(239, 238, 233));
		fname_textField.setBounds(183, 251, 177, 25);
		contentPane.add(fname_textField);
		
		JButton Register_btn = new JButton("REGISTER");
		Register_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Register_btn.setForeground(new Color(239, 238, 233));
		Register_btn.setFont(new Font("Arial", Font.BOLD, 18));
		Register_btn.setBorder(new LineBorder(new Color(79, 15, 15), 4));
		Register_btn.setBackground(new Color(200, 57, 40));
		Register_btn.setBounds(330, 497, 137, 45);
		contentPane.add(Register_btn);
		
		JLabel mnamelbl = new JLabel("Middle Name:");
		mnamelbl.setForeground(Color.BLACK);
		mnamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		mnamelbl.setBounds(417, 220, 121, 36);
		contentPane.add(mnamelbl);
		
		Mname_textField = new JTextField();
		Mname_textField.setColumns(10);
		Mname_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		Mname_textField.setBackground(new Color(239, 238, 233));
		Mname_textField.setBounds(417, 251, 177, 25);
		contentPane.add(Mname_textField);
		
		JLabel lnamelbl = new JLabel("Last Name:");
		lnamelbl.setForeground(Color.BLACK);
		lnamelbl.setFont(new Font("Arial", Font.BOLD, 14));
		lnamelbl.setBounds(183, 284, 109, 36);
		contentPane.add(lnamelbl);
		
		lname_textField = new JTextField();
		lname_textField.setColumns(10);
		lname_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		lname_textField.setBackground(new Color(239, 238, 233));
		lname_textField.setBounds(183, 315, 177, 25);
		contentPane.add(lname_textField);
		
		address_textField = new JTextField();
		address_textField.setColumns(10);
		address_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		address_textField.setBackground(new Color(239, 238, 233));
		address_textField.setBounds(417, 315, 177, 25);
		contentPane.add(address_textField);
		
		JLabel addlbl = new JLabel("Address:");
		addlbl.setForeground(Color.BLACK);
		addlbl.setFont(new Font("Arial", Font.BOLD, 14));
		addlbl.setBounds(417, 290, 78, 25);
		contentPane.add(addlbl);
		
		JLabel emaillbl = new JLabel("Email:");
		emaillbl.setForeground(Color.BLACK);
		emaillbl.setFont(new Font("Arial", Font.BOLD, 14));
		emaillbl.setBounds(183, 355, 78, 25);
		contentPane.add(emaillbl);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		email_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		email_textField.setBackground(new Color(239, 238, 233));
		email_textField.setBounds(183, 380, 177, 25);
		contentPane.add(email_textField);
		
		phone_textField = new JTextField();
		phone_textField.setColumns(10);
		phone_textField.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		phone_textField.setBackground(new Color(239, 238, 233));
		phone_textField.setBounds(417, 380, 177, 25);
		contentPane.add(phone_textField);
		
		JLabel phonelbl = new JLabel("Phone Number:");
		phonelbl.setForeground(Color.BLACK);
		phonelbl.setFont(new Font("Arial", Font.BOLD, 14));
		phonelbl.setBounds(417, 349, 137, 36);
		contentPane.add(phonelbl);
		
		JLabel proglbl = new JLabel("Program:");
		proglbl.setForeground(Color.BLACK);
		proglbl.setFont(new Font("Arial", Font.BOLD, 14));
		proglbl.setBounds(183, 411, 78, 36);
		contentPane.add(proglbl);
		
		JLabel majorlbl = new JLabel("Major:");
		majorlbl.setForeground(Color.BLACK);
		majorlbl.setFont(new Font("Arial", Font.BOLD, 14));
		majorlbl.setBounds(417, 411, 78, 36);
		contentPane.add(majorlbl);
		
		JComboBox program_comboBox = new JComboBox();
		program_comboBox.setBackground(new Color(239, 238, 233));
		program_comboBox.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		program_comboBox.setBounds(183, 442, 178, 25);
		contentPane.add(program_comboBox);
		
		JComboBox Major_comboBox = new JComboBox();
		Major_comboBox.setBackground(new Color(239, 238, 233));
		Major_comboBox.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		Major_comboBox.setBounds(416, 444, 178, 25);
		contentPane.add(Major_comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Student_Signup.class.getResource("/Resources/StudentSign_Background.png")));
		lblNewLabel.setBounds(0, 0, 771, 583);
		contentPane.add(lblNewLabel);
	}
}
