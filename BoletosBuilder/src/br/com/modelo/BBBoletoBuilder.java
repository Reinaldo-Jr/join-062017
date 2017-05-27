package br.com.modelo;

import br.com.generico.BoletoBuilder;

public class BBBoletoBuilder implements BoletoBuilder {

	@Override
	public void imprimirSacado(String sacado) {
		System.out.println("[BB] Imprimindo Sacado "+sacado);

	}

	@Override
	public void imprimirCedente(String cedente) {
		System.out.println("[BB] Imprimindo Cedente "+cedente);

	}

	@Override
	public void imprimirCodigoBarras(String codigoBarras) {
		System.out.println("[BB] Imprimindo Codigo de Barras "+codigoBarras);

	}

	@Override
	public void imprimirValor(double valor) {
		System.out.println("[BB] Imprimindo Valor "+valor);

	}

}
