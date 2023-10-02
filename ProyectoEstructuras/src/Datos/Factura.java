package Datos;

import Estructuras.Lista;

public class Factura {
	
	public final String prefijo = "ABC";
	public static int consecutivo = 0;
	public Cliente cliente;
	public Empleado vendedor;
	public Vehiculo vehiculo;
	
	// Cada factura puede contener máximo 10 productos
	public Lista<Producto> pruductosFactura = new Lista<Producto>(10);
	
	// Cada factura puede contener máximo 3 servicios
	public Lista<Servicio> serviciosFactura = new Lista<Servicio>(3);
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Empleado getEmpleado() {
		return vendedor;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.vendedor = empleado;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Lista<Producto> getPruductosFactura() {
		return pruductosFactura;
	}
	
	public void setPruductosFactura(Lista<Producto> pruductosFactura) {
		this.pruductosFactura = pruductosFactura;
	}
	
	public Lista<Servicio> getServiciosFactura() {
		return serviciosFactura;
	}
	
	public void setServiciosFactura(Lista<Servicio> serviciosFactura) {
		this.serviciosFactura = serviciosFactura;
	}
	
	public String getPrefijo() {
		return prefijo;
	}

	public Factura(Cliente cliente, Empleado empleado, Vehiculo vehiculo) {
		super();
		this.cliente = cliente;
		this.vendedor = empleado;
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Factura [prefijo=" + prefijo + ", cliente=" + cliente + ", empleado=" + vendedor + ", vehiculo="
				+ vehiculo + ", pruductosFactura=" + pruductosFactura + "]";
	}
}
