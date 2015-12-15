/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Jadwal;
import model.Kelas;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfJadwal {

    private SessionFactory aSessionFactory;

    public ServiceOfJadwal(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;

    }

    public void doSave(Jadwal aJadwal) {
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aJadwal);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
     public List<Jadwal> findJadwalByKelas(Kelas kelas)throws Exception{
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        
        Criteria aCriteria = session.createCriteria(Jadwal.class);
        aCriteria.createAlias("kelas", "k");
        aCriteria.add(Restrictions.eq("k.kodeKelas", kelas.getKodeKelas()));
        return aCriteria.list();
    }
}
