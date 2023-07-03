package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Branch;


@Component
public class BranchDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vg");

	public Branch saveBranch(Branch student) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (student != null) {
			et.begin();
			em.persist(student);
			et.commit();

		}
		return student;
	}

	public Branch getBranchById(int id) {

		EntityManager em = emf.createEntityManager();
		return em.find(Branch.class, id);

	}

	public List<Branch> getAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select a from Student a");
		return query.getResultList();
	}

	public Branch deleteBranch(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch s = em.find(Branch.class, id);

		if (s != null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		return s;
	}

	public Branch updateStudent(Branch student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Branch s = em.find(Branch.class, student.getId());

		if (s != null) {
			etr.begin();
			em.merge(student);
			etr.commit();
		}
		return s;

	}

	

	public Branch deleteByName(Branch student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Query q = em.createQuery("select a from Student a where name=?1");

		q.setParameter(1, student.getName());

		List<Branch> list = q.getResultList();

		if (list.size() > 0) {
            return list.get(0);
		}
      return null;
	}

}
