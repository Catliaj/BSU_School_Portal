package Model;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import View.Student_QR;
public class QrCodeQuery 
{
	db_connection db = new db_connection();
	private String Fullname;
	private Student_QR student_qr;
	
	public QrCodeQuery(Student_QR student_qr) 
	{
        this.student_qr = student_qr;
    }
	
	
	
	public void studentProfile(String Username) {
		
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        
        try {
            con = db.getConnection();
            String query = "SELECT CONCAT(FIRST_NAME, ' ', MIDDLE_NAME, ' ', SURNAME) as fullname FROM students WHERE srcode=?";
            ps = con.prepareStatement(query);
            ps.setString(1, Username);
            rs = ps.executeQuery();

            if (rs.next()) {
                setFullname(rs.getString("fullname"));
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

    public void getStudentPicture(String srcode) {
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
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(student_qr.lblNewLabel_2.getWidth(),
                		student_qr.lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                student_qr.lblNewLabel_2.setIcon(newImage);
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

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }
}
