package br.uem;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testConstrutorPessoa() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, Arrays.asList(new Telefone()));
		assertNotNull(pessoa);
	}

	@Test
	public void testSomaIdade() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, Arrays.asList(new Telefone()));
		int novaIdade = pessoa.somaIdade(30);
		
		assertEquals(58, novaIdade);
	}

}
