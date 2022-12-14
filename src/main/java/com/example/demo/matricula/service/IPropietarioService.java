package com.example.demo.matricula.service;

import com.example.demo.matricula.modelo.Propietario;

public interface IPropietarioService {
	
	public Propietario buscar(String id);
	public void borrar(String id);
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
}
