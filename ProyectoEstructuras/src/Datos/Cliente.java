package Datos;

import Estructuras.Lista;

public class Cliente extends Persona {

	public final String rol = "Cliente";
	
	// Cada cliente puede tener máximo 5 vehículos
	public Lista<Vehiculo> listavehiculos = new Lista<Vehiculo>(5);
	
	// Cada cliente puede tener máximo 30 facturas
	public Lista<Factura> listaFacturas = new Lista<Factura>(30);

	public String getRol() {
		return rol;
	}
	
	// La lista que contiene todos los clientes solo puede contener máximo 10000
	public static Lista<Cliente> listaClientes = new Lista<Cliente>(10000);
	
	// Metodo que recibe la cedula de un cliente y busca coincidencia en la listaClientes, en caso de no encontrar 
	// retorna null
	public static Cliente getByCedulaCliente(String cedulaCliente) {
		int i = 0;
		while (cedulaCliente.equals(Cliente.listaClientes.getByIndex(i).getCedula()) == false && i < Cliente.listaClientes.top) {
			i++;
		}
		if (i == Cliente.listaClientes.top && cedulaCliente.equals(Cliente.listaClientes.getByIndex(i).cedula) == false) {
			return null;
		} else {
			return Cliente.listaClientes.getByIndex(i);			
		}
	}

	public Cliente(String nombre, String cedula, String usuario, String correo, String celular, String direccion) {
		super(nombre, cedula, usuario, correo, celular, direccion);
		// TODO Auto-generated constructor stub
		listaClientes.add(this);
	}

	@Override
	public String toString() {
		return "Cliente [rol=" + rol + ", id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", usuario="
				+ usuario + ", correo=" + correo + ", celular=" + celular + ", direccion=" + direccion + "]";
	}
}
