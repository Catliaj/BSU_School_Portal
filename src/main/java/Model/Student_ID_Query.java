package Model;

import java.awt.Image;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import View.Student_ID;
public class Student_ID_Query 
{
	private Student_ID id;
	private String Fullname, srcode;
	db_connection db = new db_connection();
	
	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getSrcode() {
		return srcode;
	}

	public void setSrcode(String srcode) {
		this.srcode = srcode;
	}
	
	public Student_ID_Query(Student_ID id)
	{
		this.id = id;
	}
	
	public void studentProfile(String Username) 
	{
			
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        
	        try {
	            con = db.getConnection();
	            String query = "SELECT CONCAT(FIRST_NAME, ' ', MIDDLE_NAME, ' ', SURNAME) as fullname, srcode FROM students WHERE srcode=?";
	            ps = con.prepareStatement(query);
	            ps.setString(1, Username);
	            rs = ps.executeQuery();
	
	            if (rs.next()) {
	                setFullname(rs.getString("fullname"));
	                setSrcode(rs.getString("srcode"));
	                System.out.println("Fullname: " + getFullname());
	            } else {
	                JOptionPane.showMessageDialog(null, "No Data Found");
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
	
	 public void getPicture(String srcode) {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;

	        try {
	            con = db.getConnection();
	            String query = "SELECT * FROM students WHERE srcode=?";
	            ps = con.prepareStatement(query);
	            ps.setString(1, srcode);
	            rs = ps.executeQuery();

	            if (rs.next()) {
	                byte[] img = rs.getBytes("student_qr");
	                byte[] picture = rs.getBytes("student_photo");
	                ImageIcon image = new ImageIcon(img);
	                ImageIcon pictures = new ImageIcon(picture);
	                
	                Image im = image.getImage();
	                Image Pic = pictures.getImage();
	                Image myImg = im.getScaledInstance(id.QRCODE.getWidth(),id.QRCODE.getHeight(), Image.SCALE_SMOOTH);
	                Image mypicture = Pic.getScaledInstance(id.Picture.getWidth(),id.Picture.getHeight(), Image.SCALE_SMOOTH);
	                
	                ImageIcon newImage = new ImageIcon(myImg);
	                ImageIcon newpicture = new ImageIcon(mypicture);
	                id.QRCODE.setIcon(newImage);
	                id.Picture.setIcon(newpicture);
	            } else {
	                JOptionPane.showMessageDialog(null, "No Data Found");
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
