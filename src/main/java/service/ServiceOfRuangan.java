/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Ruangan;
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
    
    public void doSave(Ruangan aRuanga){
        Session aSession =  aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aRuanga);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
}
