package Datos;

import Estructuras.Lista;

public class Servicio {
	
	public String nombreServicio;
	public Empleado empleado;
	public int precio;
	
	// Cada servicio puede utilizar máximo 5 productos
	public Lista<Producto> productosServicio = new Lista<Producto>(5);
	
	public String getNombreServicio() {
		return nombreServicio;
	}
	
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public Lista<Producto> getProductosServicio() {
		return productosServicio;
	}
	
	public void setProductosServicio(Lista<Producto> productosServicio) {
		this.productosServicio = productosServicio;
	}

	public Servicio(String nombreServicio, Empleado empleado, int precio) {
		super();
		this.nombreServicio = nombreServicio;
		this.empleado = empleado;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Servicio [nombreServicio=" + nombreServicio + ", empleado=" + empleado + ", precio=" + precio
				+ ", productosServicio=" + productosServicio + "]";
	}
}
