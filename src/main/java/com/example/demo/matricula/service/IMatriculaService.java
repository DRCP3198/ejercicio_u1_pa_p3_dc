package com.example.demo.matricula.service;

import com.example.demo.matricula.modelo.Matricula;

public interface IMatriculaService {

	//AQUI ESTA LA LOGICA DE MI NEGOCIO
public void matricular(String cIdentidad, String placaAuto);
	
	//CRUD
	public Matricula buscar(String id);
	public void borrar(String id);
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);

}
