package br.uem;

import java.text.ParseException;
import java.util.List;

import javax.swing.text.MaskFormatter;

import br.uem.endereco.Endereco;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private Integer identidade;
	private List<Telefone> telefone;
	private Endereco endereco;

	public Pessoa(String nome, int idade, char sexo, Integer identidade, List<Telefone> telefone) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.identidade = identidade;
		this.telefone = telefone;
	}
	
	public void fala() {
		System.out.println("OPA eu falo, sou o: " + nome);
	}
	
	public int somaIdade(int anos) {
		return idade + anos;
	}

	@Override
	public String toString() {
		return "Pessoa: [ "
				+ "\nnome=" + nome + ", "
				+ "\nidade=" + idade + ", "
				+ "\nsexo=" + sexo + ", "
				+ "\nidentidade=" + identidade+ ", "
				+ "\ntelefone=" + telefone + ", "
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
		return telefone;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefone = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Object getIdentidadeFormatada() {
		return formatString(Integer.toString(identidade), "#######-#");
	}
	
	public static String formatString(String value, String pattern) {
        MaskFormatter mf;
        try {
            mf = new MaskFormatter(pattern);
            mf.setValueContainsLiteralCharacters(false);
            return mf.valueToString(value);
        } catch (ParseException ex) {
            return value;
        }
    }


}
