package br.uem.pessoa;

public class CNPJ implements Documento {
	
	Integer cnpj;
	
	public CNPJ(Integer cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public Integer getNumero() {
		return cnpj;
	}

}
