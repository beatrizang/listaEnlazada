package com.beatriz.lista;

public class Actividad {

	private String actividad;
	private Tarea primero;
	
	public Actividad(String actividad) {
		this.actividad = actividad;
		this.primero = null;
	}
	
	/**
	 * Agrega una tarea al inicio de la actividad
	 * @param tarea
	 */
	public void agregarAlInicio(Tarea tarea) {
		if(this.primero!=null){
			tarea.setSiguiente(this.primero);
			this.primero = tarea;
		}
		
		else {
			this.primero = tarea;
			tarea = null;
		}
	}
	
	
	/**
	 * Agrega una tarea al final de la actividad
	 * @param tarea
	 */
	public void agregarAlFinal(Tarea tarea) {
		if(this.primero==null) {
			this.primero = tarea;
		}
		else {
			Tarea aux = this.primero;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(tarea);
			tarea.setSiguiente(null);
		}
	}
	
	public boolean estaVacia(Actividad actividad){
		return this.primero == null;
	}
	
	public void mostrarTareas() {
		if(this.primero!=null) {
			Tarea aux = this.primero;
			System.out.println("Actividad: " + this.getActividad());
			while(aux!=null) {
				System.out.println(aux.getDescripcion());
				aux=aux.getSiguiente();
			}
		}
		else {
			System.out.println("La actividad "+this.getActividad()+" no tiene tareas");
		}
	}
	
	public int cantidadTareas() {
		int i = 0;
		Tarea aux = this.primero;
		while(aux!=null) {
			aux=aux.getSiguiente();
			i++;
		}
		return i;
	}
	
	public void eliminarPrimerTarea(){
		if(this.primero!=null){
			Tarea aux = this.primero;
			aux = aux.getSiguiente();
			this.primero = aux;
		}
	}
	
	public void eliminarUltimaTarea(){
		if(this.primero!=null){
			Tarea aux = this.primero;
			while(aux.getSiguiente().getSiguiente()!=null){
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(null);
		}
	}
	
	/**
	 * Devuelve una tarea segun la posicion
	 * @param posicion
	 * @return
	 */
	public Tarea obtenerTarea(int posicion) {
		Tarea aux = this.primero;
		posicion--;
		int i = 0;
		while(i<cantidadTareas()) {
			if(i==posicion) {
				return aux;
			}
			aux=aux.getSiguiente();
			i++;
		}
		return null;
	}
	

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
	
	
}
