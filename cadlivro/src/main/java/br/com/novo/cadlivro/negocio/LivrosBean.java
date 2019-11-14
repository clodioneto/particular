package br.com.novo.cadlivro.negocio;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.novo.cadlivro.modelo.Livro;

@Stateless
@LocalBean
@WebService
public class LivrosBean implements LivroWS{

	
	@PersistenceContext(unitName = "cadastrodelivros" )
	private EntityManager em;
	
	
	
	
	public void salvar(Livro livro) throws Exception {
		if (!validar(livro)) {
			throw new Exception("Livro ja cadastrado");
		}
		
		em.persist(livro);
		
				
	}
	public boolean validar(Livro livro) {
	    List<Livro> livros = obterTodos ();
		
	    for(Livro livroModelo : livros) {
	    	if (livroModelo.getNomeLivro().equals(livro.getNomeLivro())) {
	    		return false;
	    	}
	    
	    }
		return true;
	}
	
	
	public Livro consultarPorId(Integer idLivro) {
		return em.find(Livro.class, idLivro);
			
	}

	public void apagar(Integer idLivro) throws Exception {
		Query query = this.em.createQuery("delete from Livro where idLivro = :idLivro ");
		query.setParameter("idLivro", idLivro);
		
		query.executeUpdate();
				
	}
	
	public List<Livro> obterTodos(){
		Query q = em.createQuery("select l from Livro l"); 
		return (List<Livro>) q.getResultList();
		
	}

	
	@Override
	public Livro buscarPorId(Integer codigo) {
		
		TypedQuery<Livro> query = this.em.createQuery("select l from Livro l where l.idLivro = :idLivro", Livro.class);
		query.setParameter("idLivro", codigo );
		return query.getSingleResult();
	}

		
	
}
