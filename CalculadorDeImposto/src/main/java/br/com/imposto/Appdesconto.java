package br.com.imposto;

public class Appdesconto {

	public static void main(String[] args) {
		CalculadorDeDesconto desconto = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionaItens(new Item("Caneta", 250.0));
		orcamento.adicionaItens(new Item("Lapis", 350.0));
		orcamento.adicionaItens(new Item("Caderno", 750.0));
		orcamento.adicionaItens(new Item("livro", 1000.0));
		orcamento.adicionaItens(new Item("Borracha", 150.0));
		orcamento.adicionaItens(new Item("Mesa", 550.0));
		
		
		double descontofinal = desconto.calcula(orcamento);
		
		System.out.println(descontofinal);

	}

}
