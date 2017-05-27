package br.com.modelo;

import br.com.generico.ComunicadorFactory;
import br.com.generico.Emissor;
import br.com.generico.Receptor;

public class MasterCardComunicadorFactory implements ComunicadorFactory {

	@Override
	public Emissor criarEmissor() {
		return new EmissorMastercard();
	}

	@Override
	public Receptor criarReceptor() {
		return new ReceptorMastercard();
	}

}
