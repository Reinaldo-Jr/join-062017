package br.com.modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import br.com.generico.CorrecaoPreco;

public class TabelaDePreco {

	private String descricao;
	private CorrecaoPreco fatorCorrecaoPreco;
	private List<Produto> listaProduto;
	
	public TabelaDePreco(String descricao, 
			CorrecaoPreco fatorCorrecaoPreco) {
		super();
		this.descricao = descricao;
		this.fatorCorrecaoPreco = fatorCorrecaoPreco;
		listaProduto = new ArrayList<Produto>();
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public CorrecaoPreco getFatorCorrecaoPreco() {
		return fatorCorrecaoPreco;
	}
	public void setFatorCorrecaoPreco(CorrecaoPreco fatorCorrecaoPreco) {
		this.fatorCorrecaoPreco = fatorCorrecaoPreco;
	}	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public void incluirProduto(Produto produto) {
		getListaProduto().add(produto);
	}
	public void imprimirProdutos() {
		for (Produto produto : getListaProduto()) {
			produto = getFatorCorrecaoPreco().corrigirPreco(produto); 
			DecimalFormat df = new DecimalFormat("#,###.00"); 
			System.out.println(produto.getDescricao() + " "    +
							   produto.getUnidade()   + " R$ " +
							   df.format(produto.getPreco()));
		}
	}

}
