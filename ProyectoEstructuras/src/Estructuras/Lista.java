package Estructuras;

import java.util.Arrays;

public class Lista <O>{
	
	public int dimension;
	public O[] lista = (O[]) new Object[dimension];
	public int top = -1;
	
	public boolean full() {
		return this.top == dimension -1;
	}
	
	public boolean empty() {
		return this.top == -1;
	}	
	
	public void add (O elemento) {
		top++;
		if (this.full() == false) {
			this.lista[this.top] = (O) elemento;
			this.top ++;
		} else {
			System.out.println("La lista está llena, no se puede apilar");
		}
	}
	
	public Lista(int dimension) {
		this.dimension = dimension;
		this.lista = (O[]) new Object[dimension];
	}

	@Override
	public String toString() {
		return "Lista [dimension=" + dimension + ", lista=" + Arrays.toString(lista) + ", top=" + top + "]";
	}
}