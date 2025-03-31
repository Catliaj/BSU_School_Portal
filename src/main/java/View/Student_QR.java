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
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Model.QrCodeQuery;
import Controller.QueryCodeController;
public class Student_QR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Name_lbl;
	public JButton Download_btn;
	public JLabel lblNewLabel;
	public JButton btnCancel;
	public JLabel lblNewLabel_2;

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
					Student_QR frame = new Student_QR(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	QrCodeQuery qr = new QrCodeQuery(this);
	/**
	 * Create the frame.
	 */
	private String srcode;
	public String getSrcode() 
	{
		return srcode;
	}
	public void setSrcode(String srcode) 
	{
		this.srcode = srcode;
	}
	public Student_QR(String srcode) 
	{
		
		setSrcode(srcode);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bsulbl = new JLabel("BATANGAS STATE UNIVERSITY");
		bsulbl.setForeground(new Color(148, 29, 29));
		bsulbl.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		bsulbl.setBounds(256, 172, 609, 52);
		contentPane.add(bsulbl);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(79, 15, 15), 3));
		panel.setBounds(304, 263, 412, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 10, 393, 283);
		panel.add(lblNewLabel_2);
		
		JButton Download_btn = new JButton("PRINT AND DOWNLOAD");
		Download_btn.setBackground(new Color(192, 192, 192));
		Download_btn.setBorder(new LineBorder(new Color(100, 100, 100), 2));
		Download_btn.setFont(new Font("Arial Black", Font.BOLD, 15));
		Download_btn.setBounds(379, 584, 271, 36);
		contentPane.add(Download_btn);
		
		Name_lbl = new JLabel("ARAVHEIYL B. FELICISIMO");
		Name_lbl.setForeground(new Color(0, 0, 0));
		Name_lbl.setFont(new Font("Segoe UI", Font.BOLD, 17));
		Name_lbl.setBounds(395, 213, 234, 40);
		contentPane.add(Name_lbl);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCancel.setBorder(new LineBorder(new Color(100, 100, 100), 2));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(831, 657, 146, 26);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("MY QR CODE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 10, 159, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Student_QR.class.getResource("/Resources/Qr_Backg.png")));
		lblNewLabel.setBounds(0, 0, 1006, 689);
		contentPane.add(lblNewLabel);
		
		QueryCodeController qcc = new QueryCodeController(this);
		btnCancel.addActionListener(qcc);
		Download_btn.addActionListener(qcc);
		qcc.setStudentProfile(getSrcode());
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
}
