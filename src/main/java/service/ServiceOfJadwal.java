/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Jadwal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfJadwal {

    private SessionFactory aSessionFactory;

    public ServiceOfJadwal(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;

    }

    public void doSave(Jadwal aJadwal) {
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aJadwal);
        aSession.getTransaction().commit();
        aSession.close();
    }
}
