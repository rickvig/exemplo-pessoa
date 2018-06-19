package br.uem.pessoa;

import java.util.List;

import br.uem.Telefone;
import br.uem.util.Util;

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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String string) {
		this.nomeFantasia = string;
	}

	@Override
	public String getDocumentoFormatado() {
		return Util.formatString(getDocumento().getNumero(), "##.###.###/####-##");
	}
}
