package com.beatriz.lista;

public class Principal {
	 public static void main(String[] args) {
		Tarea tarea1 = new Tarea("Colocar enduido plástico");
		Tarea tarea2 = new Tarea("Lijar las paredes");
		Tarea tarea3 = new Tarea("Aplicar sellador");
		Tarea tarea4 = new Tarea("Pintar");
		
		Actividad pintar = new Actividad("Pintar Pared");
		
		pintar.agregarAlFinal(tarea1);
		pintar.agregarAlFinal(tarea2);
		pintar.agregarAlFinal(tarea3);
		pintar.agregarAlFinal(tarea4);
		
		pintar.mostrarTareas();
		
		pintar.eliminarUltimaTarea();;
		
		System.out.println("Despues de eliminar tarea");
		
		pintar.mostrarTareas();
	}
}
