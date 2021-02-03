package Conexion;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static HibernateUtils singleton;
	private Session sesion;
	private SessionFactory factory;

	private HibernateUtils() {

	}

	/**
	 * Usa patron singleton, devuelve una unica instancia.
	 * 
	 * @return HibernateUtils
	 */
	public static HibernateUtils setUp() {
		// inicializa la configuracion y la conexcion con la base de datos(mysql)
		if (singleton == null) {
			HibernateUtils hu = new HibernateUtils();
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder standardServiceRegistryBuilder;
			hu.factory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
			hu.sesion = hu.factory.openSession();
			singleton = hu;
			return hu;
		} else {

			return singleton;
		}

	}

	public void shutDown() {
		sesion.close();
	}

	public Session getSession() {

		return sesion;

	}

	public void closeSessionFactory() {
		if (sesion != null) {
			sesion.close();
		}

		if (factory != null) {
			factory.close();
		}
	}
}
