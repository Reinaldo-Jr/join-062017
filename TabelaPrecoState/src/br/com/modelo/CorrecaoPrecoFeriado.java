package br.com.modelo;

import br.com.generico.CorrecaoPreco;

public class CorrecaoPrecoFeriado implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(produto.getPreco() * 1.2);
		return produto;
	}

}
