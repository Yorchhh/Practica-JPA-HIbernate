package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import org.hibernate.*;
import org.hibernate.Session;

import Conexion.HibernateUtils;
import Models.Cliente;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class ClienteDao implements Dao<Cliente> {

	private HibernateUtils hu;

	public ClienteDao(HibernateUtils hu) {
		this.hu = hu;
	}

	public List<Cliente> mostrar() {
		Query<Cliente> query =hu.getSession().createQuery("SELECT c from Cliente c",Cliente.class);
		List<Cliente> clientes = query.getResultList();
		return clientes;
	}

	public void añadir(Cliente t) {
		// RECORDAR CAMBIAR PREGUNTAS DATOS CLIENTE PARA EL SWITCH CASE
		Session sesion = hu.getSession();// La iniciliza o utiliza la que ya esta creada
		sesion.beginTransaction();// Iniciamos una transaccion
		sesion.save(t);// Grabamos el cliente en la base de datos
		sesion.getTransaction().commit();// Finalizamos la transaccion
		sesion.close();// cerramos la conexion

	}

	public void actualizar(int id, Cliente t) {
		Session sesion = hu.getSession();//
		sesion.beginTransaction();
		sesion.save(t);
		sesion.getTransaction().commit();
		sesion.close();

	}

	public void eliminar(Cliente t) {
		Session sesion = hu.getSession();//
		sesion.beginTransaction();
		

	}

	public Cliente mostrarporId(int id) {
		//antes preguntar por el id. y despues de que tengamos el id realizamos
		Cliente cliente = hu.getSession().get(Cliente.class, id);
		return cliente;
		//Luego mostrarlo por pantalla
	}
	
	public Cliente mostrarPorNombreCli(String nombre) {
		Cliente cliente = hu.getSession().get(Cliente.class, nombre);
		return cliente;
	}
	
	public Cliente mostrarPorNombreContacto(String nombre) {
		Cliente cliente = hu.getSession().get(Cliente.class, nombre);
		return cliente;
	}
	
	public Cliente mostrarPorApellidoContacto(String apellido) {
		Cliente cliente = hu.getSession().get(Cliente.class, apellido);
		return cliente;
	}

}
