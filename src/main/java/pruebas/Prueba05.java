package pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import DAOS.RolDao;
import DAOS.RolDaoImpl;
import model.Rol;

public class Prueba05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RolDao rolDato = new RolDaoImpl();
		
		Rol rol = new Rol();
		rol.setIdrol(6);
		rol.setRolName("asistenteksjdfjkasdhfjklhsadjkfjkasdhfjkashdfjasdjkfhdjkldhasdjkfhdjkh");
		rol.setRolStatus(1);
		
		rolDato.update(rol);
		
		for( Rol r: rolDato.findAll()) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}
		
	}

}