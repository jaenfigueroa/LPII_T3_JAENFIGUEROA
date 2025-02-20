package com.example.demo.servicio;

import java.util.Calendar;
import java.util.Date;
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
		
	    Date fechaOriginal = tblmedico.getFechanacimt3();

	    if (fechaOriginal != null) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(fechaOriginal);
	        calendar.add(Calendar.DAY_OF_MONTH, 1);

	        tblmedico.setFechanacimt3(calendar.getTime());
	    }

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
