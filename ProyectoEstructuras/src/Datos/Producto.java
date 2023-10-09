package Datos;

import Estructuras.Lista;

public class Producto {
	
	public String nombreProducto;
	public String marca;
	public String modelo;
	public int disponibilidad;
	public int precio;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getDisponibilidad() {
		return disponibilidad;
	}
	
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	// La lista que contiene todos los productos solo puede contener máximo 2000
	public static Lista<Producto> listaProductos = new Lista<Producto>(2000);

	public Producto(String nombreProducto, String marca, String modelo, int disponibilidad, int precio) {
		super();
		this.nombreProducto = nombreProducto;
		this.marca = marca;
		this.modelo = modelo;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
		listaProductos.add(this);
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", marca=" + marca + ", modelo=" + modelo
				+ ", disponibilidad=" + disponibilidad + ", precio=" + precio + "]";
	}
}
