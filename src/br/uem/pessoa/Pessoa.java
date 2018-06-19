package br.uem.pessoa;

import java.util.List;

import br.uem.Telefone;
import br.uem.endereco.Endereco;
import br.uem.util.Util;

public abstract class Pessoa {
	
	private String nome;
	private Documento documento;
	private List<Telefone> telefones;	
	private Endereco endereco;
	
	public Pessoa(String nome, List<Telefone> telefone) {
		this.nome = nome;
		this.telefones = telefone;
	}
	
	public abstract String souDoTipo();

	public boolean temTelefone() {
		return !telefones.isEmpty();
	}

	public int temQuantosTelefones() {
		return telefones.size();
	}

	public boolean temEndereco() {
		return endereco != null ? true : false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Documento getDocumento() {
		return documento;
	}
	
	// transfomar em método abstrado
	public abstract String getDocumentoFormatado();

	public void setDocumento(Documento identidade) {
		this.documento = identidade;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
