package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

import Model.education_leadership_dashboard_query;
import View.Registrar_Dashboard;
import View.Registrar_Login;

public class Registrar_Dashboard_Controller implements ActionListener
{
	private Registrar_Dashboard registrar;
	private education_leadership_dashboard_query query;
	private Timer timer;
	
	public Registrar_Dashboard_Controller (Registrar_Dashboard registrar)
	{
		this.registrar = registrar;
		this.query = new education_leadership_dashboard_query(null,null,registrar);
		
		startClock();
	}
	
	public void deanProfile(String Email)
	{
		query.ELProfile(Email);
		query.getRegistrarPicture(Email);
		registrar.lbl_UserName.setText(query.getFullname());
		registrar.lbl_Date.setText(currentDateMethod());
		registrar.lbl_Time.setText(currentTimeMethod());
		
	}
	
	 private void startClock() 
	 {
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	registrar.lbl_Time.setText(currentTimeMethod());
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
		if(e.getSource() == registrar.btn_SignOut)
		{
			registrar.dispose();
			new Registrar_Login().setVisible(true);
		}
		
	}
}
