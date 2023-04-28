package com.beatriz.lista;

public class Actividad {

	private String actividad;
	private Tarea primero;
	
	public Actividad(String actividad) {
		this.actividad = actividad;
		this.primero = null;
	}
	
	public void agregarAlInicio(String descripcion) {
		Tarea tarea = new Tarea(descripcion);
		if(this.primero!=null){
			tarea.setSiguiente(this.primero);
			this.primero = tarea;
		}
		
		else {
			this.primero = tarea;
			tarea = null;
		}
	}
	
	
}
