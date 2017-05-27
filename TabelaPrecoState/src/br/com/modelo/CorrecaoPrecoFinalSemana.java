package br.com.modelo;

import br.com.generico.CorrecaoPreco;

public class CorrecaoPrecoFinalSemana implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(produto.getPreco() * 1.1);
		return produto;
	}

}
