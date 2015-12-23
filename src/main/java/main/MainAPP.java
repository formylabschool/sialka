/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import ui.MainForm;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class MainAPP {
    private Dimension layarUtama;
//    private LoginForm loginForm;
    private MainForm utama;
	
	public MainAPP(){
//             loginForm = new LoginForm(utama, true);
		MainForm utama =new MainForm();
		utama.setSize(getLayarUtama().width,getLayarUtama().height-30);
		utama.setVisible(true);
               
	}
	
	public Dimension getLayarUtama(){
		layarUtama=Toolkit.getDefaultToolkit().getScreenSize();
		return layarUtama;
	}
        
//        public void startMainAPP(){
//            loginForm.setLocationRelativeTo(utama);
//            utama.setVisible(true);
//            loginForm.setVisible(true);
//        }
    public static void main(String[]args){
//        SwingUtilities.invokeLater(new Runnable(){
//        public void run(){
      MainAPP mainAPP = new MainAPP();
//      mainAPP.startMainAPP();
//        }
//        });
    }
    
}
