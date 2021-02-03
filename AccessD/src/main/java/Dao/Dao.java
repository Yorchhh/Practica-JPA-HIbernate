package Dao;

import java.util.List;

public interface Dao<T> {
	List<T> mostrar();

	void añadir(T t);

	void actualizar(int id, T t);

	void eliminar(T t);
	
	public T mostrarporId(int id);

}
