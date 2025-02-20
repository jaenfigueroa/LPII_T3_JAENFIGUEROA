package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.TblMedico;

public interface IMedicoRepositorio extends CrudRepository<TblMedico, Integer> {

}
