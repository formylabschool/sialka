/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuration.HIbernateUtil;
import java.util.Iterator;
import java.util.List;
import model.Instruktur;
import model.Jadwal;
import model.Kelas;
import model.Materi;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

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
    
     public List<Jadwal> findJadwalByKelas(Kelas kelas)throws Exception{
        Session session = aSessionFactory.openSession();
        session.beginTransaction();
        
        Criteria aCriteria = session.createCriteria(Jadwal.class);
        aCriteria.createAlias("kelas", "k");
        aCriteria.add(Restrictions.eq("k.kodeKelas", kelas.getKodeKelas()));
        return aCriteria.list();
    }
     
     public List<Jadwal> findJadwalByInstruktur(Kelas kelas, Instruktur instruktur)throws Exception{
         Session session = aSessionFactory.openSession();
         session.beginTransaction();
         Criteria aCriteria = session.createCriteria(Jadwal.class);
         aCriteria.createAlias("kelas", "k");
         aCriteria.createAlias("instruktur", "i");
         aCriteria.add(
                 Restrictions.and(
                         Restrictions.eq("k.kodeKelas", kelas.getKodeKelas()),
                         Restrictions.eq("i.nii", instruktur.getNii())
                 )
         
         );
         return aCriteria.list();
     }
     
     public List<Materi> findAllMateri()throws Exception{
         
         Session session = aSessionFactory.openSession();
         session.beginTransaction();
         Criteria aCriteria = session.createCriteria(Materi.class);
         return aCriteria.list();         
     }
     
     public Integer hitungJumlahJamPerMateri(Materi materi){
         Session session = aSessionFactory.openSession();
         session.beginTransaction();
         
         Criteria aCriteria = session.createCriteria(Jadwal.class);
         aCriteria.createAlias("materi", "m");
         aCriteria.add(Restrictions.eq("m.id", materi.getId()));
         Integer jam = 0;
         return aCriteria.list().size();
     }
     
     public static void main(String[] args) throws Exception{
         ServiceOfJadwal service = new ServiceOfJadwal(HIbernateUtil.config());
         List<Materi> listMateri = service.findAllMateri();
         for(Materi materi : listMateri){
             System.out.println(materi.getNama()+" jumlah jam : "+service.hitungJumlahJamPerMateri(materi));
         }
         
     }
}
