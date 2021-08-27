package factory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.FilmeDAO;
import dao.FilmeDAOImpl;

@ApplicationScoped
public class FilmeDAOFactory {

	@PersistenceContext(unitName = "JPAExampleNew")
	private EntityManager em;

	@Produces
	public FilmeDAO criarFilmeDAO() {
		// Em FilmeDAOImpl(em) passamos o Entity Manager criado
		return new FilmeDAOImpl(em);
	}
}