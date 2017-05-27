package br.com.modelo;

import br.com.generico.Receptor;

public class ReceptorVisa implements Receptor {

	@Override
	public void realizarRecepcao() {
		System.out.println("RECEPTOR << VISA >>");
	}

}
