package br.com.modelo;

import br.com.generico.BoletoBuilder;

public class GeradorDeBoleto {	

	public static void gerarBoleto(BoletoBuilder Builder, Boleto boleto) {
		
		Builder.imprimirSacado(boleto.getSacado());
		Builder.imprimirCedente(boleto.getCedente());
		Builder.imprimirCodigoBarras(boleto.getCedente());
		Builder.imprimirValor(boleto.getValor());
		
	}
	
}
