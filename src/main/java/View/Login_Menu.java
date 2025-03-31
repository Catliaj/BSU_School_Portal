package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Login_Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.setProperty("sun.java2.uiScale", "1");
					System.setProperty("awt.useSystemAAFontSettings", "on");
					System.setProperty("swing.aatext", "true");
					System.setProperty("prism.lctext", "true");
					System.setProperty("prism.text", "t2k");
					System.setProperty("prism.subpixeltext", "true");
					Login_Menu frame = new Login_Menu();
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
	public Login_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Login_Menu.class.getResource("/Resources/Background_LoginMenu.png")));
		lbl_Background.setBounds(0, 0, 785, 590);
		contentPane.add(lbl_Background);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color( 0, 0, 0, 0));
		panel.setBounds(0, 0, 785, 590);
		lbl_Background.add(panel);
		panel.setLayout(null);
		
		JButton btn_StudentLogin = new JButton("");
		btn_StudentLogin.setIcon(new ImageIcon(Login_Menu.class.getResource("/Resources/Icon_Student.png")));
		btn_StudentLogin.setOpaque(false);
		btn_StudentLogin.setFocusPainted(false);
		btn_StudentLogin.setBorderPainted(false);
		btn_StudentLogin.setContentAreaFilled(false);
		btn_StudentLogin.setBounds(80, 333, 128, 128);
		panel.add(btn_StudentLogin);
		
		JButton btn_RegistrarLogin = new JButton("");
		btn_RegistrarLogin.setOpaque(false);
		btn_RegistrarLogin.setIcon(new ImageIcon(Login_Menu.class.getResource("/Resources/Icon_Registrar.png")));
		btn_RegistrarLogin.setFocusPainted(false);
		btn_RegistrarLogin.setContentAreaFilled(false);
		btn_RegistrarLogin.setBorderPainted(false);
		btn_RegistrarLogin.setBounds(241, 333, 128, 128);
		panel.add(btn_RegistrarLogin);
		
		JButton btn_DeanLogin = new JButton("");
		btn_DeanLogin.setOpaque(false);
		btn_DeanLogin.setIcon(new ImageIcon(Login_Menu.class.getResource("/Resources/Icon_Dean.png")));
		btn_DeanLogin.setFocusPainted(false);
		btn_DeanLogin.setContentAreaFilled(false);
		btn_DeanLogin.setBorderPainted(false);
		btn_DeanLogin.setBounds(402, 333, 128, 128);
		panel.add(btn_DeanLogin);
		
		JButton btn_ProgChairLogin = new JButton("");
		btn_ProgChairLogin.setOpaque(false);
		btn_ProgChairLogin.setIcon(new ImageIcon(Login_Menu.class.getResource("/Resources/Icon_ProgChair.png")));
		btn_ProgChairLogin.setFocusPainted(false);
		btn_ProgChairLogin.setContentAreaFilled(false);
		btn_ProgChairLogin.setBorderPainted(false);
		btn_ProgChairLogin.setBounds(554, 333, 128, 128);
		panel.add(btn_ProgChairLogin);
	}
}
