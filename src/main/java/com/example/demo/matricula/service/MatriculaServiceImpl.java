package com.example.demo.matricula.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.modelo.Matricula;
import com.example.demo.matricula.modelo.Propietario;
import com.example.demo.matricula.modelo.Vehiculo;
import com.example.demo.matricula.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
    
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired 
	private IPropietarioService iPropietarioService;
	
	@Autowired 
	private IVehiculoService iVehiculoService;
	
	@Override
	public void matricular(String cIdentidad, String placaAuto) {
		// TODO Auto-generated method stub
		
		Propietario propietario = this.iPropietarioService.buscar(cIdentidad);
		Vehiculo vehiculo = this.iVehiculoService.buscar(placaAuto);
		
		
		Matricula matricula = new Matricula();
		matricula.setMatricula(LocalDateTime.now());
		matricula.setSerie("abc");
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		
		if (vehiculo.getTipo().equals("LV")) {
			BigDecimal valor = new BigDecimal(0.10);
			BigDecimal precioAuto = vehiculo.getPrecio();
						
			matricula.setValor(precioAuto.multiply(valor));
		}else {
			matricula.setValor(vehiculo.getPrecio().multiply(new BigDecimal(0.15)));
		}
		
		if (matricula.getValor().compareTo(new BigDecimal(2000)) == 1 ) {
			matricula.getValor().subtract(matricula.getValor().multiply(new BigDecimal(0.07)));
		}
		
		this.iMatriculaRepository.insertar(matricula);
	}
	

	@Override
	public Matricula buscar(String id) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.borrar(id);
	}

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(matricula);
	}

}
