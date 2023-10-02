package Logica;

import Datos.Cliente;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabrica.crearClientesDeCSV("C:/Users/jpcor/git/repository/ProyectoEstructuras/src/DatosCSV/Clientes.csv");
		Fabrica.crearVehiculosDeCSV("C:/Users/jpcor/git/repository/ProyectoEstructuras/src/DatosCSV/Vehiculos.csv");
		
		System.out.println(Cliente.listaClientes.top);
		
		System.out.println(Cliente.getByCedulaCliente("1125125510"));
		System.out.println(Cliente.getByCedulaCliente("1125125510").listavehiculos);
		
		if (Cliente.getByCedulaCliente("1125125511") == null) {
			System.out.println("null");
		} else {
			System.out.println(Cliente.getByCedulaCliente("1125125511"));
		}

	}

}
