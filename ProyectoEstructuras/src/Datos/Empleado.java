package Datos;

import Estructuras.Lista;

public class Empleado extends Persona{
	
	final String rol = "Empleado";

	public String getRol() {
		return rol;
	}
	
	public static Lista<Persona> listaEmpleados = new Lista<Persona>(10);

	public Empleado(String nombre, int cedula, String usuario, String correo, String celular, String direccion) {
		super(nombre, cedula, usuario, correo, celular, direccion);
		// TODO Auto-generated constructor stub
		listaEmpleados.add(this);
	}

	@Override
	public String toString() {
		return "Empleado [rol=" + rol + ", id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", usuario="
				+ usuario + ", correo=" + correo + ", celular=" + celular + ", direccion=" + direccion + "]";
	}
}
