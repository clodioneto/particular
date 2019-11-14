package br.com.imposto;

public class DescontoPorCincoItens implements Desconto {
	
	private Desconto proximo;

	public double calculaDesconto(Orcamento orcamento) {
		
		if(orcamento.getItem().size()>5) {
			return orcamento.getValor()*0.10;
		} else {
			
			return proximo.calculaDesconto(orcamento);
		}
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
		
	}


	
	

}
