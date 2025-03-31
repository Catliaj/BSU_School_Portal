package Model;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import View.Dean_Dashboard;
import View.ProgramChair_Dashboard;
import View.Registrar_Dashboard;

public class education_leadership_dashboard_query 
{



    db_connection db = new db_connection();
    private Dean_Dashboard dean;
    private ProgramChair_Dashboard pc;
    private Registrar_Dashboard registrar;
    private String Fullname, enrollment_status;
    public String getEnrollment_status() {
		return enrollment_status;
	}

	public void setEnrollment_status(String enrollment_status) {
		this.enrollment_status = enrollment_status;
	}

	private File Studentpicture;

    
    public education_leadership_dashboard_query(Dean_Dashboard dean, ProgramChair_Dashboard pc, Registrar_Dashboard registrar)
    {
    	this.dean = dean;
    	this.pc = pc;
    	this.registrar = registrar;
    	
    	if (dean != null) {
            
        }
        if (pc != null) {
            
        }
        if (registrar != null) {
            
        }
    	
    }

    public File getStudentpictures() {
        return Studentpicture;
    }

    public void setStudentpicture(File studentpicture) {
        Studentpicture = studentpicture;
    }

    public void ELProfile(String Username) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT CONCAT(admin_fname, ' ', admin_mname, ' ', admin_surname) as fullname FROM admins WHERE email=?";
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

    public void getDeanPicture(String srcode) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT * FROM admins WHERE email=?";
            ps = con.prepareStatement(query);
            ps.setString(1, srcode);
            rs = ps.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("admin_photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(dean.lbl_UserImage.getWidth(),
                		dean.lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                dean.lbl_UserImage.setIcon(newImage);
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

    public void getProgramChairPicture(String srcode) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT * FROM admins WHERE email=?";
            ps = con.prepareStatement(query);
            ps.setString(1, srcode);
            rs = ps.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("admin_photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(pc.lbl_UserImage.getWidth(),
                		pc.lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                pc.lbl_UserImage.setIcon(newImage);
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
    
    public void getRegistrarPicture(String srcode) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = db.getConnection();
            String query = "SELECT * FROM admins WHERE email=?";
            ps = con.prepareStatement(query);
            ps.setString(1, srcode);
            rs = ps.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("admin_photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(registrar.lbl_UserImage.getWidth(),
                		registrar.lbl_UserImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                registrar.lbl_UserImage.setIcon(newImage);
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
