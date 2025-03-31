package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Dean_Login;
import View.PC_Login;
import View.Registrar_Login;
import View.Dean_Dashboard;
import View.ProgramChair_Dashboard;
import View.Registrar_Dashboard;

import Model.Education_Leadership_LoginQuery;

public class Education_Leadership_LoginController implements ActionListener {
    private Dean_Login dean_login;
    private PC_Login pc_login;
    private Registrar_Login registrar_login;
    private Education_Leadership_LoginQuery loginQuery = new Education_Leadership_LoginQuery();

    public Education_Leadership_LoginController(Dean_Login dean_login, PC_Login pc_login, Registrar_Login registrar_login) {
        this.dean_login = dean_login;
        this.pc_login = pc_login;
        this.registrar_login = registrar_login;

        // Attach action listeners only ONCE
        if (dean_login != null) {
        
        }
        if (pc_login != null) {
            
        }
        if (registrar_login != null) {
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (dean_login != null && e.getSource() == dean_login.SignIn_btn) {
            String username = dean_login.textField.getText();
            String password = String.valueOf(dean_login.passwordField.getPassword());

            if (loginQuery.Education_Leadership_LogIn(username, password, "Dean")) {
                // Open Dean Dashboard
                new Dean_Dashboard(username).setVisible(true);
                dean_login.dispose(); // Close the correct window
            }
        } else if (pc_login != null && e.getSource() == pc_login.SignIn_btn) {
            String username = pc_login.textField.getText();
            String password = String.valueOf(pc_login.passwordField.getPassword());

            if (loginQuery.Education_Leadership_LogIn(username, password, "Program Chair")) {
                // Open Program Chair Dashboard
                new ProgramChair_Dashboard(username).setVisible(true);
                pc_login.dispose(); // Fix: Dispose of the correct window
            }
        } else if (registrar_login != null && e.getSource() == registrar_login.SignIn_btn) {
            String username = registrar_login.textField.getText();
            String password = String.valueOf(registrar_login.passwordField.getPassword());

            if (loginQuery.Education_Leadership_LogIn(username, password, "Registrar")) {
                // Open Registrar Dashboard
                new Registrar_Dashboard(username).setVisible(true);
                registrar_login.dispose(); // Fix: Dispose of the correct window
            }
        }
    }
}
