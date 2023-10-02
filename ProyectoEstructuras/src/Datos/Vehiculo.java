package Datos;

import Estructuras.Lista;

public class Vehiculo {
	
	public String marca;
	public int modelo;
	public String placa;
	public String color;
	public Cliente dueño;
	public Lista<Factura> listaFacturas = new Lista<Factura>(100);
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Cliente getDueño() {
		return dueño;
	}
	
	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}
	
	public Lista<Factura> getListaFacturas() {
		return listaFacturas;
	}
	
	public void setListaFacturas(Lista<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public Vehiculo(String marca, int modelo, String placa, String color, String cedulaDueño) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.color = color;
		this.dueño = Cliente.getByCedulaCliente(cedulaDueño);
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", color=" + color + ", dueño="
				+ dueño + ", listaFacturas=" + listaFacturas + "]";
	}	
}
