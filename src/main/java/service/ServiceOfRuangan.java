/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Ruangan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfRuangan {
    private SessionFactory aSessionFactory;
    public ServiceOfRuangan(SessionFactory aSessionFactory){
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Ruangan aRuanga)throws Exception{
        Session aSession =  aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aRuanga);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doUpdate(Ruangan aRuangan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aRuangan);
        aSession.getTransaction().commit();
        aSession.close();
        
    }
    
      public void doDelete(Ruangan aRuangan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aRuangan);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public List<Ruangan> findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria =aSession.createCriteria(Ruangan.class);
         return aCriteria.list();
    }
}
