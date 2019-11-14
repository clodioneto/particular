package br.com.novo.cadlivro.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.novo.cadlivro.modelo.Livro;
import br.com.novo.cadlivro.negocio.LivrosBean;

@ManagedBean(name = "controleCadMB")
@ViewScoped
public class ControleCadMB implements Serializable {

	private static final long serialVersionUID = -2782893828415279820L;

	@EJB
	private LivrosBean livrosBean;

	@PostConstruct
	public void init() {
		livros = livrosBean.obterTodos();
	}

	private Livro livro;

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Livro getLivro() {
		if (livro == null) {
			livro = new Livro();
		}
		return livro;
	}

	private List<Livro> livros;

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public void salvar() {
		try {
			livrosBean.salvar(livro);
			livros = livrosBean.obterTodos();
			livro = new Livro();
			FacesMessage message = new FacesMessage("Cadastro salvo com sucesso");
			FacesContext.getCurrentInstance().addMessage("", message);

		} catch (Exception e) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null);
			FacesContext.getCurrentInstance().addMessage(null, message);
			e.printStackTrace();
		}

	}

	public void apagar(Integer idLivro) {
		try {
			livrosBean.apagar(idLivro);
			livros = livrosBean.obterTodos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
