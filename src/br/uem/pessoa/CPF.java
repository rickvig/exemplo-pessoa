package br.uem.pessoa;

public class CPF implements Documento, Comparable<Integer> {

	private Integer numero;
	
	public CPF(Integer numero) {
		this.numero = numero;
	}

	@Override
	public Integer getNumero() {
		return numero;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
