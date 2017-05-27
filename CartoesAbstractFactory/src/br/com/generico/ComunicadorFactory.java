package br.com.generico;

public interface ComunicadorFactory {
	
	public Emissor criarEmissor();
	public Receptor criarReceptor();

}
