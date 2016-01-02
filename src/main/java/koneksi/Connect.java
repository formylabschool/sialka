/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;

/**
 *
 * @author muhamadhanifmuhsin
 */
public interface Connect {
    String DRIVERSERVER="com.mysql.jdbc.Driver";//inisialisasi driver MySql
//	String DRIVEREMBED="org.apache.derby.jdbc.EmbeddedDriver";

    /**
     *
     */
    	String URL ="Jdbc:mysql://localhost:3306/sia_lpkkanira";
	String HOST ="localhost";
	String PORT = "3306";
	String DB = "sia_lpkkanira";//inisisalisasi schema pada MySQL
	String username = "root";//inisialisasi username pada MySQl

    /**
     *
     */
    String PASS = "root";//inisialisasi password pada MySQl
	public void panggilDriver();
	public Connection HubungkanDBbtpn();
    
}
