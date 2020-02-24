package com.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.his.model.HisAtenciones;

import com.his.service.IGeneroService;
import com.his.service.MesService;
import com.his.service.TipoDocService;
import com.his.service.UbigeoService;

@Controller
@RequestMapping("/atenciones")
public class Atenciones {

	@Autowired
	private IGeneroService generoService;
	
	@Autowired
	private UbigeoService ubigeoService;
	
	@Autowired
	private TipoDocService TipoDocService; 
	
	@Autowired
	private MesService mesService;

	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo","listado");
		//model.addAttribute("genero",generoService.listarTodo());
		model.addAttribute("departamentos",ubigeoService.listarDepartamento());
		model.addAttribute("mes",mesService.listarTodo());
		model.addAttribute("tipoDoc",TipoDocService.listarTodo());
		return "views/Atenciones/lista_busqueda";
	} 
	
	
}
