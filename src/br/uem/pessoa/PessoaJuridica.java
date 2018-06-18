package br.uem.pessoa;

import java.util.List;

import br.uem.Telefone;

public class PessoaJuridica extends Pessoa {
	
	String nomeFantasia;

	public PessoaJuridica(String nome, CNPJ documento, List<Telefone> telefone) {
		super(nome, telefone);
		setDocumento(documento);
	}

	@Override
	public String souDoTipo() {
		return this.getClass().toString();
	}

}
