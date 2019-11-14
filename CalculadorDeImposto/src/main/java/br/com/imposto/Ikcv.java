package br.com.imposto;

public class Ikcv extends TemplateImpostoCondicional{


	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item : orcamento.getItem()) {
			if(item.getValor()>100.0) {
				return true;
			} 
		
		} 
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {	
		return orcamento.getValor()*0.10;
	}

	@Override
	public boolean deveUsaraMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()>100 && temItemMaiorQue100ReaisNo(orcamento);
	}
}
