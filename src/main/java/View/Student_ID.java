package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import Controller.Student_ID_Controller;

public class Student_ID extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel Namelbl;
	public JLabel StudentCode;
	public JLabel Picture;
	public JLabel QRCODE;
	public JLabel Signature;
	public JLabel Address;
	public JLabel EmergencyC;
	public JLabel lblBlood;
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
					Student_ID frame = new Student_ID(null);
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
	
	private String Srcode;
	public String getSrcode() {
		return Srcode;
	}

	public void setSrcode(String srcode) {
		Srcode = srcode;
	}

	public Student_ID(String Srcode) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1020, 726);
		contentPane = 
				
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Note2 = new JLabel("still in the process of approving. if Error, please reload this page, if the issue persists, contact ICT Services. For freshmen");
		Note2.setFont(new Font("Arial", Font.BOLD, 14));
		Note2.setBounds(78, 73, 986, 45);
		contentPane.add(Note2);
		
		JLabel Note1 = new JLabel("This facility is for viewing and printing of electronic copy of your student ID. If NO ID RECORDS FOUND, maybe it is");
		Note1.setFont(new Font("Arial", Font.BOLD, 14));
		Note1.setBounds(121, 32, 986, 76);
		contentPane.add(Note1);
		
		JLabel Note3 = new JLabel("students, click 'UPLOAD'  to upload your ID picture kindly send an email to:");
		Note3.setFont(new Font("Arial", Font.BOLD, 14));
		Note3.setBounds(88, 97, 986, 45);
		contentPane.add(Note3);
		
		JLabel Notemail = new JLabel("ARASOF_ICT.batstate-u.edu.ph");
		Notemail.setFont(new Font("Arial Black", Font.BOLD, 13));
		Notemail.setBounds(396, 120, 649, 45);
		contentPane.add(Notemail);
		
		JLabel Note0 = new JLabel("NOTE:");
		Note0.setFont(new Font("Arial Black", Font.BOLD, 13));
		Note0.setBounds(64, 53, 83, 32);
		contentPane.add(Note0);
		
		JLabel lblUniversity = new JLabel("UNIVERSITY");
		lblUniversity.setForeground(new Color(239, 238, 233));
		lblUniversity.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		lblUniversity.setBounds(247, 207, 171, 52);
		contentPane.add(lblUniversity);
		
		JLabel lblBatangasState = new JLabel("BATANGAS STATE");
		lblBatangasState.setForeground(new Color(239, 238, 233));
		lblBatangasState.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblBatangasState.setBounds(247, 186, 344, 52);
		contentPane.add(lblBatangasState);
		
		JLabel lblTheNationalEngineering = new JLabel("THE NATIONAL ENGINEERING UNIVERSITY");
		lblTheNationalEngineering.setForeground(new Color(255, 255, 255));
		lblTheNationalEngineering.setFont(new Font("Segoe UI", Font.BOLD, 10));
		lblTheNationalEngineering.setBounds(238, 235, 377, 40);
		contentPane.add(lblTheNationalEngineering);
		
		JLabel lblStudentId = new JLabel("STUDENT ID");
		lblStudentId.setForeground(new Color(239, 238, 233));
		lblStudentId.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		lblStudentId.setBounds(10, 0, 171, 52);
		contentPane.add(lblStudentId);
		
		Picture = new JLabel("");
		Picture.setBounds(255, 278, 116, 97);
		contentPane.add(Picture);
		
		Namelbl = new JLabel("ARAVHEIYL B.");
		Namelbl.setForeground(new Color(255, 255, 255));
		Namelbl.setFont(new Font("Arial Black", Font.BOLD, 18));
		Namelbl.setBounds(242, 385, 192, 45);
		contentPane.add(Namelbl);
		
		JLabel lblBsInformationTechnology = new JLabel("BS Information Technology");
		lblBsInformationTechnology.setForeground(Color.WHITE);
		lblBsInformationTechnology.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblBsInformationTechnology.setBounds(191, 427, 243, 45);
		contentPane.add(lblBsInformationTechnology);
		
		QRCODE = new JLabel("");
		QRCODE.setBounds(184, 473, 99, 86);
		contentPane.add(QRCODE);
		
		JLabel Srcodelbl = new JLabel("SR-CODE:");
		Srcodelbl.setForeground(Color.WHITE);
		Srcodelbl.setFont(new Font("Arial Black", Font.BOLD, 18));
		Srcodelbl.setBounds(301, 482, 192, 45);
		contentPane.add(Srcodelbl);
		
		StudentCode = new JLabel("22-05429");
		StudentCode.setForeground(Color.WHITE);
		StudentCode.setFont(new Font("Arial Black", Font.BOLD, 18));
		StudentCode.setBounds(321, 505, 192, 45);
		contentPane.add(StudentCode);
		
		JLabel wwwlbl = new JLabel("www.batstate-u.edu.ph");
		wwwlbl.setForeground(Color.WHITE);
		wwwlbl.setFont(new Font("Arial Black", Font.BOLD, 16));
		wwwlbl.setBounds(204, 555, 243, 45);
		contentPane.add(wwwlbl);
		
		JLabel lblLeadingInnovationsTransforming = new JLabel("Leading Innovations, Transforming Lives, Building the Nation");
		lblLeadingInnovationsTransforming.setForeground(new Color(172, 0, 0));
		lblLeadingInnovationsTransforming.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLeadingInnovationsTransforming.setBounds(507, 249, 377, 40);
		contentPane.add(lblLeadingInnovationsTransforming);
		
		Signature = new JLabel("");
		Signature.setBounds(578, 300, 208, 59);
		contentPane.add(Signature);
		
		JLabel EmergCont = new JLabel("AUTHORIZED SIGNATURE");
		EmergCont.setForeground(new Color(172, 0, 0));
		EmergCont.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		EmergCont.setBounds(602, 335, 171, 40);
		contentPane.add(EmergCont);
		
		JLabel lblnotValidUntil = new JLabel("(NOT VALID UNTIL SIGNED)");
		lblnotValidUntil.setForeground(new Color(172, 0, 0));
		lblnotValidUntil.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblnotValidUntil.setBounds(602, 350, 171, 40);
		contentPane.add(lblnotValidUntil);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(0, 0, 0));
		lblAddress.setFont(new Font("Segoe UI", Font.BOLD, 9));
		lblAddress.setBounds(541, 369, 59, 24);
		contentPane.add(lblAddress);
		
		Address = new JLabel("NARRA 1 ST. MALARUHATAN LIAN, BATANGAS");
		Address.setForeground(Color.BLACK);
		Address.setFont(new Font("Segoe UI Black", Font.BOLD, 9));
		Address.setBounds(578, 376, 306, 40);
		contentPane.add(Address);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setForeground(Color.BLACK);
		lblEmergencyContact.setFont(new Font("Segoe UI", Font.BOLD, 9));
		lblEmergencyContact.setBounds(541, 403, 116, 24);
		contentPane.add(lblEmergencyContact);
		
		EmergencyC = new JLabel("Yasmin Felicisimo / 099764339632");
		EmergencyC.setForeground(Color.BLACK);
		EmergencyC.setFont(new Font("Segoe UI Black", Font.BOLD, 9));
		EmergencyC.setBounds(636, 399, 306, 32);
		contentPane.add(EmergencyC);
		
		JLabel lblBloodType = new JLabel("Blood Type:");
		lblBloodType.setForeground(Color.BLACK);
		lblBloodType.setFont(new Font("Segoe UI", Font.BOLD, 9));
		lblBloodType.setBounds(541, 419, 99, 24);
		contentPane.add(lblBloodType);
		
		lblBlood = new JLabel("O+");
		lblBlood.setForeground(Color.BLACK);
		lblBlood.setFont(new Font("Segoe UI Black", Font.BOLD, 9));
		lblBlood.setBounds(641, 423, 28, 19);
		contentPane.add(lblBlood);
		
		JLabel lblAddressOfCampus = new JLabel("Address of Campus:");
		lblAddressOfCampus.setForeground(Color.BLACK);
		lblAddressOfCampus.setFont(new Font("Segoe UI", Font.BOLD, 9));
		lblAddressOfCampus.setBounds(541, 437, 128, 24);
		contentPane.add(lblAddressOfCampus);
		
		JLabel CampusAdd = new JLabel("Nasugbu");
		CampusAdd.setForeground(Color.BLACK);
		CampusAdd.setFont(new Font("Segoe UI Black", Font.BOLD, 9));
		CampusAdd.setBounds(651, 441, 88, 19);
		contentPane.add(CampusAdd);
		
		JLabel PresidentSugnature = new JLabel("");
		PresidentSugnature.setForeground(new Color(172, 0, 0));
		PresidentSugnature.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		PresidentSugnature.setBounds(581, 441, 195, 72);
		contentPane.add(PresidentSugnature);
		setImage(PresidentSugnature, "/Resources/President_Signature.png");
		
		JLabel lblUniversityPresident = new JLabel("UNIVERSITY PRESIDENT");
		lblUniversityPresident.setForeground(Color.BLACK);
		lblUniversityPresident.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblUniversityPresident.setBounds(599, 486, 198, 40);
		contentPane.add(lblUniversityPresident);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCancel.setBorder(new LineBorder(new Color(100, 100, 100), 3));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(839, 653, 146, 26);
		contentPane.add(btnCancel);
		
		JButton btnUpdatePhoto = new JButton("UPDATE PHOTO");
		btnUpdatePhoto.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnUpdatePhoto.setBorder(new LineBorder(new Color(100, 100, 100), 3));
		btnUpdatePhoto.setBackground(Color.LIGHT_GRAY);
		btnUpdatePhoto.setBounds(10, 171, 137, 26);
		contentPane.add(btnUpdatePhoto);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon(Student_ID.class.getResource("/Resources/BatStateU-NEU-Logo.png")));
		lblNewLabel.setBounds(178, 195, 69, 64);
		contentPane.add(lblNewLabel);
		setImage(lblNewLabel, "/Resources/BatStateU-NEU-Logo.png");
		
		JLabel lblCalvinMPlacio = new JLabel("CALVIN M. PLACIO");
		lblCalvinMPlacio.setForeground(Color.BLACK);
		lblCalvinMPlacio.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblCalvinMPlacio.setBounds(612, 474, 198, 40);
		contentPane.add(lblCalvinMPlacio);
		
		JLabel lblID = new JLabel("");
		lblID.setIcon(new ImageIcon(Student_ID.class.getResource("/Resources/ID_Backg.png")));
		lblID.setBounds(0, 0, 1006, 706);
		contentPane.add(lblID);
		
		//Controller
		Student_ID_Controller controller = new Student_ID_Controller(this);
		controller.StudentID(Srcode);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	private void setImage(JLabel label, String imagePath) {
	    ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));

	    // Resize image to fit label
	    Image image = icon.getImage();
	    Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);

	    // Set the resized image
	    label.setIcon(new ImageIcon(scaledImage));
	}
}
