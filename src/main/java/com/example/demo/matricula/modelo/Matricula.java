package com.example.demo.matricula.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	
	private String serie;
	private LocalDateTime matricula;
	private BigDecimal valor;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	
	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + ", valor=" + valor + ", propietario=" + propietario + ", vehiculo="
				+ vehiculo + "]";
	}
	
	
	//SET y GET
	public LocalDateTime getMatricula() {
		return matricula;
	}
	public void setMatricula(LocalDateTime matricula) {
		this.matricula = matricula;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
	

}
