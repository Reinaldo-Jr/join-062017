package br.com.modelo;

import br.com.generico.ComunicadorFactory;
import br.com.generico.Emissor;
import br.com.generico.Receptor;

public class VisaComunicadorFactory implements ComunicadorFactory {

	@Override
	public Emissor criarEmissor() {
		return new EmissorVisa();
	}

	@Override
	public Receptor criarReceptor() {
		return new ReceptorVisa();
	}

}
