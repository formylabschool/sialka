/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Absensi;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfAbsensi {
      private SessionFactory aSessionFactory;

    public ServiceOfAbsensi(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Absensi absensi){
       Session aSession = aSessionFactory.openSession();
       aSession.beginTransaction();
       aSession.save(absensi);
       aSession.getTransaction().commit();
       aSession.close();
    }
    
     public List<Absensi> findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Absensi.class);
        return aCriteria.list();
    }
     
     public List<Absensi>findAbsensiBySiswa(Siswa siswa){
         Session aSession = aSessionFactory.openSession();
         aSession.beginTransaction();
         
         Criteria aCriteria = aSession.createCriteria(Absensi.class);
         aCriteria.createAlias("siswa", "s");
         aCriteria.add(Restrictions.eq("s.kodeSiswa", siswa.getKodeSiswa()));
         return aCriteria.list();
     }
    
}
