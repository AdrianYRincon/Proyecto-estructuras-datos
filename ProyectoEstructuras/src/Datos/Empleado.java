package Datos;

import Estructuras.Lista;

public class Empleado extends Persona{
	
	final String rol = "Empleado";

	public String getRol() {
		return rol;
	}
	
	// La lista que contiene todos los empleados solo puede contener máximo 10
	public static Lista<Persona> listaEmpleados = new Lista<Persona>(10);

	public Empleado(String nombre, String cedula, String usuario, String correo, String celular, String direccion) {
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
