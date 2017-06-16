package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getFactory();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		manager.close();
		JpaUtil.fecha();
	}
}
