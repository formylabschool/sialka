/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import sia.ui.MainForm;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class MainAPP {
    private Dimension layarUtama;
	
	public MainAPP(){
		MainForm utama =new MainForm();
		utama.setSize(getLayarUtama().width,getLayarUtama().height-30);
		utama.setVisible(true);
	}
	
	public Dimension getLayarUtama(){
		layarUtama=Toolkit.getDefaultToolkit().getScreenSize();
		return layarUtama;
	}
    public static void main(String[]args){
      MainAPP mainAPP = new MainAPP();
    }
    
}
