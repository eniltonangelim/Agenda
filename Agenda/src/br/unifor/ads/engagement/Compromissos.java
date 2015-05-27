package br.unifor.ads.engagement;

import java.io.Serializable;
import java.util.Date;


abstract class Compromissos implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 2144295304172069347L;
	
	private Date dataCompromisso;
	private Date dataLembrete;
	private String descricao;
	
	public Date getDataCompromisso() {
		return dataCompromisso;
	}
	public void setDataCompromisso(Date dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}
	public Date getDataLembrete() {
		return dataLembrete;
	}
	public void setDataLembrete(Date dataLembrete) {
		this.dataLembrete = dataLembrete;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	public abstract void detalharCompromissos();
}
