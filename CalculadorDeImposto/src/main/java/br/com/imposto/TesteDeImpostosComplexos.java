package br.com.imposto;

public class TesteDeImpostosComplexos {
	
	public static void main(String[] args) {
		
		Imposto iss = new CalculaIss(new CalculaIcms());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}
		
}
