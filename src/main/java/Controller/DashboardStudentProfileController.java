
package Controller;

import View.Student_Dashboard;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import Model.DashboardStudentProfileQuery;
import javax.swing.*;
import java.awt.event.ActionEvent;
import View.Student_Login;
import View.University_Mission;
import View.University_Vision;
import View.Student_QR;
import View.Student_ID;
public class DashboardStudentProfileController implements ActionListener
{
    private Student_Dashboard student_dashboard;
    public String getSrcode() {
		return srcode;
	}

	public void setSrcode(String srcode) {
		this.srcode = srcode;
	}

	private String srcode;
    private DashboardStudentProfileQuery dashboardStudentProfileQuery;
    private Timer timer;
    
    public DashboardStudentProfileController(Student_Dashboard student_dashboard) {
        this.student_dashboard = student_dashboard;
        this.dashboardStudentProfileQuery = new DashboardStudentProfileQuery(student_dashboard);
        startClock();
    }

    // Methods
    public void setStudentProfile(String srcode) {
        dashboardStudentProfileQuery.studentProfile(srcode);
        dashboardStudentProfileQuery.getStudentPicture(srcode);
        student_dashboard.lbl_UserName.setText(dashboardStudentProfileQuery.getFullname());
        student_dashboard.lbl_Enrollment_Status.setText(dashboardStudentProfileQuery.getEnrollment_status());
        student_dashboard.lbl_Date.setText(currentDateMethod());
        student_dashboard.lbl_Time.setText(currentTimeMethod());
        setSrcode(srcode);
    }
    
	public void changecolorfontenrollmentstatus() {
		if (dashboardStudentProfileQuery.getEnrollment_status().equals("ENROLLED")) {
			student_dashboard.lbl_Enrollment_Status.setForeground(new Color(0, 128, 0));
		} else {
			student_dashboard.lbl_Enrollment_Status.setForeground(new Color(255, 0, 0));
		}
	}
	  private void startClock() {
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                student_dashboard.lbl_Time.setText(currentTimeMethod());
	            }
	        });
	        timer.start();
	    }
	private String currentDateMethod() {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
	   
	    return dateFormat.format(new Date());
	}

	private String currentTimeMethod() {
	    SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:ss a");
	    return timeFormat.format(new Date());
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getSource() == student_dashboard.btn_SignOut) 
		{
			student_dashboard.dispose();
			timer.stop();
			new Student_Login().setVisible(true);
		}
		else if(e.getSource() == student_dashboard.btn_Mission)
		{
			new University_Mission().setVisible(true);
		}
		else if (e.getSource() == student_dashboard.btn_Vision) 
		{
			new University_Vision().setVisible(true);
		}
		else if(e.getSource() == student_dashboard.btn_QRCode)
		{
			new Student_QR(getSrcode()).setVisible(true);
		}
		else if(e.getSource() == student_dashboard.btn_StudentID)
		{
			new Student_ID(getSrcode()).setVisible(true);
		}
		
	}
	
	
}
