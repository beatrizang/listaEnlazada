package com.beatriz.lista;

public class Tarea {

	private String descripcion;
	private Tarea siguiente;
	
	public Tarea (String descripcion) {
		this.descripcion = descripcion;
		this.siguiente = null;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tarea getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Tarea siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
