package br.uem.pessoa;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import br.uem.Telefone;
import br.uem.endereco.Endereco;
import br.uem.pessoa.PessoaFisica;

public class PessoaTest {

//	@Test
//	public void testConstrutor() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		assertNotNull(pessoa);
//	}
//
//	@Test
//	public void testSomaIdade() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		int novaIdade = pessoa.somaIdade(30);
//		
//		assertEquals(58, novaIdade);
//	}
//	
//	@Test
//	public void testPessoaFala() {
//		PessoaFisica pessoa = Mockito.mock(PessoaFisica.class);
//		pessoa.fala();
//		Mockito.verify(pessoa).fala();
//	}
//	
//	@Test
//	public void testPessoaOuve() {
//		PessoaFisica pessoa = Mockito.mock(PessoaFisica.class);
//		pessoa.ouve();
//		Mockito.verify(pessoa).ouve();
//	}
//	
//	@Test
//	public void testPessoaTemTelefones() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		assertTrue(pessoa.temTelefone());
//	}
//	
//	@Test
//	public void testPessoaTemQuantosTelefones() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		assertEquals(1, pessoa.temQuantosTelefones());
//	}
//	
//	@Test
//	public void testPessoaTemEndereco() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		pessoa.setEndereco(new Endereco());
//		assertTrue(pessoa.temEndereco());
//	}
//	
//	@Test
//	public void testRetornaSexoLegivel() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		assertEquals("Masculino", pessoa.getSexo());
//	}
//	
//	@Test
//	public void testRetornaIdentidadeFormatada() {
//		PessoaFisica pessoa = new PessoaFisica("Henrique", 28, 'M', 91612011, asList(new Telefone()));
//		assertEquals("9191201-1", pessoa.getIdentidade());
//	}
	

}
