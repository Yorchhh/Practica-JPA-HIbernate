package Dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import Conexion.HibernateUtils;
import Models.Producto;

public class ProductoDao implements Dao<Producto>{
	private HibernateUtils hu;
	
	public ProductoDao(HibernateUtils hu) {
		this.hu=hu;
	}

	public List<Producto> mostrar() {
		return null;
	}

	public void añadir(Producto t) {
		
	}

	public void actualizar(int id, Producto t) {
		Session sesion = hu.getSession();//
		sesion.beginTransaction();
		Scanner kb = new Scanner(System.in);
		
		sesion.save(t);
		sesion.getTransaction().commit();
		sesion.close();

		
		
	}

	public void eliminar(Producto t) {
		
	}

	public Producto mostrarporId(int id) {
		return null;
	}

}
