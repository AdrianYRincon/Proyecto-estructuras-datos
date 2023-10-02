package Datos;

import Estructuras.Lista;

public class Cliente extends Persona {

	public final String rol = "Cliente";
	public Lista<Vehiculo> listavehiculos = new Lista<Vehiculo>(5);

	public String getRol() {
		return rol;
	}
	
	public static Lista<Cliente> listaClientes = new Lista<Cliente>(10000);

	

	public Cliente(String nombre, int cedula, String usuario, String correo, String celular, String direccion) {
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
