package br.com.imposto;

public class Reprovado implements EstadoDeUmOrcamento{

	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		throw new RuntimeException("Somente orçamentos APROVADOS ou EM APROVAÇÃO podem receber descontos extras");
		
	}

}
