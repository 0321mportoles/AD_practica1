package com.AD_Practica1.Practica1_AD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

import dao.ClienteDaoImplementacion;
import dao.ProductoDaoImplementacion;
import exceptions.ClientNotFound;
import exceptions.DuplicateException;
import model.Cliente;
import model.Producto;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner sc = new Scanner(System.in);
	private static ClienteDaoImplementacion cDao = new ClienteDaoImplementacion();
	private static ProductoDaoImplementacion pDao = new ProductoDaoImplementacion();
    
	public static void main( String[] args )
    {
    	int opcion = 0;
    	do {
    		try {
    			opcion = getOpcionDeMenu();
    			ejecutarOpcion(opcion);
			} catch (Exception e) {
				opcion = 0;
				System.out.println("La opción introducida no es un número, cerrando programa");
			}
    	} while (opcion != 0);
        
    	sc.close();
    	cDao.cerrarConexion();
    	pDao.cerrarConexion();
    
    }

	@SuppressWarnings("unused")
	private static void ejecutarOpcion(int opcion) {
		Cliente c = null;
		List<Cliente> clientes = new ArrayList<>();
		switch (opcion) {
		case 1:
			c = pedirDatosCliente();
			 try {
				if (cDao.anadeCliente(c)) {
					 System.out.println("Se ha insertado el cliente '" + c.getNombreCliente() + "' en la base de datos");
				 }
			} catch (DuplicateException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.print("Codigo de cliente: "); String codigoCliente = sc.nextLine();
			try {
				c = cDao.MostrarCliente(Integer.parseInt(codigoCliente));
				System.out.println("Los datos del cliente (" + codigoCliente + ") son los siguientes:");
				System.out.println(c);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (ClientNotFound e) {
				System.out.println(e.getMessage());
			}

			break;
		case 3:
			clientes = cDao.MostrarTodosClientes();
			for (Cliente cliente : clientes) {
				System.out.println(cliente);
			}
			break;
		case 4:
			System.out.print("Buscar por cadena: "); String cadenaTexto = sc.nextLine();
			clientes = cDao.buscarPorTexto(cadenaTexto);
			
			if (clientes.size() > 0) {
				
				System.out.println("Hay estas coincidencias con " + cadenaTexto + " :");
				for (Cliente cliente : clientes) {
					System.out.println(cliente);
				}
			} else {
				System.out.println("No se encuentran coincidencias con " + cadenaTexto );
			}

			break;
		case 5:
			System.out.print("Introduce codigo producto a modificar: "); String codigoProducto = sc.nextLine();
			Producto p = pDao.MostrarProducto(Integer.parseInt(codigoProducto));
			if (p != null) {
				System.out.println("Los datos del producto (" + codigoProducto + ") son los siguientes:");
				System.out.println(p);
			} else {
				System.out.println("El producto con id (" + codigoProducto + ") no existe");
			}
			Producto productoAModificar = pedirDatosProducto();
			pDao.editaProducto(p, productoAModificar);
			
			break;
		default:
			break;
		}
		
	}

	private static Cliente pedirDatosCliente() {
		System.out.print("Codigo de cliente: "); String codigoCliente = sc.nextLine();
		System.out.print("Nombre del cliente: "); String nombreCliente = sc.nextLine();
		System.out.print("Teléfono: "); String telefonoCliente = sc.nextLine();
		System.out.print("Fax: "); String faxCliente = sc.nextLine();
		System.out.print("Ciudad: "); String ciudadCliente = sc.nextLine();
		System.out.print("Direccion 1: "); String direccion1Cliente = sc.nextLine();
	
		// Hacer comprobaciones de que los datos recogidos están bien
		return new Cliente(Integer.parseInt(codigoCliente), nombreCliente, telefonoCliente, faxCliente, ciudadCliente, direccion1Cliente);
	}
	
	
	private static Producto pedirDatosProducto() throws NumberFormatException{
 		
		System.out.print("Codigo de producto: "); String codigoProducto = sc.nextLine();
		System.out.print("Nombre del producto: "); String nombreProducto = sc.nextLine();
		System.out.print("Gama: "); String gama = sc.nextLine();
		System.out.print("Dimensiones: "); String dimensiones = sc.nextLine();
		System.out.print("Proveedor: "); String proveedor = sc.nextLine();
		System.out.print("Descripcion: "); String descripcion = sc.nextLine();
		System.out.print("Cantidad Stock: "); String cantidadStock = sc.nextLine();
		System.out.print("Precio venta: "); String precioVenta = sc.nextLine();
		System.out.print("Precio proveedor: "); String precioProveedor = sc.nextLine();
	
		// Hacer comprobaciones de que los datos recogidos están bien
		return new Producto(codigoProducto, nombreProducto, gama, dimensiones, proveedor, descripcion, NumberUtils.toInt(cantidadStock, 0), NumberUtils.toDouble(precioProveedor, 0.0), NumberUtils.toDouble(precioVenta, 0.0));
	}

	private static int getOpcionDeMenu() {
		System.out.println("");
		System.out.println("******************************");
		System.out.println("******* Menú principal *******");
		System.out.println("******************************");
		System.out.println( "1.- Añade un cliente" );
		System.out.println( "2.- Muestra un cliente por id" );
		System.out.println( "3.- Muestra todos los clientes" );
		System.out.println( "4.- Busca cliente por nombre" );
		System.out.println( "5.- Edita producto" );
		System.out.print( "Selecciona una opcion (0 para terminar): " );
		
		String s = sc.nextLine();
		return Integer.parseInt(s);
	}
}
