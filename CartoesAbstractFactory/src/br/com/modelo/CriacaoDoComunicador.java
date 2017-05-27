package br.com.modelo;

import br.com.generico.ComunicadorFactory;
import br.com.generico.EnumComunicador;

public class CriacaoDoComunicador {
	
	public static ComunicadorFactory getComunicador(EnumComunicador tipoComunicador) {
		if (tipoComunicador.equals(EnumComunicador.ComunicadorVISA)) {
			return new VisaComunicadorFactory();
		} else {
			return new MasterCardComunicadorFactory();
		}
	}

}
