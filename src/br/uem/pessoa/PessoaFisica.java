package br.uem;

import java.util.List;

import br.uem.endereco.Endereco;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private Integer identidade;
	private List<Telefone> telefones;
	private Endereco endereco;

	public Pessoa(String nome, int idade, char sexo, Integer identidade, List<Telefone> telefone) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.identidade = identidade;
		this.telefones = telefone;
	}
	
	public void fala() {
		System.out.println("OPA eu falo, sou o: " + nome);
	}
	
	public int somaIdade(int anos) {
		return idade + anos;
	}
	
	public void ouve() {
		// TODO Auto-generated method stub
	}

	public boolean temTelefone() {
		return !telefones.isEmpty();
	}

	public int temQuantosTelefones() {
		return telefones.size();
	}

	public boolean temEndereco() {
		return false;
	}

	@Override
	public String toString() {
		return "Pessoa: [ "
				+ "\nnome=" + nome + ", "
				+ "\nidade=" + idade + ", "
				+ "\nsexo=" + sexo + ", "
				+ "\nidentidade=" + identidade+ ", "
				+ "\ntelefone=" + telefones + ", "
				+ "\nendereco=" + endereco + "\n]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Integer identidade) {
		this.identidade = identidade;
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
