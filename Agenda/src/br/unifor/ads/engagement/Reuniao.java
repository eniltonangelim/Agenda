package br.unifor.ads.engagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reuniao extends Compromissos {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5718922877866660285L;

	private String local;
	private Date dataReuniao;
	private List<Contato> contato = new ArrayList<Contato>();
	
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Date getDataReuniao() {
		return dataReuniao;
	}
	public void setDataReuniao(Date dataReuniao) {
		this.dataReuniao = dataReuniao;
	}

	@Override
	public void detalharCompromissos() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Contato> getContato() {
		return contato;
	}
	
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
	public void adicionarContato(Contato contato){
		contato.add(contato);
	}
	
}
