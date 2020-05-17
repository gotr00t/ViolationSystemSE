/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violationsystem;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author _
 */
public class ViolationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Login LoginScreen = new Login();
        LoginScreen.setVisible(true);
        LoginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
