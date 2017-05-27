package br.com.generico;

public interface BoletoBuilder {
	
	public void imprimirSacado(String sacado);
	public void imprimirCedente(String cedente);
	public void imprimirCodigoBarras(String codigoBarras);
	public void imprimirValor(double valor);

}
