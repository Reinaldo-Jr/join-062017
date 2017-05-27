package br.com.modelo;

import br.com.generico.CorrecaoPreco;

public class CorrecaoPrecoDiaSemana implements CorrecaoPreco {

	@Override
	public Produto corrigirPreco(Produto produto) {
		produto.setPreco(produto.getPreco() * 1.0);
		return produto;
	}

}
