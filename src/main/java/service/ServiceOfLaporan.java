/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuration.HIbernateUtil;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import model.Pembayaran;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfLaporan {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public java.util.List<Pembayaran> cariPembayaran(java.util.Date awal, java.util.Date akhir) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        
        Criteria aCriteria = session.createCriteria(Pembayaran.class);
        
        aCriteria.add(Restrictions.between("tanggal", 
                java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(awal)),
                java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(akhir))));
        return aCriteria.list();
    }
    
//    public static void main(String[] args){
//        SessionFactory sessionFactory  = HIbernateUtil.config();
//        ServiceOfLaporan service= new ServiceOfLaporan();
//        service.setSessionFactory(sessionFactory);
//        
//        java.util.List<Pembayaran> listBayar = service.cariPembayaran(new Date(), new Date());
//        for(Pembayaran bayar : listBayar){
//            System.out.println(bayar.getNoPembayaran());
//        }
//        sessionFactory.close();
        
   // }
    
    

}
