/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Iterator;
import java.util.List;
import model.Jurusan;
import model.Kelas;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

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

    public List<Siswa> findSiswaByKelas(Kelas kelas)throws Exception{
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        
        Criteria aCriteria = session.createCriteria(Siswa.class);
        aCriteria.createAlias("kelas", "k");
        aCriteria.add(Restrictions.eq("k.kodeKelas", kelas.getKodeKelas()));
        return aCriteria.list();
    }
     
   public Integer getJumlahSiswaPerKelas(Kelas kelas){
       Session session = aSessionFactory.openSession();
       session.beginTransaction();
       
       Iterator<Siswa> listSiswa = session.createCriteria(Siswa.class).list().iterator();
       Integer index = 0;
       while (listSiswa.hasNext()){
           Siswa value = listSiswa.next();
           if(value.getKelas().getId() == kelas.getId())
               index++;
       }
       return index;
       
   }
   
   
    
}
