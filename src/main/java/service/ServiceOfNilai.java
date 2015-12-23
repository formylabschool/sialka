/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuration.HIbernateUtil;
import java.util.List;
import model.Jurusan;
import model.Keterangan;
import model.Materi;
import model.Nilai;
import model.Siswa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ServiceOfNilai {

    private SessionFactory sessionFactory;

//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
    public ServiceOfNilai(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Materi> findMateriByJurusan(Jurusan jurusan) throws Exception {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Criteria aCriteria = session.createCriteria(Materi.class);
        aCriteria.createAlias("jurusan", "j");
        aCriteria.add(Restrictions.eq("j.id", jurusan.getId()));
        return aCriteria.list();
    }

    public List<Nilai> findAll() {
        Session aSession = sessionFactory.openSession();
        aSession.beginTransaction();

        Criteria aCriteria = aSession.createCriteria(Nilai.class);
        return aCriteria.list();
    }

    public void doUpdate(Nilai aNilai) {
        Session aSession = sessionFactory.openSession();
        aSession.beginTransaction();
        aSession.saveOrUpdate(aNilai);
        aSession.getTransaction().commit();
        aSession.close();
    }

    public List<Keterangan> findKeteranganByJurusan(Jurusan jurusan) throws Exception {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Criteria aCriteria = session.createCriteria(Keterangan.class);
        aCriteria.createAlias("materi", "m");
        aCriteria.createAlias("m.jurusan", "j");
        aCriteria.add(Restrictions.eq("j.id", jurusan.getId()));

        return aCriteria.list();
    }

    public void setNilai(Jurusan jurusan, Siswa siswa) throws Exception {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Keterangan> keterangans = findKeteranganByJurusan(jurusan);
        for (Keterangan ket : keterangans) {
            Nilai n = new Nilai();
            n.setKeterangan(ket);
            n.setSkor(0);
            n.setSiswa(siswa);
            StringBuilder sb = new StringBuilder();
            sb.append(n.getKeterangan().getMateri().getNama());
            sb.append(n.getSkor());
            System.out.println(sb.toString());

            session.saveOrUpdate(n);

        }
        session.getTransaction().commit();

    }

}
