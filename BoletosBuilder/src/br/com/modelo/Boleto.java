package br.com.modelo;

public class Boleto {
	
	private String cedente;
	private String sacado;
	private String codBarras;
	private double valor;
	
	
	public Boleto(String cedente, String sacado, String codBarras, double valor) {
		super();
		this.cedente = cedente;
		this.sacado = sacado;
		this.codBarras = codBarras;
		this.valor = valor;
	}
	public String getCedente() {
		return cedente;
	}
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	public String getSacado() {
		return sacado;
	}
	public void setSacado(String sacado) {
		this.sacado = sacado;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
