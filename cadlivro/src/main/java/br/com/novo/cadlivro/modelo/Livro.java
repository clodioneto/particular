package br.com.novo.cadlivro.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="cadastrodelivros", catalog = "cadastrodelivros")
public class Livro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7629898081860698175L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Gera id automaticamente
	@Column(name="idLivro", nullable = false) //Determina que cada atributo é uma coluna
	private Integer idLivro;
	@Column(name = "nome", nullable = false)
	private String nomeLivro;
	@Column(name = "nomeAutor",nullable = false)
	private String nomeAutor;
	@Column(name = "anolanca", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date anoLancamento;
	@Column(name = "isbn")
	private long isbn;

	

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Date anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	

}
