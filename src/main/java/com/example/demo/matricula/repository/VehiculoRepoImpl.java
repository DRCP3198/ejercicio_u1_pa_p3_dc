package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepository{
	
	private List<Vehiculo> baseDatosVehiculos = new ArrayList<>();
	
	
	@Override
	public Vehiculo buscar(String id) {
		Vehiculo vehiculo = null;
		for (Vehiculo vh : baseDatosVehiculos) {
			if (vh.getPlaca().equals(id)) {
				vehiculo = vh;
			}
		}
		return vehiculo;
	}

	
	@Override
	public void borrar(String id) {
		baseDatosVehiculos.remove(buscar(id));
	}
	
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatosVehiculos.add(vehiculo);
	}

	
	@Override
	public void actualizar(Vehiculo vehiculo) {
		Vehiculo vehic = null;
		for(Vehiculo vh: baseDatosVehiculos) {
			if(vh.getPlaca().equals(vehiculo.getPlaca())) {
				vehic = vehiculo;
			}
		}
		baseDatosVehiculos.remove(vehic);
		baseDatosVehiculos.add(vehiculo);
		System.out.println("ACTUALIZANDO EL VEHICULO "+vehic);
	}

	

}
