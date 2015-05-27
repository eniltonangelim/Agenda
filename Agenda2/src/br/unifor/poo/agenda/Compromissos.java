package br.unifor.poo.agenda;

import java.util.Date;

public abstract class Compromissos {

	private Date dataCompromisso;
	private Date dataLembrete;
	private String descricao;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataLembrete() {
		return dataLembrete;
	}
	public void setDataLembrete(Date dataLembrete) {
		this.dataLembrete = dataLembrete;
	}
	
	public abstract void detalharCompromissos();
	
	
	public Date getDataCompromisso() {
		return dataCompromisso;
	}
	
	public void setDataCompromisso(Date dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}
	
}

