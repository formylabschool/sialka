/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.util.List;
import model.BukuTamu;
import model.Instruktur;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfBukuTamu {

    private SessionFactory aSessionFactory;

    public ServiceOfBukuTamu(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }

    public void doSave(BukuTamu aBukuTamu){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aBukuTamu);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doUpdate(BukuTamu aBukuTamu){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aBukuTamu);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doDelete(BukuTamu aBukuTamu){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aBukuTamu);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
     public List<BukuTamu>findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Instruktur.class);
        return aCriteria.list();
    }
   
}
