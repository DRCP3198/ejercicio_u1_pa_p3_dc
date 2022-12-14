package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepository {

	
	private List<Matricula> baseDeDatos = new ArrayList<>();
	
	@Override
	public Matricula buscar(String serie) {
		Matricula mt = null;
		for (Matricula matricula : baseDeDatos) {
			if (matricula.getSerie().equals(serie)) {
				mt = matricula;
			}
		}
		return mt;
	}

	
	@Override
	public void borrar(String serie) {
		baseDeDatos.remove(buscar(serie));
	}
	
	
	@Override
	public void insertar(Matricula matricula) {
		baseDeDatos.add(matricula);
	}

	
	@Override
	public void actualizar(Matricula matricula) {
		
		Matricula matri = null;
		
		for(Matricula propietario: baseDeDatos) {
			if(propietario.getSerie().equals(matricula.getSerie())) {
				matri = matricula;
			}
		}
		baseDeDatos.remove(matri);
		baseDeDatos.add(matricula);
		System.out.println("MATRICULA ACTUALIZADA-> :"+ matricula);
	}


}
