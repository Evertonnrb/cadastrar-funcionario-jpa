package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory factory;
	static{
		factory = Persistence.createEntityManagerFactory("CadatraFuncionario");
	}
	public static EntityManager getFactory() {
		return factory.createEntityManager();
	}
	public static void fecha(){
		factory.close();
	}
}
