/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Jurusan;
import model.Kelas;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfKelas {
     private SessionFactory aSessionFactory;

    public ServiceOfKelas(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Kelas aKelas){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aKelas);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
     public void doUpdate(Kelas aKelas){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aKelas);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
     public List<Kelas>findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Kelas.class);
        return aCriteria.list();
    }
}
