package br.uem;

import static java.util.Arrays.asList;

import br.uem.pessoa.CNPJ;
import br.uem.pessoa.CPF;
import br.uem.pessoa.Pessoa;
import br.uem.pessoa.PessoaFisica;
import br.uem.pessoa.PessoaJuridica;
import br.uem.pessoa.Sexo;


public class Main {

	public static void main(String[] args) {
		
		Pessoa henrique = new PessoaFisica(
								"Henrique", 
								28, Sexo.M, new CPF("9161201"), 
								asList(new Telefone("44999410923")));

		System.out.println(henrique);
		
		//henrique.fala();
		//System.out.println(henrique.somaIdade(40));
		
		System.out.println(henrique.souDoTipo());
		System.out.println(henrique.getDocumento());
		
		henrique = new PessoaJuridica("Henrique ltda.", new CNPJ("987986"), asList(new Telefone("44999410923")));
		
		System.out.println(henrique.souDoTipo());
		System.out.println(henrique.getDocumento());
		
		
	}
	
}
