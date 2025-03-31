package Controller;

import View.Student_ID;
import Model.Student_ID_Query;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_ID_Controller implements ActionListener
{

	private Student_ID id;
	private Student_ID_Query query;
	
	public Student_ID_Controller(Student_ID id)
	{
		this.id = id;
		this.query = new Student_ID_Query(id);
	}
	
	public void StudentID(String srcode)
	{
		query.studentProfile(srcode);
		query.getPicture(srcode);
		id.Namelbl.setText(query.getFullname());
		id.StudentCode.setText(query.getSrcode());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
