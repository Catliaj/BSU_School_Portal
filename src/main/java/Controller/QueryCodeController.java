package Controller;


import View.Student_QR;
import Model.QrCodeQuery;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class QueryCodeController implements ActionListener
{
    private Student_QR student_qr;
    
    private QrCodeQuery qrCodeQuery;
    
    public QueryCodeController(Student_QR student_qr) 
    {
        this.student_qr = student_qr;
        this.qrCodeQuery = new QrCodeQuery(student_qr);
    }

    // Methods
    public void setStudentProfile(String srcode) 
    {
        qrCodeQuery.studentProfile(srcode);
        qrCodeQuery.getStudentPicture(srcode);
        student_qr.Name_lbl.setText(qrCodeQuery.getFullname());
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        // TODO Auto-generated method stub
		if (e.getSource() == student_qr.Download_btn) 
		{
			qrCodeQuery.getStudentPicture(student_qr.getSrcode());
		}
		else if (e.getSource() == student_qr.btnCancel) 
		{
			student_qr.dispose();
		}
		
		
    }

}
