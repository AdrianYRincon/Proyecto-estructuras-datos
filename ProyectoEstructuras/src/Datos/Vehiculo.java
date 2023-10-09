package Datos;

import Estructuras.Lista;

public class Vehiculo {
	
	public String marca;
	public String modelo;
	public int año;
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
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setModelo(String modelo) {
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

	public Vehiculo(String marca, String modelo, int año, String placa, String color, String cedulaDueño) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.placa = placa;
		this.color = color;
		this.dueño = Cliente.getByCedulaCliente(cedulaDueño);
		dueño.listavehiculos.add(this);
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", placa=" + placa + ", color="
				+ color + ", dueño=" + dueño + ", listaFacturas=" + listaFacturas + "]";
	}
		
}
