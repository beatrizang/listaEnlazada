package com.beatriz.lista;

public class Principal {
	 public static void main(String[] args) {
		Tarea tarea1 = new Tarea("Colocar enduido plástico");
		Tarea tarea2 = new Tarea("Lijar las paredes");
		Tarea tarea3 = new Tarea("Aplicar sellador");
		Tarea tarea4 = new Tarea("Pintar");
		
		System.out.println(tarea1.getDescripcion());
		System.out.println(tarea2.getDescripcion());
		System.out.println(tarea3.getDescripcion());
		System.out.println(tarea4.getDescripcion());
	}
}
