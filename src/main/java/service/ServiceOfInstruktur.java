/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Instruktur;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfInstruktur {
    private SessionFactory aSessionFactory;
    
    public ServiceOfInstruktur(SessionFactory aSessionFactory){
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Instruktur aInstruktur){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aInstruktur);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doUpdate(Instruktur aInstruktur){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aInstruktur);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doDelete(Instruktur aInstruktur){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aInstruktur);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
}
