package com.example.demo.matricula.service;

import com.example.demo.matricula.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo buscar(String id);
	public void borrar(String id);
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);

}
