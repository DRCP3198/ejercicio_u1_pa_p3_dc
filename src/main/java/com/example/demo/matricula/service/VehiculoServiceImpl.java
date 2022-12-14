package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.modelo.Vehiculo;
import com.example.demo.matricula.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	
	
	@Override
	public Vehiculo buscar(String id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.borrar(id);
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(vehiculo);
	}
	
	

}
