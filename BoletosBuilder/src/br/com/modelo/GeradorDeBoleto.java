package br.com.modelo;

import br.com.generico.BoletoBuilder;

public class GeradorDeBoleto {	

	public static Boleto gerarBoleto(BoletoBuilder builder) {
		
		builder.buildSacado("Reinaldo Jr");
		builder.buildCedente("WALMART");
		builder.buildCodigoBarras("1111.1111.11111.11.11111");
		builder.buildValor(2000);
		
		return builder.getBoleto();
		
	}
	
}
