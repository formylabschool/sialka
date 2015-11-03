/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia.services;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import sia.models.ModelOfCourses;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfCourses {
    private SessionFactory aSessionFactory;
    
    public ServiceOfCourses(SessionFactory aSessionFactory){
        this.aSessionFactory = aSessionFactory;
    }
    
    public void doSave(ModelOfCourses aCourses){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aCourses);
        aSession.getTransaction().commit();
        aSession.close();
        
    }
    
    public void doUpdate(ModelOfCourses aCourses){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.update(aCourses);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public void doDelete(ModelOfCourses aCourses){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.delete(aCourses);
        aSession.getTransaction().commit();
        aSession.close();
    }
    
    public List<ModelOfCourses> findAll(){
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria =aSession.createCriteria(ModelOfCourses.class);
         return aCriteria.list();
    }
    
    
}
