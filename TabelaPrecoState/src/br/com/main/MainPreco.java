package br.com.main;

import br.com.modelo.CorrecaoPrecoFinalSemana;
import br.com.modelo.Produto;
import br.com.modelo.TabelaDePreco;

public class MainPreco {

	public static void main(String[] args) {
		TabelaDePreco tabelaPreco = new TabelaDePreco("Tabela Geral", 
				new CorrecaoPrecoFinalSemana());
		tabelaPreco.incluirProduto(new Produto("Produto 1", 100.98, "LT"));
		tabelaPreco.incluirProduto(new Produto("Produto 2", 200, "LT"));
		tabelaPreco.incluirProduto(new Produto("Produto 3", 300, "LT"));
		tabelaPreco.imprimirProdutos();
	}

}
