package com.his.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.his.model.HisAtenciones;


public interface AtencionDao  {
	
	public List<HisAtenciones> listarTodoconRelaciones(String mes);
	
}
