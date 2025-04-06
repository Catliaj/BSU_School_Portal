package Model;

import java.awt.Image;
import java.sql.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import View.Student_ID;
public class Student_ID_Query 
{
	private Student_ID id;
	private String Fullname, srcode,  address, emergency_contact,  emergency_contact_person, blood_type;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergency_contact() {
		return emergency_contact;
	}

	public void setEmergency_contact(String emergency_contact) {
		this.emergency_contact = emergency_contact;
	}

	public String getEmergency_contact_person() {
		return emergency_contact_person;
	}

	public void setEmergency_contact_person(String emergency_contact_person) {
		this.emergency_contact_person = emergency_contact_person;
	}

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

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
	            String query = "SELECT CONCAT(FIRST_NAME, ' ', MIDDLE_NAME, ' ', SURNAME) as fullname, srcode, emergency_contact,  emergency_contact_person, blood_type, address FROM students WHERE srcode=?";
	            ps = con.prepareStatement(query);
	            ps.setString(1, Username);
	            rs = ps.executeQuery();
	
	            if (rs.next()) {
	                setFullname(rs.getString("fullname"));
	                setSrcode(rs.getString("srcode"));
	                setAddress(rs.getString("address"));
	                setEmergency_contact(rs.getString("emergency_contact"));
	                setEmergency_contact_person(rs.getString("emergency_contact_person"));
	                setBlood_type(rs.getString("blood_type"));
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
	                byte[] signature = rs.getBytes("student_signature");
	                ImageIcon image = new ImageIcon(img);
	                ImageIcon pictures = new ImageIcon(picture);
	                ImageIcon signatures = new ImageIcon(signature);
	                
	                
	                Image im = image.getImage();
	                Image Pic = pictures.getImage();
	                Image sign = signatures.getImage();
	                
	                Image myImg = im.getScaledInstance(id.QRCODE.getWidth(),id.QRCODE.getHeight(), Image.SCALE_SMOOTH);
	                Image mypicture = Pic.getScaledInstance(id.Picture.getWidth(),id.Picture.getHeight(), Image.SCALE_SMOOTH);
	                Image mysignature = sign.getScaledInstance(id.Signature.getWidth(),id.Signature.getHeight(), Image.SCALE_SMOOTH);
	                
	                BufferedImage bufferedPic = toBufferedImage(sign);
	                
	                // Remove white background
	                BufferedImage transparentPic = removeWhiteBackground(bufferedPic);

	                // Resize transparent image
	                Image myTransaparentSignture = transparentPic.getScaledInstance(id.Signature.getWidth(), id.Signature.getHeight(), Image.SCALE_SMOOTH);
	                
	                ImageIcon newImage = new ImageIcon(myImg);
	                ImageIcon newpicture = new ImageIcon(mypicture);
	                ImageIcon newSignature = new ImageIcon(myTransaparentSignture);
	                
	                id.Signature.setIcon(newSignature);
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
	 
	 
	 
	 /** Convert Image to BufferedImage */
	 public static BufferedImage toBufferedImage(Image img) {
	     if (img instanceof BufferedImage) {
	         return (BufferedImage) img;
	     }
	     BufferedImage bImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
	     Graphics2D g = bImage.createGraphics();
	     g.drawImage(img, 0, 0, null);
	     g.dispose();
	     return bImage;
	 }

	 /** Remove white background */
	 public static BufferedImage removeWhiteBackground(BufferedImage image) {
	     int width = image.getWidth();
	     int height = image.getHeight();
	     BufferedImage transparentImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

	     for (int y = 0; y < height; y++) {
	         for (int x = 0; x < width; x++) {
	             int pixel = image.getRGB(x, y);
	             Color color = new Color(pixel, true);

	             // If pixel is close to white, make it transparent
	             if (color.getRed() > 200 && color.getGreen() > 200 && color.getBlue() > 200) {
	                 transparentImage.setRGB(x, y, 0x00FFFFFF); // Fully transparent
	             } else {
	                 transparentImage.setRGB(x, y, pixel);
	             }
	         }
	     }
	     return transparentImage;
	 }
	 
	

	 

}
