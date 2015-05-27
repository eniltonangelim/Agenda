package br.unifor.ads.engagement;

import java.io.Serializable;

public class Contato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8781086609006406842L;

	private String nome;
	
	public Contato(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + "]";
	}
	
}
