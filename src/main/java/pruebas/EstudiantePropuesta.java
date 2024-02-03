package pruebas;

import DAOS.EstudianteDao;
import DAOS.EstudianteDaoImpl;
import model.Estudiante;

public class EstudiantePropuesta {
public static void main(String[] args) {
		
		EstudianteDao studentDao = new EstudianteDaoImpl();
		
		Estudiante estudiante = new Estudiante();
		
		//Crear
		
		estudiante.setNombresApellidos("Jose Perez");
		estudiante.setTipoDocumento(3);
		
		
	}
}
