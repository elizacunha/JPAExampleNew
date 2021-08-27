package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entity.Filme;

public class FilmeDAOImpl implements FilmeDAO {

	private EntityManager em;

	public FilmeDAOImpl(EntityManager em) {
		this.em = em;
	}

	public void adicionarFilme(Filme filme) {
		em.persist(filme);
	}

	public Filme getFilme(int id) {
		return getTodosFilmes().get(id);
	}

	public void removerFilme(int id) {
		em.remove(getFilme(id));
	}

	public void atualizarFilme(Filme filme) {
		em.merge(filme);
	}

	public List<Filme> getTodosFilmes() {
		return em.createQuery("SELECT filme FROM Filme filme", Filme.class).getResultList();
	}

}