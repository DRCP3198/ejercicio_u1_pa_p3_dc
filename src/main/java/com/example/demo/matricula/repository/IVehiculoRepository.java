package com.example.demo.matricula.repository;

import com.example.demo.matricula.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public Vehiculo buscar(String id);
	public void borrar(String id);
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);

}
