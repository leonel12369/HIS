package com.his.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.his.model.MUbigeo;

@Repository("ubigeo")
public class UbigeoDaoImpl implements UbigeoDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<MUbigeo> listarDepartamento() {
		// TODO Auto-generated method stub
		try {
			List<MUbigeo>listaDepartamento= em.createQuery("select departamento from MUbigeo group by departamento"
					).getResultList();
			return listaDepartamento;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-----------------------error----------");
			System.out.println(e);
		}
		return null;
	}

	@Override
	public List<String> listarProvincia(String departamento) {
		// TODO Auto-generated method stub
		try {
			List<String>listaProvincia=em.createQuery("select distinct provincia from MUbigeo"
					+ " where departamento =: departamento order by provincia")
					.setParameter("departamento", departamento)
					.getResultList();
			System.out.println(listaProvincia);
			return listaProvincia;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------error--------------");
			System.out.println(e);
		}
		return null;
	}

	@Override
	public List<String> listarDistrito(String departamento, String provincia) {
		// TODO Auto-generated method stub
		try {
			List<String> listaDistrito= em.createQuery("select distinct distrito from MUbigeo"
					+ " where departamento =: departamento and provincia =: provincia order by distrito")
					.setParameter("departamento", departamento)
					.setParameter("provincia",provincia)
					.getResultList();
			return listaDistrito;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("---------error----------");
			System.out.println(e);
		}
		return null;
	}
	
	

}
