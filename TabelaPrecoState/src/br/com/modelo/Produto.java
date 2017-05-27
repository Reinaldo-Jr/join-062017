package br.com.modelo;

public class Produto {

	private String descricao;
	private double preco;
	private String unidade;
	
	public Produto(String descricao, double preco, String unidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.unidade = unidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
	
}
