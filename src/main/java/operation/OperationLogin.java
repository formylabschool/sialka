/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import my_scription.koneksi.Koneksi;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class OperationLogin {

    Koneksi sambung = new Koneksi();
    public boolean login = false;
    public boolean admin = false;

    public void prosesLogin(String pemakai, String pass, int hakakses) throws SQLException {
        String tabel = PerintahSQL.tabelLogin;
        String[] kolom = PerintahSQL.kolomLogin;
        sambung.panggilDriver();
        try {
            String sql = PerintahSQL.getPerintahSelect(tabel, kolom[0], pemakai);
            Connection koneksi;
            koneksi = sambung.HubungkanDBbtpn();
            Statement perintah = koneksi.createStatement();
            ResultSet hasil = perintah.executeQuery(sql);

            if (hasil.next()) {
                Object[] data = {hasil.getString(1), hasil.getString(2), hasil.getString(3)};
                setLogin((data[1].toString().equals(pass) && data[2].equals(Integer.toString(hakakses))));
                setAdmin(data[2].equals("0"));

            } else {
                JOptionPane.showMessageDialog(null, "User Tidak Ditemukan");
                setLogin(false);
                setAdmin(false);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean isAdmin() {
        return admin;

    }

    public void setAdmin(boolean admin) {
        this.admin = admin;

    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean benar) {
        this.login = benar;
    }

}
