/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Keterangan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfKeterangan {
     private SessionFactory aSessionFactory;

   

    public ServiceOfKeterangan(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
        
    }
    
     public void doSave(Keterangan aKeterangan){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aKeterangan);
        aSession.getTransaction().commit();
        aSession.close();
    }
     
      public List<Keterangan>findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Keterangan.class);
        return aCriteria.list();
    }
}
