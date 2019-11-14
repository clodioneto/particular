package br.com.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;
	

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		
		
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItens(Item item) {
		
		itens.add(item);
	}

	public List<Item> getItem() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
		
	}
	
	

}
