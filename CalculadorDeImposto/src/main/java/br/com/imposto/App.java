package br.com.imposto;

public class App {

	public static void main(String[] args) {
		
		CalculaIcms icms = new CalculaIcms();
		CalculaIss iss = new CalculaIss();
		
		CalculadorDeImposto calculator = new CalculadorDeImposto();
		
		Orcamento orcamento = new Orcamento(5000.00);
		
		
		  calculator.realizaCalculo(orcamento, icms);
		  calculator.realizaCalculo(orcamento, iss);
		 
		
		
		
	}

}
