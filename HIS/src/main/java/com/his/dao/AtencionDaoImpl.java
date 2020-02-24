package com.his.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.his.model.HisAtenciones;

@Repository("atencion")
public class AtencionDaoImpl implements AtencionDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<HisAtenciones> listarTodoconRelaciones(String mes) {
		// TODO Auto-generated method stub
		return em.createQuery("select ").getResultList();
	}


}
