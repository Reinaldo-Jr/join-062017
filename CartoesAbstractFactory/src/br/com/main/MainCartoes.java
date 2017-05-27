package br.com.main;

import br.com.generico.ComunicadorFactory;
import br.com.generico.EnumComunicador;
import br.com.modelo.CriacaoDoComunicador;

public class MainCartoes {
	
	public static void main(String[] args) {
		ComunicadorFactory comunicador = CriacaoDoComunicador.getComunicador(EnumComunicador.ComunicadorVISA);
		comunicador.criarReceptor().realizarRecepcao();
		comunicador.criarEmissor().realizarEmissao();
		
		comunicador = CriacaoDoComunicador.getComunicador(EnumComunicador.ComunicadorMASTERCARD);
		comunicador.criarReceptor().realizarRecepcao();
		comunicador.criarEmissor().realizarEmissao();
		
	}

}
