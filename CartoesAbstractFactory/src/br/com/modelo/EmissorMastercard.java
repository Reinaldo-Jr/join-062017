package br.com.modelo;

import br.com.generico.Emissor;

public class EmissorMastercard implements Emissor {

	@Override
	public void realizarEmissao() {
		System.out.println("EMISSOR << MASTERCARD >>");
	}

}
