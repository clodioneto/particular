package br.com.imposto;

public class CalculadorDeImposto {
	
	
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double impostoqualquer = imposto.calcula(orcamento);
		System.out.println(impostoqualquer);
		
	
	}
		
		
		
	

}
