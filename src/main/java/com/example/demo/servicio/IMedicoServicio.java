package com.example.demo.servicio;

import java.util.List;

import com.example.demo.modelo.TblMedico;

public interface IMedicoServicio  {
	
	void RegistrarMedico(TblMedico tblmedico);
	void EliminarMedico(TblMedico tblmedico);
	List<TblMedico> ListadoMedicos();
	TblMedico buscarporId(Integer id);
	
}
