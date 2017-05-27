package br.com.modelo;

import br.com.generico.Emissor;

public class EmissorVisa implements Emissor {

	@Override
	public void realizarEmissao() {
		System.out.println("EMISSOR << VISA >>");
	}

}
