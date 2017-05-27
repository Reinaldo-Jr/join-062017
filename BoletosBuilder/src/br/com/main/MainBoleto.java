package br.com.main;

import br.com.modelo.BBBoletoBuilder;
import br.com.modelo.Boleto;
import br.com.modelo.GeradorDeBoleto;
import br.com.modelo.ItauBoletoBuilder;

public class MainBoleto {
	
	public static void main(String[] args) {
		
		Boleto boleto = new Boleto("Cedente", "Sacado", "Cod Barras", 289);
		GeradorDeBoleto.gerarBoleto(new BBBoletoBuilder(), boleto);
		GeradorDeBoleto.gerarBoleto(new ItauBoletoBuilder(), boleto);
		
	}

}
