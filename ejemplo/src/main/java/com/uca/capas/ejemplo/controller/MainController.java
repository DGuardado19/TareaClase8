package com.uca.capas.ejemplo.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/estudiante")
	public @ResponseBody String clase8Tarea() {
		return "Nombre: David Guardado, carnet: 00184217, carrera: Ing. Informatica, AÑo cursado: 4to";
	}
	@RequestMapping("/fecha")
	public @ResponseBody int fecha(HttpServletRequest request) {
		Calendar calendario = Calendar.getInstance();
		String dia;
		Integer diaf = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer anio = Integer.parseInt(request.getParameter("anio"));
		calendario.set(anio, mes, diaf);
		int comp= calendario.get(Calendar.DAY_OF_WEEK);
	
		return comp;
	}
}
