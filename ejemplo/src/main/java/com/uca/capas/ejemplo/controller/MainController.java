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
	public @ResponseBody String fecha(HttpServletRequest request) {
		Calendar calendario = Calendar.getInstance();
		String dia;
		Integer diaf = Integer.parseInt(request.getParameter("dia"))-1;
		Integer mes = Integer.parseInt(request.getParameter("mes"))-1;
		Integer anio = Integer.parseInt(request.getParameter("anio"));
		calendario.set(anio, mes, diaf);
		int comp= calendario.get(Calendar.DAY_OF_WEEK);
		switch (comp) {
		case 1: dia = "Lunes";
		break;
		case 2: dia = "Martes";
		break;
		case 3: dia = "Miercoles";
		break;
		case 4: dia = "Jueves";
		break;
		case 5: dia = "Viernes";
		break;
		case 6: dia = "Sabado";
		break;
		case 7: dia = "Domingo";
		break;
		default: dia = "Ningun dia seleccionado";
		break;
	}
		return "Dia de la semana enviado: " + dia;
	}
}
