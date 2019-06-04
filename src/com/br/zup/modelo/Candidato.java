package com.br.zup.modelo;

public class Candidato {
	private String nome;
	private int numero;
	private int votos;

	public Candidato(String nome, int numero, int votos) {
		this.nome = nome;
		this.numero = numero;
		this.votos = votos;
	}

	public Candidato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public Candidato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public String toString() {
		String modelo = "";

		modelo += this.getNumero() + " ----- " + this.getNome();

		return modelo;
	}

	public String toString(String n) {
		// lista de candidatos\nNumero---------Nome---------votos\n
		String modelo = "";

		modelo += this.getNumero() + " ------- " + this.getNome() + "--------" + this.getVotos();

		return modelo;
	}

}
