package br.com.main;

import br.com.modelo.BBBoletoBuilder;
import br.com.modelo.Boleto;
import br.com.modelo.GeradorDeBoleto;
import br.com.modelo.ItauBoletoBuilder;

public class MainBoleto {
	
	public static void main(String[] args) {
		
		Boleto boleto = GeradorDeBoleto.gerarBoleto(new BBBoletoBuilder());
		System.out.println(boleto.getCedente());
		System.out.println(boleto.getSacado());
		System.out.println(boleto.getCodBarras());
		System.out.println(boleto.getValor());
		
		boleto = GeradorDeBoleto.gerarBoleto(new ItauBoletoBuilder());
		System.out.println(boleto.getCedente());
		System.out.println(boleto.getSacado());
		System.out.println(boleto.getCodBarras());
		System.out.println(boleto.getValor());
		
	}

}
