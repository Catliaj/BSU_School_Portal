package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

import View.Dean_Dashboard;
import View.Dean_Login;
import Model.education_leadership_dashboard_query;

public class Dean_Dashboard_Controller implements ActionListener
{
	private Dean_Dashboard dean;
	private education_leadership_dashboard_query query;
	private Timer timer;
	public Dean_Dashboard_Controller (Dean_Dashboard dean)
	{
		this.dean = dean;
		this.query = new education_leadership_dashboard_query(dean,null,null);
		startClock();
	}
	
	public void deanProfile(String Email)
	{
		query.ELProfile(Email);
		query.getDeanPicture(Email);
		dean.lbl_UserName.setText(query.getFullname());
		dean.lbl_Date.setText(currentDateMethod());
		dean.lbl_Time.setText(currentTimeMethod());
		
	}
	
	 private void startClock() 
	 {
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                dean.lbl_Time.setText(currentTimeMethod());
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
		if(e.getSource() == dean.btn_SignOut)
		{
			dean.dispose();
			new Dean_Login().setVisible(true);
		}
		
	}

}
