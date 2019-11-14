package br.com.imposto;

public class CalculaIcms extends Imposto{
	
	public CalculaIcms (Imposto outroImposto) {
		super(outroImposto);
		
	}
	
	public CalculaIcms() {
	
	}
	
	
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() *0.10 + calculoDoOutroImposto(orcamento);
	}

}
