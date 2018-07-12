/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Pembayaran;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfPembayaran {
      private SessionFactory aSessionFactory;

    public ServiceOfPembayaran(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(Pembayaran pembayaran){
       Session aSession = aSessionFactory.openSession();
       aSession.beginTransaction();
       Integer value = (Integer) aSession.save(pembayaran);
       pembayaran.setId(value);
       aSession.getTransaction().commit();
       aSession.close();
    }
    
     public void doUpdate(Pembayaran pembayaran){
       Session aSession = aSessionFactory.openSession();
       aSession.beginTransaction();
       aSession.update(pembayaran);
       aSession.getTransaction().commit();
       aSession.close();
    }
     
      public List<Pembayaran> findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Pembayaran.class);
        return aCriteria.list();
    }
      
      public List<Siswa>findSiswaByLunas(Boolean lunas)throws Exception{
          Session aSession = aSessionFactory.openSession();
          aSession.beginTransaction();
          
          Criteria aCriteria = aSession.createCriteria(Siswa.class);
         
          aCriteria.add(Restrictions.eq("lunas", lunas));
          return aCriteria.list();
                  
      }
    
}
