package Controller;
import View.Student_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.StudentLoginQuery;
import View.Student_Dashboard;
public class StudentLoginController implements ActionListener 
{
	private Student_Login student_login;
    StudentLoginQuery studentLoginQuery = new StudentLoginQuery();
	public StudentLoginController(Student_Login student_login)
	{
		this.student_login = student_login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == student_login.SignIn_btn) {
			String username = student_login.textField.getText();
			String password = String.valueOf(student_login.passwordField.getPassword());
			studentLoginQuery.studentLogIn(username, password);
			if(studentLoginQuery.loginSuccess())
			{
				student_login.dispose();
				new Student_Dashboard(username).setVisible(true);
			}
			else
			{
				student_login.textField.setText("");
				student_login.passwordField.setText("");
			}
		}
		
	}
	
	
}
