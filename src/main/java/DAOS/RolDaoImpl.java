package DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rol;

public class RolDaoImpl implements RolDao {
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public RolDaoImpl() {
		factory = Persistence.createEntityManagerFactory("Semana02");
		em = factory.createEntityManager();
	}

	@Override
	public void create(Rol rol) {
		em.getTransaction().begin();
		em.persist(rol);
		em.getTransaction().commit();
	}

	@Override
	public void update(Rol rol) {
		try {
			em.getTransaction().begin();
			em.merge(rol);
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
	public Rol find(Integer id) {
		/*Query query = em.createQuery("SELECT r FROM Rol r WHERE r.idrol = :id")
				.setParameter("id", id);
		return (Rol) query.getSingleResult();*/
		
		return em.find(Rol.class, id);
		
	}

	@Override
	public List<Rol> findAll() {
		Query query = em.createNamedQuery("Rol.findAll");
		return (List <Rol>) query.getResultList();
	}

}
