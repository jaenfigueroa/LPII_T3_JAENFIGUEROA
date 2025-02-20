package com.example.demo.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.TblMedico;
import com.example.demo.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio {

	@Autowired
	private IMedicoRepositorio imedicorepositorio;

	@Override
	public void RegistrarMedico(TblMedico tblmedico) {

		imedicorepositorio.save(tblmedico);
	}

	@Override
	public void EliminarMedico(TblMedico tblmedico) {

		imedicorepositorio.delete(tblmedico);
	}

	@Override
	public List<TblMedico> ListadoMedicos() {

		return (List<TblMedico>) imedicorepositorio.findAll();
	}

	@Override
	public TblMedico buscarporId(Integer id) {

		return imedicorepositorio.findById(id).orElse(null);
	}
}
