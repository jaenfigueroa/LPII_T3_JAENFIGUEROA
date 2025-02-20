package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.TblMedico;
import com.example.demo.servicio.IMedicoServicio;

@Controller
@RequestMapping("/Vistas")
public class MedicoController {

	@Autowired
	private IMedicoServicio imedicoservicio;

	@GetMapping("ListadoMedicos")
	public String listarMedicos(Model modelo) {
		
		List<TblMedico> listado = imedicoservicio.ListadoMedicos();
		
		modelo.addAttribute("listado", listado);
		return "/Vistas/ListadoMedicos";
	}
	
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		
		TblMedico tblmedico = new TblMedico();
		modelo.addAttribute("regmedico", tblmedico);
		return "/Vistas/FrmRegMedico";
	}
	
	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute TblMedico tblmedico, Model modelo) {
		
		imedicoservicio.RegistrarMedico(tblmedico);
		System.out.println("Registrado en BD");
		return "redirect:/Vistas/ListadoMedicos";
	}
	
	@GetMapping("/Editarmedico/{id}")
	public String Editar(@PathVariable("id") Integer imedico, Model modelo) {
		
		TblMedico clmedico = imedicoservicio.buscarporId(imedico);
		modelo.addAttribute("regmedico", clmedico);
		return "/Vistas/FrmRegMedico";
	}
	
	@GetMapping("/Eliminarmedico/{id}")
	public String eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
		
		TblMedico tblmedico = new TblMedico();
		tblmedico.setIdmedicot3(idmedico);
		imedicoservicio.EliminarMedico(tblmedico);
		
		List<TblMedico> listado = imedicoservicio.ListadoMedicos();
		
		modelo.addAttribute("listado", listado);
		return "redirect:/Vistas/ListadoMedicos";
	}
	
}
