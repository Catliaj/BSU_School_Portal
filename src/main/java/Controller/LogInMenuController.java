package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import View.*;

public class LogInMenuController implements ActionListener
{
	private Object currentView; // Can hold any view object
	

	public LogInMenuController(Object currentView) {
		this.currentView = currentView;
	}

		

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		JButton sourceButton = (JButton) e.getSource();

		if (sourceButton.getText().equalsIgnoreCase("DEAN LOGIN")) 
		{
			switchView(new Dean_Login());

		} 
		else if (sourceButton.getText().equalsIgnoreCase("PROGRAM CHAIR LOGIN")) 
		{
			switchView(new PC_Login());
		} 
		else if (sourceButton.getText().equalsIgnoreCase("REGISTRAR LOGIN")) 
		{
			switchView(new Registrar_Login());
		} 
		else if (sourceButton.getText().equalsIgnoreCase("STUDENT LOGIN")) 
		{
			switchView(new Student_Login());
		}
		else if (sourceButton.getText().equalsIgnoreCase("EXIT")) 
		{
			switchView(new Login_Menu());
		} 
		
	}
	
	private void switchView(Object newView) 
	{
		if (currentView instanceof Dean_Login) 
        {
            ((Dean_Login) currentView).dispose();
        } 
        else if (currentView instanceof PC_Login) 
        {
            ((PC_Login) currentView).dispose();
        } 
        else if (currentView instanceof Registrar_Login) 
        {
            ((Registrar_Login) currentView).dispose();
        } 
        else if (currentView instanceof Student_Login) 
        {
            ((Student_Login) currentView).dispose();
        } 
        else if (currentView instanceof Login_Menu) 
        {
            ((Login_Menu) currentView).dispose();
        } 
    }
	
	
}
