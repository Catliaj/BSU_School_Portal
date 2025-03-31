package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Accounting_Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accounting_Dashboard frame = new Accounting_Dashboard();
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
	public Accounting_Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Student_Dashboard.class.getResource("/Resources/BatStateU-NEU-Logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Accounting_Dashboard.class.getResource("/Resources/Background_Accounting.png")));
		lbl_Background.setBounds(0, 0, 1320, 745);
		contentPane.add(lbl_Background);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color( 0, 0, 0, 0));
		panel.setBounds(0, 0, 1320, 745);
		lbl_Background.add(panel);
		panel.setLayout(null);
		
		
		
		
		JLabel lbl_HeaderTitle = new JLabel("BATANGAS STATE UNIVERSITY");
		lbl_HeaderTitle.setForeground(Color.WHITE);
		lbl_HeaderTitle.setFont(new Font("Impact", Font.PLAIN, 55));
		lbl_HeaderTitle.setBounds(141, 27, 665, 54);
		panel.add(lbl_HeaderTitle);
		
		JLabel lbl_HeaderTitle_Shadow = new JLabel("BATANGAS STATE UNIVERSITY");
		lbl_HeaderTitle_Shadow.setForeground(new Color(194, 12, 12));
		lbl_HeaderTitle_Shadow.setFont(new Font("Impact", Font.PLAIN, 55));
		lbl_HeaderTitle_Shadow.setBounds(144, 30, 665, 54);
		panel.add(lbl_HeaderTitle_Shadow);
		
		JLabel lbl_Date = new JLabel("SATURDAY, MARCH 08, 2025");
		lbl_Date.setForeground(new Color(217, 217, 217));
		lbl_Date.setFont(new Font("Gadugi", Font.BOLD, 25));
		lbl_Date.setBounds(928, 11, 350, 26);
		panel.add(lbl_Date);
		
		JLabel lbl_Time = new JLabel("2:30:55 PM");
		lbl_Time.setForeground(new Color(217, 217, 217));
		lbl_Time.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_Time.setBounds(928, 42, 237, 36);
		panel.add(lbl_Time);
		
		JLabel lbl_Motto = new JLabel("Leading Innovations, Transforming Lives, Building the Nation\r\n");
		lbl_Motto.setForeground(new Color(255, 255, 255));
		lbl_Motto.setFont(new Font("Gadugi", Font.BOLD, 16));
		lbl_Motto.setBounds(44, 98, 480, 28);
		panel.add(lbl_Motto);
		
		JButton btn_ChangePassword = new JButton("   CHANGE PASSWORD");
		btn_ChangePassword.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_ChangePassword.setOpaque(false);
		btn_ChangePassword.setFocusPainted(false);
		btn_ChangePassword.setBorderPainted(false);
		btn_ChangePassword.setContentAreaFilled(false);
		btn_ChangePassword.setBounds(902, 101, 224, 27);
		panel.add(btn_ChangePassword);
		
		JLabel lbl_ChangePassword = new JLabel("");
		lbl_ChangePassword.setBounds(916, 105, 19, 18);
		ImageIcon originalIcon1 = new ImageIcon(getClass().getResource("/Resources/Password_Icon.png"));
	    Image scaledImage1 = originalIcon1.getImage().getScaledInstance(lbl_ChangePassword.getWidth(), lbl_ChangePassword.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon1 = new ImageIcon(scaledImage1);
	    lbl_ChangePassword.setIcon(resizedIcon1);
		panel.add(lbl_ChangePassword);
		
		JButton btn_SignOut = new JButton("   SIGN OUT");
		btn_SignOut.setOpaque(false);
		btn_SignOut.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_SignOut.setFocusPainted(false);
		btn_SignOut.setBorderPainted(false);
		btn_SignOut.setContentAreaFilled(false);
		btn_SignOut.setBounds(1133, 101, 169, 27);
		panel.add(btn_SignOut);
		
		JLabel lbl_SignOut = new JLabel("");
		lbl_SignOut.setBounds(1150, 104, 17, 19);
		ImageIcon originalIcon2 = new ImageIcon(getClass().getResource("/Resources/SignOut_Icon.png"));
	    Image scaledImage2 = originalIcon2.getImage().getScaledInstance(18, lbl_SignOut.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon2 = new ImageIcon(scaledImage2);
	    lbl_SignOut.setIcon(resizedIcon2);
		panel.add(lbl_SignOut);
		
		JLabel lbl_UserName = new JLabel("ARAVHEIYL B. FELICISIMO");
		lbl_UserName.setForeground(new Color(0, 0, 0));
		lbl_UserName.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_UserName.setBounds(515, 171, 556, 50);
		panel.add(lbl_UserName);
		
		JLabel lbl_AdminRole = new JLabel("REGISTRAR");
		lbl_AdminRole.setForeground(new Color(84, 84, 84));
		lbl_AdminRole.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_AdminRole.setBounds(515, 220, 373, 51);
		panel.add(lbl_AdminRole);
		
		JLabel lbl_UserImage = new JLabel("");
		lbl_UserImage.setBounds(54, 146, 140, 140);
		ImageIcon originalIcon3 = new ImageIcon(getClass().getResource("/Resources/Percy.png"));
	    Image scaledImage3 = originalIcon3.getImage().getScaledInstance(lbl_UserImage.getWidth(), lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon3 = new ImageIcon(scaledImage3);
	    lbl_UserImage.setIcon(resizedIcon3);
		panel.add(lbl_UserImage);
		
		
		
		
		JLabel lbl_ApprovalReq_Icon = new JLabel("");
		lbl_ApprovalReq_Icon.setBounds(446, 452, 50, 50);
		ImageIcon originalIcon4 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/Approval_Icon.png"));
	    Image scaledImage4 = originalIcon4.getImage().getScaledInstance(lbl_ApprovalReq_Icon.getWidth(), lbl_ApprovalReq_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon4 = new ImageIcon(scaledImage4);
	    lbl_ApprovalReq_Icon.setIcon(resizedIcon4);
		panel.add(lbl_ApprovalReq_Icon);
		
		JButton btn_ApprovalReq = new JButton("      APPROVAL REQUESTS");
		btn_ApprovalReq.setForeground(new Color(255, 255, 255));
		btn_ApprovalReq.setOpaque(false);
		btn_ApprovalReq.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_ApprovalReq.setFocusPainted(false);
		btn_ApprovalReq.setBackground(new Color(0, 0, 0, 0));
		btn_ApprovalReq.setOpaque(false);
		btn_ApprovalReq.setBorderPainted(false);
		btn_ApprovalReq.setBounds(420, 435, 480, 85);
		panel.add(btn_ApprovalReq);
		
	}

}
