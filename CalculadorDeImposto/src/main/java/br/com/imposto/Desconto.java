package br.com.imposto;

public interface Desconto {

	double calculaDesconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
	
}
