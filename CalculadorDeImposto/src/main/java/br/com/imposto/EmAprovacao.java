package br.com.imposto;

public class EmAprovacao implements EstadoDeUmOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
		
	}

	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ir direto para FINALIZADO!");

		
	}

}
