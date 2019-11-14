package br.com.imposto;

public abstract class TemplateImpostoCondicional extends Imposto{

	public double calcula(Orcamento orcamento) {
		if(deveUsaraMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsaraMaximaTaxacao(Orcamento orcamento);

}
