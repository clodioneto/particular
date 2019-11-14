package br.com.imposto;

public class Aprovado implements EstadoDeUmOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	public void aprova(Orcamento orcamento) {
		 throw new RuntimeException("Um orçamento APROVADO não pode ser aprovado novamente!");
		
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento APROVADO não pode ser reprovado!");
		
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
