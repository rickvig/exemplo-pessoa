package br.uem.pessoa;

public class CPF implements Documento {

	private String numero;
	
	public CPF(String numero) {
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return numero;
	}
	
	// https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
	// https://github.com/raphaeloneves/validador-cpf-annotation/blob/master/src/main/java/br/com/raphaelneves/cpf/validator/CpfValidator.java

}
