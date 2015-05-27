package br.unifor.poo.agenda;

import java.util.Date;

public class Tarefas extends Compromissos {

	private Date limiteExecucao;

	public Date getLimiteExecucao() {
		return limiteExecucao;
	}

	public void setLimiteExecucao(Date limiteExecucao) {
		this.limiteExecucao = limiteExecucao;
	}

	@Override
	public void detalharCompromissos() {
		// TODO Auto-generated method stub
		
	}
	
	
}
