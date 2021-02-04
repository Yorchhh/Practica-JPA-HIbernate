package App;

import java.util.Scanner;

import Conexion.HibernateUtils;
import Dao.ClienteDao;
import Dao.PedidoDao;
import Dao.ProductoDao;
import Funciones.Funciones;
import Models.Cliente;
import Models.Producto;

public class App {

	public static void main(String[] args) {

		HibernateUtils hu = HibernateUtils.setUp();

		ClienteDao cdao = new ClienteDao(hu);
		PedidoDao pdao = new PedidoDao(hu);
		ProductoDao prodao = new ProductoDao(hu);

		int opcion, opcionbusqueda;
		do {
			opcion = Funciones.imprimirMenu();
			Scanner kb = new Scanner(System.in);
			switch (opcion) {
			case 1:
				Cliente cliente = Funciones.preguntasDatos();
				cdao.añadir(cliente);
				System.out.println("** CLIENTE AÑADIDO **");
				break;
			case 2:
				System.out.println("Introduzca el id del cliente que quiere mostras, porfavor");
				int id = kb.nextInt();
				System.out.println(cdao.mostrarporId(id));
				break;
			case 3:
				System.out.println(cdao.mostrar().toString());
				break;
			case 4:
				opcionbusqueda = Funciones.menuBusquedaCliente();
				switch (opcionbusqueda) {
				case 1:
					System.out.println("Introduzca el nombre del cliente");
					String nombre = kb.next();
					System.out.println(cdao.mostrarPorNombreCli(nombre).toString());
					System.out.println("** CONSULTA REALIZADA **");
					break;
				case 2:
					System.out.println("Introduzca el nombre de contacto");
					String nombre2 = kb.next();
					System.out.println(cdao.mostrarPorNombreContacto(nombre2).toString());
					System.out.println("** CONSULTA REALIZADA **");
					break;
				case 3:
					System.out.println("Introduzca el apellido de contacto");
					String apellido = kb.next();
					System.out.println(cdao.mostrarPorApellidoContacto(apellido).toString());
					System.out.println("** CONSULTA REALIZADA **");
				}

			case 5:
				System.out.println("Introduzca el codigo del producto que quiera editar");
				int cod = kb.nextInt();
				Producto p = Funciones.editarPorCodigo(cod);
				prodao.actualizar(cod, p);
				break;
			case 6:
				System.out.println("Introduzca el codigo del pedido que quiere ver");
				int codigo = kb.nextInt();
				System.out.println(pdao.mostrarporId(codigo).toString());
				break;
			case 7:
				System.out.println("** HAS SALIDO DEL PROGRAMA **");

			}

		} while (opcion != 7);

	}

}
