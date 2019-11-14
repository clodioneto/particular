package br.com.imposto;

public class CalculaIss extends Imposto{
	
	
	public CalculaIss(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public CalculaIss() {
	
	}

	public double calcula(Orcamento orcamento) {
		
		return orcamento.getValor()*0.20 + calculoDoOutroImposto(orcamento);
		
	}



}
