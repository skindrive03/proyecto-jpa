package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DAOS.RolDao;
import DAOS.RolDaoImpl;
import model.Rol;

public class Prueba06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RolDao rolDao = new RolDaoImpl();
		rolDao.delete(7);
		
		for( Rol r: rolDao.findAll()) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}
		
	}

}