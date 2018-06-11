package br.uem;

import static java.util.Arrays.asList;


public class Main {

	public static void main(String[] args) {
		
		Pessoa henrique = new Pessoa(
								"Henrique", 
								28, 'M', 9161201, 
								asList(new Telefone()));
		henrique.fala();
		int idadeApos50Anos = henrique.somaIdade(40);
		
		System.out.println(idadeApos50Anos == 78);
		
		
		//System.out.println(henrique);
		
	}
	
}
