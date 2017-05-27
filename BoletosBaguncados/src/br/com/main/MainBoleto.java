package br.com.main;

import br.com.modelo.BBBoleto;
import br.com.modelo.ItauBoleto;

public class MainBoleto {

	public static void main(String[] args) {
		
		BBBoleto bbBoleto = new BBBoleto("Walmart", "Reinaldo Jr", "111.1111.1111.11", 1500);
		bbBoleto.imprimirCedente();
		bbBoleto.imprimirSacado();
		bbBoleto.imprimirCodigoBarras();
		bbBoleto.imprimirValor();
		
		ItauBoleto itauBoleto = new ItauBoleto("Walmart", "Reinaldo Jr", "111.1111.1111.11", 1500);
		itauBoleto.imprimirCedente();
		itauBoleto.imprimirSacado();
		itauBoleto.imprimirCodigoBarras();
		itauBoleto.imprimirValor();

	}

}
