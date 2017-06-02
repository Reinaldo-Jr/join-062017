package br.com.generico;

import br.com.modelo.Boleto;

public interface BoletoBuilder {
	
	public void buildSacado(String sacado);
	public void buildCedente(String cedente);
	public void buildCodigoBarras(String codigoBarras);
	public void buildValor(double valor);
	public Boleto getBoleto();

}
