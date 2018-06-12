package br.uem;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import br.uem.endereco.Endereco;

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
	public void testPessoaFala() {
		Pessoa pessoa = Mockito.mock(Pessoa.class);
		pessoa.fala();
		Mockito.verify(pessoa).fala();
	}
	
	@Test
	public void testPessoaOuve() {
		Pessoa pessoa = Mockito.mock(Pessoa.class);
		pessoa.ouve();
		Mockito.verify(pessoa).ouve();
	}
	
	@Test
	public void testPessoaTemTelefones() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		assertTrue(pessoa.temTelefone());
	}
	
	@Test
	public void testPessoaTemQuantosTelefones() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		assertEquals(1, pessoa.temQuantosTelefones());
	}
	
	@Test
	public void testPessoaTemEndereco() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		pessoa.setEndereco(new Endereco());
		assertTrue(pessoa.temEndereco());
	}
	
	@Test
	public void testRetornaSexoLegivel() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		assertEquals("Masculino", pessoa.getSexo());
	}
	
	@Test
	public void testRetornaIdentidadeFormatada() {
		Pessoa pessoa = new Pessoa("Henrique", 28, 'M', 91612011, asList(new Telefone()));
		assertEquals("9191201-1", pessoa.getIdentidade());
	}
	

}
