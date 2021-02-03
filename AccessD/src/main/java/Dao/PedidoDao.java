package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import Conexion.HibernateUtils;
import Models.Cliente;
import Models.Pedido;

public class PedidoDao implements Dao<Pedido>{
	private HibernateUtils hu;
	public PedidoDao(HibernateUtils hu) {
		this.hu=hu;
	}

	public List<Pedido> mostrar() {
		Query query = hu.getSession().createQuery("FROM Cliente");
		ArrayList<Pedido> pedidos = (ArrayList<Pedido>) query.list();
		return pedidos ;
		
	}

	public void añadir(Pedido t) {
		
	}

	public void actualizar(int id, Pedido t) {
		
	}

	public void eliminar(Pedido t) {
		
	}

	public Pedido mostrarporId(int id) {
		//Preguntar antes por el id
		Pedido pedido = hu.getSession().get(Pedido.class, id);
		return pedido;
		
	}

}
