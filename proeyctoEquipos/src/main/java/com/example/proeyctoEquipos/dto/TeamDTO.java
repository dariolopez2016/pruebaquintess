package com.example.proeyctoEquipos.dto;

public class TeamDTO {

	private String nombre;
	private String pais;
	private int puntuacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public TeamDTO(String nombre, String pais, int puntuacion) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "TeamDTO [nombre=" + nombre + ", pais=" + pais + ", puntuacion=" + puntuacion + "]";
	}

}
