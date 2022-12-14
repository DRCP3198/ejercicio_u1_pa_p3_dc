package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matricula.modelo.Propietario;
import com.example.demo.matricula.service.IMatriculaService;
import com.example.demo.matricula.service.IPropietarioService;
import com.example.demo.matricula.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3DcApplication {
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
    private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3DcApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		
		
		Propietario propietario = new Propietario();
		propietario.setNombre("Dillan Renato");
		propietario.setApellido("Coloma Pozo");
		propietario.setCedula("1751457167");
		propietario.setNacimiento(LocalDateTime.of(1998, 8, 31, 23, 0));
		
		System.out.println(propietario);
		
	}


}
