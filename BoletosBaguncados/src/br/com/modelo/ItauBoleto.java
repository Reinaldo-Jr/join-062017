package br.com.modelo;

public class ItauBoleto {
	private String cedente;
	private String sacado;
	private String codBarras;
	private double valor;
	
	
	public ItauBoleto(String cedente, String sacado, String codBarras, double valor) {
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
	
	public void imprimirSacado() {
		System.out.println("[ITAU] Imprimindo Sacado "+getSacado());

	}

	public void imprimirCedente() {
		System.out.println("[ITAU] Imprimindo Cedente "+getCedente());

	}

	public void imprimirCodigoBarras() {
		System.out.println("[ITAU] Imprimindo Codigo de Barras "+getCodBarras());

	}

	public void imprimirValor() {
		System.out.println("[ITAU] Imprimindo Valor "+getValor());

	}	
}
