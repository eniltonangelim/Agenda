package br.unifor.poo.agenda;

public class Contato {
	
	private String nome;
	
	public Contato(){
		
	};
	
	public Contato(String nome){
		this.setNome(nome);
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
