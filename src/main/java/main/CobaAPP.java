/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import configuration.HIbernateUtil;
import model.Jurusan;
import model.Materi;
import org.hibernate.SessionFactory;
import service.ServiceOfJurusan;
import service.ServiceOfMateri;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class CobaAPP {

    public static void main(String[] args) {
        

//        Jurusan aJurusan = new Jurusan();
//        ServiceOfJurusan aServiceOfJurusan = new ServiceOfJurusan(aSessionFactory);
//
//        aJurusan.setKodeJurusan("PK001");
//        aJurusan.setNama("PERAKITAN KOMPUTER");
//        aJurusan.setHarga(Double.valueOf("2000000"));
//
//        aServiceOfJurusan.doSave(aJurusan);
//
//        aSessionFactory.close();
        
        Materi aMateri = new Materi();
        aMateri.setKodeMateri("ME001");
        
        Jurusan aJurusan = new Jurusan();
        aJurusan.setKodeJurusan("PK001");
        
        Jurusan aJurusan1 = new Jurusan();
        aJurusan1.setKodeJurusan("ADM001");
        
        aMateri.getJurusan().add(aJurusan);
        aMateri.getJurusan().add(aJurusan1);
        
        SessionFactory aSessionFactory = HIbernateUtil.config();
        ServiceOfMateri aServiceOfMateri = new ServiceOfMateri(aSessionFactory);
        ServiceOfJurusan aServiceOfJurusan = new ServiceOfJurusan(aSessionFactory);
        
        aServiceOfJurusan.doSave(aJurusan);
     //   aServiceOfJurusan.doSave(aJurusan1);
        aServiceOfMateri.doSave(aMateri);
        aSessionFactory.close();
        
//        aMateri.setKodeMateri("MW001");
//        aMateri.setNama("MICROSOFT WORD");
//        aMateri.setPraktek(Integer.valueOf("80"));
//        aMateri.setTeori(Integer.valueOf("14"));
//        aServiceOfMateri.doSave(aMateri);
//        aSessionFactory.close();
    }

}
