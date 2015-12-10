/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfSiswa {

    private SessionFactory aSessionFactory;

    public ServiceOfSiswa(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }

    public void doSave(Siswa aSiswa) {
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        aSiswa.setId((Integer) session.save(aSiswa));
        session.getTransaction().commit();
        session.close();
    }

    public void doUpdate(Siswa aSiswa) {
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        session.update(aSiswa);
        session.getTransaction().commit();
        session.close();

    }
    
    public void doDelete(Siswa aSiswa){
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        session.delete(aSiswa);
        session.getTransaction().commit();
        session.close();
    }
    
    public List<Siswa>findAll(){
       Session session = aSessionFactory.openSession();
       session.beginTransaction();
       
       Criteria criteria = session.createCriteria(Siswa.class);
       return criteria.list();
    }
    
    public Siswa findSiswa(String kodeSiswa){
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Siswa.class);
        criteria.add(Restrictions.eq("kodeSiswa",kodeSiswa ));
        return (Siswa) criteria.uniqueResult();
    }
    
    
}
