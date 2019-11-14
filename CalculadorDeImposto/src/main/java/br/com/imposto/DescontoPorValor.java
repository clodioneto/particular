package br.com.imposto;

public class DescontoPorValor implements Desconto{
	
	private Desconto proximo;


	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor()>500.0) {
			return orcamento.getValor()*0.05;
		} else {
			return proximo.calculaDesconto(orcamento);
		}
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	
		
	}



}
