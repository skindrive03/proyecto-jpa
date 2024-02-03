package DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Estudiante;
import model.Rol;

public class EstudianteDaoImpl implements EstudianteDao {
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public EstudianteDaoImpl() {
		factory = Persistence.createEntityManagerFactory("Semana02");
		em = factory.createEntityManager();
	}

	@Override
	public void create(Estudiante estudiante) {
		em.getTransaction().begin();
		em.persist(estudiante);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(Estudiante estudiante) {
		try {
			em.getTransaction().begin();
			em.merge(estudiante);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}	
	}

	@Override
	public void delete(Integer id) {
		em.getTransaction().begin();
		em.remove(find(id));
		em.getTransaction().commit();
		
	}

	@Override
	public Estudiante find(Integer id) {
		return em.find(Estudiante.class, id);
	}

	@Override
	public List<Estudiante> findAll() {
		Query query = em.createNamedQuery("Estudiante.findAll");
		return (List <Estudiante>) query.getResultList();
	}
	
}
