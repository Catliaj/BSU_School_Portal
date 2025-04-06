package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import Controller.DashboardStudentProfileController;
import Model.DashboardStudentProfileQuery;

public class Student_Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel lbl_UserName;
	public JLabel lbl_UserImage;
	public JLabel lbl_Enrollment_Status;
	public	JLabel lbl_Date;
	public	JLabel lbl_Time;
	public JButton btn_Vision;
	public JButton btn_Mission;
	public JButton btn_SignOut;
	public JButton btn_QRCode;
	public JButton btn_StudentID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.setProperty("sun.java2d.uiScale", "1.5"); // Adjust scaling
					System.setProperty("awt.useSystemAAFontSettings", "on");
					System.setProperty("swing.aatext", "true");
					System.setProperty("prism.lcdtext", "true");
					System.setProperty("prism.text", "t2k");
					System.setProperty("prism.subpixeltext", "true");
					Student_Dashboard frame = new Student_Dashboard(null);
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
	DashboardStudentProfileQuery dashboardStudentProfileQuery = new DashboardStudentProfileQuery(this);
	private String srcode;
	
	public String getSrcode() 
	{
		return srcode;
	}
	public void setSrcode(String srcode) 
	{
		this.srcode = srcode;
	}
	
	public Student_Dashboard(String srcode) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Student_Dashboard.class.getResource("/Resources/BatStateU-NEU-Logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		setSrcode(srcode);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setBounds(0, 0, 1320, 745);
		
		ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Resources/Background_Student's Dashboard.png"));
	    Image scaledImage = originalIcon.getImage().getScaledInstance(lbl_Background.getWidth(), lbl_Background.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon = new ImageIcon(scaledImage);
	    lbl_Background.setIcon(resizedIcon);
		
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
		lbl_HeaderTitle.setBounds(117, 25, 665, 54);
		panel.add(lbl_HeaderTitle);
		
		JLabel lbl_HeaderTitle_Shadow = new JLabel("BATANGAS STATE UNIVERSITY");
		lbl_HeaderTitle_Shadow.setForeground(new Color(194, 12, 12));
		lbl_HeaderTitle_Shadow.setFont(new Font("Impact", Font.PLAIN, 55));
		lbl_HeaderTitle_Shadow.setBounds(120, 28, 665, 54);
		panel.add(lbl_HeaderTitle_Shadow);
		
		lbl_Date = new JLabel("SATURDAY, MARCH 08, 2025");
		lbl_Date.setForeground(new Color(217, 217, 217));
		lbl_Date.setFont(new Font("Gadugi", Font.BOLD, 25));
		lbl_Date.setBounds(954, 11, 366, 28);
		panel.add(lbl_Date);
		
		lbl_Time = new JLabel("2:30:55 PM");
		lbl_Time.setForeground(new Color(217, 217, 217));
		lbl_Time.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_Time.setBounds(954, 44, 343, 38);
		panel.add(lbl_Time);
		
		JLabel lbl_Motto = new JLabel("Leading Innovations, Transforming Lives, Building the Nation\r\n");
		lbl_Motto.setForeground(new Color(133, 19, 19));
		lbl_Motto.setFont(new Font("Gadugi", Font.BOLD, 20));
		lbl_Motto.setBounds(10, 106, 596, 28);
		panel.add(lbl_Motto);
		
		JButton btn_ChangePassword = new JButton("CHANGE PASSWORD");
		btn_ChangePassword.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_ChangePassword.setOpaque(false);
		btn_ChangePassword.setFocusPainted(false);
		btn_ChangePassword.setBorderPainted(false);
		btn_ChangePassword.setContentAreaFilled(false);
		btn_ChangePassword.setBounds(870, 109, 246, 29);
		panel.add(btn_ChangePassword);
		
		JLabel lbl_ChangePassword = new JLabel("");
		lbl_ChangePassword.setBounds(883, 115, 19, 18);
		ImageIcon originalIcon1 = new ImageIcon(getClass().getResource("/Resources/Password_Icon.png"));
	    Image scaledImage1 = originalIcon1.getImage().getScaledInstance(lbl_ChangePassword.getWidth(), lbl_ChangePassword.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon1 = new ImageIcon(scaledImage1);
	    lbl_ChangePassword.setIcon(resizedIcon1);
		panel.add(lbl_ChangePassword);
		
		btn_SignOut = new JButton("SIGN OUT");
		btn_SignOut.setOpaque(false);
		btn_SignOut.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_SignOut.setFocusPainted(false);
		btn_SignOut.setBorderPainted(false);
		btn_SignOut.setContentAreaFilled(false);
		btn_SignOut.setBounds(1124, 109, 185, 29);
		panel.add(btn_SignOut);
		
		JLabel lbl_SignOut = new JLabel("");
		lbl_SignOut.setBounds(1136, 115, 17, 19);
		ImageIcon originalIcon2 = new ImageIcon(getClass().getResource("/Resources/SignOut_Icon.png"));
	    Image scaledImage2 = originalIcon2.getImage().getScaledInstance(18, lbl_SignOut.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon2 = new ImageIcon(scaledImage2);
	    lbl_SignOut.setIcon(resizedIcon2);
		panel.add(lbl_SignOut);
		
	    lbl_UserName = new JLabel("PERSEUS P. JACKSON");
		lbl_UserName.setForeground(new Color(0, 0, 0));
		lbl_UserName.setFont(new Font("Gadugi", Font.BOLD, 40));
		lbl_UserName.setBounds(477, 187, 820, 44);
		panel.add(lbl_UserName);
		
		btn_Mission = new JButton("UNIVERSITY MISSION");
		btn_Mission.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Mission.setForeground(new Color(255, 255, 255));
		btn_Mission.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btn_Mission.setFocusPainted(false);
		btn_Mission.setBorder(BorderFactory.createLineBorder(new Color(133, 19, 19), 5));
		btn_Mission.setBackground(new Color(194, 12, 12));
		btn_Mission.setBounds(316, 406, 318, 49);
		panel.add(btn_Mission);
		
		btn_Vision = new JButton("UNIVERSITY VISION");
		btn_Vision.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Vision.setForeground(Color.WHITE);
		btn_Vision.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		btn_Vision.setFocusPainted(false);
		btn_Vision.setBorder(BorderFactory.createLineBorder(new Color(133, 19, 19), 5));
		btn_Vision.setBackground(new Color(194, 12, 12));
		btn_Vision.setBounds(723, 406, 318, 49);
		panel.add(btn_Vision);
		
	    lbl_UserImage = new JLabel("");
		lbl_UserImage.setBounds(34, 165, 200, 200);
		ImageIcon originalIcon3 = new ImageIcon(getClass().getResource("/Resources/Percy.png"));
	    Image scaledImage3 = originalIcon3.getImage().getScaledInstance(lbl_UserImage.getWidth(), lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon3 = new ImageIcon(scaledImage3);
	    lbl_UserImage.setIcon(resizedIcon3);
		panel.add(lbl_UserImage);
		
		
		
		
		JLabel lbl_COR_Icon = new JLabel("");
		lbl_COR_Icon.setBounds(33, 480, 50, 50);
		ImageIcon originalIcon4 = new ImageIcon(getClass().getResource("/Resources/COR_icon.png"));
	    Image scaledImage4 = originalIcon4.getImage().getScaledInstance(lbl_COR_Icon.getWidth(), lbl_COR_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon4 = new ImageIcon(scaledImage4);
	    lbl_COR_Icon.setIcon(resizedIcon4);
		panel.add(lbl_COR_Icon);
		
		JButton btn_COR = new JButton("           CERTIFICATE OF REGISTRATION");
		btn_COR.setOpaque(false);
		btn_COR.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_COR.setFocusPainted(false);
		btn_COR.setBackground(new Color(0, 0, 0, 0));
		btn_COR.setOpaque(false);
		btn_COR.setBorderPainted(false);
		btn_COR.setBounds(22, 472, 404, 64);
		panel.add(btn_COR);

		
		JLabel lbl_Forms_Icon = new JLabel("");
		lbl_Forms_Icon.setBounds(37, 575, 45, 45);
		ImageIcon originalIcon5 = new ImageIcon(getClass().getResource("/Resources/Forms_icon.png"));
	    Image scaledImage5 = originalIcon5.getImage().getScaledInstance(lbl_Forms_Icon.getWidth(), lbl_Forms_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon5 = new ImageIcon(scaledImage5);
	    lbl_Forms_Icon.setIcon(resizedIcon5);
		panel.add(lbl_Forms_Icon);
		
		JButton btn_Forms = new JButton("      FORMS");
		btn_Forms.setOpaque(false);
		btn_Forms.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Forms.setFocusPainted(false);
		btn_Forms.setBackground(new Color(0, 0, 0, 0));
		btn_Forms.setOpaque(false);
		btn_Forms.setBorderPainted(false);
		btn_Forms.setBounds(22, 565, 404, 64);
		panel.add(btn_Forms);
		
		
		
		JLabel lbl_StudentID_Icon = new JLabel("");
		lbl_StudentID_Icon.setBounds(479, 472, 45, 45);
		ImageIcon originalIcon6 = new ImageIcon(Student_Dashboard.class.getResource("/Resources/ID_Icon.png"));
	    Image scaledImage6 = originalIcon6.getImage().getScaledInstance(lbl_StudentID_Icon.getWidth(), lbl_StudentID_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon6 = new ImageIcon(scaledImage6);
	    lbl_StudentID_Icon.setIcon(resizedIcon6);
		panel.add(lbl_StudentID_Icon);
		
		btn_StudentID = new JButton("      STUDENT ID");
		btn_StudentID.setOpaque(false);
		btn_StudentID.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_StudentID.setFocusPainted(false);
		btn_StudentID.setBackground(new Color(0, 0, 0, 0));
		btn_StudentID.setOpaque(false);
		btn_StudentID.setBorderPainted(false);
		btn_StudentID.setBounds(458, 472, 404, 64);
		panel.add(btn_StudentID);
		
		
		
		JLabel lbl_Grades_Icon = new JLabel("");
		lbl_Grades_Icon.setBounds(482, 575, 45, 45);
		ImageIcon originalIcon7 = new ImageIcon(Student_Dashboard.class.getResource("/Resources/Grades_Icon.png"));
	    Image scaledImage7 = originalIcon7.getImage().getScaledInstance(lbl_Grades_Icon.getWidth(), lbl_Grades_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon7 = new ImageIcon(scaledImage7);
	    lbl_Grades_Icon.setIcon(resizedIcon7);
		panel.add(lbl_Grades_Icon);
		
		JButton btn_Grades = new JButton("      GRADES");
		btn_Grades.setOpaque(false);
		btn_Grades.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Grades.setFocusPainted(false);
		btn_Grades.setBackground(new Color(0, 0, 0, 0));
		btn_Grades.setOpaque(false);
		btn_Grades.setBorderPainted(false);
		btn_Grades.setBounds(458, 565, 404, 64);
		panel.add(btn_Grades);
		
		
		
		JLabel lbl_Subjects_Icon = new JLabel("");
		lbl_Subjects_Icon.setBounds(919, 482, 45, 45);
		ImageIcon originalIcon8 = new ImageIcon(Student_Dashboard.class.getResource("/Resources/Subjects_Icon.png"));
	    Image scaledImage8 = originalIcon8.getImage().getScaledInstance(lbl_Subjects_Icon.getWidth(), lbl_Subjects_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon8 = new ImageIcon(scaledImage8);
	    lbl_Subjects_Icon.setIcon(resizedIcon8);
		panel.add(lbl_Subjects_Icon);
		
		JButton btn_Subjects = new JButton("      SUBJECTS");
		btn_Subjects.setOpaque(false);
		btn_Subjects.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Subjects.setFocusPainted(false);
		btn_Subjects.setBackground(new Color(0, 0, 0, 0));
		btn_Subjects.setOpaque(false);
		btn_Subjects.setBorderPainted(false);
		btn_Subjects.setBounds(894, 472, 404, 64);
		panel.add(btn_Subjects);
		
		
		
		JLabel lbl_QRCode_Icon = new JLabel("");
		lbl_QRCode_Icon.setBounds(918, 575, 44, 44);
		ImageIcon originalIcon9 = new ImageIcon(Student_Dashboard.class.getResource("/Resources/QR_Icon.png"));
	    Image scaledImage9 = originalIcon9.getImage().getScaledInstance(lbl_QRCode_Icon.getWidth(), lbl_QRCode_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon9 = new ImageIcon(scaledImage9);
	    lbl_QRCode_Icon.setIcon(resizedIcon9);
		panel.add(lbl_QRCode_Icon);
		
		btn_QRCode = new JButton("      MY QR CODE");
		btn_QRCode.setOpaque(false);
		btn_QRCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_QRCode.setFocusPainted(false);
		btn_QRCode.setBackground(new Color(0, 0, 0, 0));
		btn_QRCode.setOpaque(false);
		btn_QRCode.setBorderPainted(false);
		btn_QRCode.setBounds(894, 565, 404, 64);
		panel.add(btn_QRCode);
		
		
		
		JLabel lbl_Enrollment_Icon = new JLabel("");
		lbl_Enrollment_Icon.setBounds(461, 671, 47, 47);
		ImageIcon originalIcon10 = new ImageIcon(Student_Dashboard.class.getResource("/Resources/Enrollment_Icon.png"));
	    Image scaledImage10 = originalIcon10.getImage().getScaledInstance(lbl_Enrollment_Icon.getWidth(), lbl_Enrollment_Icon.getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon resizedIcon10 = new ImageIcon(scaledImage10);
	    lbl_Enrollment_Icon.setIcon(resizedIcon10);
		panel.add(lbl_Enrollment_Icon);
		
		JButton btn_Enrollment = new JButton("      ENROLLMENT");
		btn_Enrollment.setOpaque(false);
		btn_Enrollment.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_Enrollment.setFocusPainted(false);
		btn_Enrollment.setBackground(new Color(0, 0, 0, 0));
		btn_Enrollment.setOpaque(false);
		btn_Enrollment.setBorderPainted(false);
		btn_Enrollment.setBounds(443, 659, 434, 69);
		panel.add(btn_Enrollment);
		
		JLabel lbl_Semester = new JLabel("SECOND SEMESTER AY 2024-2025");
		lbl_Semester.setForeground(new Color(0, 0, 0));
		lbl_Semester.setFont(new Font("Gadugi", Font.BOLD, 20));
		lbl_Semester.setBounds(534, 234, 346, 20);
		panel.add(lbl_Semester);
		
		JLabel lbl_College_Campus = new JLabel("College of Informatics and Computing Sciences - ARASOF-Nasugbu Campus");
		lbl_College_Campus.setForeground(Color.BLACK);
		lbl_College_Campus.setFont(new Font("Gadugi", Font.PLAIN, 20));
		lbl_College_Campus.setBounds(534, 256, 686, 29);
		panel.add(lbl_College_Campus);
		
		JLabel lbl_Program = new JLabel("BS in Information Technology -\r\n");
		lbl_Program.setForeground(Color.BLACK);
		lbl_Program.setFont(new Font("Gadugi", Font.PLAIN, 20));
		lbl_Program.setBounds(534, 281, 276, 29);
		panel.add(lbl_Program);
		
		JLabel lbl_TermYear = new JLabel("SECOND YEAR");
		lbl_TermYear.setForeground(Color.BLACK);
		lbl_TermYear.setFont(new Font("Gadugi", Font.BOLD, 20));
		lbl_TermYear.setBounds(810, 281, 276, 29);
		panel.add(lbl_TermYear);
		
		lbl_Enrollment_Status = new JLabel("ENROLLED");
		lbl_Enrollment_Status.setForeground(new Color(0, 128, 0));
		lbl_Enrollment_Status.setFont(new Font("Gadugi", Font.BOLD, 25));
		lbl_Enrollment_Status.setBounds(534, 308, 276, 29);
		panel.add(lbl_Enrollment_Status);
		
		DashboardStudentProfileController dashboardStudentProfileController = new DashboardStudentProfileController(this);
		dashboardStudentProfileController.setStudentProfile(getSrcode());
		dashboardStudentProfileController.changecolorfontenrollmentstatus();
		btn_SignOut.addActionListener(dashboardStudentProfileController);
		btn_Vision.addActionListener(dashboardStudentProfileController);
		btn_Mission.addActionListener(dashboardStudentProfileController);
		btn_QRCode.addActionListener(dashboardStudentProfileController);
		btn_StudentID.addActionListener(dashboardStudentProfileController);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
