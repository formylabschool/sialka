/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import configuration.HIbernateUtil;
import model.Jurusan;
import org.hibernate.SessionFactory;
import service.ServiceOfJurusan;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class CobaAPP {
    public static void main (String[]args){
        SessionFactory aSessionFactory = HIbernateUtil.config();
        aSessionFactory.openSession();
        Jurusan aJurusan = new Jurusan();
        ServiceOfJurusan aServiceOfJurusan = new ServiceOfJurusan(aSessionFactory);
        
        aJurusan.setKodeJurusan("PK001");
        aJurusan.setNama("PERAKITAN KOMPUTER");
        aJurusan.setHarga(Double.valueOf("2000000"));
        
       
        
        Jurusan aJurusan1 = new Jurusan();
        ServiceOfJurusan aServiceOfJurusan1 = new ServiceOfJurusan(aSessionFactory);
        aJurusan1.setKodeJurusan("ADM001");
        aJurusan1.setNama("ADMINISTRASI");
        aJurusan1.setHarga(Double.valueOf("2000000"));
        aServiceOfJurusan.doSave(aJurusan);
        aServiceOfJurusan1.doSave(aJurusan1);
        
        aSessionFactory.close();
    }
    
}
