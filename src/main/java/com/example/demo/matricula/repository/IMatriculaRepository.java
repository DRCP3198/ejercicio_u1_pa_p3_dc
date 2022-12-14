package com.example.demo.matricula.repository;

import com.example.demo.matricula.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
	public Matricula buscar(String id);
	
	public void borrar(String id);
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	

}
