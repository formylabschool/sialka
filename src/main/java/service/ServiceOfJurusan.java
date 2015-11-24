/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.sun.media.jai.opimage.RescaleCRIF;
import java.util.List;
import model.Jurusan;
import model.Materi;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfJurusan {

    private SessionFactory aSessionFactory;

    public ServiceOfJurusan(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }

    public void doSave(Jurusan aJurusan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aJurusan);
        aSession.getTransaction().commit();
        aSessionFactory.close();
    }
    
    public void doUpdate(Jurusan aJurusan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aJurusan);
        aSession.getTransaction().commit();
        aSessionFactory.close();
    }
    
    public void doDelete(Jurusan aJurusan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aJurusan);
        aSession.getTransaction().commit();
        aSessionFactory.close();
    }
    
    public List<Jurusan>findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Jurusan.class);
        return aCriteria.list();
    }
    
    public void deleteMateri(Jurusan jurusan) throws Exception{
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        List<Materi> list = session.createCriteria(Materi.class)
                .add(Restrictions.eq("jurusan.id", jurusan.getId())).list();
        
        System.out.println(list.size()+" jumlah data dihapus");
        for (Materi materi : list) {
            System.out.println(materi.getId()+" telah dihapus");
            session.delete(materi);
        }
        session.delete(jurusan);
        session.getTransaction().commit();
        session.close();
    }
    
    public void cariData(Jurusan jurusan){
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        List<Jurusan> list = session.createCriteria(Jurusan.class)
                .add(Restrictions.eq("jurusan.kode",jurusan.getKodeJurusan())).list();
    }
    
}