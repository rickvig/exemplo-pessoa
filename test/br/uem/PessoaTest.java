package br.uem;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void testConstrutor() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		assertNotNull(pessoa);
	}

	@Test
	public void testSomaIdade() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		int novaIdade = pessoa.somaIdade(30);
		
		assertEquals(58, novaIdade);
	}
	
	@Test
	public void testPessoaTemTelefone() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPessoaTemQuantosTelefones() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testPessoaTemEndereco() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRetornaSexoLegivel() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRetornaIdentidadeFormatada() {
		fail("Not yet implemented");
	}
	

}
