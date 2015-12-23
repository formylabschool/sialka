/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_scription.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class Koneksi implements Connect {

    private Connection konek;
    String status;

    @Override
    public void panggilDriver() {
        try {
            Class.forName(Connect.DRIVERSERVER);
            System.out.println("Proses Pemanggilan Driver Sukses");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "DRIVER NOT FOUND",
                    "WARNING!", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public Connection HubungkanDBbtpn() {
        try {
            konek = (Connection) DriverManager.getConnection(Connect.URL, Connect.username, Connect.PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection failure", "WARNING!", JOptionPane.WARNING_MESSAGE);
        }
        return konek;
    }

}
