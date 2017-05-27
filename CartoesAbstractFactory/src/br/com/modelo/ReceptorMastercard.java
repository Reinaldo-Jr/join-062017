package br.com.modelo;

import br.com.generico.Receptor;

public class ReceptorMastercard implements Receptor {

	@Override
	public void realizarRecepcao() {
		System.out.println("RECEPTOR << MASTERCARD >>");
	}

}
