package br.uem.pessoa;

import java.util.List;

import br.uem.Telefone;

public final class PessoaFisica extends Pessoa {
	
	private int idade;
	private char sexo;
	
	public PessoaFisica(String nome, int idade, char sexo, CPF cpf, List<Telefone> telefone) {
		super(nome, cpf, telefone);
		this.idade = idade;
		this.sexo = sexo;
	}

	@Override
	public String souDoTipo() {
		return this.getClass().toString();
	}
	
	public int somaIdade(int anos) {
		return idade + anos;
	}
	
	public void fala() {
		System.out.println("Eu falo, sou: " + getNome());
	}
	
	public void ouve() {
		System.out.println("Estou ouvindo...");
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
	
	@Override
	public String toString() {
		return "Pessoa: [ "
				+ "\nnome=" + getNome() + ", "
				+ "\nidade=" + idade + ", "
				+ "\nsexo=" + sexo + ", "
				+ "\nidentidade=" + getDcumento()+ ", "
				+ "\ntelefone=" + getTelefones() + ", "
				+ "\nendereco=" + getEndereco() + "\n]";
	}

}
