package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

import Model.education_leadership_dashboard_query;
import View.ProgramChair_Dashboard;
import View.PC_Login;

public class ProgramChair_Dashboard_Controller implements ActionListener
{
	private ProgramChair_Dashboard pc;
	private education_leadership_dashboard_query query;
	private Timer timer;
	
	public ProgramChair_Dashboard_Controller (ProgramChair_Dashboard pc)
	{
		this.pc = pc;
		this.query = new education_leadership_dashboard_query(null,pc,null);
		startClock();
	}
	
	public void PCProfile(String Email)
	{
		query.ELProfile(Email);
		query.getProgramChairPicture(Email);
		pc.lbl_UserName.setText(query.getFullname());
		pc.lbl_Date.setText(currentDateMethod());
		pc.lbl_Time.setText(currentTimeMethod());
		
	}
	
	 private void startClock() 
	 {
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                pc.lbl_Time.setText(currentTimeMethod());
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
		if(e.getSource() == pc.btn_SignOut)
		{
			pc.dispose();
			new PC_Login().setVisible(true);
		}
		
	}

}
