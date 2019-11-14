package br.com.imposto;

public class TesteDeDeswcontoExtra {

	public static void main(String[] args) {
	Orcamento reforma = new Orcamento(500);
	
	reforma.aplicaDescontoExtra();
	
	System.out.println(reforma.getValor());
	}

}
