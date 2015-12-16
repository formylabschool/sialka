/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Jurusan;
import model.Materi;
import model.Nilai;
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

	public void setSessionFactory(SessionFactory sessionFactory) {
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
        
        public List<Nilai> findAll(){
        Session aSession = sessionFactory.openSession();
        aSession.beginTransaction();
        
        Criteria aCriteria = aSession.createCriteria(Nilai.class);
        return aCriteria.list();
        }
}
