package br.unifor.ads.engagement;

import java.util.Date;

public class Agenda extends Compromissos implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3785598868638700583L;
	
	private Date dataAtual;
	private Compromissos[] compromissos = new Compromissos[1000];
	
	
	public Date getDataAtual() {
		return dataAtual;
	}
	
	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Compromissos[] getCompromissos() {
		return compromissos;
	}


	public void addCompromissos(Compromissos[] compromissos){
		this.compromissos = compromissos;
	};

	public String listarInformacaoCompromissos(){
		return null;
	}

	@Override
	public void detalharCompromissos() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			for(Compromissos compromisso: compromissos){
				if (compromisso.getDataCompromisso().after(new Date())){
					System.out.println("Está na hora do compromisso "+compromisso.getDescricao());
				}
			}
			try{
				Thread.sleep(6000L);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
