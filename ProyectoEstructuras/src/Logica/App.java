package Logica;

import Datos.Cliente;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabrica.crearClientesDeCSV("C:/Users/jpcor/eclipse-workspace/ProyectoEstructuras/src/DatosCSV/Clientes.csv");
		
		System.out.println(Cliente.listaClientes.top);
		
		System.out.println(Cliente.getByCedulaCliente("1125125510"));

	}

}
