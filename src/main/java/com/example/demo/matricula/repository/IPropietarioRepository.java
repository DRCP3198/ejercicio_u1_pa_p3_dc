package com.example.demo.matricula.repository;

import com.example.demo.matricula.modelo.Propietario;

public interface IPropietarioRepository {
	//CRUD
	
	public Propietario buscar(String id);
	public void borrar(String id);
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);

}
