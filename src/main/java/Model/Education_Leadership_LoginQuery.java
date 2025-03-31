package Model;

import java.sql.*;
import javax.swing.JOptionPane;
 
public class Education_Leadership_LoginQuery
{
	db_connection db = new db_connection();
	private boolean loginSuccess = false;

	public boolean loginSuccess() {
		return loginSuccess;
	}

	public boolean Education_Leadership_LogIn(String Username, String Password, String requiredRole) {
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con = db.getConnection();
	        String query = "SELECT * FROM admins WHERE Email = ? AND Password = ?";
	        ps = con.prepareStatement(query);
	        ps.setString(1, Username);
	        ps.setString(2, Password);
	        rs = ps.executeQuery();

	        if (rs.next()) {
	            String userRole = rs.getString("Position");

	            if (userRole.equalsIgnoreCase(requiredRole)) { 
	                loginSuccess = true;
	                JOptionPane.showMessageDialog(null, "Login Successful as " + userRole);
	                return true; // Allow access
	            } else {
	                JOptionPane.showMessageDialog(null, "Access Denied! You are not authorized for this role.");
	                return false; // Deny access
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
	            return false;
	        }
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, e.getMessage());
	        return false;
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
