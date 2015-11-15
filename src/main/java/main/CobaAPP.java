/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import configuration.HIbernateUtil;
import model.Jurusan;
import model.Materi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Deprecated
public class CobaAPP {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HIbernateUtil.config();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Materi aMateri = new Materi();
        aMateri.setKodeMateri("4561");
        aMateri.setNama("Informatika");
        Integer id = (Integer) session.save(aMateri);
        aMateri.setId(id);

        Jurusan aJurusan = session.get(Jurusan.class, 3);
        aJurusan.getMateris().add(session.get(Materi.class, aMateri.getId()));
        
        for(Materi materi : aJurusan.getMateris()){
            System.out.println(materi.getNama());
        }
        
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();

//        
    }

}
