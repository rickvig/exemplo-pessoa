package br.uem.pessoa;

public class CNPJ implements Documento {
	
	String cnpj;
	
	public CNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNumero() {
		return cnpj;
	}
	
	// https://www.devmedia.com.br/validando-o-cnpj-em-uma-aplicacao-java/22374

}
