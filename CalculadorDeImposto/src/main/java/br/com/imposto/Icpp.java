package br.com.imposto;

public class Icpp extends TemplateImpostoCondicional{
	
	

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()*0.15;
	}

	@Override
	public boolean deveUsaraMaximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor()>500; 
	}


}
