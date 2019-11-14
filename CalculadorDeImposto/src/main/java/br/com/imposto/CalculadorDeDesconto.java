package br.com.imposto;

public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
		
		
		Desconto descontoA = new DescontoPorCincoItens();
		Desconto descontoB = new DescontoPorValor();
		Desconto descontoC = new SemDesconto();
		
		descontoA.setProximo(descontoB);
		descontoB.setProximo(descontoC);
		
	return descontoA.calculaDesconto(orcamento);
	
}
}

