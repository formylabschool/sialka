/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuration.HIbernateUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Keterangan;
import model.Materi;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfKeterangan {

    private SessionFactory aSessionFactory;

    public ServiceOfKeterangan(SessionFactory aSessionFactory) {
        this.aSessionFactory = aSessionFactory;

    }

    public void doSave(Keterangan aKeterangan) {
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();
        aSession.save(aKeterangan);
        aSession.getTransaction().commit();
        aSession.close();
    }

    public List<Keterangan> findAll() {
        Session aSession = aSessionFactory.openSession();
        aSession.beginTransaction();

        Criteria aCriteria = aSession.createCriteria(Keterangan.class);
        return aCriteria.list();
    }

    public List<Keterangan> findKeteranganByMateri(Materi materi) throws Exception {
        Session session = aSessionFactory.openSession();
        session.beginTransaction();

        Criteria aCriteria = session.createCriteria(Keterangan.class);
        aCriteria.createAlias("materi", "m");
        aCriteria.add(Restrictions.eq("m.kodeMateri", materi.getKodeMateri()));
        return aCriteria.list();
    }
    
//    public static void main(String[] args){
//        SessionFactory sessionFactory = HIbernateUtil.config();
//        ServiceOfKeterangan service = new ServiceOfKeterangan(sessionFactory);
//        Session session  = sessionFactory.openSession();
//        session.beginTransaction();
//        
//        try {
//            for(Keterangan ket: service.findKeteranganByMateri((Materi)session.get(Materi.class, 3))){
//                System.out.println(ket.getNamaKeterangan());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ServiceOfKeterangan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
}
