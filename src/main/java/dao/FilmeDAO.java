package dao;

import java.util.List;

import entity.Filme;

public interface FilmeDAO {

	public void adicionarFilme(Filme filme);

	public Filme getFilme(int id);

	public void removerFilme(int id);

	public void atualizarFilme(Filme filme);

	public List<Filme> getTodosFilmes();

}