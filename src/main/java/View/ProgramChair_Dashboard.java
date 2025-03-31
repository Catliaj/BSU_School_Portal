package View;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ProgramChair_Dashboard_Controller;

public class ProgramChair_Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel lbl_UserImage;
	public JLabel lbl_Date;
	public JLabel lbl_Time;
	public JButton btn_SignOut;
	public JLabel lbl_UserName;

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
					ProgramChair_Dashboard frame = new ProgramChair_Dashboard(null);
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

	private String email;

	public void setEmail(String email) {
        this.email = email;
    }
	
	public String getEmail() {
		return email;
	}
	public ProgramChair_Dashboard(String email) 
	{
		setEmail(email);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Student_Dashboard.class.getResource("/Resources/BatStateU-NEU-Logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/Background_ProgramChair.png")));
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
		
		lbl_Date = new JLabel("SATURDAY, MARCH 08, 2025");
		lbl_Date.setForeground(new Color(217, 217, 217));
		lbl_Date.setFont(new Font("Gadugi", Font.BOLD, 25));
		lbl_Date.setBounds(928, 11, 421, 26);
		panel.add(lbl_Date);
		
		lbl_Time = new JLabel("2:30:55 PM");
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
		btn_ChangePassword.setBounds(828, 100, 224, 27);
		panel.add(btn_ChangePassword);
		
		JLabel lbl_ChangePassword = new JLabel("");
		lbl_ChangePassword.setBounds(840, 105, 19, 18);
		ImageIcon originalIcon1 = new ImageIcon(getClass().getResource("/Resources/Password_Icon.png"));
	    Image scaledImage1 = originalIcon1.getImage().getScaledInstance(lbl_ChangePassword.getWidth(), lbl_ChangePassword.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon1 = new ImageIcon(scaledImage1);
	    lbl_ChangePassword.setIcon(resizedIcon1);
		panel.add(lbl_ChangePassword);
		
		btn_SignOut = new JButton("   SIGN OUT");
		btn_SignOut.setOpaque(false);
		btn_SignOut.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_SignOut.setFocusPainted(false);
		btn_SignOut.setBorderPainted(false);
		btn_SignOut.setContentAreaFilled(false);
		btn_SignOut.setBounds(1060, 100, 169, 27);
		panel.add(btn_SignOut);
		
		JLabel lbl_SignOut = new JLabel("");
		lbl_SignOut.setBounds(1075, 104, 17, 19);
		ImageIcon originalIcon2 = new ImageIcon(getClass().getResource("/Resources/SignOut_Icon.png"));
	    Image scaledImage2 = originalIcon2.getImage().getScaledInstance(18, lbl_SignOut.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon2 = new ImageIcon(scaledImage2);
	    lbl_SignOut.setIcon(resizedIcon2);
		panel.add(lbl_SignOut);
		
		lbl_UserName = new JLabel("JARED JEFFREY A. ABELLERA");
		lbl_UserName.setForeground(new Color(0, 0, 0));
		lbl_UserName.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_UserName.setBounds(515, 171, 556, 50);
		panel.add(lbl_UserName);
		
		JLabel lbl_AdminRole = new JLabel("PROGRAM CHAIR");
		lbl_AdminRole.setForeground(new Color(20, 93, 160));
		lbl_AdminRole.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_AdminRole.setBounds(515, 220, 373, 51);
		panel.add(lbl_AdminRole);
		
		lbl_UserImage = new JLabel("");
		lbl_UserImage.setBounds(54, 147, 140, 140);
		ImageIcon originalIcon3 = new ImageIcon(getClass().getResource("/Resources/Percy.png"));
	    Image scaledImage3 = originalIcon3.getImage().getScaledInstance(lbl_UserImage.getWidth(), lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon3 = new ImageIcon(scaledImage3);
	    lbl_UserImage.setIcon(resizedIcon3);
		panel.add(lbl_UserImage);
		
		
		
		
		JLabel lbl_StudentList_Icon = new JLabel("");
		lbl_StudentList_Icon.setBounds(184, 366, 50, 50);
		ImageIcon originalIcon4 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/StudentList_Icon.png"));
	    Image scaledImage4 = originalIcon4.getImage().getScaledInstance(lbl_StudentList_Icon.getWidth(), lbl_StudentList_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon4 = new ImageIcon(scaledImage4);
	    lbl_StudentList_Icon.setIcon(resizedIcon4);
		panel.add(lbl_StudentList_Icon);
		
		JButton btn_StudentList = new JButton("      STUDENT LIST");
		btn_StudentList.setForeground(new Color(255, 255, 255));
		btn_StudentList.setOpaque(false);
		btn_StudentList.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_StudentList.setFocusPainted(false);
		btn_StudentList.setBackground(new Color(0, 0, 0, 0));
		btn_StudentList.setOpaque(false);
		btn_StudentList.setBorderPainted(false);
		btn_StudentList.setBounds(156, 353, 439, 77);
		panel.add(btn_StudentList);
		
		
		
		JLabel lbl_Schedules_Icon = new JLabel("");
		lbl_Schedules_Icon.setBounds(184, 487, 50, 50);
		ImageIcon originalIcon5 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/Schedules_Icon.png"));
	    Image scaledImage5 = originalIcon5.getImage().getScaledInstance(lbl_Schedules_Icon.getWidth(), lbl_Schedules_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon5 = new ImageIcon(scaledImage5);
	    lbl_Schedules_Icon.setIcon(resizedIcon5);
		panel.add(lbl_Schedules_Icon);
		
		JButton btn_Schedules = new JButton("      SCHEDULES");
		btn_Schedules.setOpaque(false);
		btn_Schedules.setForeground(Color.WHITE);
		btn_Schedules.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Schedules.setFocusPainted(false);
		btn_Schedules.setBorderPainted(false);
		btn_Schedules.setBackground(new Color(0, 0, 0, 0));
		btn_Schedules.setBounds(156, 474, 439, 77);
		panel.add(btn_Schedules);
		
		
		
		JLabel lbl_ApprovalReq_Icon = new JLabel("");
		lbl_ApprovalReq_Icon.setBounds(733, 366, 50, 50);
		ImageIcon originalIcon6 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/Approval_Icon.png"));
	    Image scaledImage6 = originalIcon6.getImage().getScaledInstance(lbl_ApprovalReq_Icon.getWidth(), lbl_ApprovalReq_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon6 = new ImageIcon(scaledImage6);
	    lbl_ApprovalReq_Icon.setIcon(resizedIcon6);
		panel.add(lbl_ApprovalReq_Icon);
		
		JButton btn_ApprovalReq = new JButton("       APPROVAL REQUEST");
		btn_ApprovalReq.setOpaque(false);
		btn_ApprovalReq.setForeground(Color.WHITE);
		btn_ApprovalReq.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_ApprovalReq.setFocusPainted(false);
		btn_ApprovalReq.setBorderPainted(false);
		btn_ApprovalReq.setBackground(new Color(0, 0, 0, 0));
		btn_ApprovalReq.setBounds(705, 353, 439, 77);
		panel.add(btn_ApprovalReq);
		
		
		
		JLabel lbl_PreviousReq_Icon = new JLabel("");
		lbl_PreviousReq_Icon.setBounds(726, 487, 50, 50);
		ImageIcon originalIcon7 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/PreviousReq_Icon.png"));
	    Image scaledImage7 = originalIcon7.getImage().getScaledInstance(lbl_PreviousReq_Icon.getWidth(), lbl_PreviousReq_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon7 = new ImageIcon(scaledImage7);
	    lbl_PreviousReq_Icon.setIcon(resizedIcon7);
		panel.add(lbl_PreviousReq_Icon);
		
		JButton btn_PreviousReq = new JButton("       PREVIOUS REQUEST");
		btn_PreviousReq.setOpaque(false);
		btn_PreviousReq.setForeground(Color.WHITE);
		btn_PreviousReq.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_PreviousReq.setFocusPainted(false);
		btn_PreviousReq.setBorderPainted(false);
		btn_PreviousReq.setBackground(new Color(0, 0, 0, 0));
		btn_PreviousReq.setBounds(705, 474, 439, 77);
		panel.add(btn_PreviousReq);
		
		
		
		JLabel lbl_Freshmen_Icon = new JLabel("");
		lbl_Freshmen_Icon.setBounds(477, 614, 50, 50);
		ImageIcon originalIcon8 = new ImageIcon(ProgramChair_Dashboard.class.getResource("/Resources/Freshmen_Icon.png"));
	    Image scaledImage8 = originalIcon8.getImage().getScaledInstance(lbl_Freshmen_Icon.getWidth(), lbl_Freshmen_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon8 = new ImageIcon(scaledImage8);
	    lbl_Freshmen_Icon.setIcon(resizedIcon8);
		panel.add(lbl_Freshmen_Icon);
		
		JButton btn_Freshmen = new JButton("     FRESHMEN");
		btn_Freshmen.setOpaque(false);
		btn_Freshmen.setForeground(Color.WHITE);
		btn_Freshmen.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_Freshmen.setFocusPainted(false);
		btn_Freshmen.setBorderPainted(false);
		btn_Freshmen.setBackground(new Color(0, 0, 0, 0));
		btn_Freshmen.setBounds(449, 601, 439, 77);
		panel.add(btn_Freshmen);
		
		ProgramChair_Dashboard_Controller controller = new ProgramChair_Dashboard_Controller(this);
		controller.PCProfile(email);
		btn_SignOut.addActionListener(controller);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

}
