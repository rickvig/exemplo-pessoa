package br.uem.pessoa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PessoaJuridicaTest {
	
	private PessoaJuridica subject;

	@Before
	public void setup() {
		
	}

	@Test
	public void testSouDoTipo() {
		assertEquals(PessoaJuridica.class, subject.getClass());
	}
	
	@Test
	public void testConstrutor() {
		assertNotNull(subject);
	}

	@Test
	public void testNomeFantasia() {
		fail("not implemented yet...");
	}
	
	@Test
	public void testPessoaTemTelefones() {
		assertTrue(subject.temTelefone());
	}
	
	@Test
	public void testPessoaTemQuantosTelefones() {
		assertEquals(1, subject.temQuantosTelefones());
	}
	
	@Test
	public void testPessoaTemEndereco() {
		assertTrue(subject.temEndereco());
	}
		
	@Test
	public void testRetornaCNPJFormatado() {
		fail("not implemented yet...");
	}

}
