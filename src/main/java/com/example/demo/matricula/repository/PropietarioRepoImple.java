package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.modelo.Propietario;

@Repository
public class PropietarioRepoImple implements IPropietarioRepository {

private List<Propietario> baseDatosPropietario = new ArrayList<>();
	
	@Override
	public Propietario buscar(String id) {
		Propietario pro = null;
		for (Propietario propietario : baseDatosPropietario) {
			if (propietario.getCedula().equals(id)) {
				pro = propietario;
			}
		}
		return pro;
	}

	
	@Override
	public void borrar(String id) {
		baseDatosPropietario.remove(buscar(id));
	}
	
	
	@Override
	public void insertar(Propietario propietario) {
		baseDatosPropietario.add(propietario);
	}

	
	@Override
	public void actualizar(Propietario propietario) {
		Propietario pro = null;
		for(Propietario propi:baseDatosPropietario) {
			if(propietario.getCedula().equals(propietario.getCedula())) {
				pro = propi;
			}
		}
		baseDatosPropietario.remove(pro);
		baseDatosPropietario.add(propietario);
		System.out.println("PROPIETARIO ACTUALIZADO->: "+propietario);
	}


}
