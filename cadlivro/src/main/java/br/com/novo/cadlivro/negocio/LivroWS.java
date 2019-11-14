package br.com.novo.cadlivro.negocio;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.novo.cadlivro.modelo.Livro;

@WebService(name="LivroService")
public interface LivroWS {
	
	@WebMethod(operationName = "buscarPorId")
	Livro buscarPorId(Integer codigo);

}
