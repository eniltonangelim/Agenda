package br.unifor.poo.agenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reuniao extends Compromissos {

	private String localReuniao;
	private Date dataReuniao;
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public String getLocalReuniao() {
		return localReuniao;
	}
	
	public void setLocalReuniao(String localReuniao) {
		this.localReuniao = localReuniao;
	}
	
	public Date getDataReuniao() {
		return dataReuniao;
	}
	
	public void setDataReuniao(Date dataReuniao) {
		this.dataReuniao = dataReuniao;
	}

	public void addContato(Contato contato){
		contatos.add(contato);
	}

	@Override
	public void detalharCompromissos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Reuniao [localReuniao=" + localReuniao + ", dataReuniao="
				+ dataReuniao + ", contatos=" + contatos + " dataLembrete=" + getDataLembrete() + ", descricao="
						+ getDescricao() + "]";
	}
	
	
}
