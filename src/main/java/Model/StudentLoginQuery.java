package Model;

import java.sql.*;
import javax.swing.JOptionPane;
public class StudentLoginQuery 
{
	db_connection db = new db_connection();
	private boolean loginSuccess = false;
	
	public boolean  loginSuccess()
	{
		return loginSuccess;
	}

    public void studentLogIn(String Username, String Password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT * FROM students WHERE srcode=? AND Password=?";
            ps = con.prepareStatement(query);
            ps.setString(1, Username);
            ps.setString(2, Password);
            rs = ps.executeQuery();

            if (rs.next()) {
            	loginSuccess = true;
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username or Password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
