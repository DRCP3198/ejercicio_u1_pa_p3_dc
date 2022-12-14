package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.modelo.Propietario;
import com.example.demo.matricula.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImple implements IPropietarioService {

	
	//DI Inyeccion de dependencia
	@Autowired
	private IPropietarioRepository iPropietarioRepository;


    @Override
	public Propietario buscar(String id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.buscar(id);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

}
