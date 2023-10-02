package Logica;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import Datos.Cliente;
import Datos.Vehiculo;

public class Fabrica {
	
	protected static void crearClientesDeCSV(String filename) {
		
        try (CSVReader csvReader = new CSVReader(new FileReader(filename))) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                String nombre = nextRecord[0];
                String cedula = nextRecord[1];
                String usuario = nextRecord[2];
                String correo = nextRecord[3];
                String celular = nextRecord[4];
                String direccion = nextRecord[5];

                new Cliente(nombre, cedula, usuario, correo, celular, direccion);
            }
        }	 catch (IOException | CsvValidationException e) {
        	// TODO: handle exception
            e.printStackTrace();
        }
    }
	
	protected static void crearVehiculosDeCSV(String filename) {
		
        try (CSVReader csvReader = new CSVReader(new FileReader(filename))) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                String marca = nextRecord[0];
                String modelo = nextRecord[1];
                int año = Integer.parseInt(nextRecord[2]);
                String placa = nextRecord[3];
                String color = nextRecord[4];
                String cedulaDueño = nextRecord[5];

                new Vehiculo(marca, modelo, año, placa, color, cedulaDueño);
            }
        }	 catch (IOException | CsvValidationException e) {
        	// TODO: handle exception
            e.printStackTrace();
        }
    }
}
