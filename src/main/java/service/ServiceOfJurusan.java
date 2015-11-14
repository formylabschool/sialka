/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Jurusan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
}
