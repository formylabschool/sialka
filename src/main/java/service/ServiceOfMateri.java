/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Materi;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfMateri {

    private SessionFactory aSessionFactory;

    public ServiceOfMateri(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Materi aMateri){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aMateri);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doUpdate(Materi aMateri){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aMateri);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doDelete(Materi aMateri){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aMateri);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public List<Materi> findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Materi.class);
        return aCriteria.list();
    }
    
     public List<Materi> findMateriBySiswa(Siswa siswa)throws Exception{
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        
        Criteria aCriteria = session.createCriteria(Materi.class);
        aCriteria.createAlias("jurusan", "j");
        aCriteria.add(Restrictions.eq("j.kodeJurusan", siswa.getKelas().getJurusan().getKodeJurusan()));
        return aCriteria.list();
    }
   

}
