package Funciones;

import java.util.Scanner;

import Models.Cliente;
import Models.Producto;

public class Funciones {
	
	public static int imprimirMenu() {
		int opcion;
		Scanner kb = new Scanner(System.in);
		System.out.println("*************** MENU *******************");
		System.out.println("1.- Añadir un cliente");
		System.out.println("2.- Mostrar un cliente (ID)");
		System.out.println("3.- Mostrar todos los clientes");
		System.out.println("4.- Buscar un cliente");
		System.out.println("5.- Editar un producto (ID cliente)");
		System.out.println("6.- Mostrar detalles pedido de un cliente (ID)");
		System.out.println("7.- Salir del programa");
		opcion = kb.nextInt();
		return opcion;

	}
	
	public static int menuBusquedaCliente() {
		int opcion;
		Scanner kb = new Scanner(System.in);
		System.out.println("BUSQUEDA CLIENTE");
		System.out.println("1.- Por Nombre de Empresa");
		System.out.println("2.- Nombre del Cliente");
		System.out.println("3.- Apellidos del Cliente");
		opcion = kb.nextInt();
		return opcion;
		
	}
	
	public static Cliente preguntasDatos() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduzca el codigo del cliente , por favor");
		int cod = kb.nextInt();
		System.out.println("Introduzca el nombre del cliente, por favor");
		String nombreCli = kb.next();
		System.out.println("Introduce el nombre de contacto, por favor");
		String nombreContacto = kb.next();
		System.out.println("Introduce el apellido del contacto, por favor");
		String apellidoContacto = kb.next();
		System.out.println("Introduce el telefono, porfavor");
		String telefono = kb.next();
		System.out.println("Introduce el fax, por favor");
		String fax = kb.next();
		System.out.println("Introduce la direccion principal , por favor");
		String direccion1 = kb.next();
		System.out.println("Introduce la direccion secundario, porfavor ");
		String direccion2 = kb.next();
		System.out.println("Introduce la ciudad, por favor");
		String ciudad = kb.nextLine();
		System.out.println("Introduce el pais, por favor");
		String pais = kb.nextLine();
		System.out.println("Introduce la region, por favor");
		String region = kb.next();
		System.out.println("Intrduce el codigo postal , por favor");
		String codPostal = kb.next();
		System.out.println("Introduce el codigo del empleado, por favor");
		int codEmple = kb.nextInt();
		System.out.println("Introduce un limite de credito, por favor");
		int limite = kb.nextInt();
		return new Cliente(cod, nombreCli, nombreContacto, apellidoContacto, telefono, fax, direccion1, direccion2, ciudad, region, pais, codPostal, codEmple, limite);
	}
	
	
	public static Producto editarPorCodigo(int codigo) {
		Scanner kb = new Scanner(System.in);
		int codProducto= codigo;
		System.out.println("Introduzca el nombre del producto, porfavor");
		String nombreProd= kb.next();
		System.out.println("Introduzca la gama del producto , porfavor");
		String gama = kb.next();
		System.out.println("Introduzca las dimensiones del producto, porfavor");
		String dimensiones=kb.next();
		System.out.println("Introduzca el proveedor del producto, porfavor");
		String proveedor= kb.next();
		System.out.println("Introduzca descripcion");
		String descripcion=kb.next();
		System.out.println("Introduzca el precio de venta");
		double precioV=kb.nextDouble();
		System.out.println("Introduzca el precio del proveedor");
		double precioP=kb.nextDouble();
		System.out.println("Introduzca la cantidad de stock");
		int cantidad=kb.nextInt();
		
		
		return new Producto(codigo, nombreProd, gama, dimensiones, proveedor, descripcion, precioV, precioP, cantidad);
	}

}
