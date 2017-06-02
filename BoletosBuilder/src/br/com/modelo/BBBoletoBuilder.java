package br.com.modelo;

import br.com.generico.BoletoBuilder;

public class BBBoletoBuilder implements BoletoBuilder {

	private Boleto boleto;	
	
	public BBBoletoBuilder() {
		this.boleto = new Boleto();
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	
	@Override
	public Boleto getBoleto() {
		// TODO Auto-generated method stub
		return boleto;
	}
	@Override
	public void buildSacado(String sacado) {
		getBoleto().setSacado(sacado);
	}

	@Override
	public void buildCedente(String cedente) {
		getBoleto().setCedente(cedente);
	}

	@Override
	public void buildCodigoBarras(String codigoBarras) {
		getBoleto().setCodBarras(codigoBarras);
	}

	@Override
	public void buildValor(double valor) {
		getBoleto().setValor(valor);
	}

}
