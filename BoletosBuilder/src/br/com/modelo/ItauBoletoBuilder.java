package br.com.modelo;

import br.com.generico.BoletoBuilder;

public class ItauBoletoBuilder implements BoletoBuilder {

	@Override
	public void imprimirSacado(String sacado) {
		System.out.println("[ITAU] Imprimindo Sacado "+sacado);

	}

	@Override
	public void imprimirCedente(String cedente) {
		System.out.println("[ITAU] Imprimindo Cedente "+cedente);

	}

	@Override
	public void imprimirCodigoBarras(String codigoBarras) {
		System.out.println("[ITAU] Imprimindo Codigo de Barras "+codigoBarras);

	}

	@Override
	public void imprimirValor(double valor) {
		System.out.println("[ITAU] Imprimindo Valor "+valor);

	}

}
