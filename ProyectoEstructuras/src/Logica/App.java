package Logica;

import Datos.Cliente;
import Datos.Producto;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabrica.crearClientesDeCSV("C:/Users/jpcor/git/repository/ProyectoEstructuras/src/DatosCSV/Clientes.csv");
		Fabrica.crearVehiculosDeCSV("C:/Users/jpcor/git/repository/ProyectoEstructuras/src/DatosCSV/Vehiculos.csv");
		Fabrica.crearProductosDeCSV("C:/Users/jpcor/git/repository/ProyectoEstructuras/src/DatosCSV/Productos.csv");
		
		//System.out.println(Cliente.listaClientes.top);
		
//		System.out.println(Cliente.getByCedulaCliente("130815114"));
		
//		System.out.println(Cliente.getByCedulaCliente("605714945"));
//		System.out.println(Cliente.getByCedulaCliente("605714945").listavehiculos.getByIndex(0));
//		System.out.println(Cliente.getByCedulaCliente("605714945").listavehiculos.getByIndex(1));
//		System.out.println(Cliente.getByCedulaCliente("605714945").listavehiculos.getByIndex(2));
		
		System.out.println(Producto.listaProductos.getByIndex(145));
		System.out.println(Producto.listaProductos.getByIndex(0));
		System.out.println(Producto.listaProductos.getByIndex(64));
		System.out.println(Producto.listaProductos.getByIndex(150));


		
//		if (Cliente.getByCedulaCliente("1125125511") == null) {
//			System.out.println("null");
//		} else {
//			System.out.println(Cliente.getByCedulaCliente("1125125511"));
//		}
		

	}

}
