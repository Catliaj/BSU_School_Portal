
package Model;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import View.Student_Dashboard;

public class DashboardStudentProfileQuery {
    db_connection db = new db_connection();
    private Student_Dashboard student_dashboard;
    private String Fullname, enrollment_status;
    public String getEnrollment_status() {
		return enrollment_status;
	}

	public void setEnrollment_status(String enrollment_status) {
		this.enrollment_status = enrollment_status;
	}

	private File Studentpicture;

    public DashboardStudentProfileQuery(Student_Dashboard student_dashboard) {
        this.student_dashboard = student_dashboard;
    }

    public File getStudentpictures() {
        return Studentpicture;
    }

    public void setStudentpicture(File studentpicture) {
        Studentpicture = studentpicture;
    }

    public void studentProfile(String Username) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT CONCAT(FIRST_NAME, ' ', MIDDLE_NAME, ' ', SURNAME) as fullname, enrollment_status FROM students WHERE srcode=?";
            ps = con.prepareStatement(query);
            ps.setString(1, Username);
            rs = ps.executeQuery();

            if (rs.next()) {
                setFullname(rs.getString("fullname"));
                setEnrollment_status(rs.getString("enrollment_status"));
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
                byte[] img = rs.getBytes("student_photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(student_dashboard.lbl_UserImage.getWidth(),
                        student_dashboard.lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                student_dashboard.lbl_UserImage.setIcon(newImage);
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
